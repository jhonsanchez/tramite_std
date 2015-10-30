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
@Table(name = "ADM_MODULO", catalog = "")
public class AdmModulo {
    private BigDecimal idenModuMod;
    private String nombModuMod;
    private String rutaImagMod;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaMod;
    private Collection<AdmMenuModulo> admMenuModulosByIdenModuMod;
    private Collection<AdmModuloRol> admModuloRolsByIdenModuMod;

    @Id
    @Column(name = "IDEN_MODU_MOD")
    public BigDecimal getIdenModuMod() {
        return idenModuMod;
    }

    public void setIdenModuMod(BigDecimal idenModuMod) {
        this.idenModuMod = idenModuMod;
    }

    @Basic
    @Column(name = "NOMB_MODU_MOD")
    public String getNombModuMod() {
        return nombModuMod;
    }

    public void setNombModuMod(String nombModuMod) {
        this.nombModuMod = nombModuMod;
    }

    @Basic
    @Column(name = "RUTA_IMAG_MOD")
    public String getRutaImagMod() {
        return rutaImagMod;
    }

    public void setRutaImagMod(String rutaImagMod) {
        this.rutaImagMod = rutaImagMod;
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
    @Column(name = "FLAG_ESTA_MOD")
    public BigInteger getFlagEstaMod() {
        return flagEstaMod;
    }

    public void setFlagEstaMod(BigInteger flagEstaMod) {
        this.flagEstaMod = flagEstaMod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmModulo admModulo = (AdmModulo) o;

        if (idenModuMod != null ? !idenModuMod.equals(admModulo.idenModuMod) : admModulo.idenModuMod != null)
            return false;
        if (nombModuMod != null ? !nombModuMod.equals(admModulo.nombModuMod) : admModulo.nombModuMod != null)
            return false;
        if (rutaImagMod != null ? !rutaImagMod.equals(admModulo.rutaImagMod) : admModulo.rutaImagMod != null)
            return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(admModulo.usuaCreaAud) : admModulo.usuaCreaAud != null)
            return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(admModulo.fechCreaAud) : admModulo.fechCreaAud != null)
            return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(admModulo.usuaModiAud) : admModulo.usuaModiAud != null)
            return false;
        if (fechModiAud != null ? !fechModiAud.equals(admModulo.fechModiAud) : admModulo.fechModiAud != null)
            return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(admModulo.nombEquiAud) : admModulo.nombEquiAud != null)
            return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(admModulo.nombSopeAud) : admModulo.nombSopeAud != null)
            return false;
        if (flagEstaMod != null ? !flagEstaMod.equals(admModulo.flagEstaMod) : admModulo.flagEstaMod != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenModuMod != null ? idenModuMod.hashCode() : 0;
        result = 31 * result + (nombModuMod != null ? nombModuMod.hashCode() : 0);
        result = 31 * result + (rutaImagMod != null ? rutaImagMod.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaMod != null ? flagEstaMod.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "admModuloByIdenModuMod")
    public Collection<AdmMenuModulo> getAdmMenuModulosByIdenModuMod() {
        return admMenuModulosByIdenModuMod;
    }

    public void setAdmMenuModulosByIdenModuMod(Collection<AdmMenuModulo> admMenuModulosByIdenModuMod) {
        this.admMenuModulosByIdenModuMod = admMenuModulosByIdenModuMod;
    }

    @OneToMany(mappedBy = "admModuloByIdenModuMod")
    public Collection<AdmModuloRol> getAdmModuloRolsByIdenModuMod() {
        return admModuloRolsByIdenModuMod;
    }

    public void setAdmModuloRolsByIdenModuMod(Collection<AdmModuloRol> admModuloRolsByIdenModuMod) {
        this.admModuloRolsByIdenModuMod = admModuloRolsByIdenModuMod;
    }
}
