package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "ADM_ROL_PERMENU", catalog = "")
public class AdmRolPermenu {
    private BigDecimal idenRoleRpm;
    private BigDecimal idenRoleRol;
    private BigDecimal idenPermPmn;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaRpm;
    private AdmPermisoMenu admPermisoMenuByIdenPermPmn;
    private AdmRol admRolByIdenRoleRol;

    @Id
    @Column(name = "IDEN_ROLE_RPM")
    public BigDecimal getIdenRoleRpm() {
        return idenRoleRpm;
    }

    public void setIdenRoleRpm(BigDecimal idenRoleRpm) {
        this.idenRoleRpm = idenRoleRpm;
    }

    @Basic
    @Column(name = "IDEN_ROLE_ROL")
    public BigDecimal getIdenRoleRol() {
        return idenRoleRol;
    }

    public void setIdenRoleRol(BigDecimal idenRoleRol) {
        this.idenRoleRol = idenRoleRol;
    }

    @Basic
    @Column(name = "IDEN_PERM_PMN")
    public BigDecimal getIdenPermPmn() {
        return idenPermPmn;
    }

    public void setIdenPermPmn(BigDecimal idenPermPmn) {
        this.idenPermPmn = idenPermPmn;
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

    @Basic
    @Column(name = "FLAG_ESTA_RPM")
    public BigInteger getFlagEstaRpm() {
        return flagEstaRpm;
    }

    public void setFlagEstaRpm(BigInteger flagEstaRpm) {
        this.flagEstaRpm = flagEstaRpm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmRolPermenu that = (AdmRolPermenu) o;

        if (idenRoleRpm != null ? !idenRoleRpm.equals(that.idenRoleRpm) : that.idenRoleRpm != null) return false;
        if (idenRoleRol != null ? !idenRoleRol.equals(that.idenRoleRol) : that.idenRoleRol != null) return false;
        if (idenPermPmn != null ? !idenPermPmn.equals(that.idenPermPmn) : that.idenPermPmn != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaRpm != null ? !flagEstaRpm.equals(that.flagEstaRpm) : that.flagEstaRpm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenRoleRpm != null ? idenRoleRpm.hashCode() : 0;
        result = 31 * result + (idenRoleRol != null ? idenRoleRol.hashCode() : 0);
        result = 31 * result + (idenPermPmn != null ? idenPermPmn.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaRpm != null ? flagEstaRpm.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_PERM_PMN", referencedColumnName = "IDEN_PERM_PMN",insertable = false,updatable = false)
    public AdmPermisoMenu getAdmPermisoMenuByIdenPermPmn() {
        return admPermisoMenuByIdenPermPmn;
    }

    public void setAdmPermisoMenuByIdenPermPmn(AdmPermisoMenu admPermisoMenuByIdenPermPmn) {
        this.admPermisoMenuByIdenPermPmn = admPermisoMenuByIdenPermPmn;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_ROLE_ROL", referencedColumnName = "IDEN_ROLE_ROL",insertable = false,updatable = false)
    public AdmRol getAdmRolByIdenRoleRol() {
        return admRolByIdenRoleRol;
    }

    public void setAdmRolByIdenRoleRol(AdmRol admRolByIdenRoleRol) {
        this.admRolByIdenRoleRol = admRolByIdenRoleRol;
    }
}
