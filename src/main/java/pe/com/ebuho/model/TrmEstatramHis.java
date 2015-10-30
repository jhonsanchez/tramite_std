package pe.com.ebuho.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "TRM_ESTATRAM_HIS", catalog = "")
@IdClass(TrmEstatramHisPK.class)
public class TrmEstatramHis implements Serializable{
    private BigDecimal idenExpeTrm;
    private int secuEstaHis;
    private String codiEstaHis;
    private Timestamp fechEstaHis;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaHis;

    @Id
    @Column(name = "IDEN_EXPE_TRM")
    public BigDecimal getIdenExpeTrm() {
        return idenExpeTrm;
    }

    public void setIdenExpeTrm(BigDecimal idenExpeTrm) {
        this.idenExpeTrm = idenExpeTrm;
    }

    @Id
    @Column(name = "SECU_ESTA_HIS")
    public int getSecuEstaHis() {
        return secuEstaHis;
    }

    public void setSecuEstaHis(int secuEstaHis) {
        this.secuEstaHis = secuEstaHis;
    }

    @Basic
    @Column(name = "CODI_ESTA_HIS")
    public String getCodiEstaHis() {
        return codiEstaHis;
    }

    public void setCodiEstaHis(String codiEstaHis) {
        this.codiEstaHis = codiEstaHis;
    }

    @Basic
    @Column(name = "FECH_ESTA_HIS")
    public Timestamp getFechEstaHis() {
        return fechEstaHis;
    }

    public void setFechEstaHis(Timestamp fechEstaHis) {
        this.fechEstaHis = fechEstaHis;
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
    @Column(name = "FLAG_ESTA_HIS")
    public BigInteger getFlagEstaHis() {
        return flagEstaHis;
    }

    public void setFlagEstaHis(BigInteger flagEstaHis) {
        this.flagEstaHis = flagEstaHis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrmEstatramHis that = (TrmEstatramHis) o;

        if (secuEstaHis != that.secuEstaHis) return false;
        if (idenExpeTrm != null ? !idenExpeTrm.equals(that.idenExpeTrm) : that.idenExpeTrm != null) return false;
        if (codiEstaHis != null ? !codiEstaHis.equals(that.codiEstaHis) : that.codiEstaHis != null) return false;
        if (fechEstaHis != null ? !fechEstaHis.equals(that.fechEstaHis) : that.fechEstaHis != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaHis != null ? !flagEstaHis.equals(that.flagEstaHis) : that.flagEstaHis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenExpeTrm != null ? idenExpeTrm.hashCode() : 0;
        result = 31 * result + secuEstaHis;
        result = 31 * result + (codiEstaHis != null ? codiEstaHis.hashCode() : 0);
        result = 31 * result + (fechEstaHis != null ? fechEstaHis.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaHis != null ? flagEstaHis.hashCode() : 0);
        return result;
    }
}
