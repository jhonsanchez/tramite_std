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
@Table(name = "ADM_PERMISO_MENU", catalog = "")
public class AdmPermisoMenu {
    private BigDecimal idenPermPmn;
    private BigDecimal idenMenuPmn;
    private String nombPermPmn;
    private String nombPercPmn;
    private String tipoVisuPmn;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaPmn;
    private AdmMenu admMenuByIdenMenuPmn;
    private Collection<AdmRolPermenu> admRolPermenusByIdenPermPmn;

    @Id
    @Column(name = "IDEN_PERM_PMN")
    public BigDecimal getIdenPermPmn() {
        return idenPermPmn;
    }

    public void setIdenPermPmn(BigDecimal idenPermPmn) {
        this.idenPermPmn = idenPermPmn;
    }

    @Basic
    @Column(name = "IDEN_MENU_PMN")
    public BigDecimal getIdenMenuPmn() {
        return idenMenuPmn;
    }

    public void setIdenMenuPmn(BigDecimal idenMenuPmn) {
        this.idenMenuPmn = idenMenuPmn;
    }

    @Basic
    @Column(name = "NOMB_PERM_PMN")
    public String getNombPermPmn() {
        return nombPermPmn;
    }

    public void setNombPermPmn(String nombPermPmn) {
        this.nombPermPmn = nombPermPmn;
    }

    @Basic
    @Column(name = "NOMB_PERC_PMN")
    public String getNombPercPmn() {
        return nombPercPmn;
    }

    public void setNombPercPmn(String nombPercPmn) {
        this.nombPercPmn = nombPercPmn;
    }

    @Basic
    @Column(name = "TIPO_VISU_PMN")
    public String getTipoVisuPmn() {
        return tipoVisuPmn;
    }

    public void setTipoVisuPmn(String tipoVisuPmn) {
        this.tipoVisuPmn = tipoVisuPmn;
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
    @Column(name = "FLAG_ESTA_PMN")
    public BigInteger getFlagEstaPmn() {
        return flagEstaPmn;
    }

    public void setFlagEstaPmn(BigInteger flagEstaPmn) {
        this.flagEstaPmn = flagEstaPmn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmPermisoMenu that = (AdmPermisoMenu) o;

        if (idenPermPmn != null ? !idenPermPmn.equals(that.idenPermPmn) : that.idenPermPmn != null) return false;
        if (idenMenuPmn != null ? !idenMenuPmn.equals(that.idenMenuPmn) : that.idenMenuPmn != null) return false;
        if (nombPermPmn != null ? !nombPermPmn.equals(that.nombPermPmn) : that.nombPermPmn != null) return false;
        if (nombPercPmn != null ? !nombPercPmn.equals(that.nombPercPmn) : that.nombPercPmn != null) return false;
        if (tipoVisuPmn != null ? !tipoVisuPmn.equals(that.tipoVisuPmn) : that.tipoVisuPmn != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaPmn != null ? !flagEstaPmn.equals(that.flagEstaPmn) : that.flagEstaPmn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenPermPmn != null ? idenPermPmn.hashCode() : 0;
        result = 31 * result + (idenMenuPmn != null ? idenMenuPmn.hashCode() : 0);
        result = 31 * result + (nombPermPmn != null ? nombPermPmn.hashCode() : 0);
        result = 31 * result + (nombPercPmn != null ? nombPercPmn.hashCode() : 0);
        result = 31 * result + (tipoVisuPmn != null ? tipoVisuPmn.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaPmn != null ? flagEstaPmn.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_MENU_PMN", referencedColumnName = "IDEN_MENU_MNU",insertable = false,updatable = false)
    public AdmMenu getAdmMenuByIdenMenuPmn() {
        return admMenuByIdenMenuPmn;
    }

    public void setAdmMenuByIdenMenuPmn(AdmMenu admMenuByIdenMenuPmn) {
        this.admMenuByIdenMenuPmn = admMenuByIdenMenuPmn;
    }

    @OneToMany(mappedBy = "admPermisoMenuByIdenPermPmn")
    public Collection<AdmRolPermenu> getAdmRolPermenusByIdenPermPmn() {
        return admRolPermenusByIdenPermPmn;
    }

    public void setAdmRolPermenusByIdenPermPmn(Collection<AdmRolPermenu> admRolPermenusByIdenPermPmn) {
        this.admRolPermenusByIdenPermPmn = admRolPermenusByIdenPermPmn;
    }
}
