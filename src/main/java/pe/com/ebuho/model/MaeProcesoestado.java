package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "MAE_PROCESOESTADO", catalog = "")
@IdClass(MaeProcesoestadoPK.class)
public class MaeProcesoestado {
    private BigDecimal idenProcPrc;
    private int secuEstaPre;
    private String nombEstaPre;
    private String rutaIconPre;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaPrc;

    @Id
    @Column(name = "IDEN_PROC_PRC")
    public BigDecimal getIdenProcPrc() {
        return idenProcPrc;
    }

    public void setIdenProcPrc(BigDecimal idenProcPrc) {
        this.idenProcPrc = idenProcPrc;
    }

    @Id
    @Column(name = "SECU_ESTA_PRE")
    public int getSecuEstaPre() {
        return secuEstaPre;
    }

    public void setSecuEstaPre(int secuEstaPre) {
        this.secuEstaPre = secuEstaPre;
    }

    @Basic
    @Column(name = "NOMB_ESTA_PRE")
    public String getNombEstaPre() {
        return nombEstaPre;
    }

    public void setNombEstaPre(String nombEstaPre) {
        this.nombEstaPre = nombEstaPre;
    }

    @Basic
    @Column(name = "RUTA_ICON_PRE")
    public String getRutaIconPre() {
        return rutaIconPre;
    }

    public void setRutaIconPre(String rutaIconPre) {
        this.rutaIconPre = rutaIconPre;
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
    @Column(name = "FLAG_ESTA_PRC")
    public BigInteger getFlagEstaPrc() {
        return flagEstaPrc;
    }

    public void setFlagEstaPrc(BigInteger flagEstaPrc) {
        this.flagEstaPrc = flagEstaPrc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeProcesoestado that = (MaeProcesoestado) o;

        if (secuEstaPre != that.secuEstaPre) return false;
        if (idenProcPrc != null ? !idenProcPrc.equals(that.idenProcPrc) : that.idenProcPrc != null) return false;
        if (nombEstaPre != null ? !nombEstaPre.equals(that.nombEstaPre) : that.nombEstaPre != null) return false;
        if (rutaIconPre != null ? !rutaIconPre.equals(that.rutaIconPre) : that.rutaIconPre != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaPrc != null ? !flagEstaPrc.equals(that.flagEstaPrc) : that.flagEstaPrc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenProcPrc != null ? idenProcPrc.hashCode() : 0;
        result = 31 * result + secuEstaPre;
        result = 31 * result + (nombEstaPre != null ? nombEstaPre.hashCode() : 0);
        result = 31 * result + (rutaIconPre != null ? rutaIconPre.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaPrc != null ? flagEstaPrc.hashCode() : 0);
        return result;
    }
}
