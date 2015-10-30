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
@Table(name = "TRM_CUENTA_CORREO", catalog = "")
public class TrmCuentaCorreo {
    private BigDecimal idenCuenCor;
    private String smtpHostCor;
    private BigDecimal smtpPortCor;
    private String passUsuaCor;
    private String nombUsuaCor;
    private BigInteger flagEstaCor;
    private Timestamp fechCreaAud;
    private String usuaCreaAud;
    private Timestamp fechModiAud;
    private String usuaModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigDecimal codiEmprEmp;
    private BigDecimal codiSedeOpe;
    private Collection<TrmSmsComunica> trmSmsComunicasByIdenCuenCor;

    @Id
    @Column(name = "IDEN_CUEN_COR")
    public BigDecimal getIdenCuenCor() {
        return idenCuenCor;
    }

    public void setIdenCuenCor(BigDecimal idenCuenCor) {
        this.idenCuenCor = idenCuenCor;
    }

    @Basic
    @Column(name = "SMTP_HOST_COR")
    public String getSmtpHostCor() {
        return smtpHostCor;
    }

    public void setSmtpHostCor(String smtpHostCor) {
        this.smtpHostCor = smtpHostCor;
    }

    @Basic
    @Column(name = "SMTP_PORT_COR")
    public BigDecimal getSmtpPortCor() {
        return smtpPortCor;
    }

    public void setSmtpPortCor(BigDecimal smtpPortCor) {
        this.smtpPortCor = smtpPortCor;
    }

    @Basic
    @Column(name = "PASS_USUA_COR")
    public String getPassUsuaCor() {
        return passUsuaCor;
    }

    public void setPassUsuaCor(String passUsuaCor) {
        this.passUsuaCor = passUsuaCor;
    }

    @Basic
    @Column(name = "NOMB_USUA_COR")
    public String getNombUsuaCor() {
        return nombUsuaCor;
    }

    public void setNombUsuaCor(String nombUsuaCor) {
        this.nombUsuaCor = nombUsuaCor;
    }

    @Basic
    @Column(name = "FLAG_ESTA_COR")
    public BigInteger getFlagEstaCor() {
        return flagEstaCor;
    }

    public void setFlagEstaCor(BigInteger flagEstaCor) {
        this.flagEstaCor = flagEstaCor;
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
    @Column(name = "USUA_CREA_AUD")
    public String getUsuaCreaAud() {
        return usuaCreaAud;
    }

    public void setUsuaCreaAud(String usuaCreaAud) {
        this.usuaCreaAud = usuaCreaAud;
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
    @Column(name = "USUA_MODI_AUD")
    public String getUsuaModiAud() {
        return usuaModiAud;
    }

    public void setUsuaModiAud(String usuaModiAud) {
        this.usuaModiAud = usuaModiAud;
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
    @Column(name = "CODI_EMPR_EMP")
    public BigDecimal getCodiEmprEmp() {
        return codiEmprEmp;
    }

    public void setCodiEmprEmp(BigDecimal codiEmprEmp) {
        this.codiEmprEmp = codiEmprEmp;
    }

    @Basic
    @Column(name = "CODI_SEDE_OPE")
    public BigDecimal getCodiSedeOpe() {
        return codiSedeOpe;
    }

    public void setCodiSedeOpe(BigDecimal codiSedeOpe) {
        this.codiSedeOpe = codiSedeOpe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrmCuentaCorreo that = (TrmCuentaCorreo) o;

        if (idenCuenCor != null ? !idenCuenCor.equals(that.idenCuenCor) : that.idenCuenCor != null) return false;
        if (smtpHostCor != null ? !smtpHostCor.equals(that.smtpHostCor) : that.smtpHostCor != null) return false;
        if (smtpPortCor != null ? !smtpPortCor.equals(that.smtpPortCor) : that.smtpPortCor != null) return false;
        if (passUsuaCor != null ? !passUsuaCor.equals(that.passUsuaCor) : that.passUsuaCor != null) return false;
        if (nombUsuaCor != null ? !nombUsuaCor.equals(that.nombUsuaCor) : that.nombUsuaCor != null) return false;
        if (flagEstaCor != null ? !flagEstaCor.equals(that.flagEstaCor) : that.flagEstaCor != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(that.fechCreaAud) : that.fechCreaAud != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(that.usuaCreaAud) : that.usuaCreaAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(that.fechModiAud) : that.fechModiAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(that.usuaModiAud) : that.usuaModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(that.nombEquiAud) : that.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(that.nombSopeAud) : that.nombSopeAud != null) return false;
        if (codiEmprEmp != null ? !codiEmprEmp.equals(that.codiEmprEmp) : that.codiEmprEmp != null) return false;
        if (codiSedeOpe != null ? !codiSedeOpe.equals(that.codiSedeOpe) : that.codiSedeOpe != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenCuenCor != null ? idenCuenCor.hashCode() : 0;
        result = 31 * result + (smtpHostCor != null ? smtpHostCor.hashCode() : 0);
        result = 31 * result + (smtpPortCor != null ? smtpPortCor.hashCode() : 0);
        result = 31 * result + (passUsuaCor != null ? passUsuaCor.hashCode() : 0);
        result = 31 * result + (nombUsuaCor != null ? nombUsuaCor.hashCode() : 0);
        result = 31 * result + (flagEstaCor != null ? flagEstaCor.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (codiEmprEmp != null ? codiEmprEmp.hashCode() : 0);
        result = 31 * result + (codiSedeOpe != null ? codiSedeOpe.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "trmCuentaCorreoByIdenCuenCor")
    public Collection<TrmSmsComunica> getTrmSmsComunicasByIdenCuenCor() {
        return trmSmsComunicasByIdenCuenCor;
    }

    public void setTrmSmsComunicasByIdenCuenCor(Collection<TrmSmsComunica> trmSmsComunicasByIdenCuenCor) {
        this.trmSmsComunicasByIdenCuenCor = trmSmsComunicasByIdenCuenCor;
    }
}
