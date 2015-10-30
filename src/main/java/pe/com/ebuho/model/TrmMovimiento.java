package pe.com.ebuho.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "TRM_MOVIMIENTO", catalog = "")
public class TrmMovimiento implements Serializable{
    private BigDecimal idenExpeTrm;

    @Id
    @javax.persistence.Column(name = "IDEN_EXPE_TRM")
    public BigDecimal getIdenExpeTrm() {
        return idenExpeTrm;
    }

    public void setIdenExpeTrm(BigDecimal idenExpeTrm) {
        this.idenExpeTrm = idenExpeTrm;
    }

    private int secuMoviMvm;

    @Id
    @javax.persistence.Column(name = "SECU_MOVI_MVM")
    public int getSecuMoviMvm() {
        return secuMoviMvm;
    }

    public void setSecuMoviMvm(int secuMoviMvm) {
        this.secuMoviMvm = secuMoviMvm;
    }

    private BigDecimal idenProcPrc;

    @Basic
    @javax.persistence.Column(name = "IDEN_PROC_PRC")
    public BigDecimal getIdenProcPrc() {
        return idenProcPrc;
    }

    public void setIdenProcPrc(BigDecimal idenProcPrc) {
        this.idenProcPrc = idenProcPrc;
    }

    private BigDecimal areaOrigMvm;

    @Basic
    @javax.persistence.Column(name = "AREA_ORIG_MVM")
    public BigDecimal getAreaOrigMvm() {
        return areaOrigMvm;
    }

    public void setAreaOrigMvm(BigDecimal areaOrigMvm) {
        this.areaOrigMvm = areaOrigMvm;
    }

    private String usuaEnviMvm;

    @Basic
    @javax.persistence.Column(name = "USUA_ENVI_MVM")
    public String getUsuaEnviMvm() {
        return usuaEnviMvm;
    }

    public void setUsuaEnviMvm(String usuaEnviMvm) {
        this.usuaEnviMvm = usuaEnviMvm;
    }

    private Timestamp fechEnviMvm;

    @Basic
    @javax.persistence.Column(name = "FECH_ENVI_MVM")
    public Timestamp getFechEnviMvm() {
        return fechEnviMvm;
    }

    public void setFechEnviMvm(Timestamp fechEnviMvm) {
        this.fechEnviMvm = fechEnviMvm;
    }

    private BigDecimal areaDestMvm;

    @Basic
    @javax.persistence.Column(name = "AREA_DEST_MVM")
    public BigDecimal getAreaDestMvm() {
        return areaDestMvm;
    }

    public void setAreaDestMvm(BigDecimal areaDestMvm) {
        this.areaDestMvm = areaDestMvm;
    }

    private String usuaReceMvm;

    @Basic
    @javax.persistence.Column(name = "USUA_RECE_MVM")
    public String getUsuaReceMvm() {
        return usuaReceMvm;
    }

    public void setUsuaReceMvm(String usuaReceMvm) {
        this.usuaReceMvm = usuaReceMvm;
    }

    private Timestamp fechReceMvm;

    @Basic
    @javax.persistence.Column(name = "FECH_RECE_MVM")
    public Timestamp getFechReceMvm() {
        return fechReceMvm;
    }

    public void setFechReceMvm(Timestamp fechReceMvm) {
        this.fechReceMvm = fechReceMvm;
    }

    private String descInfoMvm;

    @Basic
    @javax.persistence.Column(name = "DESC_INFO_MVM")
    public String getDescInfoMvm() {
        return descInfoMvm;
    }

    public void setDescInfoMvm(String descInfoMvm) {
        this.descInfoMvm = descInfoMvm;
    }

    private String usuaAsigMvm;

    @Basic
    @javax.persistence.Column(name = "USUA_ASIG_MVM")
    public String getUsuaAsigMvm() {
        return usuaAsigMvm;
    }

    public void setUsuaAsigMvm(String usuaAsigMvm) {
        this.usuaAsigMvm = usuaAsigMvm;
    }

    private String usuaTrabMvm;

    @Basic
    @javax.persistence.Column(name = "USUA_TRAB_MVM")
    public String getUsuaTrabMvm() {
        return usuaTrabMvm;
    }

    public void setUsuaTrabMvm(String usuaTrabMvm) {
        this.usuaTrabMvm = usuaTrabMvm;
    }

    private Timestamp fechAsigMvm;

    @Basic
    @javax.persistence.Column(name = "FECH_ASIG_MVM")
    public Timestamp getFechAsigMvm() {
        return fechAsigMvm;
    }

    public void setFechAsigMvm(Timestamp fechAsigMvm) {
        this.fechAsigMvm = fechAsigMvm;
    }

    private BigDecimal numeDiasMvm;

    @Basic
    @javax.persistence.Column(name = "NUME_DIAS_MVM")
    public BigDecimal getNumeDiasMvm() {
        return numeDiasMvm;
    }

    public void setNumeDiasMvm(BigDecimal numeDiasMvm) {
        this.numeDiasMvm = numeDiasMvm;
    }

    private Timestamp fechVencMvm;

    @Basic
    @javax.persistence.Column(name = "FECH_VENC_MVM")
    public Timestamp getFechVencMvm() {
        return fechVencMvm;
    }

    public void setFechVencMvm(Timestamp fechVencMvm) {
        this.fechVencMvm = fechVencMvm;
    }

    private Integer codiMotiRec;

    @Basic
    @javax.persistence.Column(name = "CODI_MOTI_REC")
    public Integer getCodiMotiRec() {
        return codiMotiRec;
    }

    public void setCodiMotiRec(Integer codiMotiRec) {
        this.codiMotiRec = codiMotiRec;
    }

    private String descMotiRec;

    @Basic
    @javax.persistence.Column(name = "DESC_MOTI_REC")
    public String getDescMotiRec() {
        return descMotiRec;
    }

    public void setDescMotiRec(String descMotiRec) {
        this.descMotiRec = descMotiRec;
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

    private BigInteger flagSituMvm;

    @Basic
    @javax.persistence.Column(name = "FLAG_SITU_MVM")
    public BigInteger getFlagSituMvm() {
        return flagSituMvm;
    }

    public void setFlagSituMvm(BigInteger flagSituMvm) {
        this.flagSituMvm = flagSituMvm;
    }

    private BigInteger flagEstaMvm;

    @Basic
    @javax.persistence.Column(name = "FLAG_ESTA_MVM")
    public BigInteger getFlagEstaMvm() {
        return flagEstaMvm;
    }

    public void setFlagEstaMvm(BigInteger flagEstaMvm) {
        this.flagEstaMvm = flagEstaMvm;
    }

    private BigDecimal emprTrabMvm;

    @Basic
    @javax.persistence.Column(name = "EMPR_TRAB_MVM")
    public BigDecimal getEmprTrabMvm() {
        return emprTrabMvm;
    }

    public void setEmprTrabMvm(BigDecimal emprTrabMvm) {
        this.emprTrabMvm = emprTrabMvm;
    }

    private BigInteger flagOpinMvm;

    @Basic
    @javax.persistence.Column(name = "FLAG_OPIN_MVM")
    public BigInteger getFlagOpinMvm() {
        return flagOpinMvm;
    }

    public void setFlagOpinMvm(BigInteger flagOpinMvm) {
        this.flagOpinMvm = flagOpinMvm;
    }

    private BigDecimal idenExppMvm;

    @Basic
    @javax.persistence.Column(name = "IDEN_EXPP_MVM")
    public BigDecimal getIdenExppMvm() {
        return idenExppMvm;
    }

    public void setIdenExppMvm(BigDecimal idenExppMvm) {
        this.idenExppMvm = idenExppMvm;
    }

    private Integer secuMovpMvm;

    @Basic
    @javax.persistence.Column(name = "SECU_MOVP_MVM")
    public Integer getSecuMovpMvm() {
        return secuMovpMvm;
    }

    public void setSecuMovpMvm(Integer secuMovpMvm) {
        this.secuMovpMvm = secuMovpMvm;
    }

    private String descOpinMvm;

    @Basic
    @javax.persistence.Column(name = "DESC_OPIN_MVM")
    public String getDescOpinMvm() {
        return descOpinMvm;
    }

    public void setDescOpinMvm(String descOpinMvm) {
        this.descOpinMvm = descOpinMvm;
    }

    private BigDecimal numePaseMvm;

    @Basic
    @javax.persistence.Column(name = "NUME_PASE_MVM")
    public BigDecimal getNumePaseMvm() {
        return numePaseMvm;
    }

    public void setNumePaseMvm(BigDecimal numePaseMvm) {
        this.numePaseMvm = numePaseMvm;
    }

    private String seccAreaMvm;

    @Basic
    @javax.persistence.Column(name = "SECC_AREA_MVM")
    public String getSeccAreaMvm() {
        return seccAreaMvm;
    }

    public void setSeccAreaMvm(String seccAreaMvm) {
        this.seccAreaMvm = seccAreaMvm;
    }

    private Timestamp fechSupeMvm;

    @Basic
    @javax.persistence.Column(name = "FECH_SUPE_MVM")
    public Timestamp getFechSupeMvm() {
        return fechSupeMvm;
    }

    public void setFechSupeMvm(Timestamp fechSupeMvm) {
        this.fechSupeMvm = fechSupeMvm;
    }

    private BigDecimal costSupeMvm;

    @Basic
    @javax.persistence.Column(name = "COST_SUPE_MVM")
    public BigDecimal getCostSupeMvm() {
        return costSupeMvm;
    }

    public void setCostSupeMvm(BigDecimal costSupeMvm) {
        this.costSupeMvm = costSupeMvm;
    }

    private Integer plzoSupeMvm;

    @Basic
    @javax.persistence.Column(name = "PLZO_SUPE_MVM")
    public Integer getPlzoSupeMvm() {
        return plzoSupeMvm;
    }

    public void setPlzoSupeMvm(Integer plzoSupeMvm) {
        this.plzoSupeMvm = plzoSupeMvm;
    }

    private BigDecimal idenPersPer;

    @Basic
    @javax.persistence.Column(name = "IDEN_PERS_PER")
    public BigDecimal getIdenPersPer() {
        return idenPersPer;
    }

    public void setIdenPersPer(BigDecimal idenPersPer) {
        this.idenPersPer = idenPersPer;
    }

    private String descComuMvm;

    @Basic
    @javax.persistence.Column(name = "DESC_COMU_MVM")
    public String getDescComuMvm() {
        return descComuMvm;
    }

    public void setDescComuMvm(String descComuMvm) {
        this.descComuMvm = descComuMvm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrmMovimiento that = (TrmMovimiento) o;

        if (secuMoviMvm != that.secuMoviMvm) return false;
        if (idenExpeTrm != null ? !idenExpeTrm.equals(that.idenExpeTrm) : that.idenExpeTrm != null) return false;
        if (idenProcPrc != null ? !idenProcPrc.equals(that.idenProcPrc) : that.idenProcPrc != null) return false;
        if (areaOrigMvm != null ? !areaOrigMvm.equals(that.areaOrigMvm) : that.areaOrigMvm != null) return false;
        if (usuaEnviMvm != null ? !usuaEnviMvm.equals(that.usuaEnviMvm) : that.usuaEnviMvm != null) return false;
        if (fechEnviMvm != null ? !fechEnviMvm.equals(that.fechEnviMvm) : that.fechEnviMvm != null) return false;
        if (areaDestMvm != null ? !areaDestMvm.equals(that.areaDestMvm) : that.areaDestMvm != null) return false;
        if (usuaReceMvm != null ? !usuaReceMvm.equals(that.usuaReceMvm) : that.usuaReceMvm != null) return false;
        if (fechReceMvm != null ? !fechReceMvm.equals(that.fechReceMvm) : that.fechReceMvm != null) return false;
        if (descInfoMvm != null ? !descInfoMvm.equals(that.descInfoMvm) : that.descInfoMvm != null) return false;
        if (usuaAsigMvm != null ? !usuaAsigMvm.equals(that.usuaAsigMvm) : that.usuaAsigMvm != null) return false;
        if (usuaTrabMvm != null ? !usuaTrabMvm.equals(that.usuaTrabMvm) : that.usuaTrabMvm != null) return false;
        if (fechAsigMvm != null ? !fechAsigMvm.equals(that.fechAsigMvm) : that.fechAsigMvm != null) return false;
        if (numeDiasMvm != null ? !numeDiasMvm.equals(that.numeDiasMvm) : that.numeDiasMvm != null) return false;
        if (fechVencMvm != null ? !fechVencMvm.equals(that.fechVencMvm) : that.fechVencMvm != null) return false;
        if (codiMotiRec != null ? !codiMotiRec.equals(that.codiMotiRec) : that.codiMotiRec != null) return false;
        if (descMotiRec != null ? !descMotiRec.equals(that.descMotiRec) : that.descMotiRec != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagSituMvm != null ? !flagSituMvm.equals(that.flagSituMvm) : that.flagSituMvm != null) return false;
        if (flagEstaMvm != null ? !flagEstaMvm.equals(that.flagEstaMvm) : that.flagEstaMvm != null) return false;
        if (emprTrabMvm != null ? !emprTrabMvm.equals(that.emprTrabMvm) : that.emprTrabMvm != null) return false;
        if (flagOpinMvm != null ? !flagOpinMvm.equals(that.flagOpinMvm) : that.flagOpinMvm != null) return false;
        if (idenExppMvm != null ? !idenExppMvm.equals(that.idenExppMvm) : that.idenExppMvm != null) return false;
        if (secuMovpMvm != null ? !secuMovpMvm.equals(that.secuMovpMvm) : that.secuMovpMvm != null) return false;
        if (descOpinMvm != null ? !descOpinMvm.equals(that.descOpinMvm) : that.descOpinMvm != null) return false;
        if (numePaseMvm != null ? !numePaseMvm.equals(that.numePaseMvm) : that.numePaseMvm != null) return false;
        if (seccAreaMvm != null ? !seccAreaMvm.equals(that.seccAreaMvm) : that.seccAreaMvm != null) return false;
        if (fechSupeMvm != null ? !fechSupeMvm.equals(that.fechSupeMvm) : that.fechSupeMvm != null) return false;
        if (costSupeMvm != null ? !costSupeMvm.equals(that.costSupeMvm) : that.costSupeMvm != null) return false;
        if (plzoSupeMvm != null ? !plzoSupeMvm.equals(that.plzoSupeMvm) : that.plzoSupeMvm != null) return false;
        if (idenPersPer != null ? !idenPersPer.equals(that.idenPersPer) : that.idenPersPer != null) return false;
        if (descComuMvm != null ? !descComuMvm.equals(that.descComuMvm) : that.descComuMvm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenExpeTrm != null ? idenExpeTrm.hashCode() : 0;
        result = 31 * result + secuMoviMvm;
        result = 31 * result + (idenProcPrc != null ? idenProcPrc.hashCode() : 0);
        result = 31 * result + (areaOrigMvm != null ? areaOrigMvm.hashCode() : 0);
        result = 31 * result + (usuaEnviMvm != null ? usuaEnviMvm.hashCode() : 0);
        result = 31 * result + (fechEnviMvm != null ? fechEnviMvm.hashCode() : 0);
        result = 31 * result + (areaDestMvm != null ? areaDestMvm.hashCode() : 0);
        result = 31 * result + (usuaReceMvm != null ? usuaReceMvm.hashCode() : 0);
        result = 31 * result + (fechReceMvm != null ? fechReceMvm.hashCode() : 0);
        result = 31 * result + (descInfoMvm != null ? descInfoMvm.hashCode() : 0);
        result = 31 * result + (usuaAsigMvm != null ? usuaAsigMvm.hashCode() : 0);
        result = 31 * result + (usuaTrabMvm != null ? usuaTrabMvm.hashCode() : 0);
        result = 31 * result + (fechAsigMvm != null ? fechAsigMvm.hashCode() : 0);
        result = 31 * result + (numeDiasMvm != null ? numeDiasMvm.hashCode() : 0);
        result = 31 * result + (fechVencMvm != null ? fechVencMvm.hashCode() : 0);
        result = 31 * result + (codiMotiRec != null ? codiMotiRec.hashCode() : 0);
        result = 31 * result + (descMotiRec != null ? descMotiRec.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagSituMvm != null ? flagSituMvm.hashCode() : 0);
        result = 31 * result + (flagEstaMvm != null ? flagEstaMvm.hashCode() : 0);
        result = 31 * result + (emprTrabMvm != null ? emprTrabMvm.hashCode() : 0);
        result = 31 * result + (flagOpinMvm != null ? flagOpinMvm.hashCode() : 0);
        result = 31 * result + (idenExppMvm != null ? idenExppMvm.hashCode() : 0);
        result = 31 * result + (secuMovpMvm != null ? secuMovpMvm.hashCode() : 0);
        result = 31 * result + (descOpinMvm != null ? descOpinMvm.hashCode() : 0);
        result = 31 * result + (numePaseMvm != null ? numePaseMvm.hashCode() : 0);
        result = 31 * result + (seccAreaMvm != null ? seccAreaMvm.hashCode() : 0);
        result = 31 * result + (fechSupeMvm != null ? fechSupeMvm.hashCode() : 0);
        result = 31 * result + (costSupeMvm != null ? costSupeMvm.hashCode() : 0);
        result = 31 * result + (plzoSupeMvm != null ? plzoSupeMvm.hashCode() : 0);
        result = 31 * result + (idenPersPer != null ? idenPersPer.hashCode() : 0);
        result = 31 * result + (descComuMvm != null ? descComuMvm.hashCode() : 0);
        return result;
    }
}
