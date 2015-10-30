package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "ADM_ROL", catalog = "")
public class AdmRol {
    private BigDecimal idenRoleRol;
    private String nombRoleRol;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaRol;
    private Collection<AdmModuloRol> admModuloRolsByIdenRoleRol;
    private Collection<AdmRolPermenu> admRolPermenusByIdenRoleRol;
    private Collection<AdmUsuarioRol> admUsuarioRolsByIdenRoleRol;

    @Id
    @Column(name = "IDEN_ROLE_ROL")
    public BigDecimal getIdenRoleRol() {
        return idenRoleRol;
    }

    public void setIdenRoleRol(BigDecimal idenRoleRol) {
        this.idenRoleRol = idenRoleRol;
    }

    @Basic
    @Column(name = "NOMB_ROLE_ROL")
    public String getNombRoleRol() {
        return nombRoleRol;
    }

    public void setNombRoleRol(String nombRoleRol) {
        this.nombRoleRol = nombRoleRol;
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
    @Column(name = "FLAG_ESTA_ROL")
    public BigInteger getFlagEstaRol() {
        return flagEstaRol;
    }

    public void setFlagEstaRol(BigInteger flagEstaRol) {
        this.flagEstaRol = flagEstaRol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmRol admRol = (AdmRol) o;

        if (idenRoleRol != null ? !idenRoleRol.equals(admRol.idenRoleRol) : admRol.idenRoleRol != null) return false;
        if (nombRoleRol != null ? !nombRoleRol.equals(admRol.nombRoleRol) : admRol.nombRoleRol != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(admRol.usuaCreaAud) : admRol.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(admRol.fechCreaAud) : admRol.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(admRol.usuaModiAud) : admRol.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(admRol.fechModiAud) : admRol.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(admRol.nombEquiAud) : admRol.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(admRol.nombSopeAud) : admRol.nombSopeAud != null) return false;
        if (flagEstaRol != null ? !flagEstaRol.equals(admRol.flagEstaRol) : admRol.flagEstaRol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenRoleRol != null ? idenRoleRol.hashCode() : 0;
        result = 31 * result + (nombRoleRol != null ? nombRoleRol.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaRol != null ? flagEstaRol.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "admRolByIdenRoleRol")
    public Collection<AdmModuloRol> getAdmModuloRolsByIdenRoleRol() {
        return admModuloRolsByIdenRoleRol;
    }

    public void setAdmModuloRolsByIdenRoleRol(Collection<AdmModuloRol> admModuloRolsByIdenRoleRol) {
        this.admModuloRolsByIdenRoleRol = admModuloRolsByIdenRoleRol;
    }

    @OneToMany(mappedBy = "admRolByIdenRoleRol")
    public Collection<AdmRolPermenu> getAdmRolPermenusByIdenRoleRol() {
        return admRolPermenusByIdenRoleRol;
    }

    public void setAdmRolPermenusByIdenRoleRol(Collection<AdmRolPermenu> admRolPermenusByIdenRoleRol) {
        this.admRolPermenusByIdenRoleRol = admRolPermenusByIdenRoleRol;
    }

    @OneToMany(mappedBy = "admRolByIdenRoleRol")
    public Collection<AdmUsuarioRol> getAdmUsuarioRolsByIdenRoleRol() {
        return admUsuarioRolsByIdenRoleRol;
    }

    public void setAdmUsuarioRolsByIdenRoleRol(Collection<AdmUsuarioRol> admUsuarioRolsByIdenRoleRol) {
        this.admUsuarioRolsByIdenRoleRol = admUsuarioRolsByIdenRoleRol;
    }
}
