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
@Table(name = "MAE_EMPLEADOSTD", catalog = "")
public class MaeEmpleadostd {
    private BigDecimal idenPersPer;

    @Id
    @javax.persistence.Column(name = "IDEN_PERS_PER")
    public BigDecimal getIdenPersPer() {
        return idenPersPer;
    }

    public void setIdenPersPer(BigDecimal idenPersPer) {
        this.idenPersPer = idenPersPer;
    }

    private String codiEmplEmp;

    @Basic
    @javax.persistence.Column(name = "CODI_EMPL_EMP")
    public String getCodiEmplEmp() {
        return codiEmplEmp;
    }

    public void setCodiEmplEmp(String codiEmplEmp) {
        this.codiEmplEmp = codiEmplEmp;
    }

    private Timestamp fechContEmp;

    @Basic
    @javax.persistence.Column(name = "FECH_CONT_EMP")
    public Timestamp getFechContEmp() {
        return fechContEmp;
    }

    public void setFechContEmp(Timestamp fechContEmp) {
        this.fechContEmp = fechContEmp;
    }

    private Integer codiCargEmp;

    @Basic
    @javax.persistence.Column(name = "CODI_CARG_EMP")
    public Integer getCodiCargEmp() {
        return codiCargEmp;
    }

    public void setCodiCargEmp(Integer codiCargEmp) {
        this.codiCargEmp = codiCargEmp;
    }

    private BigDecimal codiSupePer;

    @Basic
    @javax.persistence.Column(name = "CODI_SUPE_PER")
    public BigDecimal getCodiSupePer() {
        return codiSupePer;
    }

    public void setCodiSupePer(BigDecimal codiSupePer) {
        this.codiSupePer = codiSupePer;
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

    private String numeCtacEmp;

    @Basic
    @javax.persistence.Column(name = "NUME_CTAC_EMP")
    public String getNumeCtacEmp() {
        return numeCtacEmp;
    }

    public void setNumeCtacEmp(String numeCtacEmp) {
        this.numeCtacEmp = numeCtacEmp;
    }

    private Integer codiEntiBan;

    @Basic
    @javax.persistence.Column(name = "CODI_ENTI_BAN")
    public Integer getCodiEntiBan() {
        return codiEntiBan;
    }

    public void setCodiEntiBan(Integer codiEntiBan) {
        this.codiEntiBan = codiEntiBan;
    }

    private BigDecimal impoSuelEmp;

    @Basic
    @javax.persistence.Column(name = "IMPO_SUEL_EMP")
    public BigDecimal getImpoSuelEmp() {
        return impoSuelEmp;
    }

    public void setImpoSuelEmp(BigDecimal impoSuelEmp) {
        this.impoSuelEmp = impoSuelEmp;
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

    private BigInteger flagEstaEmp;

    @Basic
    @javax.persistence.Column(name = "FLAG_ESTA_EMP")
    public BigInteger getFlagEstaEmp() {
        return flagEstaEmp;
    }

    public void setFlagEstaEmp(BigInteger flagEstaEmp) {
        this.flagEstaEmp = flagEstaEmp;
    }

    private BigInteger flagRespEmp;

    @Basic
    @javax.persistence.Column(name = "FLAG_RESP_EMP")
    public BigInteger getFlagRespEmp() {
        return flagRespEmp;
    }

    public void setFlagRespEmp(BigInteger flagRespEmp) {
        this.flagRespEmp = flagRespEmp;
    }

    private String codiColeSup;

    @Basic
    @javax.persistence.Column(name = "CODI_COLE_SUP")
    public String getCodiColeSup() {
        return codiColeSup;
    }

    public void setCodiColeSup(String codiColeSup) {
        this.codiColeSup = codiColeSup;
    }

    private String fechColeSup;

    @Basic
    @javax.persistence.Column(name = "FECH_COLE_SUP")
    public String getFechColeSup() {
        return fechColeSup;
    }

    public void setFechColeSup(String fechColeSup) {
        this.fechColeSup = fechColeSup;
    }

    private String nombUnivSup;

    @Basic
    @javax.persistence.Column(name = "NOMB_UNIV_SUP")
    public String getNombUnivSup() {
        return nombUnivSup;
    }

    public void setNombUnivSup(String nombUnivSup) {
        this.nombUnivSup = nombUnivSup;
    }

    private BigDecimal codiEmprEmp;

    @Basic
    @javax.persistence.Column(name = "CODI_EMPR_EMP")
    public BigDecimal getCodiEmprEmp() {
        return codiEmprEmp;
    }

    public void setCodiEmprEmp(BigDecimal codiEmprEmp) {
        this.codiEmprEmp = codiEmprEmp;
    }

    private BigDecimal codiSedeOpe;

    @Basic
    @javax.persistence.Column(name = "CODI_SEDE_OPE")
    public BigDecimal getCodiSedeOpe() {
        return codiSedeOpe;
    }

    public void setCodiSedeOpe(BigDecimal codiSedeOpe) {
        this.codiSedeOpe = codiSedeOpe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeEmpleadostd that = (MaeEmpleadostd) o;

        if (idenPersPer != null ? !idenPersPer.equals(that.idenPersPer) : that.idenPersPer != null) return false;
        if (codiEmplEmp != null ? !codiEmplEmp.equals(that.codiEmplEmp) : that.codiEmplEmp != null) return false;
        if (fechContEmp != null ? !fechContEmp.equals(that.fechContEmp) : that.fechContEmp != null) return false;
        if (codiCargEmp != null ? !codiCargEmp.equals(that.codiCargEmp) : that.codiCargEmp != null) return false;
        if (codiSupePer != null ? !codiSupePer.equals(that.codiSupePer) : that.codiSupePer != null) return false;
        if (idenAreaAre != null ? !idenAreaAre.equals(that.idenAreaAre) : that.idenAreaAre != null) return false;
        if (numeCtacEmp != null ? !numeCtacEmp.equals(that.numeCtacEmp) : that.numeCtacEmp != null) return false;
        if (codiEntiBan != null ? !codiEntiBan.equals(that.codiEntiBan) : that.codiEntiBan != null) return false;
        if (impoSuelEmp != null ? !impoSuelEmp.equals(that.impoSuelEmp) : that.impoSuelEmp != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaEmp != null ? !flagEstaEmp.equals(that.flagEstaEmp) : that.flagEstaEmp != null) return false;
        if (flagRespEmp != null ? !flagRespEmp.equals(that.flagRespEmp) : that.flagRespEmp != null) return false;
        if (codiColeSup != null ? !codiColeSup.equals(that.codiColeSup) : that.codiColeSup != null) return false;
        if (fechColeSup != null ? !fechColeSup.equals(that.fechColeSup) : that.fechColeSup != null) return false;
        if (nombUnivSup != null ? !nombUnivSup.equals(that.nombUnivSup) : that.nombUnivSup != null) return false;
        if (codiEmprEmp != null ? !codiEmprEmp.equals(that.codiEmprEmp) : that.codiEmprEmp != null) return false;
        if (codiSedeOpe != null ? !codiSedeOpe.equals(that.codiSedeOpe) : that.codiSedeOpe != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenPersPer != null ? idenPersPer.hashCode() : 0;
        result = 31 * result + (codiEmplEmp != null ? codiEmplEmp.hashCode() : 0);
        result = 31 * result + (fechContEmp != null ? fechContEmp.hashCode() : 0);
        result = 31 * result + (codiCargEmp != null ? codiCargEmp.hashCode() : 0);
        result = 31 * result + (codiSupePer != null ? codiSupePer.hashCode() : 0);
        result = 31 * result + (idenAreaAre != null ? idenAreaAre.hashCode() : 0);
        result = 31 * result + (numeCtacEmp != null ? numeCtacEmp.hashCode() : 0);
        result = 31 * result + (codiEntiBan != null ? codiEntiBan.hashCode() : 0);
        result = 31 * result + (impoSuelEmp != null ? impoSuelEmp.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaEmp != null ? flagEstaEmp.hashCode() : 0);
        result = 31 * result + (flagRespEmp != null ? flagRespEmp.hashCode() : 0);
        result = 31 * result + (codiColeSup != null ? codiColeSup.hashCode() : 0);
        result = 31 * result + (fechColeSup != null ? fechColeSup.hashCode() : 0);
        result = 31 * result + (nombUnivSup != null ? nombUnivSup.hashCode() : 0);
        result = 31 * result + (codiEmprEmp != null ? codiEmprEmp.hashCode() : 0);
        result = 31 * result + (codiSedeOpe != null ? codiSedeOpe.hashCode() : 0);
        return result;
    }
}
