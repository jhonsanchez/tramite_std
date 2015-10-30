package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "TRM_STICKER", catalog = "")
public class TrmSticker {
    private BigDecimal idenSticStk;
    private String descSticStk;

    @Id
    @Column(name = "IDEN_STIC_STK")
    public BigDecimal getIdenSticStk() {
        return idenSticStk;
    }

    public void setIdenSticStk(BigDecimal idenSticStk) {
        this.idenSticStk = idenSticStk;
    }

    @Basic
    @Column(name = "DESC_STIC_STK")
    public String getDescSticStk() {
        return descSticStk;
    }

    public void setDescSticStk(String descSticStk) {
        this.descSticStk = descSticStk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrmSticker that = (TrmSticker) o;

        if (idenSticStk != null ? !idenSticStk.equals(that.idenSticStk) : that.idenSticStk != null) return false;
        if (descSticStk != null ? !descSticStk.equals(that.descSticStk) : that.descSticStk != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenSticStk != null ? idenSticStk.hashCode() : 0;
        result = 31 * result + (descSticStk != null ? descSticStk.hashCode() : 0);
        return result;
    }
}
