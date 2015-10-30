package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "ADM_MODULO_EXCEPCION", catalog = "")
public class AdmModuloExcepcion {
    private BigDecimal idenModuMde;
    private BigDecimal idenMoroMdr;
    private BigDecimal idenMemoMmd;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaMde;
    private AdmMenuModulo admMenuModuloByIdenMemoMmd;
    private AdmModuloRol admModuloRolByIdenMoroMdr;

    @Id
    @Column(name = "IDEN_MODU_MDE")
    public BigDecimal getIdenModuMde() {
        return idenModuMde;
    }

    public void setIdenModuMde(BigDecimal idenModuMde) {
        this.idenModuMde = idenModuMde;
    }

    @Basic
    @Column(name = "IDEN_MORO_MDR")
    public BigDecimal getIdenMoroMdr() {
        return idenMoroMdr;
    }

    public void setIdenMoroMdr(BigDecimal idenMoroMdr) {
        this.idenMoroMdr = idenMoroMdr;
    }

    @Basic
    @Column(name = "IDEN_MEMO_MMD")
    public BigDecimal getIdenMemoMmd() {
        return idenMemoMmd;
    }

    public void setIdenMemoMmd(BigDecimal idenMemoMmd) {
        this.idenMemoMmd = idenMemoMmd;
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
    @Column(name = "FLAG_ESTA_MDE")
    public BigInteger getFlagEstaMde() {
        return flagEstaMde;
    }

    public void setFlagEstaMde(BigInteger flagEstaMde) {
        this.flagEstaMde = flagEstaMde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmModuloExcepcion that = (AdmModuloExcepcion) o;

        if (idenModuMde != null ? !idenModuMde.equals(that.idenModuMde) : that.idenModuMde != null) return false;
        if (idenMoroMdr != null ? !idenMoroMdr.equals(that.idenMoroMdr) : that.idenMoroMdr != null) return false;
        if (idenMemoMmd != null ? !idenMemoMmd.equals(that.idenMemoMmd) : that.idenMemoMmd != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaMde != null ? !flagEstaMde.equals(that.flagEstaMde) : that.flagEstaMde != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenModuMde != null ? idenModuMde.hashCode() : 0;
        result = 31 * result + (idenMoroMdr != null ? idenMoroMdr.hashCode() : 0);
        result = 31 * result + (idenMemoMmd != null ? idenMemoMmd.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaMde != null ? flagEstaMde.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_MEMO_MMD", referencedColumnName = "IDEN_MEMO_MMD",insertable = false,updatable = false)
    public AdmMenuModulo getAdmMenuModuloByIdenMemoMmd() {
        return admMenuModuloByIdenMemoMmd;
    }

    public void setAdmMenuModuloByIdenMemoMmd(AdmMenuModulo admMenuModuloByIdenMemoMmd) {
        this.admMenuModuloByIdenMemoMmd = admMenuModuloByIdenMemoMmd;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_MORO_MDR", referencedColumnName = "IDEN_MORO_MDR",insertable = false,updatable = false)
    public AdmModuloRol getAdmModuloRolByIdenMoroMdr() {
        return admModuloRolByIdenMoroMdr;
    }

    public void setAdmModuloRolByIdenMoroMdr(AdmModuloRol admModuloRolByIdenMoroMdr) {
        this.admModuloRolByIdenMoroMdr = admModuloRolByIdenMoroMdr;
    }
}
