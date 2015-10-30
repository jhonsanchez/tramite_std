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
@Table(name = "TRM_TRAMITE", catalog = "")
public class TrmTramite {
    private BigDecimal idenExpeTrm;

    @Id
    @javax.persistence.Column(name = "IDEN_EXPE_TRM")
    public BigDecimal getIdenExpeTrm() {
        return idenExpeTrm;
    }

    public void setIdenExpeTrm(BigDecimal idenExpeTrm) {
        this.idenExpeTrm = idenExpeTrm;
    }

    private String numeGuiaTrm;

    @Basic
    @javax.persistence.Column(name = "NUME_GUIA_TRM")
    public String getNumeGuiaTrm() {
        return numeGuiaTrm;
    }

    public void setNumeGuiaTrm(String numeGuiaTrm) {
        this.numeGuiaTrm = numeGuiaTrm;
    }

    private Integer tipoTramTrm;

    @Basic
    @javax.persistence.Column(name = "TIPO_TRAM_TRM")
    public Integer getTipoTramTrm() {
        return tipoTramTrm;
    }

    public void setTipoTramTrm(Integer tipoTramTrm) {
        this.tipoTramTrm = tipoTramTrm;
    }

    private Integer codiOrigTrm;

    @Basic
    @javax.persistence.Column(name = "CODI_ORIG_TRM")
    public Integer getCodiOrigTrm() {
        return codiOrigTrm;
    }

    public void setCodiOrigTrm(Integer codiOrigTrm) {
        this.codiOrigTrm = codiOrigTrm;
    }

    private Integer codiModaTrm;

    @Basic
    @javax.persistence.Column(name = "CODI_MODA_TRM")
    public Integer getCodiModaTrm() {
        return codiModaTrm;
    }

    public void setCodiModaTrm(Integer codiModaTrm) {
        this.codiModaTrm = codiModaTrm;
    }

    private String codiExpeTrm;

    @Basic
    @javax.persistence.Column(name = "CODI_EXPE_TRM")
    public String getCodiExpeTrm() {
        return codiExpeTrm;
    }

    public void setCodiExpeTrm(String codiExpeTrm) {
        this.codiExpeTrm = codiExpeTrm;
    }

    private String codiBarrTrm;

    @Basic
    @javax.persistence.Column(name = "CODI_BARR_TRM")
    public String getCodiBarrTrm() {
        return codiBarrTrm;
    }

    public void setCodiBarrTrm(String codiBarrTrm) {
        this.codiBarrTrm = codiBarrTrm;
    }

    private BigDecimal idenSimuSim;

    @Basic
    @javax.persistence.Column(name = "IDEN_SIMU_SIM")
    public BigDecimal getIdenSimuSim() {
        return idenSimuSim;
    }

    public void setIdenSimuSim(BigDecimal idenSimuSim) {
        this.idenSimuSim = idenSimuSim;
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

    private BigDecimal codiPersTrm;

    @Basic
    @javax.persistence.Column(name = "CODI_PERS_TRM")
    public BigDecimal getCodiPersTrm() {
        return codiPersTrm;
    }

    public void setCodiPersTrm(BigDecimal codiPersTrm) {
        this.codiPersTrm = codiPersTrm;
    }

    private String nombTramTrm;

    @Basic
    @javax.persistence.Column(name = "NOMB_TRAM_TRM")
    public String getNombTramTrm() {
        return nombTramTrm;
    }

    public void setNombTramTrm(String nombTramTrm) {
        this.nombTramTrm = nombTramTrm;
    }

    private BigDecimal numeFolioTrm;

    @Basic
    @javax.persistence.Column(name = "NUME_FOLIO_TRM")
    public BigDecimal getNumeFolioTrm() {
        return numeFolioTrm;
    }

    public void setNumeFolioTrm(BigDecimal numeFolioTrm) {
        this.numeFolioTrm = numeFolioTrm;
    }

    private String descAsunTrm;

    @Basic
    @javax.persistence.Column(name = "DESC_ASUN_TRM")
    public String getDescAsunTrm() {
        return descAsunTrm;
    }

    public void setDescAsunTrm(String descAsunTrm) {
        this.descAsunTrm = descAsunTrm;
    }

    private BigDecimal docuRefeTrm;

    @Basic
    @javax.persistence.Column(name = "DOCU_REFE_TRM")
    public BigDecimal getDocuRefeTrm() {
        return docuRefeTrm;
    }

    public void setDocuRefeTrm(BigDecimal docuRefeTrm) {
        this.docuRefeTrm = docuRefeTrm;
    }

    private Timestamp fechIngrTrm;

    @Basic
    @javax.persistence.Column(name = "FECH_INGR_TRM")
    public Timestamp getFechIngrTrm() {
        return fechIngrTrm;
    }

    public void setFechIngrTrm(Timestamp fechIngrTrm) {
        this.fechIngrTrm = fechIngrTrm;
    }

    private BigDecimal numeDiasTrm;

    @Basic
    @javax.persistence.Column(name = "NUME_DIAS_TRM")
    public BigDecimal getNumeDiasTrm() {
        return numeDiasTrm;
    }

    public void setNumeDiasTrm(BigDecimal numeDiasTrm) {
        this.numeDiasTrm = numeDiasTrm;
    }

    private Timestamp fechVencTrm;

    @Basic
    @javax.persistence.Column(name = "FECH_VENC_TRM")
    public Timestamp getFechVencTrm() {
        return fechVencTrm;
    }

    public void setFechVencTrm(Timestamp fechVencTrm) {
        this.fechVencTrm = fechVencTrm;
    }

    private Integer codiPrioTrm;

    @Basic
    @javax.persistence.Column(name = "CODI_PRIO_TRM")
    public Integer getCodiPrioTrm() {
        return codiPrioTrm;
    }

    public void setCodiPrioTrm(Integer codiPrioTrm) {
        this.codiPrioTrm = codiPrioTrm;
    }

    private BigInteger flagPrivTrm;

    @Basic
    @javax.persistence.Column(name = "FLAG_PRIV_TRM")
    public BigInteger getFlagPrivTrm() {
        return flagPrivTrm;
    }

    public void setFlagPrivTrm(BigInteger flagPrivTrm) {
        this.flagPrivTrm = flagPrivTrm;
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

    private BigInteger flagEstaTrm;

    @Basic
    @javax.persistence.Column(name = "FLAG_ESTA_TRM")
    public BigInteger getFlagEstaTrm() {
        return flagEstaTrm;
    }

    public void setFlagEstaTrm(BigInteger flagEstaTrm) {
        this.flagEstaTrm = flagEstaTrm;
    }

    private BigInteger flagDemaTrm;

    @Basic
    @javax.persistence.Column(name = "FLAG_DEMA_TRM")
    public BigInteger getFlagDemaTrm() {
        return flagDemaTrm;
    }

    public void setFlagDemaTrm(BigInteger flagDemaTrm) {
        this.flagDemaTrm = flagDemaTrm;
    }

    private Integer subtTipoTrm;

    @Basic
    @javax.persistence.Column(name = "SUBT_TIPO_TRM")
    public Integer getSubtTipoTrm() {
        return subtTipoTrm;
    }

    public void setSubtTipoTrm(Integer subtTipoTrm) {
        this.subtTipoTrm = subtTipoTrm;
    }

    private BigDecimal montSoliTrm;

    @Basic
    @javax.persistence.Column(name = "MONT_SOLI_TRM")
    public BigDecimal getMontSoliTrm() {
        return montSoliTrm;
    }

    public void setMontSoliTrm(BigDecimal montSoliTrm) {
        this.montSoliTrm = montSoliTrm;
    }

    private BigDecimal montSentTrm;

    @Basic
    @javax.persistence.Column(name = "MONT_SENT_TRM")
    public BigDecimal getMontSentTrm() {
        return montSentTrm;
    }

    public void setMontSentTrm(BigDecimal montSentTrm) {
        this.montSentTrm = montSentTrm;
    }

    private BigDecimal idenEmprEmp;

    @Basic
    @javax.persistence.Column(name = "IDEN_EMPR_EMP")
    public BigDecimal getIdenEmprEmp() {
        return idenEmprEmp;
    }

    public void setIdenEmprEmp(BigDecimal idenEmprEmp) {
        this.idenEmprEmp = idenEmprEmp;
    }

    private BigDecimal codiExppTrm;

    @Basic
    @javax.persistence.Column(name = "CODI_EXPP_TRM")
    public BigDecimal getCodiExppTrm() {
        return codiExppTrm;
    }

    public void setCodiExppTrm(BigDecimal codiExppTrm) {
        this.codiExppTrm = codiExppTrm;
    }

    private Integer codiMoneCrd;

    @Basic
    @javax.persistence.Column(name = "CODI_MONE_CRD")
    public Integer getCodiMoneCrd() {
        return codiMoneCrd;
    }

    public void setCodiMoneCrd(Integer codiMoneCrd) {
        this.codiMoneCrd = codiMoneCrd;
    }

    private String seriDocuTrm;

    @Basic
    @javax.persistence.Column(name = "SERI_DOCU_TRM")
    public String getSeriDocuTrm() {
        return seriDocuTrm;
    }

    public void setSeriDocuTrm(String seriDocuTrm) {
        this.seriDocuTrm = seriDocuTrm;
    }

    private String numeDocuTrm;

    @Basic
    @javax.persistence.Column(name = "NUME_DOCU_TRM")
    public String getNumeDocuTrm() {
        return numeDocuTrm;
    }

    public void setNumeDocuTrm(String numeDocuTrm) {
        this.numeDocuTrm = numeDocuTrm;
    }

    private String idenTramTrm;

    @Basic
    @javax.persistence.Column(name = "IDEN_TRAM_TRM")
    public String getIdenTramTrm() {
        return idenTramTrm;
    }

    public void setIdenTramTrm(String idenTramTrm) {
        this.idenTramTrm = idenTramTrm;
    }

    private BigDecimal idenPeraTrm;

    @Basic
    @javax.persistence.Column(name = "IDEN_PERA_TRM")
    public BigDecimal getIdenPeraTrm() {
        return idenPeraTrm;
    }

    public void setIdenPeraTrm(BigDecimal idenPeraTrm) {
        this.idenPeraTrm = idenPeraTrm;
    }

    private BigDecimal idenProcTrm;

    @Basic
    @javax.persistence.Column(name = "IDEN_PROC_TRM")
    public BigDecimal getIdenProcTrm() {
        return idenProcTrm;
    }

    public void setIdenProcTrm(BigDecimal idenProcTrm) {
        this.idenProcTrm = idenProcTrm;
    }

    private Timestamp fechIngrNot;

    @Basic
    @javax.persistence.Column(name = "FECH_INGR_NOT")
    public Timestamp getFechIngrNot() {
        return fechIngrNot;
    }

    public void setFechIngrNot(Timestamp fechIngrNot) {
        this.fechIngrNot = fechIngrNot;
    }

    private Timestamp fechSaliNot;

    @Basic
    @javax.persistence.Column(name = "FECH_SALI_NOT")
    public Timestamp getFechSaliNot() {
        return fechSaliNot;
    }

    public void setFechSaliNot(Timestamp fechSaliNot) {
        this.fechSaliNot = fechSaliNot;
    }

    private String teleContTrm;

    @Basic
    @javax.persistence.Column(name = "TELE_CONT_TRM")
    public String getTeleContTrm() {
        return teleContTrm;
    }

    public void setTeleContTrm(String teleContTrm) {
        this.teleContTrm = teleContTrm;
    }

    private BigDecimal idenSedeSed;

    @Basic
    @javax.persistence.Column(name = "IDEN_SEDE_SED")
    public BigDecimal getIdenSedeSed() {
        return idenSedeSed;
    }

    public void setIdenSedeSed(BigDecimal idenSedeSed) {
        this.idenSedeSed = idenSedeSed;
    }

    private String descInfoTrm;

    @Basic
    @javax.persistence.Column(name = "DESC_INFO_TRM")
    public String getDescInfoTrm() {
        return descInfoTrm;
    }

    public void setDescInfoTrm(String descInfoTrm) {
        this.descInfoTrm = descInfoTrm;
    }

    private BigInteger tipoDestTrm;

    @Basic
    @javax.persistence.Column(name = "TIPO_DEST_TRM")
    public BigInteger getTipoDestTrm() {
        return tipoDestTrm;
    }

    public void setTipoDestTrm(BigInteger tipoDestTrm) {
        this.tipoDestTrm = tipoDestTrm;
    }

    private String comuTramTrm;

    @Basic
    @javax.persistence.Column(name = "COMU_TRAM_TRM")
    public String getComuTramTrm() {
        return comuTramTrm;
    }

    public void setComuTramTrm(String comuTramTrm) {
        this.comuTramTrm = comuTramTrm;
    }

    private Timestamp fechDispTrm;

    @Basic
    @javax.persistence.Column(name = "FECH_DISP_TRM")
    public Timestamp getFechDispTrm() {
        return fechDispTrm;
    }

    public void setFechDispTrm(Timestamp fechDispTrm) {
        this.fechDispTrm = fechDispTrm;
    }

    private Integer tipoDocuTrm;

    @Basic
    @javax.persistence.Column(name = "TIPO_DOCU_TRM")
    public Integer getTipoDocuTrm() {
        return tipoDocuTrm;
    }

    public void setTipoDocuTrm(Integer tipoDocuTrm) {
        this.tipoDocuTrm = tipoDocuTrm;
    }

    private String tempParaTrm;

    @Basic
    @javax.persistence.Column(name = "TEMP_PARA_TRM")
    public String getTempParaTrm() {
        return tempParaTrm;
    }

    public void setTempParaTrm(String tempParaTrm) {
        this.tempParaTrm = tempParaTrm;
    }

    private String tempCopiTrm;

    @Basic
    @javax.persistence.Column(name = "TEMP_COPI_TRM")
    public String getTempCopiTrm() {
        return tempCopiTrm;
    }

    public void setTempCopiTrm(String tempCopiTrm) {
        this.tempCopiTrm = tempCopiTrm;
    }

    private Timestamp fechFinaTrm;

    @Basic
    @javax.persistence.Column(name = "FECH_FINA_TRM")
    public Timestamp getFechFinaTrm() {
        return fechFinaTrm;
    }

    public void setFechFinaTrm(Timestamp fechFinaTrm) {
        this.fechFinaTrm = fechFinaTrm;
    }

    private BigInteger flagCiclTrm;

    @Basic
    @javax.persistence.Column(name = "FLAG_CICL_TRM")
    public BigInteger getFlagCiclTrm() {
        return flagCiclTrm;
    }

    public void setFlagCiclTrm(BigInteger flagCiclTrm) {
        this.flagCiclTrm = flagCiclTrm;
    }

    private BigInteger idenPdreTrm;

    @Basic
    @javax.persistence.Column(name = "IDEN_PDRE_TRM")
    public BigInteger getIdenPdreTrm() {
        return idenPdreTrm;
    }

    public void setIdenPdreTrm(BigInteger idenPdreTrm) {
        this.idenPdreTrm = idenPdreTrm;
    }

    private Timestamp fechInicClc;

    @Basic
    @javax.persistence.Column(name = "FECH_INIC_CLC")
    public Timestamp getFechInicClc() {
        return fechInicClc;
    }

    public void setFechInicClc(Timestamp fechInicClc) {
        this.fechInicClc = fechInicClc;
    }

    private BigDecimal nmesCiclTrm;

    @Basic
    @javax.persistence.Column(name = "NMES_CICL_TRM")
    public BigDecimal getNmesCiclTrm() {
        return nmesCiclTrm;
    }

    public void setNmesCiclTrm(BigDecimal nmesCiclTrm) {
        this.nmesCiclTrm = nmesCiclTrm;
    }

    private BigInteger flagActiClc;

    @Basic
    @javax.persistence.Column(name = "FLAG_ACTI_CLC")
    public BigInteger getFlagActiClc() {
        return flagActiClc;
    }

    public void setFlagActiClc(BigInteger flagActiClc) {
        this.flagActiClc = flagActiClc;
    }

    private Timestamp fechFinaClc;

    @Basic
    @javax.persistence.Column(name = "FECH_FINA_CLC")
    public Timestamp getFechFinaClc() {
        return fechFinaClc;
    }

    public void setFechFinaClc(Timestamp fechFinaClc) {
        this.fechFinaClc = fechFinaClc;
    }

    private BigDecimal numeRepeTrm;

    @Basic
    @javax.persistence.Column(name = "NUME_REPE_TRM")
    public BigDecimal getNumeRepeTrm() {
        return numeRepeTrm;
    }

    public void setNumeRepeTrm(BigDecimal numeRepeTrm) {
        this.numeRepeTrm = numeRepeTrm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrmTramite that = (TrmTramite) o;

        if (idenExpeTrm != null ? !idenExpeTrm.equals(that.idenExpeTrm) : that.idenExpeTrm != null) return false;
        if (numeGuiaTrm != null ? !numeGuiaTrm.equals(that.numeGuiaTrm) : that.numeGuiaTrm != null) return false;
        if (tipoTramTrm != null ? !tipoTramTrm.equals(that.tipoTramTrm) : that.tipoTramTrm != null) return false;
        if (codiOrigTrm != null ? !codiOrigTrm.equals(that.codiOrigTrm) : that.codiOrigTrm != null) return false;
        if (codiModaTrm != null ? !codiModaTrm.equals(that.codiModaTrm) : that.codiModaTrm != null) return false;
        if (codiExpeTrm != null ? !codiExpeTrm.equals(that.codiExpeTrm) : that.codiExpeTrm != null) return false;
        if (codiBarrTrm != null ? !codiBarrTrm.equals(that.codiBarrTrm) : that.codiBarrTrm != null) return false;
        if (idenSimuSim != null ? !idenSimuSim.equals(that.idenSimuSim) : that.idenSimuSim != null) return false;
        if (idenProcPrc != null ? !idenProcPrc.equals(that.idenProcPrc) : that.idenProcPrc != null) return false;
        if (codiPersTrm != null ? !codiPersTrm.equals(that.codiPersTrm) : that.codiPersTrm != null) return false;
        if (nombTramTrm != null ? !nombTramTrm.equals(that.nombTramTrm) : that.nombTramTrm != null) return false;
        if (numeFolioTrm != null ? !numeFolioTrm.equals(that.numeFolioTrm) : that.numeFolioTrm != null) return false;
        if (descAsunTrm != null ? !descAsunTrm.equals(that.descAsunTrm) : that.descAsunTrm != null) return false;
        if (docuRefeTrm != null ? !docuRefeTrm.equals(that.docuRefeTrm) : that.docuRefeTrm != null) return false;
        if (fechIngrTrm != null ? !fechIngrTrm.equals(that.fechIngrTrm) : that.fechIngrTrm != null) return false;
        if (numeDiasTrm != null ? !numeDiasTrm.equals(that.numeDiasTrm) : that.numeDiasTrm != null) return false;
        if (fechVencTrm != null ? !fechVencTrm.equals(that.fechVencTrm) : that.fechVencTrm != null) return false;
        if (codiPrioTrm != null ? !codiPrioTrm.equals(that.codiPrioTrm) : that.codiPrioTrm != null) return false;
        if (flagPrivTrm != null ? !flagPrivTrm.equals(that.flagPrivTrm) : that.flagPrivTrm != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaTrm != null ? !flagEstaTrm.equals(that.flagEstaTrm) : that.flagEstaTrm != null) return false;
        if (flagDemaTrm != null ? !flagDemaTrm.equals(that.flagDemaTrm) : that.flagDemaTrm != null) return false;
        if (subtTipoTrm != null ? !subtTipoTrm.equals(that.subtTipoTrm) : that.subtTipoTrm != null) return false;
        if (montSoliTrm != null ? !montSoliTrm.equals(that.montSoliTrm) : that.montSoliTrm != null) return false;
        if (montSentTrm != null ? !montSentTrm.equals(that.montSentTrm) : that.montSentTrm != null) return false;
        if (idenEmprEmp != null ? !idenEmprEmp.equals(that.idenEmprEmp) : that.idenEmprEmp != null) return false;
        if (codiExppTrm != null ? !codiExppTrm.equals(that.codiExppTrm) : that.codiExppTrm != null) return false;
        if (codiMoneCrd != null ? !codiMoneCrd.equals(that.codiMoneCrd) : that.codiMoneCrd != null) return false;
        if (seriDocuTrm != null ? !seriDocuTrm.equals(that.seriDocuTrm) : that.seriDocuTrm != null) return false;
        if (numeDocuTrm != null ? !numeDocuTrm.equals(that.numeDocuTrm) : that.numeDocuTrm != null) return false;
        if (idenTramTrm != null ? !idenTramTrm.equals(that.idenTramTrm) : that.idenTramTrm != null) return false;
        if (idenPeraTrm != null ? !idenPeraTrm.equals(that.idenPeraTrm) : that.idenPeraTrm != null) return false;
        if (idenProcTrm != null ? !idenProcTrm.equals(that.idenProcTrm) : that.idenProcTrm != null) return false;
        if (fechIngrNot != null ? !fechIngrNot.equals(that.fechIngrNot) : that.fechIngrNot != null) return false;
        if (fechSaliNot != null ? !fechSaliNot.equals(that.fechSaliNot) : that.fechSaliNot != null) return false;
        if (teleContTrm != null ? !teleContTrm.equals(that.teleContTrm) : that.teleContTrm != null) return false;
        if (idenSedeSed != null ? !idenSedeSed.equals(that.idenSedeSed) : that.idenSedeSed != null) return false;
        if (descInfoTrm != null ? !descInfoTrm.equals(that.descInfoTrm) : that.descInfoTrm != null) return false;
        if (tipoDestTrm != null ? !tipoDestTrm.equals(that.tipoDestTrm) : that.tipoDestTrm != null) return false;
        if (comuTramTrm != null ? !comuTramTrm.equals(that.comuTramTrm) : that.comuTramTrm != null) return false;
        if (fechDispTrm != null ? !fechDispTrm.equals(that.fechDispTrm) : that.fechDispTrm != null) return false;
        if (tipoDocuTrm != null ? !tipoDocuTrm.equals(that.tipoDocuTrm) : that.tipoDocuTrm != null) return false;
        if (tempParaTrm != null ? !tempParaTrm.equals(that.tempParaTrm) : that.tempParaTrm != null) return false;
        if (tempCopiTrm != null ? !tempCopiTrm.equals(that.tempCopiTrm) : that.tempCopiTrm != null) return false;
        if (fechFinaTrm != null ? !fechFinaTrm.equals(that.fechFinaTrm) : that.fechFinaTrm != null) return false;
        if (flagCiclTrm != null ? !flagCiclTrm.equals(that.flagCiclTrm) : that.flagCiclTrm != null) return false;
        if (idenPdreTrm != null ? !idenPdreTrm.equals(that.idenPdreTrm) : that.idenPdreTrm != null) return false;
        if (fechInicClc != null ? !fechInicClc.equals(that.fechInicClc) : that.fechInicClc != null) return false;
        if (nmesCiclTrm != null ? !nmesCiclTrm.equals(that.nmesCiclTrm) : that.nmesCiclTrm != null) return false;
        if (flagActiClc != null ? !flagActiClc.equals(that.flagActiClc) : that.flagActiClc != null) return false;
        if (fechFinaClc != null ? !fechFinaClc.equals(that.fechFinaClc) : that.fechFinaClc != null) return false;
        if (numeRepeTrm != null ? !numeRepeTrm.equals(that.numeRepeTrm) : that.numeRepeTrm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenExpeTrm != null ? idenExpeTrm.hashCode() : 0;
        result = 31 * result + (numeGuiaTrm != null ? numeGuiaTrm.hashCode() : 0);
        result = 31 * result + (tipoTramTrm != null ? tipoTramTrm.hashCode() : 0);
        result = 31 * result + (codiOrigTrm != null ? codiOrigTrm.hashCode() : 0);
        result = 31 * result + (codiModaTrm != null ? codiModaTrm.hashCode() : 0);
        result = 31 * result + (codiExpeTrm != null ? codiExpeTrm.hashCode() : 0);
        result = 31 * result + (codiBarrTrm != null ? codiBarrTrm.hashCode() : 0);
        result = 31 * result + (idenSimuSim != null ? idenSimuSim.hashCode() : 0);
        result = 31 * result + (idenProcPrc != null ? idenProcPrc.hashCode() : 0);
        result = 31 * result + (codiPersTrm != null ? codiPersTrm.hashCode() : 0);
        result = 31 * result + (nombTramTrm != null ? nombTramTrm.hashCode() : 0);
        result = 31 * result + (numeFolioTrm != null ? numeFolioTrm.hashCode() : 0);
        result = 31 * result + (descAsunTrm != null ? descAsunTrm.hashCode() : 0);
        result = 31 * result + (docuRefeTrm != null ? docuRefeTrm.hashCode() : 0);
        result = 31 * result + (fechIngrTrm != null ? fechIngrTrm.hashCode() : 0);
        result = 31 * result + (numeDiasTrm != null ? numeDiasTrm.hashCode() : 0);
        result = 31 * result + (fechVencTrm != null ? fechVencTrm.hashCode() : 0);
        result = 31 * result + (codiPrioTrm != null ? codiPrioTrm.hashCode() : 0);
        result = 31 * result + (flagPrivTrm != null ? flagPrivTrm.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaTrm != null ? flagEstaTrm.hashCode() : 0);
        result = 31 * result + (flagDemaTrm != null ? flagDemaTrm.hashCode() : 0);
        result = 31 * result + (subtTipoTrm != null ? subtTipoTrm.hashCode() : 0);
        result = 31 * result + (montSoliTrm != null ? montSoliTrm.hashCode() : 0);
        result = 31 * result + (montSentTrm != null ? montSentTrm.hashCode() : 0);
        result = 31 * result + (idenEmprEmp != null ? idenEmprEmp.hashCode() : 0);
        result = 31 * result + (codiExppTrm != null ? codiExppTrm.hashCode() : 0);
        result = 31 * result + (codiMoneCrd != null ? codiMoneCrd.hashCode() : 0);
        result = 31 * result + (seriDocuTrm != null ? seriDocuTrm.hashCode() : 0);
        result = 31 * result + (numeDocuTrm != null ? numeDocuTrm.hashCode() : 0);
        result = 31 * result + (idenTramTrm != null ? idenTramTrm.hashCode() : 0);
        result = 31 * result + (idenPeraTrm != null ? idenPeraTrm.hashCode() : 0);
        result = 31 * result + (idenProcTrm != null ? idenProcTrm.hashCode() : 0);
        result = 31 * result + (fechIngrNot != null ? fechIngrNot.hashCode() : 0);
        result = 31 * result + (fechSaliNot != null ? fechSaliNot.hashCode() : 0);
        result = 31 * result + (teleContTrm != null ? teleContTrm.hashCode() : 0);
        result = 31 * result + (idenSedeSed != null ? idenSedeSed.hashCode() : 0);
        result = 31 * result + (descInfoTrm != null ? descInfoTrm.hashCode() : 0);
        result = 31 * result + (tipoDestTrm != null ? tipoDestTrm.hashCode() : 0);
        result = 31 * result + (comuTramTrm != null ? comuTramTrm.hashCode() : 0);
        result = 31 * result + (fechDispTrm != null ? fechDispTrm.hashCode() : 0);
        result = 31 * result + (tipoDocuTrm != null ? tipoDocuTrm.hashCode() : 0);
        result = 31 * result + (tempParaTrm != null ? tempParaTrm.hashCode() : 0);
        result = 31 * result + (tempCopiTrm != null ? tempCopiTrm.hashCode() : 0);
        result = 31 * result + (fechFinaTrm != null ? fechFinaTrm.hashCode() : 0);
        result = 31 * result + (flagCiclTrm != null ? flagCiclTrm.hashCode() : 0);
        result = 31 * result + (idenPdreTrm != null ? idenPdreTrm.hashCode() : 0);
        result = 31 * result + (fechInicClc != null ? fechInicClc.hashCode() : 0);
        result = 31 * result + (nmesCiclTrm != null ? nmesCiclTrm.hashCode() : 0);
        result = 31 * result + (flagActiClc != null ? flagActiClc.hashCode() : 0);
        result = 31 * result + (fechFinaClc != null ? fechFinaClc.hashCode() : 0);
        result = 31 * result + (numeRepeTrm != null ? numeRepeTrm.hashCode() : 0);
        return result;
    }
}
