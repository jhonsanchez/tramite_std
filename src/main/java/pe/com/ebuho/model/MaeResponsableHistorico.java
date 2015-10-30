package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "MAE_RESPONSABLE_HISTORICO", catalog = "")
public class MaeResponsableHistorico {
    private BigDecimal idenRespRhi;
    private BigDecimal idenAreaAre;
    private BigDecimal idenPersPer;
    private Timestamp fechInicRhi;
    private Timestamp fechFinaRhi;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private BigInteger flagEstaRhi;
    private String nombEquiAud;
    private String nombSopeAud;
    private MaeArea maeAreaByIdenAreaAre;

    @Id
    @Column(name = "IDEN_RESP_RHI")
    public BigDecimal getIdenRespRhi() {
        return idenRespRhi;
    }

    public void setIdenRespRhi(BigDecimal idenRespRhi) {
        this.idenRespRhi = idenRespRhi;
    }

    @Basic
    @Column(name = "IDEN_AREA_ARE")
    public BigDecimal getIdenAreaAre() {
        return idenAreaAre;
    }

    public void setIdenAreaAre(BigDecimal idenAreaAre) {
        this.idenAreaAre = idenAreaAre;
    }

    @Basic
    @Column(name = "IDEN_PERS_PER")
    public BigDecimal getIdenPersPer() {
        return idenPersPer;
    }

    public void setIdenPersPer(BigDecimal idenPersPer) {
        this.idenPersPer = idenPersPer;
    }

    @Basic
    @Column(name = "FECH_INIC_RHI")
    public Timestamp getFechInicRhi() {
        return fechInicRhi;
    }

    public void setFechInicRhi(Timestamp fechInicRhi) {
        this.fechInicRhi = fechInicRhi;
    }

    @Basic
    @Column(name = "FECH_FINA_RHI")
    public Timestamp getFechFinaRhi() {
        return fechFinaRhi;
    }

    public void setFechFinaRhi(Timestamp fechFinaRhi) {
        this.fechFinaRhi = fechFinaRhi;
    }

    @Basic
    @Column(name = "USUA_CREA_AUD")
    public String getUsuaCreaAud() {
        return usuaCreaAud;
    }

    public void setUsuaCreaAud(String usuaCreaAud) {
        this.usuaCreaAud = usuaCreaAud;
    }

    @Basic
    @Column(name = "FECH_CREA_AUD")
    public Timestamp getFechCreaAud() {
        return fechCreaAud;
    }

    public void setFechCreaAud(Timestamp fechCreaAud) {
        this.fechCreaAud = fechCreaAud;
    }

    @Basic
    @Column(name = "USUA_MODI_AUD")
    public String getUsuaModiAud() {
        return usuaModiAud;
    }

    public void setUsuaModiAud(String usuaModiAud) {
        this.usuaModiAud = usuaModiAud;
    }

    @Basic
    @Column(name = "FECH_MODI_AUD")
    public Timestamp getFechModiAud() {
        return fechModiAud;
    }

    public void setFechModiAud(Timestamp fechModiAud) {
        this.fechModiAud = fechModiAud;
    }

    @Basic
    @Column(name = "FLAG_ESTA_RHI")
    public BigInteger getFlagEstaRhi() {
        return flagEstaRhi;
    }

    public void setFlagEstaRhi(BigInteger flagEstaRhi) {
        this.flagEstaRhi = flagEstaRhi;
    }

    @Basic
    @Column(name = "NOMB_EQUI_AUD")
    public String getNombEquiAud() {
        return nombEquiAud;
    }

    public void setNombEquiAud(String nombEquiAud) {
        this.nombEquiAud = nombEquiAud;
    }

    @Basic
    @Column(name = "NOMB_SOPE_AUD")
    public String getNombSopeAud() {
        return nombSopeAud;
    }

    public void setNombSopeAud(String nombSopeAud) {
        this.nombSopeAud = nombSopeAud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeResponsableHistorico that = (MaeResponsableHistorico) o;

        if (idenRespRhi != null ? !idenRespRhi.equals(that.idenRespRhi) : that.idenRespRhi != null) return false;
        if (idenAreaAre != null ? !idenAreaAre.equals(that.idenAreaAre) : that.idenAreaAre != null) return false;
        if (idenPersPer != null ? !idenPersPer.equals(that.idenPersPer) : that.idenPersPer != null) return false;
        if (fechInicRhi != null ? !fechInicRhi.equals(that.fechInicRhi) : that.fechInicRhi != null) return false;
        if (fechFinaRhi != null ? !fechFinaRhi.equals(that.fechFinaRhi) : that.fechFinaRhi != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (flagEstaRhi != null ? !flagEstaRhi.equals(that.flagEstaRhi) : that.flagEstaRhi != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenRespRhi != null ? idenRespRhi.hashCode() : 0;
        result = 31 * result + (idenAreaAre != null ? idenAreaAre.hashCode() : 0);
        result = 31 * result + (idenPersPer != null ? idenPersPer.hashCode() : 0);
        result = 31 * result + (fechInicRhi != null ? fechInicRhi.hashCode() : 0);
        result = 31 * result + (fechFinaRhi != null ? fechFinaRhi.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (flagEstaRhi != null ? flagEstaRhi.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_AREA_ARE", referencedColumnName = "IDEN_AREA_ARE",insertable = false,updatable = false)
    public MaeArea getMaeAreaByIdenAreaAre() {
        return maeAreaByIdenAreaAre;
    }

    public void setMaeAreaByIdenAreaAre(MaeArea maeAreaByIdenAreaAre) {
        this.maeAreaByIdenAreaAre = maeAreaByIdenAreaAre;
    }
}
