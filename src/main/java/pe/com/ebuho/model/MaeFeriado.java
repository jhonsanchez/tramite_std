package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "MAE_FERIADO", catalog = "")
public class MaeFeriado {
    private BigDecimal idenFeriFer;
    private Timestamp fechFeriFer;
    private BigInteger flagFijoFer;
    private String obseFeriFer;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaFer;

    @Id
    @Column(name = "IDEN_FERI_FER")
    public BigDecimal getIdenFeriFer() {
        return idenFeriFer;
    }

    public void setIdenFeriFer(BigDecimal idenFeriFer) {
        this.idenFeriFer = idenFeriFer;
    }

    @Basic
    @Column(name = "FECH_FERI_FER")
    public Timestamp getFechFeriFer() {
        return fechFeriFer;
    }

    public void setFechFeriFer(Timestamp fechFeriFer) {
        this.fechFeriFer = fechFeriFer;
    }

    @Basic
    @Column(name = "FLAG_FIJO_FER")
    public BigInteger getFlagFijoFer() {
        return flagFijoFer;
    }

    public void setFlagFijoFer(BigInteger flagFijoFer) {
        this.flagFijoFer = flagFijoFer;
    }

    @Basic
    @Column(name = "OBSE_FERI_FER")
    public String getObseFeriFer() {
        return obseFeriFer;
    }

    public void setObseFeriFer(String obseFeriFer) {
        this.obseFeriFer = obseFeriFer;
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
    @Column(name = "FLAG_ESTA_FER")
    public BigInteger getFlagEstaFer() {
        return flagEstaFer;
    }

    public void setFlagEstaFer(BigInteger flagEstaFer) {
        this.flagEstaFer = flagEstaFer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeFeriado that = (MaeFeriado) o;

        if (idenFeriFer != null ? !idenFeriFer.equals(that.idenFeriFer) : that.idenFeriFer != null) return false;
        if (fechFeriFer != null ? !fechFeriFer.equals(that.fechFeriFer) : that.fechFeriFer != null) return false;
        if (flagFijoFer != null ? !flagFijoFer.equals(that.flagFijoFer) : that.flagFijoFer != null) return false;
        if (obseFeriFer != null ? !obseFeriFer.equals(that.obseFeriFer) : that.obseFeriFer != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaFer != null ? !flagEstaFer.equals(that.flagEstaFer) : that.flagEstaFer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenFeriFer != null ? idenFeriFer.hashCode() : 0;
        result = 31 * result + (fechFeriFer != null ? fechFeriFer.hashCode() : 0);
        result = 31 * result + (flagFijoFer != null ? flagFijoFer.hashCode() : 0);
        result = 31 * result + (obseFeriFer != null ? obseFeriFer.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaFer != null ? flagEstaFer.hashCode() : 0);
        return result;
    }
}
