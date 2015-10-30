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
@Table(name = "ADM_MENU_MODULO", catalog = "")
public class AdmMenuModulo {
    private BigDecimal idenMemoMmd;
    private BigDecimal idenModuMod;
    private BigDecimal idenMenuMnu;
    private BigDecimal idenMempMmd;
    private String nombMenuMmd;
    private String rutaImagMmd;
    private Integer numeNiveMmd;
    private String mensAyudMmd;
    private Integer ordeMenuMmd;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaMmd;
    private AdmMenu admMenuByIdenMenuMnu;
    private AdmMenuModulo admMenuModuloByIdenMempMmd;
    private Collection<AdmMenuModulo> admMenuModulosByIdenMemoMmd;
    private AdmModulo admModuloByIdenModuMod;
    private Collection<AdmModuloExcepcion> admModuloExcepcionsByIdenMemoMmd;

    @Id
    @Column(name = "IDEN_MEMO_MMD")
    public BigDecimal getIdenMemoMmd() {
        return idenMemoMmd;
    }

    public void setIdenMemoMmd(BigDecimal idenMemoMmd) {
        this.idenMemoMmd = idenMemoMmd;
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
    @Column(name = "IDEN_MENU_MNU")
    public BigDecimal getIdenMenuMnu() {
        return idenMenuMnu;
    }

    public void setIdenMenuMnu(BigDecimal idenMenuMnu) {
        this.idenMenuMnu = idenMenuMnu;
    }

    @Basic
    @Column(name = "IDEN_MEMP_MMD")
    public BigDecimal getIdenMempMmd() {
        return idenMempMmd;
    }

    public void setIdenMempMmd(BigDecimal idenMempMmd) {
        this.idenMempMmd = idenMempMmd;
    }

    @Basic
    @Column(name = "NOMB_MENU_MMD")
    public String getNombMenuMmd() {
        return nombMenuMmd;
    }

    public void setNombMenuMmd(String nombMenuMmd) {
        this.nombMenuMmd = nombMenuMmd;
    }

    @Basic
    @Column(name = "RUTA_IMAG_MMD")
    public String getRutaImagMmd() {
        return rutaImagMmd;
    }

    public void setRutaImagMmd(String rutaImagMmd) {
        this.rutaImagMmd = rutaImagMmd;
    }

    @Basic
    @Column(name = "NUME_NIVE_MMD")
    public Integer getNumeNiveMmd() {
        return numeNiveMmd;
    }

    public void setNumeNiveMmd(Integer numeNiveMmd) {
        this.numeNiveMmd = numeNiveMmd;
    }

    @Basic
    @Column(name = "MENS_AYUD_MMD")
    public String getMensAyudMmd() {
        return mensAyudMmd;
    }

    public void setMensAyudMmd(String mensAyudMmd) {
        this.mensAyudMmd = mensAyudMmd;
    }

    @Basic
    @Column(name = "ORDE_MENU_MMD")
    public Integer getOrdeMenuMmd() {
        return ordeMenuMmd;
    }

    public void setOrdeMenuMmd(Integer ordeMenuMmd) {
        this.ordeMenuMmd = ordeMenuMmd;
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
    @Column(name = "FLAG_ESTA_MMD")
    public BigInteger getFlagEstaMmd() {
        return flagEstaMmd;
    }

    public void setFlagEstaMmd(BigInteger flagEstaMmd) {
        this.flagEstaMmd = flagEstaMmd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmMenuModulo that = (AdmMenuModulo) o;

        if (idenMemoMmd != null ? !idenMemoMmd.equals(that.idenMemoMmd) : that.idenMemoMmd != null) return false;
        if (idenModuMod != null ? !idenModuMod.equals(that.idenModuMod) : that.idenModuMod != null) return false;
        if (idenMenuMnu != null ? !idenMenuMnu.equals(that.idenMenuMnu) : that.idenMenuMnu != null) return false;
        if (idenMempMmd != null ? !idenMempMmd.equals(that.idenMempMmd) : that.idenMempMmd != null) return false;
        if (nombMenuMmd != null ? !nombMenuMmd.equals(that.nombMenuMmd) : that.nombMenuMmd != null) return false;
        if (rutaImagMmd != null ? !rutaImagMmd.equals(that.rutaImagMmd) : that.rutaImagMmd != null) return false;
        if (numeNiveMmd != null ? !numeNiveMmd.equals(that.numeNiveMmd) : that.numeNiveMmd != null) return false;
        if (mensAyudMmd != null ? !mensAyudMmd.equals(that.mensAyudMmd) : that.mensAyudMmd != null) return false;
        if (ordeMenuMmd != null ? !ordeMenuMmd.equals(that.ordeMenuMmd) : that.ordeMenuMmd != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaMmd != null ? !flagEstaMmd.equals(that.flagEstaMmd) : that.flagEstaMmd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenMemoMmd != null ? idenMemoMmd.hashCode() : 0;
        result = 31 * result + (idenModuMod != null ? idenModuMod.hashCode() : 0);
        result = 31 * result + (idenMenuMnu != null ? idenMenuMnu.hashCode() : 0);
        result = 31 * result + (idenMempMmd != null ? idenMempMmd.hashCode() : 0);
        result = 31 * result + (nombMenuMmd != null ? nombMenuMmd.hashCode() : 0);
        result = 31 * result + (rutaImagMmd != null ? rutaImagMmd.hashCode() : 0);
        result = 31 * result + (numeNiveMmd != null ? numeNiveMmd.hashCode() : 0);
        result = 31 * result + (mensAyudMmd != null ? mensAyudMmd.hashCode() : 0);
        result = 31 * result + (ordeMenuMmd != null ? ordeMenuMmd.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaMmd != null ? flagEstaMmd.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_MENU_MNU", referencedColumnName = "IDEN_MENU_MNU",insertable = false,updatable = false)
    public AdmMenu getAdmMenuByIdenMenuMnu() {
        return admMenuByIdenMenuMnu;
    }

    public void setAdmMenuByIdenMenuMnu(AdmMenu admMenuByIdenMenuMnu) {
        this.admMenuByIdenMenuMnu = admMenuByIdenMenuMnu;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_MEMP_MMD", referencedColumnName = "IDEN_MEMO_MMD",insertable = false,updatable = false)
    public AdmMenuModulo getAdmMenuModuloByIdenMempMmd() {
        return admMenuModuloByIdenMempMmd;
    }

    public void setAdmMenuModuloByIdenMempMmd(AdmMenuModulo admMenuModuloByIdenMempMmd) {
        this.admMenuModuloByIdenMempMmd = admMenuModuloByIdenMempMmd;
    }

    @OneToMany(mappedBy = "admMenuModuloByIdenMempMmd")
    public Collection<AdmMenuModulo> getAdmMenuModulosByIdenMemoMmd() {
        return admMenuModulosByIdenMemoMmd;
    }

    public void setAdmMenuModulosByIdenMemoMmd(Collection<AdmMenuModulo> admMenuModulosByIdenMemoMmd) {
        this.admMenuModulosByIdenMemoMmd = admMenuModulosByIdenMemoMmd;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_MODU_MOD", referencedColumnName = "IDEN_MODU_MOD",insertable = false,updatable = false)
    public AdmModulo getAdmModuloByIdenModuMod() {
        return admModuloByIdenModuMod;
    }

    public void setAdmModuloByIdenModuMod(AdmModulo admModuloByIdenModuMod) {
        this.admModuloByIdenModuMod = admModuloByIdenModuMod;
    }

    @OneToMany(mappedBy = "admMenuModuloByIdenMemoMmd")
    public Collection<AdmModuloExcepcion> getAdmModuloExcepcionsByIdenMemoMmd() {
        return admModuloExcepcionsByIdenMemoMmd;
    }

    public void setAdmModuloExcepcionsByIdenMemoMmd(Collection<AdmModuloExcepcion> admModuloExcepcionsByIdenMemoMmd) {
        this.admModuloExcepcionsByIdenMemoMmd = admModuloExcepcionsByIdenMemoMmd;
    }
}
