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
@Table(name = "ADM_MODULO_ROL", catalog = "")
public class AdmModuloRol {
    private BigDecimal idenMoroMdr;
    private BigDecimal idenRoleRol;
    private BigDecimal idenModuMod;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaMdr;
    private Collection<AdmModuloExcepcion> admModuloExcepcionsByIdenMoroMdr;
    private AdmModulo admModuloByIdenModuMod;
    private AdmRol admRolByIdenRoleRol;

    @Id
    @Column(name = "IDEN_MORO_MDR")
    public BigDecimal getIdenMoroMdr() {
        return idenMoroMdr;
    }

    public void setIdenMoroMdr(BigDecimal idenMoroMdr) {
        this.idenMoroMdr = idenMoroMdr;
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
    @Column(name = "IDEN_MODU_MOD")
    public BigDecimal getIdenModuMod() {
        return idenModuMod;
    }

    public void setIdenModuMod(BigDecimal idenModuMod) {
        this.idenModuMod = idenModuMod;
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
    @Column(name = "FLAG_ESTA_MDR")
    public BigInteger getFlagEstaMdr() {
        return flagEstaMdr;
    }

    public void setFlagEstaMdr(BigInteger flagEstaMdr) {
        this.flagEstaMdr = flagEstaMdr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmModuloRol that = (AdmModuloRol) o;

        if (idenMoroMdr != null ? !idenMoroMdr.equals(that.idenMoroMdr) : that.idenMoroMdr != null) return false;
        if (idenRoleRol != null ? !idenRoleRol.equals(that.idenRoleRol) : that.idenRoleRol != null) return false;
        if (idenModuMod != null ? !idenModuMod.equals(that.idenModuMod) : that.idenModuMod != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaMdr != null ? !flagEstaMdr.equals(that.flagEstaMdr) : that.flagEstaMdr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenMoroMdr != null ? idenMoroMdr.hashCode() : 0;
        result = 31 * result + (idenRoleRol != null ? idenRoleRol.hashCode() : 0);
        result = 31 * result + (idenModuMod != null ? idenModuMod.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaMdr != null ? flagEstaMdr.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "admModuloRolByIdenMoroMdr")
    public Collection<AdmModuloExcepcion> getAdmModuloExcepcionsByIdenMoroMdr() {
        return admModuloExcepcionsByIdenMoroMdr;
    }

    public void setAdmModuloExcepcionsByIdenMoroMdr(Collection<AdmModuloExcepcion> admModuloExcepcionsByIdenMoroMdr) {
        this.admModuloExcepcionsByIdenMoroMdr = admModuloExcepcionsByIdenMoroMdr;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_MODU_MOD", referencedColumnName = "IDEN_MODU_MOD",insertable = false,updatable = false)
    public AdmModulo getAdmModuloByIdenModuMod() {
        return admModuloByIdenModuMod;
    }

    public void setAdmModuloByIdenModuMod(AdmModulo admModuloByIdenModuMod) {
        this.admModuloByIdenModuMod = admModuloByIdenModuMod;
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
