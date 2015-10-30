package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "ADM_USUARIO_ROL", catalog = "")
public class AdmUsuarioRol {
    private BigDecimal idenUsuaUro;
    private BigDecimal idenRoleRol;
    private BigDecimal idenPersPer;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaUro;
    private AdmRol admRolByIdenRoleRol;
    private AdmUsuario admUsuarioByIdenPersPer;

    @Id
    @Column(name = "IDEN_USUA_URO")
    public BigDecimal getIdenUsuaUro() {
        return idenUsuaUro;
    }

    public void setIdenUsuaUro(BigDecimal idenUsuaUro) {
        this.idenUsuaUro = idenUsuaUro;
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
    @Column(name = "IDEN_PERS_PER")
    public BigDecimal getIdenPersPer() {
        return idenPersPer;
    }

    public void setIdenPersPer(BigDecimal idenPersPer) {
        this.idenPersPer = idenPersPer;
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
    @Column(name = "FLAG_ESTA_URO")
    public BigInteger getFlagEstaUro() {
        return flagEstaUro;
    }

    public void setFlagEstaUro(BigInteger flagEstaUro) {
        this.flagEstaUro = flagEstaUro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmUsuarioRol that = (AdmUsuarioRol) o;

        if (idenUsuaUro != null ? !idenUsuaUro.equals(that.idenUsuaUro) : that.idenUsuaUro != null) return false;
        if (idenRoleRol != null ? !idenRoleRol.equals(that.idenRoleRol) : that.idenRoleRol != null) return false;
        if (idenPersPer != null ? !idenPersPer.equals(that.idenPersPer) : that.idenPersPer != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaUro != null ? !flagEstaUro.equals(that.flagEstaUro) : that.flagEstaUro != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenUsuaUro != null ? idenUsuaUro.hashCode() : 0;
        result = 31 * result + (idenRoleRol != null ? idenRoleRol.hashCode() : 0);
        result = 31 * result + (idenPersPer != null ? idenPersPer.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaUro != null ? flagEstaUro.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_ROLE_ROL", referencedColumnName = "IDEN_ROLE_ROL",insertable = false,updatable = false)
    public AdmRol getAdmRolByIdenRoleRol() {
        return admRolByIdenRoleRol;
    }

    public void setAdmRolByIdenRoleRol(AdmRol admRolByIdenRoleRol) {
        this.admRolByIdenRoleRol = admRolByIdenRoleRol;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_PERS_PER", referencedColumnName = "IDEN_PERS_PER",insertable = false,updatable = false)
    public AdmUsuario getAdmUsuarioByIdenPersPer() {
        return admUsuarioByIdenPersPer;
    }

    public void setAdmUsuarioByIdenPersPer(AdmUsuario admUsuarioByIdenPersPer) {
        this.admUsuarioByIdenPersPer = admUsuarioByIdenPersPer;
    }
}
