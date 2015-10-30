package pe.com.ebuho.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by John on 10/29/2015.
 */
public class MaeProcesoestadoPK implements Serializable {
    private BigDecimal idenProcPrc;
    private int secuEstaPre;

    @Column(name = "IDEN_PROC_PRC")
    @Id
    public BigDecimal getIdenProcPrc() {
        return idenProcPrc;
    }

    public void setIdenProcPrc(BigDecimal idenProcPrc) {
        this.idenProcPrc = idenProcPrc;
    }

    @Column(name = "SECU_ESTA_PRE")
    @Id
    public int getSecuEstaPre() {
        return secuEstaPre;
    }

    public void setSecuEstaPre(int secuEstaPre) {
        this.secuEstaPre = secuEstaPre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeProcesoestadoPK that = (MaeProcesoestadoPK) o;

        if (secuEstaPre != that.secuEstaPre) return false;
        if (idenProcPrc != null ? !idenProcPrc.equals(that.idenProcPrc) : that.idenProcPrc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenProcPrc != null ? idenProcPrc.hashCode() : 0;
        result = 31 * result + secuEstaPre;
        return result;
    }
}
