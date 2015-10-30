package pe.com.ebuho.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by John on 10/29/2015.
 */
public class MaeRequisitoPK implements Serializable {
    private BigDecimal idenProcPrc;
    private BigDecimal secuMaeReq;

    @Column(name = "IDEN_PROC_PRC")
    @Id
    public BigDecimal getIdenProcPrc() {
        return idenProcPrc;
    }

    public void setIdenProcPrc(BigDecimal idenProcPrc) {
        this.idenProcPrc = idenProcPrc;
    }

    @Column(name = "SECU_MAE_REQ")
    @Id
    public BigDecimal getSecuMaeReq() {
        return secuMaeReq;
    }

    public void setSecuMaeReq(BigDecimal secuMaeReq) {
        this.secuMaeReq = secuMaeReq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeRequisitoPK that = (MaeRequisitoPK) o;

        if (idenProcPrc != null ? !idenProcPrc.equals(that.idenProcPrc) : that.idenProcPrc != null) return false;
        if (secuMaeReq != null ? !secuMaeReq.equals(that.secuMaeReq) : that.secuMaeReq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenProcPrc != null ? idenProcPrc.hashCode() : 0;
        result = 31 * result + (secuMaeReq != null ? secuMaeReq.hashCode() : 0);
        return result;
    }
}
