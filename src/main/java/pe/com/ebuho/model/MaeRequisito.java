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
@Table(name = "MAE_REQUISITO", catalog = "")
@IdClass(MaeRequisitoPK.class)
public class MaeRequisito implements Serializable{
    private BigDecimal idenProcPrc;
    private BigDecimal secuMaeReq;
    private String nombRequReq;
    private Integer codiTipoReq;
    private String descObseReq;
    private int secuOrdeReq;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaReq;

    @Id
    @Column(name = "IDEN_PROC_PRC")
    public BigDecimal getIdenProcPrc() {
        return idenProcPrc;
    }

    public void setIdenProcPrc(BigDecimal idenProcPrc) {
        this.idenProcPrc = idenProcPrc;
    }

    @Id
    @Column(name = "SECU_MAE_REQ")
    public BigDecimal getSecuMaeReq() {
        return secuMaeReq;
    }

    public void setSecuMaeReq(BigDecimal secuMaeReq) {
        this.secuMaeReq = secuMaeReq;
    }

    @Basic
    @Column(name = "NOMB_REQU_REQ")
    public String getNombRequReq() {
        return nombRequReq;
    }

    public void setNombRequReq(String nombRequReq) {
        this.nombRequReq = nombRequReq;
    }

    @Basic
    @Column(name = "CODI_TIPO_REQ")
    public Integer getCodiTipoReq() {
        return codiTipoReq;
    }

    public void setCodiTipoReq(Integer codiTipoReq) {
        this.codiTipoReq = codiTipoReq;
    }

    @Basic
    @Column(name = "DESC_OBSE_REQ")
    public String getDescObseReq() {
        return descObseReq;
    }

    public void setDescObseReq(String descObseReq) {
        this.descObseReq = descObseReq;
    }

    @Basic
    @Column(name = "SECU_ORDE_REQ")
    public int getSecuOrdeReq() {
        return secuOrdeReq;
    }

    public void setSecuOrdeReq(int secuOrdeReq) {
        this.secuOrdeReq = secuOrdeReq;
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
    @Column(name = "FLAG_ESTA_REQ")
    public BigInteger getFlagEstaReq() {
        return flagEstaReq;
    }

    public void setFlagEstaReq(BigInteger flagEstaReq) {
        this.flagEstaReq = flagEstaReq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeRequisito that = (MaeRequisito) o;

        if (secuOrdeReq != that.secuOrdeReq) return false;
        if (idenProcPrc != null ? !idenProcPrc.equals(that.idenProcPrc) : that.idenProcPrc != null) return false;
        if (secuMaeReq != null ? !secuMaeReq.equals(that.secuMaeReq) : that.secuMaeReq != null) return false;
        if (nombRequReq != null ? !nombRequReq.equals(that.nombRequReq) : that.nombRequReq != null) return false;
        if (codiTipoReq != null ? !codiTipoReq.equals(that.codiTipoReq) : that.codiTipoReq != null) return false;
        if (descObseReq != null ? !descObseReq.equals(that.descObseReq) : that.descObseReq != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaReq != null ? !flagEstaReq.equals(that.flagEstaReq) : that.flagEstaReq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenProcPrc != null ? idenProcPrc.hashCode() : 0;
        result = 31 * result + (secuMaeReq != null ? secuMaeReq.hashCode() : 0);
        result = 31 * result + (nombRequReq != null ? nombRequReq.hashCode() : 0);
        result = 31 * result + (codiTipoReq != null ? codiTipoReq.hashCode() : 0);
        result = 31 * result + (descObseReq != null ? descObseReq.hashCode() : 0);
        result = 31 * result + secuOrdeReq;
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaReq != null ? flagEstaReq.hashCode() : 0);
        return result;
    }
}
