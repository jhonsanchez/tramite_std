package pe.com.ebuho.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "MAE_PROCESO", catalog = "")
public class MaeProceso {
    private BigDecimal idenProcPrc;

    @Id
    @javax.persistence.Column(name = "IDEN_PROC_PRC")
    public BigDecimal getIdenProcPrc() {
        return idenProcPrc;
    }

    public void setIdenProcPrc(BigDecimal idenProcPrc) {
        this.idenProcPrc = idenProcPrc;
    }

    private BigDecimal codiPropPrc;

    @Basic
    @javax.persistence.Column(name = "CODI_PROP_PRC")
    public BigDecimal getCodiPropPrc() {
        return codiPropPrc;
    }

    public void setCodiPropPrc(BigDecimal codiPropPrc) {
        this.codiPropPrc = codiPropPrc;
    }

    private String nombProcPrc;

    @Basic
    @javax.persistence.Column(name = "NOMB_PROC_PRC")
    public String getNombProcPrc() {
        return nombProcPrc;
    }

    public void setNombProcPrc(String nombProcPrc) {
        this.nombProcPrc = nombProcPrc;
    }

    private BigInteger tipoProcPrc;

    @Basic
    @javax.persistence.Column(name = "TIPO_PROC_PRC")
    public BigInteger getTipoProcPrc() {
        return tipoProcPrc;
    }

    public void setTipoProcPrc(BigInteger tipoProcPrc) {
        this.tipoProcPrc = tipoProcPrc;
    }

    private BigDecimal tiemDemoPrc;

    @Basic
    @javax.persistence.Column(name = "TIEM_DEMO_PRC")
    public BigDecimal getTiemDemoPrc() {
        return tiemDemoPrc;
    }

    public void setTiemDemoPrc(BigDecimal tiemDemoPrc) {
        this.tiemDemoPrc = tiemDemoPrc;
    }

    private BigInteger niveProcPrc;

    @Basic
    @javax.persistence.Column(name = "NIVE_PROC_PRC")
    public BigInteger getNiveProcPrc() {
        return niveProcPrc;
    }

    public void setNiveProcPrc(BigInteger niveProcPrc) {
        this.niveProcPrc = niveProcPrc;
    }

    private BigDecimal idenAreaAre;

    @Basic
    @javax.persistence.Column(name = "IDEN_AREA_ARE")
    public BigDecimal getIdenAreaAre() {
        return idenAreaAre;
    }

    public void setIdenAreaAre(BigDecimal idenAreaAre) {
        this.idenAreaAre = idenAreaAre;
    }

    private BigDecimal ordeSecuPrc;

    @Basic
    @javax.persistence.Column(name = "ORDE_SECU_PRC")
    public BigDecimal getOrdeSecuPrc() {
        return ordeSecuPrc;
    }

    public void setOrdeSecuPrc(BigDecimal ordeSecuPrc) {
        this.ordeSecuPrc = ordeSecuPrc;
    }

    private Integer secuEstaPrc;

    @Basic
    @javax.persistence.Column(name = "SECU_ESTA_PRC")
    public Integer getSecuEstaPrc() {
        return secuEstaPrc;
    }

    public void setSecuEstaPrc(Integer secuEstaPrc) {
        this.secuEstaPrc = secuEstaPrc;
    }

    private String pagiProcPrc;

    @Basic
    @javax.persistence.Column(name = "PAGI_PROC_PRC")
    public String getPagiProcPrc() {
        return pagiProcPrc;
    }

    public void setPagiProcPrc(String pagiProcPrc) {
        this.pagiProcPrc = pagiProcPrc;
    }

    private BigInteger flagAlerPrc;

    @Basic
    @javax.persistence.Column(name = "FLAG_ALER_PRC")
    public BigInteger getFlagAlerPrc() {
        return flagAlerPrc;
    }

    public void setFlagAlerPrc(BigInteger flagAlerPrc) {
        this.flagAlerPrc = flagAlerPrc;
    }

    private String asunEmaiPrc;

    @Basic
    @javax.persistence.Column(name = "ASUN_EMAI_PRC")
    public String getAsunEmaiPrc() {
        return asunEmaiPrc;
    }

    public void setAsunEmaiPrc(String asunEmaiPrc) {
        this.asunEmaiPrc = asunEmaiPrc;
    }

    private String cabeEmaiPrc;

    @Basic
    @javax.persistence.Column(name = "CABE_EMAI_PRC")
    public String getCabeEmaiPrc() {
        return cabeEmaiPrc;
    }

    public void setCabeEmaiPrc(String cabeEmaiPrc) {
        this.cabeEmaiPrc = cabeEmaiPrc;
    }

    private String piepEmaiPrc;

    @Basic
    @javax.persistence.Column(name = "PIEP_EMAI_PRC")
    public String getPiepEmaiPrc() {
        return piepEmaiPrc;
    }

    public void setPiepEmaiPrc(String piepEmaiPrc) {
        this.piepEmaiPrc = piepEmaiPrc;
    }

    private String usuaCreaAud;

    @Basic
    @javax.persistence.Column(name = "USUA_CREA_AUD")
    public String getUsuaCreaAud() {
        return usuaCreaAud;
    }

    public void setUsuaCreaAud(String usuaCreaAud) {
        this.usuaCreaAud = usuaCreaAud;
    }

    private Timestamp fechCreaAud;

    @Basic
    @javax.persistence.Column(name = "FECH_CREA_AUD")
    public Timestamp getFechCreaAud() {
        return fechCreaAud;
    }

    public void setFechCreaAud(Timestamp fechCreaAud) {
        this.fechCreaAud = fechCreaAud;
    }

    private String usuaModiAud;

    @Basic
    @javax.persistence.Column(name = "USUA_MODI_AUD")
    public String getUsuaModiAud() {
        return usuaModiAud;
    }

    public void setUsuaModiAud(String usuaModiAud) {
        this.usuaModiAud = usuaModiAud;
    }

    private Timestamp fechModiAud;

    @Basic
    @javax.persistence.Column(name = "FECH_MODI_AUD")
    public Timestamp getFechModiAud() {
        return fechModiAud;
    }

    public void setFechModiAud(Timestamp fechModiAud) {
        this.fechModiAud = fechModiAud;
    }

    private String nombEquiAud;

    @Basic
    @javax.persistence.Column(name = "NOMB_EQUI_AUD")
    public String getNombEquiAud() {
        return nombEquiAud;
    }

    public void setNombEquiAud(String nombEquiAud) {
        this.nombEquiAud = nombEquiAud;
    }

    private String nombSopeAud;

    @Basic
    @javax.persistence.Column(name = "NOMB_SOPE_AUD")
    public String getNombSopeAud() {
        return nombSopeAud;
    }

    public void setNombSopeAud(String nombSopeAud) {
        this.nombSopeAud = nombSopeAud;
    }

    private BigInteger flagEstaPrc;

    @Basic
    @javax.persistence.Column(name = "FLAG_ESTA_PRC")
    public BigInteger getFlagEstaPrc() {
        return flagEstaPrc;
    }

    public void setFlagEstaPrc(BigInteger flagEstaPrc) {
        this.flagEstaPrc = flagEstaPrc;
    }

    private BigInteger flagVistPrc;

    @Basic
    @javax.persistence.Column(name = "FLAG_VIST_PRC")
    public BigInteger getFlagVistPrc() {
        return flagVistPrc;
    }

    public void setFlagVistPrc(BigInteger flagVistPrc) {
        this.flagVistPrc = flagVistPrc;
    }

    private BigInteger flagRecePrc;

    @Basic
    @javax.persistence.Column(name = "FLAG_RECE_PRC")
    public BigInteger getFlagRecePrc() {
        return flagRecePrc;
    }

    public void setFlagRecePrc(BigInteger flagRecePrc) {
        this.flagRecePrc = flagRecePrc;
    }

    private BigInteger flagJefePrc;

    @Basic
    @javax.persistence.Column(name = "FLAG_JEFE_PRC")
    public BigInteger getFlagJefePrc() {
        return flagJefePrc;
    }

    public void setFlagJefePrc(BigInteger flagJefePrc) {
        this.flagJefePrc = flagJefePrc;
    }

    private BigInteger flagAlerRes;

    @Basic
    @javax.persistence.Column(name = "FLAG_ALER_RES")
    public BigInteger getFlagAlerRes() {
        return flagAlerRes;
    }

    public void setFlagAlerRes(BigInteger flagAlerRes) {
        this.flagAlerRes = flagAlerRes;
    }

    private BigInteger flagAlerAdm;

    @Basic
    @javax.persistence.Column(name = "FLAG_ALER_ADM")
    public BigInteger getFlagAlerAdm() {
        return flagAlerAdm;
    }

    public void setFlagAlerAdm(BigInteger flagAlerAdm) {
        this.flagAlerAdm = flagAlerAdm;
    }

    private BigInteger flagAlerUsu;

    @Basic
    @javax.persistence.Column(name = "FLAG_ALER_USU")
    public BigInteger getFlagAlerUsu() {
        return flagAlerUsu;
    }

    public void setFlagAlerUsu(BigInteger flagAlerUsu) {
        this.flagAlerUsu = flagAlerUsu;
    }

    private BigInteger flagAutoPrc;

    @Basic
    @javax.persistence.Column(name = "FLAG_AUTO_PRC")
    public BigInteger getFlagAutoPrc() {
        return flagAutoPrc;
    }

    public void setFlagAutoPrc(BigInteger flagAutoPrc) {
        this.flagAutoPrc = flagAutoPrc;
    }

    private String descAsunPrc;

    @Basic
    @javax.persistence.Column(name = "DESC_ASUN_PRC")
    public String getDescAsunPrc() {
        return descAsunPrc;
    }

    public void setDescAsunPrc(String descAsunPrc) {
        this.descAsunPrc = descAsunPrc;
    }

    private String descCabePrc;

    @Basic
    @javax.persistence.Column(name = "DESC_CABE_PRC")
    public String getDescCabePrc() {
        return descCabePrc;
    }

    public void setDescCabePrc(String descCabePrc) {
        this.descCabePrc = descCabePrc;
    }

    private String descCue1Prc;

    @Basic
    @javax.persistence.Column(name = "DESC_CUE1_PRC")
    public String getDescCue1Prc() {
        return descCue1Prc;
    }

    public void setDescCue1Prc(String descCue1Prc) {
        this.descCue1Prc = descCue1Prc;
    }

    private String descCue2Prc;

    @Basic
    @javax.persistence.Column(name = "DESC_CUE2_PRC")
    public String getDescCue2Prc() {
        return descCue2Prc;
    }

    public void setDescCue2Prc(String descCue2Prc) {
        this.descCue2Prc = descCue2Prc;
    }

    private String descCue3Prc;

    @Basic
    @javax.persistence.Column(name = "DESC_CUE3_PRC")
    public String getDescCue3Prc() {
        return descCue3Prc;
    }

    public void setDescCue3Prc(String descCue3Prc) {
        this.descCue3Prc = descCue3Prc;
    }

    private String descPiepPrc;

    @Basic
    @javax.persistence.Column(name = "DESC_PIEP_PRC")
    public String getDescPiepPrc() {
        return descPiepPrc;
    }

    public void setDescPiepPrc(String descPiepPrc) {
        this.descPiepPrc = descPiepPrc;
    }

    private BigInteger flagAlerDen;

    @Basic
    @javax.persistence.Column(name = "FLAG_ALER_DEN")
    public BigInteger getFlagAlerDen() {
        return flagAlerDen;
    }

    public void setFlagAlerDen(BigInteger flagAlerDen) {
        this.flagAlerDen = flagAlerDen;
    }

    private BigInteger flagCiclPrc;

    @Basic
    @javax.persistence.Column(name = "FLAG_CICL_PRC")
    public BigInteger getFlagCiclPrc() {
        return flagCiclPrc;
    }

    public void setFlagCiclPrc(BigInteger flagCiclPrc) {
        this.flagCiclPrc = flagCiclPrc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeProceso that = (MaeProceso) o;

        if (idenProcPrc != null ? !idenProcPrc.equals(that.idenProcPrc) : that.idenProcPrc != null) return false;
        if (codiPropPrc != null ? !codiPropPrc.equals(that.codiPropPrc) : that.codiPropPrc != null) return false;
        if (nombProcPrc != null ? !nombProcPrc.equals(that.nombProcPrc) : that.nombProcPrc != null) return false;
        if (tipoProcPrc != null ? !tipoProcPrc.equals(that.tipoProcPrc) : that.tipoProcPrc != null) return false;
        if (tiemDemoPrc != null ? !tiemDemoPrc.equals(that.tiemDemoPrc) : that.tiemDemoPrc != null) return false;
        if (niveProcPrc != null ? !niveProcPrc.equals(that.niveProcPrc) : that.niveProcPrc != null) return false;
        if (idenAreaAre != null ? !idenAreaAre.equals(that.idenAreaAre) : that.idenAreaAre != null) return false;
        if (ordeSecuPrc != null ? !ordeSecuPrc.equals(that.ordeSecuPrc) : that.ordeSecuPrc != null) return false;
        if (secuEstaPrc != null ? !secuEstaPrc.equals(that.secuEstaPrc) : that.secuEstaPrc != null) return false;
        if (pagiProcPrc != null ? !pagiProcPrc.equals(that.pagiProcPrc) : that.pagiProcPrc != null) return false;
        if (flagAlerPrc != null ? !flagAlerPrc.equals(that.flagAlerPrc) : that.flagAlerPrc != null) return false;
        if (asunEmaiPrc != null ? !asunEmaiPrc.equals(that.asunEmaiPrc) : that.asunEmaiPrc != null) return false;
        if (cabeEmaiPrc != null ? !cabeEmaiPrc.equals(that.cabeEmaiPrc) : that.cabeEmaiPrc != null) return false;
        if (piepEmaiPrc != null ? !piepEmaiPrc.equals(that.piepEmaiPrc) : that.piepEmaiPrc != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaPrc != null ? !flagEstaPrc.equals(that.flagEstaPrc) : that.flagEstaPrc != null) return false;
        if (flagVistPrc != null ? !flagVistPrc.equals(that.flagVistPrc) : that.flagVistPrc != null) return false;
        if (flagRecePrc != null ? !flagRecePrc.equals(that.flagRecePrc) : that.flagRecePrc != null) return false;
        if (flagJefePrc != null ? !flagJefePrc.equals(that.flagJefePrc) : that.flagJefePrc != null) return false;
        if (flagAlerRes != null ? !flagAlerRes.equals(that.flagAlerRes) : that.flagAlerRes != null) return false;
        if (flagAlerAdm != null ? !flagAlerAdm.equals(that.flagAlerAdm) : that.flagAlerAdm != null) return false;
        if (flagAlerUsu != null ? !flagAlerUsu.equals(that.flagAlerUsu) : that.flagAlerUsu != null) return false;
        if (flagAutoPrc != null ? !flagAutoPrc.equals(that.flagAutoPrc) : that.flagAutoPrc != null) return false;
        if (descAsunPrc != null ? !descAsunPrc.equals(that.descAsunPrc) : that.descAsunPrc != null) return false;
        if (descCabePrc != null ? !descCabePrc.equals(that.descCabePrc) : that.descCabePrc != null) return false;
        if (descCue1Prc != null ? !descCue1Prc.equals(that.descCue1Prc) : that.descCue1Prc != null) return false;
        if (descCue2Prc != null ? !descCue2Prc.equals(that.descCue2Prc) : that.descCue2Prc != null) return false;
        if (descCue3Prc != null ? !descCue3Prc.equals(that.descCue3Prc) : that.descCue3Prc != null) return false;
        if (descPiepPrc != null ? !descPiepPrc.equals(that.descPiepPrc) : that.descPiepPrc != null) return false;
        if (flagAlerDen != null ? !flagAlerDen.equals(that.flagAlerDen) : that.flagAlerDen != null) return false;
        if (flagCiclPrc != null ? !flagCiclPrc.equals(that.flagCiclPrc) : that.flagCiclPrc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenProcPrc != null ? idenProcPrc.hashCode() : 0;
        result = 31 * result + (codiPropPrc != null ? codiPropPrc.hashCode() : 0);
        result = 31 * result + (nombProcPrc != null ? nombProcPrc.hashCode() : 0);
        result = 31 * result + (tipoProcPrc != null ? tipoProcPrc.hashCode() : 0);
        result = 31 * result + (tiemDemoPrc != null ? tiemDemoPrc.hashCode() : 0);
        result = 31 * result + (niveProcPrc != null ? niveProcPrc.hashCode() : 0);
        result = 31 * result + (idenAreaAre != null ? idenAreaAre.hashCode() : 0);
        result = 31 * result + (ordeSecuPrc != null ? ordeSecuPrc.hashCode() : 0);
        result = 31 * result + (secuEstaPrc != null ? secuEstaPrc.hashCode() : 0);
        result = 31 * result + (pagiProcPrc != null ? pagiProcPrc.hashCode() : 0);
        result = 31 * result + (flagAlerPrc != null ? flagAlerPrc.hashCode() : 0);
        result = 31 * result + (asunEmaiPrc != null ? asunEmaiPrc.hashCode() : 0);
        result = 31 * result + (cabeEmaiPrc != null ? cabeEmaiPrc.hashCode() : 0);
        result = 31 * result + (piepEmaiPrc != null ? piepEmaiPrc.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaPrc != null ? flagEstaPrc.hashCode() : 0);
        result = 31 * result + (flagVistPrc != null ? flagVistPrc.hashCode() : 0);
        result = 31 * result + (flagRecePrc != null ? flagRecePrc.hashCode() : 0);
        result = 31 * result + (flagJefePrc != null ? flagJefePrc.hashCode() : 0);
        result = 31 * result + (flagAlerRes != null ? flagAlerRes.hashCode() : 0);
        result = 31 * result + (flagAlerAdm != null ? flagAlerAdm.hashCode() : 0);
        result = 31 * result + (flagAlerUsu != null ? flagAlerUsu.hashCode() : 0);
        result = 31 * result + (flagAutoPrc != null ? flagAutoPrc.hashCode() : 0);
        result = 31 * result + (descAsunPrc != null ? descAsunPrc.hashCode() : 0);
        result = 31 * result + (descCabePrc != null ? descCabePrc.hashCode() : 0);
        result = 31 * result + (descCue1Prc != null ? descCue1Prc.hashCode() : 0);
        result = 31 * result + (descCue2Prc != null ? descCue2Prc.hashCode() : 0);
        result = 31 * result + (descCue3Prc != null ? descCue3Prc.hashCode() : 0);
        result = 31 * result + (descPiepPrc != null ? descPiepPrc.hashCode() : 0);
        result = 31 * result + (flagAlerDen != null ? flagAlerDen.hashCode() : 0);
        result = 31 * result + (flagCiclPrc != null ? flagCiclPrc.hashCode() : 0);
        return result;
    }
}
