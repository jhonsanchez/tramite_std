package pe.com.ebuho.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by John on 10/29/2015.
 */
public class TrmEstatramHisPK implements Serializable {
    private BigDecimal idenExpeTrm;
    private int secuEstaHis;

    @Column(name = "IDEN_EXPE_TRM")
    @Id
    public BigDecimal getIdenExpeTrm() {
        return idenExpeTrm;
    }

    public void setIdenExpeTrm(BigDecimal idenExpeTrm) {
        this.idenExpeTrm = idenExpeTrm;
    }

    @Column(name = "SECU_ESTA_HIS")
    @Id
    public int getSecuEstaHis() {
        return secuEstaHis;
    }

    public void setSecuEstaHis(int secuEstaHis) {
        this.secuEstaHis = secuEstaHis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrmEstatramHisPK that = (TrmEstatramHisPK) o;

        if (secuEstaHis != that.secuEstaHis) return false;
        if (idenExpeTrm != null ? !idenExpeTrm.equals(that.idenExpeTrm) : that.idenExpeTrm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenExpeTrm != null ? idenExpeTrm.hashCode() : 0;
        result = 31 * result + secuEstaHis;
        return result;
    }
}
