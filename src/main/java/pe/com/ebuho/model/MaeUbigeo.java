package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "MAE_UBIGEO", catalog = "")
public class MaeUbigeo {
    private String idenUbigUbi;
    private String nombUbigUbi;
    private BigInteger niveUbigUbi;
    private String usuaCreaUbi;
    private Timestamp fechCreaUbi;
    private String usuaModiUbi;
    private Timestamp fechModiUbi;
    private String idenUbipUbi;
    private BigInteger flagEstaUbi;
    private MaeUbigeo maeUbigeoByIdenUbipUbi;
    private Collection<MaeUbigeo> maeUbigeosByIdenUbigUbi;

    @Id
    @Column(name = "IDEN_UBIG_UBI")
    public String getIdenUbigUbi() {
        return idenUbigUbi;
    }

    public void setIdenUbigUbi(String idenUbigUbi) {
        this.idenUbigUbi = idenUbigUbi;
    }

    @Basic
    @Column(name = "NOMB_UBIG_UBI")
    public String getNombUbigUbi() {
        return nombUbigUbi;
    }

    public void setNombUbigUbi(String nombUbigUbi) {
        this.nombUbigUbi = nombUbigUbi;
    }

    @Basic
    @Column(name = "NIVE_UBIG_UBI")
    public BigInteger getNiveUbigUbi() {
        return niveUbigUbi;
    }

    public void setNiveUbigUbi(BigInteger niveUbigUbi) {
        this.niveUbigUbi = niveUbigUbi;
    }

    @Basic
    @Column(name = "USUA_CREA_UBI")
    public String getUsuaCreaUbi() {
        return usuaCreaUbi;
    }

    public void setUsuaCreaUbi(String usuaCreaUbi) {
        this.usuaCreaUbi = usuaCreaUbi;
    }

    @Basic
    @Column(name = "FECH_CREA_UBI")
    public Timestamp getFechCreaUbi() {
        return fechCreaUbi;
    }

    public void setFechCreaUbi(Timestamp fechCreaUbi) {
        this.fechCreaUbi = fechCreaUbi;
    }

    @Basic
    @Column(name = "USUA_MODI_UBI")
    public String getUsuaModiUbi() {
        return usuaModiUbi;
    }

    public void setUsuaModiUbi(String usuaModiUbi) {
        this.usuaModiUbi = usuaModiUbi;
    }

    @Basic
    @Column(name = "FECH_MODI_UBI")
    public Timestamp getFechModiUbi() {
        return fechModiUbi;
    }

    public void setFechModiUbi(Timestamp fechModiUbi) {
        this.fechModiUbi = fechModiUbi;
    }

    @Basic
    @Column(name = "IDEN_UBIP_UBI")
    public String getIdenUbipUbi() {
        return idenUbipUbi;
    }

    public void setIdenUbipUbi(String idenUbipUbi) {
        this.idenUbipUbi = idenUbipUbi;
    }

    @Basic
    @Column(name = "FLAG_ESTA_UBI")
    public BigInteger getFlagEstaUbi() {
        return flagEstaUbi;
    }

    public void setFlagEstaUbi(BigInteger flagEstaUbi) {
        this.flagEstaUbi = flagEstaUbi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeUbigeo maeUbigeo = (MaeUbigeo) o;

        if (idenUbigUbi != null ? !idenUbigUbi.equals(maeUbigeo.idenUbigUbi) : maeUbigeo.idenUbigUbi != null)
            return false;
        if (nombUbigUbi != null ? !nombUbigUbi.equals(maeUbigeo.nombUbigUbi) : maeUbigeo.nombUbigUbi != null)
            return false;
        if (niveUbigUbi != null ? !niveUbigUbi.equals(maeUbigeo.niveUbigUbi) : maeUbigeo.niveUbigUbi != null)
            return false;
        if (usuaCreaUbi != null ? !usuaCreaUbi.equals(maeUbigeo.usuaCreaUbi) : maeUbigeo.usuaCreaUbi != null)
            return false;
        if (fechCreaUbi != null ? !fechCreaUbi.equals(maeUbigeo.fechCreaUbi) : maeUbigeo.fechCreaUbi != null)
            return false;
        if (usuaModiUbi != null ? !usuaModiUbi.equals(maeUbigeo.usuaModiUbi) : maeUbigeo.usuaModiUbi != null)
            return false;
        if (fechModiUbi != null ? !fechModiUbi.equals(maeUbigeo.fechModiUbi) : maeUbigeo.fechModiUbi != null)
            return false;
        if (idenUbipUbi != null ? !idenUbipUbi.equals(maeUbigeo.idenUbipUbi) : maeUbigeo.idenUbipUbi != null)
            return false;
        if (flagEstaUbi != null ? !flagEstaUbi.equals(maeUbigeo.flagEstaUbi) : maeUbigeo.flagEstaUbi != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenUbigUbi != null ? idenUbigUbi.hashCode() : 0;
        result = 31 * result + (nombUbigUbi != null ? nombUbigUbi.hashCode() : 0);
        result = 31 * result + (niveUbigUbi != null ? niveUbigUbi.hashCode() : 0);
        result = 31 * result + (usuaCreaUbi != null ? usuaCreaUbi.hashCode() : 0);
        result = 31 * result + (fechCreaUbi != null ? fechCreaUbi.hashCode() : 0);
        result = 31 * result + (usuaModiUbi != null ? usuaModiUbi.hashCode() : 0);
        result = 31 * result + (fechModiUbi != null ? fechModiUbi.hashCode() : 0);
        result = 31 * result + (idenUbipUbi != null ? idenUbipUbi.hashCode() : 0);
        result = 31 * result + (flagEstaUbi != null ? flagEstaUbi.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDEN_UBIP_UBI", referencedColumnName = "IDEN_UBIG_UBI",insertable = false,updatable = false)
    public MaeUbigeo getMaeUbigeoByIdenUbipUbi() {
        return maeUbigeoByIdenUbipUbi;
    }

    public void setMaeUbigeoByIdenUbipUbi(MaeUbigeo maeUbigeoByIdenUbipUbi) {
        this.maeUbigeoByIdenUbipUbi = maeUbigeoByIdenUbipUbi;
    }

    @OneToMany(mappedBy = "maeUbigeoByIdenUbipUbi")
    public Collection<MaeUbigeo> getMaeUbigeosByIdenUbigUbi() {
        return maeUbigeosByIdenUbigUbi;
    }

    public void setMaeUbigeosByIdenUbigUbi(Collection<MaeUbigeo> maeUbigeosByIdenUbigUbi) {
        this.maeUbigeosByIdenUbigUbi = maeUbigeosByIdenUbigUbi;
    }
}
