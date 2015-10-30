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
@Table(name = "MAE_SEDE", catalog = "")
public class MaeSede {
    private BigDecimal codiMaeSede;
    private BigDecimal idenEmprEmp;
    private String descSedeSed;
    private String descDireSede;
    private String persContSed;
    private String numeTeleSed;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private BigInteger flagSedeSed;
    private Collection<MaeArea> maeAreasByCodiMaeSede;

    @Id
    @Column(name = "CODI_MAE_SEDE")
    public BigDecimal getCodiMaeSede() {
        return codiMaeSede;
    }

    public void setCodiMaeSede(BigDecimal codiMaeSede) {
        this.codiMaeSede = codiMaeSede;
    }

    @Basic
    @Column(name = "IDEN_EMPR_EMP")
    public BigDecimal getIdenEmprEmp() {
        return idenEmprEmp;
    }

    public void setIdenEmprEmp(BigDecimal idenEmprEmp) {
        this.idenEmprEmp = idenEmprEmp;
    }

    @Basic
    @Column(name = "DESC_SEDE_SED")
    public String getDescSedeSed() {
        return descSedeSed;
    }

    public void setDescSedeSed(String descSedeSed) {
        this.descSedeSed = descSedeSed;
    }

    @Basic
    @Column(name = "DESC_DIRE_SEDE")
    public String getDescDireSede() {
        return descDireSede;
    }

    public void setDescDireSede(String descDireSede) {
        this.descDireSede = descDireSede;
    }

    @Basic
    @Column(name = "PERS_CONT_SED")
    public String getPersContSed() {
        return persContSed;
    }

    public void setPersContSed(String persContSed) {
        this.persContSed = persContSed;
    }

    @Basic
    @Column(name = "NUME_TELE_SED")
    public String getNumeTeleSed() {
        return numeTeleSed;
    }

    public void setNumeTeleSed(String numeTeleSed) {
        this.numeTeleSed = numeTeleSed;
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
    @Column(name = "FLAG_SEDE_SED")
    public BigInteger getFlagSedeSed() {
        return flagSedeSed;
    }

    public void setFlagSedeSed(BigInteger flagSedeSed) {
        this.flagSedeSed = flagSedeSed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeSede maeSede = (MaeSede) o;

        if (codiMaeSede != null ? !codiMaeSede.equals(maeSede.codiMaeSede) : maeSede.codiMaeSede != null) return false;
        if (idenEmprEmp != null ? !idenEmprEmp.equals(maeSede.idenEmprEmp) : maeSede.idenEmprEmp != null) return false;
        if (descSedeSed != null ? !descSedeSed.equals(maeSede.descSedeSed) : maeSede.descSedeSed != null) return false;
        if (descDireSede != null ? !descDireSede.equals(maeSede.descDireSede) : maeSede.descDireSede != null)
            return false;
        if (persContSed != null ? !persContSed.equals(maeSede.persContSed) : maeSede.persContSed != null) return false;
        if (numeTeleSed != null ? !numeTeleSed.equals(maeSede.numeTeleSed) : maeSede.numeTeleSed != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(maeSede.usuaCreaAud) : maeSede.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(maeSede.fechCreaAud) : maeSede.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(maeSede.usuaModiAud) : maeSede.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(maeSede.fechModiAud) : maeSede.fechModiAud != null) return false;
        if (flagSedeSed != null ? !flagSedeSed.equals(maeSede.flagSedeSed) : maeSede.flagSedeSed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codiMaeSede != null ? codiMaeSede.hashCode() : 0;
        result = 31 * result + (idenEmprEmp != null ? idenEmprEmp.hashCode() : 0);
        result = 31 * result + (descSedeSed != null ? descSedeSed.hashCode() : 0);
        result = 31 * result + (descDireSede != null ? descDireSede.hashCode() : 0);
        result = 31 * result + (persContSed != null ? persContSed.hashCode() : 0);
        result = 31 * result + (numeTeleSed != null ? numeTeleSed.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (flagSedeSed != null ? flagSedeSed.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "maeSedeByCodiMaeSede")
    public Collection<MaeArea> getMaeAreasByCodiMaeSede() {
        return maeAreasByCodiMaeSede;
    }

    public void setMaeAreasByCodiMaeSede(Collection<MaeArea> maeAreasByCodiMaeSede) {
        this.maeAreasByCodiMaeSede = maeAreasByCodiMaeSede;
    }
}
