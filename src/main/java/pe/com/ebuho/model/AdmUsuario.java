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
@Table(name = "ADM_USUARIO", catalog = "")
public class AdmUsuario {
    private BigDecimal idenPersPer;
    private String codiUsuaUsr;
    private String clavUsuaUsr;
    private String corrRecuUsr;
    private Timestamp fechExpiUsr;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaUsr;
    private BigInteger flagCuenExp;
    private BigInteger flagClavExp;
    private BigInteger flagCuenBlq;
    private BigDecimal numeInteUsr;
    private BigInteger flagUsuaSoc;
    private Collection<AdmUsuarioRol> admUsuarioRolsByIdenPersPer;

    @Id
    @Column(name = "IDEN_PERS_PER")
    public BigDecimal getIdenPersPer() {
        return idenPersPer;
    }

    public void setIdenPersPer(BigDecimal idenPersPer) {
        this.idenPersPer = idenPersPer;
    }

    @Basic
    @Column(name = "CODI_USUA_USR")
    public String getCodiUsuaUsr() {
        return codiUsuaUsr;
    }

    public void setCodiUsuaUsr(String codiUsuaUsr) {
        this.codiUsuaUsr = codiUsuaUsr;
    }

    @Basic
    @Column(name = "CLAV_USUA_USR")
    public String getClavUsuaUsr() {
        return clavUsuaUsr;
    }

    public void setClavUsuaUsr(String clavUsuaUsr) {
        this.clavUsuaUsr = clavUsuaUsr;
    }

    @Basic
    @Column(name = "CORR_RECU_USR")
    public String getCorrRecuUsr() {
        return corrRecuUsr;
    }

    public void setCorrRecuUsr(String corrRecuUsr) {
        this.corrRecuUsr = corrRecuUsr;
    }

    @Basic
    @Column(name = "FECH_EXPI_USR")
    public Timestamp getFechExpiUsr() {
        return fechExpiUsr;
    }

    public void setFechExpiUsr(Timestamp fechExpiUsr) {
        this.fechExpiUsr = fechExpiUsr;
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
    @Column(name = "FLAG_ESTA_USR")
    public BigInteger getFlagEstaUsr() {
        return flagEstaUsr;
    }

    public void setFlagEstaUsr(BigInteger flagEstaUsr) {
        this.flagEstaUsr = flagEstaUsr;
    }

    @Basic
    @Column(name = "FLAG_CUEN_EXP")
    public BigInteger getFlagCuenExp() {
        return flagCuenExp;
    }

    public void setFlagCuenExp(BigInteger flagCuenExp) {
        this.flagCuenExp = flagCuenExp;
    }

    @Basic
    @Column(name = "FLAG_CLAV_EXP")
    public BigInteger getFlagClavExp() {
        return flagClavExp;
    }

    public void setFlagClavExp(BigInteger flagClavExp) {
        this.flagClavExp = flagClavExp;
    }

    @Basic
    @Column(name = "FLAG_CUEN_BLQ")
    public BigInteger getFlagCuenBlq() {
        return flagCuenBlq;
    }

    public void setFlagCuenBlq(BigInteger flagCuenBlq) {
        this.flagCuenBlq = flagCuenBlq;
    }

    @Basic
    @Column(name = "NUME_INTE_USR")
    public BigDecimal getNumeInteUsr() {
        return numeInteUsr;
    }

    public void setNumeInteUsr(BigDecimal numeInteUsr) {
        this.numeInteUsr = numeInteUsr;
    }

    @Basic
    @Column(name = "FLAG_USUA_SOC")
    public BigInteger getFlagUsuaSoc() {
        return flagUsuaSoc;
    }

    public void setFlagUsuaSoc(BigInteger flagUsuaSoc) {
        this.flagUsuaSoc = flagUsuaSoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmUsuario that = (AdmUsuario) o;

        if (idenPersPer != null ? !idenPersPer.equals(that.idenPersPer) : that.idenPersPer != null) return false;
        if (codiUsuaUsr != null ? !codiUsuaUsr.equals(that.codiUsuaUsr) : that.codiUsuaUsr != null) return false;
        if (clavUsuaUsr != null ? !clavUsuaUsr.equals(that.clavUsuaUsr) : that.clavUsuaUsr != null) return false;
        if (corrRecuUsr != null ? !corrRecuUsr.equals(that.corrRecuUsr) : that.corrRecuUsr != null) return false;
        if (fechExpiUsr != null ? !fechExpiUsr.equals(that.fechExpiUsr) : that.fechExpiUsr != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (flagEstaUsr != null ? !flagEstaUsr.equals(that.flagEstaUsr) : that.flagEstaUsr != null) return false;
        if (flagCuenExp != null ? !flagCuenExp.equals(that.flagCuenExp) : that.flagCuenExp != null) return false;
        if (flagClavExp != null ? !flagClavExp.equals(that.flagClavExp) : that.flagClavExp != null) return false;
        if (flagCuenBlq != null ? !flagCuenBlq.equals(that.flagCuenBlq) : that.flagCuenBlq != null) return false;
        if (numeInteUsr != null ? !numeInteUsr.equals(that.numeInteUsr) : that.numeInteUsr != null) return false;
        if (flagUsuaSoc != null ? !flagUsuaSoc.equals(that.flagUsuaSoc) : that.flagUsuaSoc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenPersPer != null ? idenPersPer.hashCode() : 0;
        result = 31 * result + (codiUsuaUsr != null ? codiUsuaUsr.hashCode() : 0);
        result = 31 * result + (clavUsuaUsr != null ? clavUsuaUsr.hashCode() : 0);
        result = 31 * result + (corrRecuUsr != null ? corrRecuUsr.hashCode() : 0);
        result = 31 * result + (fechExpiUsr != null ? fechExpiUsr.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaUsr != null ? flagEstaUsr.hashCode() : 0);
        result = 31 * result + (flagCuenExp != null ? flagCuenExp.hashCode() : 0);
        result = 31 * result + (flagClavExp != null ? flagClavExp.hashCode() : 0);
        result = 31 * result + (flagCuenBlq != null ? flagCuenBlq.hashCode() : 0);
        result = 31 * result + (numeInteUsr != null ? numeInteUsr.hashCode() : 0);
        result = 31 * result + (flagUsuaSoc != null ? flagUsuaSoc.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "admUsuarioByIdenPersPer")
    public Collection<AdmUsuarioRol> getAdmUsuarioRolsByIdenPersPer() {
        return admUsuarioRolsByIdenPersPer;
    }

    public void setAdmUsuarioRolsByIdenPersPer(Collection<AdmUsuarioRol> admUsuarioRolsByIdenPersPer) {
        this.admUsuarioRolsByIdenPersPer = admUsuarioRolsByIdenPersPer;
    }
}
