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
@Table(name = "MAE_PERSONA", catalog = "")
public class MaePersona {
    private BigDecimal idenPersPer;

    @Id
    @javax.persistence.Column(name = "IDEN_PERS_PER")
    public BigDecimal getIdenPersPer() {
        return idenPersPer;
    }

    public void setIdenPersPer(BigDecimal idenPersPer) {
        this.idenPersPer = idenPersPer;
    }

    private BigDecimal codiPerpPer;

    @Basic
    @javax.persistence.Column(name = "CODI_PERP_PER")
    public BigDecimal getCodiPerpPer() {
        return codiPerpPer;
    }

    public void setCodiPerpPer(BigDecimal codiPerpPer) {
        this.codiPerpPer = codiPerpPer;
    }

    private String apelPatePer;

    @Basic
    @javax.persistence.Column(name = "APEL_PATE_PER")
    public String getApelPatePer() {
        return apelPatePer;
    }

    public void setApelPatePer(String apelPatePer) {
        this.apelPatePer = apelPatePer;
    }

    private String apelMatePer;

    @Basic
    @javax.persistence.Column(name = "APEL_MATE_PER")
    public String getApelMatePer() {
        return apelMatePer;
    }

    public void setApelMatePer(String apelMatePer) {
        this.apelMatePer = apelMatePer;
    }

    private String nombPersPer;

    @Basic
    @javax.persistence.Column(name = "NOMB_PERS_PER")
    public String getNombPersPer() {
        return nombPersPer;
    }

    public void setNombPersPer(String nombPersPer) {
        this.nombPersPer = nombPersPer;
    }

    private String nombCompPer;

    @Basic
    @javax.persistence.Column(name = "NOMB_COMP_PER")
    public String getNombCompPer() {
        return nombCompPer;
    }

    public void setNombCompPer(String nombCompPer) {
        this.nombCompPer = nombCompPer;
    }

    private Integer tipoIdenPer;

    @Basic
    @javax.persistence.Column(name = "TIPO_IDEN_PER")
    public Integer getTipoIdenPer() {
        return tipoIdenPer;
    }

    public void setTipoIdenPer(Integer tipoIdenPer) {
        this.tipoIdenPer = tipoIdenPer;
    }

    private String numeIdenPer;

    @Basic
    @javax.persistence.Column(name = "NUME_IDEN_PER")
    public String getNumeIdenPer() {
        return numeIdenPer;
    }

    public void setNumeIdenPer(String numeIdenPer) {
        this.numeIdenPer = numeIdenPer;
    }

    private String direPersPer;

    @Basic
    @javax.persistence.Column(name = "DIRE_PERS_PER")
    public String getDirePersPer() {
        return direPersPer;
    }

    public void setDirePersPer(String direPersPer) {
        this.direPersPer = direPersPer;
    }

    private Integer estaCiviPer;

    @Basic
    @javax.persistence.Column(name = "ESTA_CIVI_PER")
    public Integer getEstaCiviPer() {
        return estaCiviPer;
    }

    public void setEstaCiviPer(Integer estaCiviPer) {
        this.estaCiviPer = estaCiviPer;
    }

    private Integer sexoPersPer;

    @Basic
    @javax.persistence.Column(name = "SEXO_PERS_PER")
    public Integer getSexoPersPer() {
        return sexoPersPer;
    }

    public void setSexoPersPer(Integer sexoPersPer) {
        this.sexoPersPer = sexoPersPer;
    }

    private Timestamp fechNaciPer;

    @Basic
    @javax.persistence.Column(name = "FECH_NACI_PER")
    public Timestamp getFechNaciPer() {
        return fechNaciPer;
    }

    public void setFechNaciPer(Timestamp fechNaciPer) {
        this.fechNaciPer = fechNaciPer;
    }

    private String ubigNaciPer;

    @Basic
    @javax.persistence.Column(name = "UBIG_NACI_PER")
    public String getUbigNaciPer() {
        return ubigNaciPer;
    }

    public void setUbigNaciPer(String ubigNaciPer) {
        this.ubigNaciPer = ubigNaciPer;
    }

    private String ubigResiPer;

    @Basic
    @javax.persistence.Column(name = "UBIG_RESI_PER")
    public String getUbigResiPer() {
        return ubigResiPer;
    }

    public void setUbigResiPer(String ubigResiPer) {
        this.ubigResiPer = ubigResiPer;
    }

    private String numeTelcPer;

    @Basic
    @javax.persistence.Column(name = "NUME_TELC_PER")
    public String getNumeTelcPer() {
        return numeTelcPer;
    }

    public void setNumeTelcPer(String numeTelcPer) {
        this.numeTelcPer = numeTelcPer;
    }

    private String numeTeltPer;

    @Basic
    @javax.persistence.Column(name = "NUME_TELT_PER")
    public String getNumeTeltPer() {
        return numeTeltPer;
    }

    public void setNumeTeltPer(String numeTeltPer) {
        this.numeTeltPer = numeTeltPer;
    }

    private String corrElecPer;

    @Basic
    @javax.persistence.Column(name = "CORR_ELEC_PER")
    public String getCorrElecPer() {
        return corrElecPer;
    }

    public void setCorrElecPer(String corrElecPer) {
        this.corrElecPer = corrElecPer;
    }

    private String numeCeluPer;

    @Basic
    @javax.persistence.Column(name = "NUME_CELU_PER")
    public String getNumeCeluPer() {
        return numeCeluPer;
    }

    public void setNumeCeluPer(String numeCeluPer) {
        this.numeCeluPer = numeCeluPer;
    }

    private String numeCel2Per;

    @Basic
    @javax.persistence.Column(name = "NUME_CEL2_PER")
    public String getNumeCel2Per() {
        return numeCel2Per;
    }

    public void setNumeCel2Per(String numeCel2Per) {
        this.numeCel2Per = numeCel2Per;
    }

    private Timestamp fechFallPer;

    @Basic
    @javax.persistence.Column(name = "FECH_FALL_PER")
    public Timestamp getFechFallPer() {
        return fechFallPer;
    }

    public void setFechFallPer(Timestamp fechFallPer) {
        this.fechFallPer = fechFallPer;
    }

    private Integer tipoProfPer;

    @Basic
    @javax.persistence.Column(name = "TIPO_PROF_PER")
    public Integer getTipoProfPer() {
        return tipoProfPer;
    }

    public void setTipoProfPer(Integer tipoProfPer) {
        this.tipoProfPer = tipoProfPer;
    }

    private String refeUbigPer;

    @Basic
    @javax.persistence.Column(name = "REFE_UBIG_PER")
    public String getRefeUbigPer() {
        return refeUbigPer;
    }

    public void setRefeUbigPer(String refeUbigPer) {
        this.refeUbigPer = refeUbigPer;
    }

    private BigDecimal mediTallPer;

    @Basic
    @javax.persistence.Column(name = "MEDI_TALL_PER")
    public BigDecimal getMediTallPer() {
        return mediTallPer;
    }

    public void setMediTallPer(BigDecimal mediTallPer) {
        this.mediTallPer = mediTallPer;
    }

    private String rutaFotoPer;

    @Basic
    @javax.persistence.Column(name = "RUTA_FOTO_PER")
    public String getRutaFotoPer() {
        return rutaFotoPer;
    }

    public void setRutaFotoPer(String rutaFotoPer) {
        this.rutaFotoPer = rutaFotoPer;
    }

    private BigInteger flagBloqPer;

    @Basic
    @javax.persistence.Column(name = "FLAG_BLOQ_PER")
    public BigInteger getFlagBloqPer() {
        return flagBloqPer;
    }

    public void setFlagBloqPer(BigInteger flagBloqPer) {
        this.flagBloqPer = flagBloqPer;
    }

    private Integer motiBloqPer;

    @Basic
    @javax.persistence.Column(name = "MOTI_BLOQ_PER")
    public Integer getMotiBloqPer() {
        return motiBloqPer;
    }

    public void setMotiBloqPer(Integer motiBloqPer) {
        this.motiBloqPer = motiBloqPer;
    }

    private BigInteger flagHomoPer;

    @Basic
    @javax.persistence.Column(name = "FLAG_HOMO_PER")
    public BigInteger getFlagHomoPer() {
        return flagHomoPer;
    }

    public void setFlagHomoPer(BigInteger flagHomoPer) {
        this.flagHomoPer = flagHomoPer;
    }

    private String docuHomoPer;

    @Basic
    @javax.persistence.Column(name = "DOCU_HOMO_PER")
    public String getDocuHomoPer() {
        return docuHomoPer;
    }

    public void setDocuHomoPer(String docuHomoPer) {
        this.docuHomoPer = docuHomoPer;
    }

    private String grpoSangPer;

    @Basic
    @javax.persistence.Column(name = "GRPO_SANG_PER")
    public String getGrpoSangPer() {
        return grpoSangPer;
    }

    public void setGrpoSangPer(String grpoSangPer) {
        this.grpoSangPer = grpoSangPer;
    }

    private Integer gradParePer;

    @Basic
    @javax.persistence.Column(name = "GRAD_PARE_PER")
    public Integer getGradParePer() {
        return gradParePer;
    }

    public void setGradParePer(Integer gradParePer) {
        this.gradParePer = gradParePer;
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

    private BigInteger flagEstaPer;

    @Basic
    @javax.persistence.Column(name = "FLAG_ESTA_PER")
    public BigInteger getFlagEstaPer() {
        return flagEstaPer;
    }

    public void setFlagEstaPer(BigInteger flagEstaPer) {
        this.flagEstaPer = flagEstaPer;
    }

    private String refeContPer;

    @Basic
    @javax.persistence.Column(name = "REFE_CONT_PER")
    public String getRefeContPer() {
        return refeContPer;
    }

    public void setRefeContPer(String refeContPer) {
        this.refeContPer = refeContPer;
    }

    private String horaUbicPer;

    @Basic
    @javax.persistence.Column(name = "HORA_UBIC_PER")
    public String getHoraUbicPer() {
        return horaUbicPer;
    }

    public void setHoraUbicPer(String horaUbicPer) {
        this.horaUbicPer = horaUbicPer;
    }

    private String codiSigaPer;

    @Basic
    @javax.persistence.Column(name = "CODI_SIGA_PER")
    public String getCodiSigaPer() {
        return codiSigaPer;
    }

    public void setCodiSigaPer(String codiSigaPer) {
        this.codiSigaPer = codiSigaPer;
    }

    private BigInteger flagTipoPer;

    @Basic
    @javax.persistence.Column(name = "FLAG_TIPO_PER")
    public BigInteger getFlagTipoPer() {
        return flagTipoPer;
    }

    public void setFlagTipoPer(BigInteger flagTipoPer) {
        this.flagTipoPer = flagTipoPer;
    }

    private String numeRegiPer;

    @Basic
    @javax.persistence.Column(name = "NUME_REGI_PER")
    public String getNumeRegiPer() {
        return numeRegiPer;
    }

    public void setNumeRegiPer(String numeRegiPer) {
        this.numeRegiPer = numeRegiPer;
    }

    private String tipoSituPer;

    @Basic
    @javax.persistence.Column(name = "TIPO_SITU_PER")
    public String getTipoSituPer() {
        return tipoSituPer;
    }

    public void setTipoSituPer(String tipoSituPer) {
        this.tipoSituPer = tipoSituPer;
    }

    private String tipoParePer;

    @Basic
    @javax.persistence.Column(name = "TIPO_PARE_PER")
    public String getTipoParePer() {
        return tipoParePer;
    }

    public void setTipoParePer(String tipoParePer) {
        this.tipoParePer = tipoParePer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaePersona that = (MaePersona) o;

        if (idenPersPer != null ? !idenPersPer.equals(that.idenPersPer) : that.idenPersPer != null) return false;
        if (codiPerpPer != null ? !codiPerpPer.equals(that.codiPerpPer) : that.codiPerpPer != null) return false;
        if (apelPatePer != null ? !apelPatePer.equals(that.apelPatePer) : that.apelPatePer != null) return false;
        if (apelMatePer != null ? !apelMatePer.equals(that.apelMatePer) : that.apelMatePer != null) return false;
        if (nombPersPer != null ? !nombPersPer.equals(that.nombPersPer) : that.nombPersPer != null) return false;
        if (nombCompPer != null ? !nombCompPer.equals(that.nombCompPer) : that.nombCompPer != null) return false;
        if (tipoIdenPer != null ? !tipoIdenPer.equals(that.tipoIdenPer) : that.tipoIdenPer != null) return false;
        if (numeIdenPer != null ? !numeIdenPer.equals(that.numeIdenPer) : that.numeIdenPer != null) return false;
        if (direPersPer != null ? !direPersPer.equals(that.direPersPer) : that.direPersPer != null) return false;
        if (estaCiviPer != null ? !estaCiviPer.equals(that.estaCiviPer) : that.estaCiviPer != null) return false;
        if (sexoPersPer != null ? !sexoPersPer.equals(that.sexoPersPer) : that.sexoPersPer != null) return false;
        if (fechNaciPer != null ? !fechNaciPer.equals(that.fechNaciPer) : that.fechNaciPer != null) return false;
        if (ubigNaciPer != null ? !ubigNaciPer.equals(that.ubigNaciPer) : that.ubigNaciPer != null) return false;
        if (ubigResiPer != null ? !ubigResiPer.equals(that.ubigResiPer) : that.ubigResiPer != null) return false;
        if (numeTelcPer != null ? !numeTelcPer.equals(that.numeTelcPer) : that.numeTelcPer != null) return false;
        if (numeTeltPer != null ? !numeTeltPer.equals(that.numeTeltPer) : that.numeTeltPer != null) return false;
        if (corrElecPer != null ? !corrElecPer.equals(that.corrElecPer) : that.corrElecPer != null) return false;
        if (numeCeluPer != null ? !numeCeluPer.equals(that.numeCeluPer) : that.numeCeluPer != null) return false;
        if (numeCel2Per != null ? !numeCel2Per.equals(that.numeCel2Per) : that.numeCel2Per != null) return false;
        if (fechFallPer != null ? !fechFallPer.equals(that.fechFallPer) : that.fechFallPer != null) return false;
        if (tipoProfPer != null ? !tipoProfPer.equals(that.tipoProfPer) : that.tipoProfPer != null) return false;
        if (refeUbigPer != null ? !refeUbigPer.equals(that.refeUbigPer) : that.refeUbigPer != null) return false;
        if (mediTallPer != null ? !mediTallPer.equals(that.mediTallPer) : that.mediTallPer != null) return false;
        if (rutaFotoPer != null ? !rutaFotoPer.equals(that.rutaFotoPer) : that.rutaFotoPer != null) return false;
        if (flagBloqPer != null ? !flagBloqPer.equals(that.flagBloqPer) : that.flagBloqPer != null) return false;
        if (motiBloqPer != null ? !motiBloqPer.equals(that.motiBloqPer) : that.motiBloqPer != null) return false;
        if (flagHomoPer != null ? !flagHomoPer.equals(that.flagHomoPer) : that.flagHomoPer != null) return false;
        if (docuHomoPer != null ? !docuHomoPer.equals(that.docuHomoPer) : that.docuHomoPer != null) return false;
        if (grpoSangPer != null ? !grpoSangPer.equals(that.grpoSangPer) : that.grpoSangPer != null) return false;
        if (gradParePer != null ? !gradParePer.equals(that.gradParePer) : that.gradParePer != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaPer != null ? !flagEstaPer.equals(that.flagEstaPer) : that.flagEstaPer != null) return false;
        if (refeContPer != null ? !refeContPer.equals(that.refeContPer) : that.refeContPer != null) return false;
        if (horaUbicPer != null ? !horaUbicPer.equals(that.horaUbicPer) : that.horaUbicPer != null) return false;
        if (codiSigaPer != null ? !codiSigaPer.equals(that.codiSigaPer) : that.codiSigaPer != null) return false;
        if (flagTipoPer != null ? !flagTipoPer.equals(that.flagTipoPer) : that.flagTipoPer != null) return false;
        if (numeRegiPer != null ? !numeRegiPer.equals(that.numeRegiPer) : that.numeRegiPer != null) return false;
        if (tipoSituPer != null ? !tipoSituPer.equals(that.tipoSituPer) : that.tipoSituPer != null) return false;
        if (tipoParePer != null ? !tipoParePer.equals(that.tipoParePer) : that.tipoParePer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenPersPer != null ? idenPersPer.hashCode() : 0;
        result = 31 * result + (codiPerpPer != null ? codiPerpPer.hashCode() : 0);
        result = 31 * result + (apelPatePer != null ? apelPatePer.hashCode() : 0);
        result = 31 * result + (apelMatePer != null ? apelMatePer.hashCode() : 0);
        result = 31 * result + (nombPersPer != null ? nombPersPer.hashCode() : 0);
        result = 31 * result + (nombCompPer != null ? nombCompPer.hashCode() : 0);
        result = 31 * result + (tipoIdenPer != null ? tipoIdenPer.hashCode() : 0);
        result = 31 * result + (numeIdenPer != null ? numeIdenPer.hashCode() : 0);
        result = 31 * result + (direPersPer != null ? direPersPer.hashCode() : 0);
        result = 31 * result + (estaCiviPer != null ? estaCiviPer.hashCode() : 0);
        result = 31 * result + (sexoPersPer != null ? sexoPersPer.hashCode() : 0);
        result = 31 * result + (fechNaciPer != null ? fechNaciPer.hashCode() : 0);
        result = 31 * result + (ubigNaciPer != null ? ubigNaciPer.hashCode() : 0);
        result = 31 * result + (ubigResiPer != null ? ubigResiPer.hashCode() : 0);
        result = 31 * result + (numeTelcPer != null ? numeTelcPer.hashCode() : 0);
        result = 31 * result + (numeTeltPer != null ? numeTeltPer.hashCode() : 0);
        result = 31 * result + (corrElecPer != null ? corrElecPer.hashCode() : 0);
        result = 31 * result + (numeCeluPer != null ? numeCeluPer.hashCode() : 0);
        result = 31 * result + (numeCel2Per != null ? numeCel2Per.hashCode() : 0);
        result = 31 * result + (fechFallPer != null ? fechFallPer.hashCode() : 0);
        result = 31 * result + (tipoProfPer != null ? tipoProfPer.hashCode() : 0);
        result = 31 * result + (refeUbigPer != null ? refeUbigPer.hashCode() : 0);
        result = 31 * result + (mediTallPer != null ? mediTallPer.hashCode() : 0);
        result = 31 * result + (rutaFotoPer != null ? rutaFotoPer.hashCode() : 0);
        result = 31 * result + (flagBloqPer != null ? flagBloqPer.hashCode() : 0);
        result = 31 * result + (motiBloqPer != null ? motiBloqPer.hashCode() : 0);
        result = 31 * result + (flagHomoPer != null ? flagHomoPer.hashCode() : 0);
        result = 31 * result + (docuHomoPer != null ? docuHomoPer.hashCode() : 0);
        result = 31 * result + (grpoSangPer != null ? grpoSangPer.hashCode() : 0);
        result = 31 * result + (gradParePer != null ? gradParePer.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaPer != null ? flagEstaPer.hashCode() : 0);
        result = 31 * result + (refeContPer != null ? refeContPer.hashCode() : 0);
        result = 31 * result + (horaUbicPer != null ? horaUbicPer.hashCode() : 0);
        result = 31 * result + (codiSigaPer != null ? codiSigaPer.hashCode() : 0);
        result = 31 * result + (flagTipoPer != null ? flagTipoPer.hashCode() : 0);
        result = 31 * result + (numeRegiPer != null ? numeRegiPer.hashCode() : 0);
        result = 31 * result + (tipoSituPer != null ? tipoSituPer.hashCode() : 0);
        result = 31 * result + (tipoParePer != null ? tipoParePer.hashCode() : 0);
        return result;
    }
}
