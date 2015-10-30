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
@Table(name = "ADM_MENU", catalog = "")
public class AdmMenu {
    private BigDecimal idenMenuMnu;
    private String nombMenuMnu;
    private String pagiMenuMnu;
    private String descPrmtMnu;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaMnu;
    private BigInteger flagMenuMnu;
    private BigInteger flagProcMnu;
    private Collection<AdmMenuModulo> admMenuModulosByIdenMenuMnu;
    private Collection<AdmPermisoMenu> admPermisoMenusByIdenMenuMnu;

    @Id
    @Column(name = "IDEN_MENU_MNU")
    public BigDecimal getIdenMenuMnu() {
        return idenMenuMnu;
    }

    public void setIdenMenuMnu(BigDecimal idenMenuMnu) {
        this.idenMenuMnu = idenMenuMnu;
    }

    @Basic
    @Column(name = "NOMB_MENU_MNU")
    public String getNombMenuMnu() {
        return nombMenuMnu;
    }

    public void setNombMenuMnu(String nombMenuMnu) {
        this.nombMenuMnu = nombMenuMnu;
    }

    @Basic
    @Column(name = "PAGI_MENU_MNU")
    public String getPagiMenuMnu() {
        return pagiMenuMnu;
    }

    public void setPagiMenuMnu(String pagiMenuMnu) {
        this.pagiMenuMnu = pagiMenuMnu;
    }

    @Basic
    @Column(name = "DESC_PRMT_MNU")
    public String getDescPrmtMnu() {
        return descPrmtMnu;
    }

    public void setDescPrmtMnu(String descPrmtMnu) {
        this.descPrmtMnu = descPrmtMnu;
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
    @Column(name = "FLAG_ESTA_MNU")
    public BigInteger getFlagEstaMnu() {
        return flagEstaMnu;
    }

    public void setFlagEstaMnu(BigInteger flagEstaMnu) {
        this.flagEstaMnu = flagEstaMnu;
    }

    @Basic
    @Column(name = "FLAG_MENU_MNU")
    public BigInteger getFlagMenuMnu() {
        return flagMenuMnu;
    }

    public void setFlagMenuMnu(BigInteger flagMenuMnu) {
        this.flagMenuMnu = flagMenuMnu;
    }

    @Basic
    @Column(name = "FLAG_PROC_MNU")
    public BigInteger getFlagProcMnu() {
        return flagProcMnu;
    }

    public void setFlagProcMnu(BigInteger flagProcMnu) {
        this.flagProcMnu = flagProcMnu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmMenu admMenu = (AdmMenu) o;

        if (idenMenuMnu != null ? !idenMenuMnu.equals(admMenu.idenMenuMnu) : admMenu.idenMenuMnu != null) return false;
        if (nombMenuMnu != null ? !nombMenuMnu.equals(admMenu.nombMenuMnu) : admMenu.nombMenuMnu != null) return false;
        if (pagiMenuMnu != null ? !pagiMenuMnu.equals(admMenu.pagiMenuMnu) : admMenu.pagiMenuMnu != null) return false;
        if (descPrmtMnu != null ? !descPrmtMnu.equals(admMenu.descPrmtMnu) : admMenu.descPrmtMnu != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(admMenu.usuaCreaAud) : admMenu.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(admMenu.fechCreaAud) : admMenu.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(admMenu.usuaModiAud) : admMenu.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(admMenu.fechModiAud) : admMenu.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(admMenu.nombEquiAud) : admMenu.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(admMenu.nombSopeAud) : admMenu.nombSopeAud != null) return false;
        if (flagEstaMnu != null ? !flagEstaMnu.equals(admMenu.flagEstaMnu) : admMenu.flagEstaMnu != null) return false;
        if (flagMenuMnu != null ? !flagMenuMnu.equals(admMenu.flagMenuMnu) : admMenu.flagMenuMnu != null) return false;
        if (flagProcMnu != null ? !flagProcMnu.equals(admMenu.flagProcMnu) : admMenu.flagProcMnu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenMenuMnu != null ? idenMenuMnu.hashCode() : 0;
        result = 31 * result + (nombMenuMnu != null ? nombMenuMnu.hashCode() : 0);
        result = 31 * result + (pagiMenuMnu != null ? pagiMenuMnu.hashCode() : 0);
        result = 31 * result + (descPrmtMnu != null ? descPrmtMnu.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaMnu != null ? flagEstaMnu.hashCode() : 0);
        result = 31 * result + (flagMenuMnu != null ? flagMenuMnu.hashCode() : 0);
        result = 31 * result + (flagProcMnu != null ? flagProcMnu.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AdmMenu{" +
                "idenMenuMnu=" + idenMenuMnu +
                ", nombMenuMnu='" + nombMenuMnu + '\'' +
                ", pagiMenuMnu='" + pagiMenuMnu + '\'' +
                ", descPrmtMnu='" + descPrmtMnu + '\'' +
                '}';
    }

    @OneToMany(mappedBy = "admMenuByIdenMenuMnu")
    public Collection<AdmMenuModulo> getAdmMenuModulosByIdenMenuMnu() {
        return admMenuModulosByIdenMenuMnu;
    }

    public void setAdmMenuModulosByIdenMenuMnu(Collection<AdmMenuModulo> admMenuModulosByIdenMenuMnu) {
        this.admMenuModulosByIdenMenuMnu = admMenuModulosByIdenMenuMnu;
    }

    @OneToMany(mappedBy = "admMenuByIdenMenuPmn")
    public Collection<AdmPermisoMenu> getAdmPermisoMenusByIdenMenuMnu() {
        return admPermisoMenusByIdenMenuMnu;
    }

    public void setAdmPermisoMenusByIdenMenuMnu(Collection<AdmPermisoMenu> admPermisoMenusByIdenMenuMnu) {
        this.admPermisoMenusByIdenMenuMnu = admPermisoMenusByIdenMenuMnu;
    }
}
