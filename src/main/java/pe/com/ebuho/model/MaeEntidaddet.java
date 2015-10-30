package pe.com.ebuho.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "MAE_ENTIDADDET", catalog = "")
public class MaeEntidaddet {
    private BigDecimal idenEntiDet;

    @Id
    @javax.persistence.Column(name = "IDEN_ENTI_DET")
    public BigDecimal getIdenEntiDet() {
        return idenEntiDet;
    }

    public void setIdenEntiDet(BigDecimal idenEntiDet) {
        this.idenEntiDet = idenEntiDet;
    }

    private String codiEntiEnt;

    @Basic
    @javax.persistence.Column(name = "CODI_ENTI_ENT")
    public String getCodiEntiEnt() {
        return codiEntiEnt;
    }

    public void setCodiEntiEnt(String codiEntiEnt) {
        this.codiEntiEnt = codiEntiEnt;
    }

    private int secuEntiDet;

    @Basic
    @javax.persistence.Column(name = "SECU_ENTI_DET")
    public int getSecuEntiDet() {
        return secuEntiDet;
    }

    public void setSecuEntiDet(int secuEntiDet) {
        this.secuEntiDet = secuEntiDet;
    }

    private String valoCaduDet;

    @Basic
    @javax.persistence.Column(name = "VALO_CADU_DET")
    public String getValoCaduDet() {
        return valoCaduDet;
    }

    public void setValoCaduDet(String valoCaduDet) {
        this.valoCaduDet = valoCaduDet;
    }

    private String valoCaddDet;

    @Basic
    @javax.persistence.Column(name = "VALO_CADD_DET")
    public String getValoCaddDet() {
        return valoCaddDet;
    }

    public void setValoCaddDet(String valoCaddDet) {
        this.valoCaddDet = valoCaddDet;
    }

    private String valoCadtDet;

    @Basic
    @javax.persistence.Column(name = "VALO_CADT_DET")
    public String getValoCadtDet() {
        return valoCadtDet;
    }

    public void setValoCadtDet(String valoCadtDet) {
        this.valoCadtDet = valoCadtDet;
    }

    private BigDecimal valoNumuDet;

    @Basic
    @javax.persistence.Column(name = "VALO_NUMU_DET")
    public BigDecimal getValoNumuDet() {
        return valoNumuDet;
    }

    public void setValoNumuDet(BigDecimal valoNumuDet) {
        this.valoNumuDet = valoNumuDet;
    }

    private BigDecimal valoNumdDet;

    @Basic
    @javax.persistence.Column(name = "VALO_NUMD_DET")
    public BigDecimal getValoNumdDet() {
        return valoNumdDet;
    }

    public void setValoNumdDet(BigDecimal valoNumdDet) {
        this.valoNumdDet = valoNumdDet;
    }

    private BigDecimal valoNumtDet;

    @Basic
    @javax.persistence.Column(name = "VALO_NUMT_DET")
    public BigDecimal getValoNumtDet() {
        return valoNumtDet;
    }

    public void setValoNumtDet(BigDecimal valoNumtDet) {
        this.valoNumtDet = valoNumtDet;
    }

    private BigDecimal valoDecuDet;

    @Basic
    @javax.persistence.Column(name = "VALO_DECU_DET")
    public BigDecimal getValoDecuDet() {
        return valoDecuDet;
    }

    public void setValoDecuDet(BigDecimal valoDecuDet) {
        this.valoDecuDet = valoDecuDet;
    }

    private BigDecimal valoDecdDet;

    @Basic
    @javax.persistence.Column(name = "VALO_DECD_DET")
    public BigDecimal getValoDecdDet() {
        return valoDecdDet;
    }

    public void setValoDecdDet(BigDecimal valoDecdDet) {
        this.valoDecdDet = valoDecdDet;
    }

    private BigDecimal valoDectDet;

    @Basic
    @javax.persistence.Column(name = "VALO_DECT_DET")
    public BigDecimal getValoDectDet() {
        return valoDectDet;
    }

    public void setValoDectDet(BigDecimal valoDectDet) {
        this.valoDectDet = valoDectDet;
    }

    private Timestamp valoFecuDet;

    @Basic
    @javax.persistence.Column(name = "VALO_FECU_DET")
    public Timestamp getValoFecuDet() {
        return valoFecuDet;
    }

    public void setValoFecuDet(Timestamp valoFecuDet) {
        this.valoFecuDet = valoFecuDet;
    }

    private Timestamp valoFecdDet;

    @Basic
    @javax.persistence.Column(name = "VALO_FECD_DET")
    public Timestamp getValoFecdDet() {
        return valoFecdDet;
    }

    public void setValoFecdDet(Timestamp valoFecdDet) {
        this.valoFecdDet = valoFecdDet;
    }

    private Timestamp valoFectDet;

    @Basic
    @javax.persistence.Column(name = "VALO_FECT_DET")
    public Timestamp getValoFectDet() {
        return valoFectDet;
    }

    public void setValoFectDet(Timestamp valoFectDet) {
        this.valoFectDet = valoFectDet;
    }

    private String usuaCreaDet;

    @Basic
    @javax.persistence.Column(name = "USUA_CREA_DET")
    public String getUsuaCreaDet() {
        return usuaCreaDet;
    }

    public void setUsuaCreaDet(String usuaCreaDet) {
        this.usuaCreaDet = usuaCreaDet;
    }

    private Timestamp fechCreaDet;

    @Basic
    @javax.persistence.Column(name = "FECH_CREA_DET")
    public Timestamp getFechCreaDet() {
        return fechCreaDet;
    }

    public void setFechCreaDet(Timestamp fechCreaDet) {
        this.fechCreaDet = fechCreaDet;
    }

    private String usuaModiDet;

    @Basic
    @javax.persistence.Column(name = "USUA_MODI_DET")
    public String getUsuaModiDet() {
        return usuaModiDet;
    }

    public void setUsuaModiDet(String usuaModiDet) {
        this.usuaModiDet = usuaModiDet;
    }

    private Timestamp fechModiDet;

    @Basic
    @javax.persistence.Column(name = "FECH_MODI_DET")
    public Timestamp getFechModiDet() {
        return fechModiDet;
    }

    public void setFechModiDet(Timestamp fechModiDet) {
        this.fechModiDet = fechModiDet;
    }

    private BigInteger flagEstaDet;

    @Basic
    @javax.persistence.Column(name = "FLAG_ESTA_DET")
    public BigInteger getFlagEstaDet() {
        return flagEstaDet;
    }

    public void setFlagEstaDet(BigInteger flagEstaDet) {
        this.flagEstaDet = flagEstaDet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeEntidaddet that = (MaeEntidaddet) o;

        if (secuEntiDet != that.secuEntiDet) return false;
        if (idenEntiDet != null ? !idenEntiDet.equals(that.idenEntiDet) : that.idenEntiDet != null) return false;
        if (codiEntiEnt != null ? !codiEntiEnt.equals(that.codiEntiEnt) : that.codiEntiEnt != null) return false;
        if (valoCaduDet != null ? !valoCaduDet.equals(that.valoCaduDet) : that.valoCaduDet != null) return false;
        if (valoCaddDet != null ? !valoCaddDet.equals(that.valoCaddDet) : that.valoCaddDet != null) return false;
        if (valoCadtDet != null ? !valoCadtDet.equals(that.valoCadtDet) : that.valoCadtDet != null) return false;
        if (valoNumuDet != null ? !valoNumuDet.equals(that.valoNumuDet) : that.valoNumuDet != null) return false;
        if (valoNumdDet != null ? !valoNumdDet.equals(that.valoNumdDet) : that.valoNumdDet != null) return false;
        if (valoNumtDet != null ? !valoNumtDet.equals(that.valoNumtDet) : that.valoNumtDet != null) return false;
        if (valoDecuDet != null ? !valoDecuDet.equals(that.valoDecuDet) : that.valoDecuDet != null) return false;
        if (valoDecdDet != null ? !valoDecdDet.equals(that.valoDecdDet) : that.valoDecdDet != null) return false;
        if (valoDectDet != null ? !valoDectDet.equals(that.valoDectDet) : that.valoDectDet != null) return false;
        if (valoFecuDet != null ? !valoFecuDet.equals(that.valoFecuDet) : that.valoFecuDet != null) return false;
        if (valoFecdDet != null ? !valoFecdDet.equals(that.valoFecdDet) : that.valoFecdDet != null) return false;
        if (valoFectDet != null ? !valoFectDet.equals(that.valoFectDet) : that.valoFectDet != null) return false;
        if (usuaCreaDet != null ? !usuaCreaDet.equals(that.usuaCreaDet) : that.usuaCreaDet != null) return false;
        if (fechCreaDet != null ? !fechCreaDet.equals(that.fechCreaDet) : that.fechCreaDet != null) return false;
        if (usuaModiDet != null ? !usuaModiDet.equals(that.usuaModiDet) : that.usuaModiDet != null) return false;
        if (fechModiDet != null ? !fechModiDet.equals(that.fechModiDet) : that.fechModiDet != null) return false;
        if (flagEstaDet != null ? !flagEstaDet.equals(that.flagEstaDet) : that.flagEstaDet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenEntiDet != null ? idenEntiDet.hashCode() : 0;
        result = 31 * result + (codiEntiEnt != null ? codiEntiEnt.hashCode() : 0);
        result = 31 * result + secuEntiDet;
        result = 31 * result + (valoCaduDet != null ? valoCaduDet.hashCode() : 0);
        result = 31 * result + (valoCaddDet != null ? valoCaddDet.hashCode() : 0);
        result = 31 * result + (valoCadtDet != null ? valoCadtDet.hashCode() : 0);
        result = 31 * result + (valoNumuDet != null ? valoNumuDet.hashCode() : 0);
        result = 31 * result + (valoNumdDet != null ? valoNumdDet.hashCode() : 0);
        result = 31 * result + (valoNumtDet != null ? valoNumtDet.hashCode() : 0);
        result = 31 * result + (valoDecuDet != null ? valoDecuDet.hashCode() : 0);
        result = 31 * result + (valoDecdDet != null ? valoDecdDet.hashCode() : 0);
        result = 31 * result + (valoDectDet != null ? valoDectDet.hashCode() : 0);
        result = 31 * result + (valoFecuDet != null ? valoFecuDet.hashCode() : 0);
        result = 31 * result + (valoFecdDet != null ? valoFecdDet.hashCode() : 0);
        result = 31 * result + (valoFectDet != null ? valoFectDet.hashCode() : 0);
        result = 31 * result + (usuaCreaDet != null ? usuaCreaDet.hashCode() : 0);
        result = 31 * result + (fechCreaDet != null ? fechCreaDet.hashCode() : 0);
        result = 31 * result + (usuaModiDet != null ? usuaModiDet.hashCode() : 0);
        result = 31 * result + (fechModiDet != null ? fechModiDet.hashCode() : 0);
        result = 31 * result + (flagEstaDet != null ? flagEstaDet.hashCode() : 0);
        return result;
    }
}
