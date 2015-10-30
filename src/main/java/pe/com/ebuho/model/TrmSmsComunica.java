package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "TRM_SMS_COMUNICA", catalog = "")
public class TrmSmsComunica {
    private BigDecimal idenConfCom;
    private String destCorrCom;
    private String ccopCorrCom;
    private String ccocCorrCom;
    private String asunCorrCom;
    private String cuerCorrCom;
    private BigDecimal idenCuenCor;
    private BigInteger flagEstaRea;
    private BigDecimal idenProcPrc;
    private String piepCorrCom;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private TrmCuentaCorreo trmCuentaCorreoByIdenCuenCor;

    @Id
    @Column(name = "IDEN_CONF_COM")
    public BigDecimal getIdenConfCom() {
        return idenConfCom;
    }

    public void setIdenConfCom(BigDecimal idenConfCom) {
        this.idenConfCom = idenConfCom;
    }

    @Basic
    @Column(name = "DEST_CORR_COM")
    public String getDestCorrCom() {
        return destCorrCom;
    }

    public void setDestCorrCom(String destCorrCom) {
        this.destCorrCom = destCorrCom;
    }

    @Basic
    @Column(name = "CCOP_CORR_COM")
    public String getCcopCorrCom() {
        return ccopCorrCom;
    }

    public void setCcopCorrCom(String ccopCorrCom) {
        this.ccopCorrCom = ccopCorrCom;
    }

    @Basic
    @Column(name = "CCOC_CORR_COM")
    public String getCcocCorrCom() {
        return ccocCorrCom;
    }

    public void setCcocCorrCom(String ccocCorrCom) {
        this.ccocCorrCom = ccocCorrCom;
    }

    @Basic
    @Column(name = "ASUN_CORR_COM")
    public String getAsunCorrCom() {
        return asunCorrCom;
    }

    public void setAsunCorrCom(String asunCorrCom) {
        this.asunCorrCom = asunCorrCom;
    }

    @Basic
    @Column(name = "CUER_CORR_COM")
    public String getCuerCorrCom() {
        return cuerCorrCom;
    }

    public void setCuerCorrCom(String cuerCorrCom) {
        this.cuerCorrCom = cuerCorrCom;
    }

    @Basic
    @Column(name = "IDEN_CUEN_COR")
    public BigDecimal getIdenCuenCor() {
        return idenCuenCor;
    }

    public void setIdenCuenCor(BigDecimal idenCuenCor) {
        this.idenCuenCor = idenCuenCor;
    }

    @Basic
    @Column(name = "FLAG_ESTA_REA")
    public BigInteger getFlagEstaRea() {
        return flagEstaRea;
    }

    public void setFlagEstaRea(BigInteger flagEstaRea) {
        this.flagEstaRea = flagEstaRea;
    }

    @Basic
    @Column(name = "IDEN_PROC_PRC")
    public BigDecimal getIdenProcPrc() {
        return idenProcPrc;
    }

    public void setIdenProcPrc(BigDecimal idenProcPrc) {
        this.idenProcPrc = idenProcPrc;
    }

    @Basic
    @Column(name = "PIEP_CORR_COM")
    public String getPiepCorrCom() {
        return piepCorrCom;
    }

    public void setPiepCorrCom(String piepCorrCom) {
        this.piepCorrCom = piepCorrCom;
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

        TrmSmsComunica that = (TrmSmsComunica) o;

        if (idenConfCom != null ? !idenConfCom.equals(that.idenConfCom) : that.idenConfCom != null) return false;
        if (destCorrCom != null ? !destCorrCom.equals(that.destCorrCom) : that.destCorrCom != null) return false;
        if (ccopCorrCom != null ? !ccopCorrCom.equals(that.ccopCorrCom) : that.ccopCorrCom != null) return false;
        if (ccocCorrCom != null ? !ccocCorrCom.equals(that.ccocCorrCom) : that.ccocCorrCom != null) return false;
        if (asunCorrCom != null ? !asunCorrCom.equals(that.asunCorrCom) : that.asunCorrCom != null) return false;
        if (cuerCorrCom != null ? !cuerCorrCom.equals(that.cuerCorrCom) : that.cuerCorrCom != null) return false;
        if (idenCuenCor != null ? !idenCuenCor.equals(that.idenCuenCor) : that.idenCuenCor != null) return false;
        if (flagEstaRea != null ? !flagEstaRea.equals(that.flagEstaRea) : that.flagEstaRea != null) return false;
        if (idenProcPrc != null ? !idenProcPrc.equals(that.idenProcPrc) : that.idenProcPrc != null) return false;
        if (piepCorrCom != null ? !piepCorrCom.equals(that.piepCorrCom) : that.piepCorrCom != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenConfCom != null ? idenConfCom.hashCode() : 0;
        result = 31 * result + (destCorrCom != null ? destCorrCom.hashCode() : 0);
        result = 31 * result + (ccopCorrCom != null ? ccopCorrCom.hashCode() : 0);
        result = 31 * result + (ccocCorrCom != null ? ccocCorrCom.hashCode() : 0);
        result = 31 * result + (asunCorrCom != null ? asunCorrCom.hashCode() : 0);
        result = 31 * result + (cuerCorrCom != null ? cuerCorrCom.hashCode() : 0);
        result = 31 * result + (idenCuenCor != null ? idenCuenCor.hashCode() : 0);
        result = 31 * result + (flagEstaRea != null ? flagEstaRea.hashCode() : 0);
        result = 31 * result + (idenProcPrc != null ? idenProcPrc.hashCode() : 0);
        result = 31 * result + (piepCorrCom != null ? piepCorrCom.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_CUEN_COR", referencedColumnName = "IDEN_CUEN_COR",insertable = false,updatable = false)
    public TrmCuentaCorreo getTrmCuentaCorreoByIdenCuenCor() {
        return trmCuentaCorreoByIdenCuenCor;
    }

    public void setTrmCuentaCorreoByIdenCuenCor(TrmCuentaCorreo trmCuentaCorreoByIdenCuenCor) {
        this.trmCuentaCorreoByIdenCuenCor = trmCuentaCorreoByIdenCuenCor;
    }
}
