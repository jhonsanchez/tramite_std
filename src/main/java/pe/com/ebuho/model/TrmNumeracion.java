package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "TRM_NUMERACION", catalog = "")
public class TrmNumeracion {
    private BigDecimal idenNumeNum;
    private Integer tipoDocuTrm;
    private BigDecimal idenAreaAre;
    private BigDecimal secuNumeNum;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private Integer anioNumeNum;
    private String nombEquiAud;
    private String nombSopeAud;

    @Id
    @Column(name = "IDEN_NUME_NUM")
    public BigDecimal getIdenNumeNum() {
        return idenNumeNum;
    }

    public void setIdenNumeNum(BigDecimal idenNumeNum) {
        this.idenNumeNum = idenNumeNum;
    }

    @Basic
    @Column(name = "TIPO_DOCU_TRM")
    public Integer getTipoDocuTrm() {
        return tipoDocuTrm;
    }

    public void setTipoDocuTrm(Integer tipoDocuTrm) {
        this.tipoDocuTrm = tipoDocuTrm;
    }

    @Basic
    @Column(name = "IDEN_AREA_ARE")
    public BigDecimal getIdenAreaAre() {
        return idenAreaAre;
    }

    public void setIdenAreaAre(BigDecimal idenAreaAre) {
        this.idenAreaAre = idenAreaAre;
    }

    @Basic
    @Column(name = "SECU_NUME_NUM")
    public BigDecimal getSecuNumeNum() {
        return secuNumeNum;
    }

    public void setSecuNumeNum(BigDecimal secuNumeNum) {
        this.secuNumeNum = secuNumeNum;
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
    @Column(name = "ANIO_NUME_NUM")
    public Integer getAnioNumeNum() {
        return anioNumeNum;
    }

    public void setAnioNumeNum(Integer anioNumeNum) {
        this.anioNumeNum = anioNumeNum;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrmNumeracion that = (TrmNumeracion) o;

        if (idenNumeNum != null ? !idenNumeNum.equals(that.idenNumeNum) : that.idenNumeNum != null) return false;
        if (tipoDocuTrm != null ? !tipoDocuTrm.equals(that.tipoDocuTrm) : that.tipoDocuTrm != null) return false;
        if (idenAreaAre != null ? !idenAreaAre.equals(that.idenAreaAre) : that.idenAreaAre != null) return false;
        if (secuNumeNum != null ? !secuNumeNum.equals(that.secuNumeNum) : that.secuNumeNum != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (anioNumeNum != null ? !anioNumeNum.equals(that.anioNumeNum) : that.anioNumeNum != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenNumeNum != null ? idenNumeNum.hashCode() : 0;
        result = 31 * result + (tipoDocuTrm != null ? tipoDocuTrm.hashCode() : 0);
        result = 31 * result + (idenAreaAre != null ? idenAreaAre.hashCode() : 0);
        result = 31 * result + (secuNumeNum != null ? secuNumeNum.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (anioNumeNum != null ? anioNumeNum.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        return result;
    }
}
