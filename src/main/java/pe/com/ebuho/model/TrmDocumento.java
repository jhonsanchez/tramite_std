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
@Table(name = "TRM_DOCUMENTO", catalog = "")
public class TrmDocumento implements Serializable{
    private BigDecimal idenExpeTrm;

    @Id
    @javax.persistence.Column(name = "IDEN_EXPE_TRM")
    public BigDecimal getIdenExpeTrm() {
        return idenExpeTrm;
    }

    public void setIdenExpeTrm(BigDecimal idenExpeTrm) {
        this.idenExpeTrm = idenExpeTrm;
    }

    private int secuDocuDoc;

    @Id
    @javax.persistence.Column(name = "SECU_DOCU_DOC")
    public int getSecuDocuDoc() {
        return secuDocuDoc;
    }

    public void setSecuDocuDoc(int secuDocuDoc) {
        this.secuDocuDoc = secuDocuDoc;
    }

    private Timestamp fechVigeDoc;

    @Basic
    @javax.persistence.Column(name = "FECH_VIGE_DOC")
    public Timestamp getFechVigeDoc() {
        return fechVigeDoc;
    }

    public void setFechVigeDoc(Timestamp fechVigeDoc) {
        this.fechVigeDoc = fechVigeDoc;
    }

    private Timestamp fechEmisDoc;

    @Basic
    @javax.persistence.Column(name = "FECH_EMIS_DOC")
    public Timestamp getFechEmisDoc() {
        return fechEmisDoc;
    }

    public void setFechEmisDoc(Timestamp fechEmisDoc) {
        this.fechEmisDoc = fechEmisDoc;
    }

    private Integer numeFoliDoc;

    @Basic
    @javax.persistence.Column(name = "NUME_FOLI_DOC")
    public Integer getNumeFoliDoc() {
        return numeFoliDoc;
    }

    public void setNumeFoliDoc(Integer numeFoliDoc) {
        this.numeFoliDoc = numeFoliDoc;
    }

    private String descObseDoc;

    @Basic
    @javax.persistence.Column(name = "DESC_OBSE_DOC")
    public String getDescObseDoc() {
        return descObseDoc;
    }

    public void setDescObseDoc(String descObseDoc) {
        this.descObseDoc = descObseDoc;
    }

    private BigDecimal emprExpiDoc;

    @Basic
    @javax.persistence.Column(name = "EMPR_EXPI_DOC")
    public BigDecimal getEmprExpiDoc() {
        return emprExpiDoc;
    }

    public void setEmprExpiDoc(BigDecimal emprExpiDoc) {
        this.emprExpiDoc = emprExpiDoc;
    }

    private String nombRutaDoc;

    @Basic
    @javax.persistence.Column(name = "NOMB_RUTA_DOC")
    public String getNombRutaDoc() {
        return nombRutaDoc;
    }

    public void setNombRutaDoc(String nombRutaDoc) {
        this.nombRutaDoc = nombRutaDoc;
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

    private Integer secuMaeReq;

    @Basic
    @javax.persistence.Column(name = "SECU_MAE_REQ")
    public Integer getSecuMaeReq() {
        return secuMaeReq;
    }

    public void setSecuMaeReq(Integer secuMaeReq) {
        this.secuMaeReq = secuMaeReq;
    }

    private String flagFisiDoc;

    @Basic
    @javax.persistence.Column(name = "FLAG_FISI_DOC")
    public String getFlagFisiDoc() {
        return flagFisiDoc;
    }

    public void setFlagFisiDoc(String flagFisiDoc) {
        this.flagFisiDoc = flagFisiDoc;
    }

    private String flagPertDoc;

    @Basic
    @javax.persistence.Column(name = "FLAG_PERT_DOC")
    public String getFlagPertDoc() {
        return flagPertDoc;
    }

    public void setFlagPertDoc(String flagPertDoc) {
        this.flagPertDoc = flagPertDoc;
    }

    private String descNombDoc;

    @Basic
    @javax.persistence.Column(name = "DESC_NOMB_DOC")
    public String getDescNombDoc() {
        return descNombDoc;
    }

    public void setDescNombDoc(String descNombDoc) {
        this.descNombDoc = descNombDoc;
    }

    private String usuaRegiAud;

    @Basic
    @javax.persistence.Column(name = "USUA_REGI_AUD")
    public String getUsuaRegiAud() {
        return usuaRegiAud;
    }

    public void setUsuaRegiAud(String usuaRegiAud) {
        this.usuaRegiAud = usuaRegiAud;
    }

    private Timestamp fechRegiAud;

    @Basic
    @javax.persistence.Column(name = "FECH_REGI_AUD")
    public Timestamp getFechRegiAud() {
        return fechRegiAud;
    }

    public void setFechRegiAud(Timestamp fechRegiAud) {
        this.fechRegiAud = fechRegiAud;
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

    private BigInteger flagEstaDoc;

    @Basic
    @javax.persistence.Column(name = "FLAG_ESTA_DOC")
    public BigInteger getFlagEstaDoc() {
        return flagEstaDoc;
    }

    public void setFlagEstaDoc(BigInteger flagEstaDoc) {
        this.flagEstaDoc = flagEstaDoc;
    }

    private BigDecimal codiTipoReq;

    @Basic
    @javax.persistence.Column(name = "CODI_TIPO_REQ")
    public BigDecimal getCodiTipoReq() {
        return codiTipoReq;
    }

    public void setCodiTipoReq(BigDecimal codiTipoReq) {
        this.codiTipoReq = codiTipoReq;
    }

    private BigDecimal secuTipoDoc;

    @Basic
    @javax.persistence.Column(name = "SECU_TIPO_DOC")
    public BigDecimal getSecuTipoDoc() {
        return secuTipoDoc;
    }

    public void setSecuTipoDoc(BigDecimal secuTipoDoc) {
        this.secuTipoDoc = secuTipoDoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrmDocumento that = (TrmDocumento) o;

        if (secuDocuDoc != that.secuDocuDoc) return false;
        if (idenExpeTrm != null ? !idenExpeTrm.equals(that.idenExpeTrm) : that.idenExpeTrm != null) return false;
        if (fechVigeDoc != null ? !fechVigeDoc.equals(that.fechVigeDoc) : that.fechVigeDoc != null) return false;
        if (fechEmisDoc != null ? !fechEmisDoc.equals(that.fechEmisDoc) : that.fechEmisDoc != null) return false;
        if (numeFoliDoc != null ? !numeFoliDoc.equals(that.numeFoliDoc) : that.numeFoliDoc != null) return false;
        if (descObseDoc != null ? !descObseDoc.equals(that.descObseDoc) : that.descObseDoc != null) return false;
        if (emprExpiDoc != null ? !emprExpiDoc.equals(that.emprExpiDoc) : that.emprExpiDoc != null) return false;
        if (nombRutaDoc != null ? !nombRutaDoc.equals(that.nombRutaDoc) : that.nombRutaDoc != null) return false;
        if (idenProcPrc != null ? !idenProcPrc.equals(that.idenProcPrc) : that.idenProcPrc != null) return false;
        if (secuMaeReq != null ? !secuMaeReq.equals(that.secuMaeReq) : that.secuMaeReq != null) return false;
        if (flagFisiDoc != null ? !flagFisiDoc.equals(that.flagFisiDoc) : that.flagFisiDoc != null) return false;
        if (flagPertDoc != null ? !flagPertDoc.equals(that.flagPertDoc) : that.flagPertDoc != null) return false;
        if (descNombDoc != null ? !descNombDoc.equals(that.descNombDoc) : that.descNombDoc != null) return false;
        if (usuaRegiAud != null ? !usuaRegiAud.equals(that.usuaRegiAud) : that.usuaRegiAud != null) return false;
        if (fechRegiAud != null ? !fechRegiAud.equals(that.fechRegiAud) : that.fechRegiAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaDoc != null ? !flagEstaDoc.equals(that.flagEstaDoc) : that.flagEstaDoc != null) return false;
        if (codiTipoReq != null ? !codiTipoReq.equals(that.codiTipoReq) : that.codiTipoReq != null) return false;
        if (secuTipoDoc != null ? !secuTipoDoc.equals(that.secuTipoDoc) : that.secuTipoDoc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenExpeTrm != null ? idenExpeTrm.hashCode() : 0;
        result = 31 * result + secuDocuDoc;
        result = 31 * result + (fechVigeDoc != null ? fechVigeDoc.hashCode() : 0);
        result = 31 * result + (fechEmisDoc != null ? fechEmisDoc.hashCode() : 0);
        result = 31 * result + (numeFoliDoc != null ? numeFoliDoc.hashCode() : 0);
        result = 31 * result + (descObseDoc != null ? descObseDoc.hashCode() : 0);
        result = 31 * result + (emprExpiDoc != null ? emprExpiDoc.hashCode() : 0);
        result = 31 * result + (nombRutaDoc != null ? nombRutaDoc.hashCode() : 0);
        result = 31 * result + (idenProcPrc != null ? idenProcPrc.hashCode() : 0);
        result = 31 * result + (secuMaeReq != null ? secuMaeReq.hashCode() : 0);
        result = 31 * result + (flagFisiDoc != null ? flagFisiDoc.hashCode() : 0);
        result = 31 * result + (flagPertDoc != null ? flagPertDoc.hashCode() : 0);
        result = 31 * result + (descNombDoc != null ? descNombDoc.hashCode() : 0);
        result = 31 * result + (usuaRegiAud != null ? usuaRegiAud.hashCode() : 0);
        result = 31 * result + (fechRegiAud != null ? fechRegiAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaDoc != null ? flagEstaDoc.hashCode() : 0);
        result = 31 * result + (codiTipoReq != null ? codiTipoReq.hashCode() : 0);
        result = 31 * result + (secuTipoDoc != null ? secuTipoDoc.hashCode() : 0);
        return result;
    }
}
