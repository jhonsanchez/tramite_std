package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "ADM_SECUENCIA", catalog = "")
public class AdmSecuencia {
    private BigDecimal secuGeneSec;
    private String idenGeneTab;
    private BigDecimal geneVal;

    @Id
    @Column(name = "SECU_GENE_SEC")
    public BigDecimal getSecuGeneSec() {
        return secuGeneSec;
    }

    public void setSecuGeneSec(BigDecimal secuGeneSec) {
        this.secuGeneSec = secuGeneSec;
    }

    @Basic
    @Column(name = "IDEN_GENE_TAB")
    public String getIdenGeneTab() {
        return idenGeneTab;
    }

    public void setIdenGeneTab(String idenGeneTab) {
        this.idenGeneTab = idenGeneTab;
    }

    @Basic
    @Column(name = "GENE_VAL")
    public BigDecimal getGeneVal() {
        return geneVal;
    }

    public void setGeneVal(BigDecimal geneVal) {
        this.geneVal = geneVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmSecuencia that = (AdmSecuencia) o;

        if (secuGeneSec != null ? !secuGeneSec.equals(that.secuGeneSec) : that.secuGeneSec != null) return false;
        if (idenGeneTab != null ? !idenGeneTab.equals(that.idenGeneTab) : that.idenGeneTab != null) return false;
        if (geneVal != null ? !geneVal.equals(that.geneVal) : that.geneVal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = secuGeneSec != null ? secuGeneSec.hashCode() : 0;
        result = 31 * result + (idenGeneTab != null ? idenGeneTab.hashCode() : 0);
        result = 31 * result + (geneVal != null ? geneVal.hashCode() : 0);
        return result;
    }
}
