package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "MAE_TAXONOMIA", catalog = "")
public class MaeTaxonomia {
    private BigDecimal idenTaxoMtx;
    private String descTaxoMtx;
    private BigDecimal idepTaxoMtx;
    private BigInteger flagEstaMtx;
    private BigDecimal contTaxoMtx;
    private Collection<TrmTramiTaxonomia> trmTramiTaxonomiasByIdenTaxoMtx;

    @Id
    @Column(name = "IDEN_TAXO_MTX")
    public BigDecimal getIdenTaxoMtx() {
        return idenTaxoMtx;
    }

    public void setIdenTaxoMtx(BigDecimal idenTaxoMtx) {
        this.idenTaxoMtx = idenTaxoMtx;
    }

    @Basic
    @Column(name = "DESC_TAXO_MTX")
    public String getDescTaxoMtx() {
        return descTaxoMtx;
    }

    public void setDescTaxoMtx(String descTaxoMtx) {
        this.descTaxoMtx = descTaxoMtx;
    }

    @Basic
    @Column(name = "IDEP_TAXO_MTX")
    public BigDecimal getIdepTaxoMtx() {
        return idepTaxoMtx;
    }

    public void setIdepTaxoMtx(BigDecimal idepTaxoMtx) {
        this.idepTaxoMtx = idepTaxoMtx;
    }

    @Basic
    @Column(name = "FLAG_ESTA_MTX")
    public BigInteger getFlagEstaMtx() {
        return flagEstaMtx;
    }

    public void setFlagEstaMtx(BigInteger flagEstaMtx) {
        this.flagEstaMtx = flagEstaMtx;
    }

    @Basic
    @Column(name = "CONT_TAXO_MTX")
    public BigDecimal getContTaxoMtx() {
        return contTaxoMtx;
    }

    public void setContTaxoMtx(BigDecimal contTaxoMtx) {
        this.contTaxoMtx = contTaxoMtx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeTaxonomia that = (MaeTaxonomia) o;

        if (idenTaxoMtx != null ? !idenTaxoMtx.equals(that.idenTaxoMtx) : that.idenTaxoMtx != null) return false;
        if (descTaxoMtx != null ? !descTaxoMtx.equals(that.descTaxoMtx) : that.descTaxoMtx != null) return false;
        if (idepTaxoMtx != null ? !idepTaxoMtx.equals(that.idepTaxoMtx) : that.idepTaxoMtx != null) return false;
        if (flagEstaMtx != null ? !flagEstaMtx.equals(that.flagEstaMtx) : that.flagEstaMtx != null) return false;
        if (contTaxoMtx != null ? !contTaxoMtx.equals(that.contTaxoMtx) : that.contTaxoMtx != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenTaxoMtx != null ? idenTaxoMtx.hashCode() : 0;
        result = 31 * result + (descTaxoMtx != null ? descTaxoMtx.hashCode() : 0);
        result = 31 * result + (idepTaxoMtx != null ? idepTaxoMtx.hashCode() : 0);
        result = 31 * result + (flagEstaMtx != null ? flagEstaMtx.hashCode() : 0);
        result = 31 * result + (contTaxoMtx != null ? contTaxoMtx.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "maeTaxonomiaByIdenTaxoMtx")
    public Collection<TrmTramiTaxonomia> getTrmTramiTaxonomiasByIdenTaxoMtx() {
        return trmTramiTaxonomiasByIdenTaxoMtx;
    }

    public void setTrmTramiTaxonomiasByIdenTaxoMtx(Collection<TrmTramiTaxonomia> trmTramiTaxonomiasByIdenTaxoMtx) {
        this.trmTramiTaxonomiasByIdenTaxoMtx = trmTramiTaxonomiasByIdenTaxoMtx;
    }
}
