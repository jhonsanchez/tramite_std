package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "TRM_TRAMI_TAXONOMIA", catalog = "")
public class TrmTramiTaxonomia {
    private BigDecimal idenTaxoTtt;
    private BigDecimal idenTaxoMtx;
    private BigDecimal idenExpeTrm;
    private BigInteger flagTramTtt;
    private MaeTaxonomia maeTaxonomiaByIdenTaxoMtx;

    @Id
    @Column(name = "IDEN_TAXO_TTT")
    public BigDecimal getIdenTaxoTtt() {
        return idenTaxoTtt;
    }

    public void setIdenTaxoTtt(BigDecimal idenTaxoTtt) {
        this.idenTaxoTtt = idenTaxoTtt;
    }

    @Basic
    @Column(name = "IDEN_TAXO_MTX")
    public BigDecimal getIdenTaxoMtx() {
        return idenTaxoMtx;
    }

    public void setIdenTaxoMtx(BigDecimal idenTaxoMtx) {
        this.idenTaxoMtx = idenTaxoMtx;
    }

    @Basic
    @Column(name = "IDEN_EXPE_TRM")
    public BigDecimal getIdenExpeTrm() {
        return idenExpeTrm;
    }

    public void setIdenExpeTrm(BigDecimal idenExpeTrm) {
        this.idenExpeTrm = idenExpeTrm;
    }

    @Basic
    @Column(name = "FLAG_TRAM_TTT")
    public BigInteger getFlagTramTtt() {
        return flagTramTtt;
    }

    public void setFlagTramTtt(BigInteger flagTramTtt) {
        this.flagTramTtt = flagTramTtt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrmTramiTaxonomia that = (TrmTramiTaxonomia) o;

        if (idenTaxoTtt != null ? !idenTaxoTtt.equals(that.idenTaxoTtt) : that.idenTaxoTtt != null) return false;
        if (idenTaxoMtx != null ? !idenTaxoMtx.equals(that.idenTaxoMtx) : that.idenTaxoMtx != null) return false;
        if (idenExpeTrm != null ? !idenExpeTrm.equals(that.idenExpeTrm) : that.idenExpeTrm != null) return false;
        if (flagTramTtt != null ? !flagTramTtt.equals(that.flagTramTtt) : that.flagTramTtt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenTaxoTtt != null ? idenTaxoTtt.hashCode() : 0;
        result = 31 * result + (idenTaxoMtx != null ? idenTaxoMtx.hashCode() : 0);
        result = 31 * result + (idenExpeTrm != null ? idenExpeTrm.hashCode() : 0);
        result = 31 * result + (flagTramTtt != null ? flagTramTtt.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_TAXO_MTX", referencedColumnName = "IDEN_TAXO_MTX",insertable = false,updatable = false)
    public MaeTaxonomia getMaeTaxonomiaByIdenTaxoMtx() {
        return maeTaxonomiaByIdenTaxoMtx;
    }

    public void setMaeTaxonomiaByIdenTaxoMtx(MaeTaxonomia maeTaxonomiaByIdenTaxoMtx) {
        this.maeTaxonomiaByIdenTaxoMtx = maeTaxonomiaByIdenTaxoMtx;
    }
}
