package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "MAE_ENTIDAD", catalog = "")
public class MaeEntidad {
    private String codiEntiEnt;
    private String nombEntiEnt;
    private String descLargEnt;
    private BigInteger flagEstaEnt;

    @Id
    @Column(name = "CODI_ENTI_ENT")
    public String getCodiEntiEnt() {
        return codiEntiEnt;
    }

    public void setCodiEntiEnt(String codiEntiEnt) {
        this.codiEntiEnt = codiEntiEnt;
    }

    @Basic
    @Column(name = "NOMB_ENTI_ENT")
    public String getNombEntiEnt() {
        return nombEntiEnt;
    }

    public void setNombEntiEnt(String nombEntiEnt) {
        this.nombEntiEnt = nombEntiEnt;
    }

    @Basic
    @Column(name = "DESC_LARG_ENT")
    public String getDescLargEnt() {
        return descLargEnt;
    }

    public void setDescLargEnt(String descLargEnt) {
        this.descLargEnt = descLargEnt;
    }

    @Basic
    @Column(name = "FLAG_ESTA_ENT")
    public BigInteger getFlagEstaEnt() {
        return flagEstaEnt;
    }

    public void setFlagEstaEnt(BigInteger flagEstaEnt) {
        this.flagEstaEnt = flagEstaEnt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeEntidad that = (MaeEntidad) o;

        if (codiEntiEnt != null ? !codiEntiEnt.equals(that.codiEntiEnt) : that.codiEntiEnt != null) return false;
        if (nombEntiEnt != null ? !nombEntiEnt.equals(that.nombEntiEnt) : that.nombEntiEnt != null) return false;
        if (descLargEnt != null ? !descLargEnt.equals(that.descLargEnt) : that.descLargEnt != null) return false;
        if (flagEstaEnt != null ? !flagEstaEnt.equals(that.flagEstaEnt) : that.flagEstaEnt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codiEntiEnt != null ? codiEntiEnt.hashCode() : 0;
        result = 31 * result + (nombEntiEnt != null ? nombEntiEnt.hashCode() : 0);
        result = 31 * result + (descLargEnt != null ? descLargEnt.hashCode() : 0);
        result = 31 * result + (flagEstaEnt != null ? flagEstaEnt.hashCode() : 0);
        return result;
    }
}
