package pe.com.ebuho.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * TrmMovimientoPK.java
 * Copyright (c) 2015
 * Creado el: 12/10/2015
 * Propósito: Clase que representa la clave primaria compuesta de la tabla TRM_MOVIMIENTO.
 *
 * @author: eBuho
 * @version 01.00.00
*/

/**<pre>
* Versión  |    Fecha    |   Modificado por   |  Método Modificado |  Desc. del cambio
*-----------------------------------------------------------------------------------------------------------------
*  01.00    12/10/2015       eBuho               Ninguno.	      Se creó la clase.
*  01.01
* </pre>
*/
@Embeddable
public class TrmMovimientoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEN_EXPE_TRM")
    private BigInteger idenExpeTrm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECU_MOVI_MVM")
    private int secuMoviMvm;

    /**
     *
     */
    public TrmMovimientoPK() {
    }

    /**
     *
     * @param idenExpeTrm
     * @param secuMoviMvm
     */
    public TrmMovimientoPK(BigInteger idenExpeTrm, int secuMoviMvm) {
        this.idenExpeTrm = idenExpeTrm;
        this.secuMoviMvm = secuMoviMvm;
    }

    /**
     *
     * @return
     */
    public BigInteger getIdenExpeTrm() {
        return idenExpeTrm;
    }

    /**
     *
     * @param idenExpeTrm
     */
    public void setIdenExpeTrm(BigInteger idenExpeTrm) {
        this.idenExpeTrm = idenExpeTrm;
    }

    /**
     *
     * @return
     */
    public int getSecuMoviMvm() {
        return secuMoviMvm;
    }

    /**
     *
     * @param secuMoviMvm
     */
    public void setSecuMoviMvm(int secuMoviMvm) {
        this.secuMoviMvm = secuMoviMvm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idenExpeTrm != null ? idenExpeTrm.hashCode() : 0);
        hash += (Integer) secuMoviMvm;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrmMovimientoPK)) {
            return false;
        }
        TrmMovimientoPK other = (TrmMovimientoPK) object;
        if ((this.idenExpeTrm == null && other.idenExpeTrm != null) || (this.idenExpeTrm != null && !this.idenExpeTrm.equals(other.idenExpeTrm))) {
            return false;
        }
        if (this.secuMoviMvm != other.secuMoviMvm) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.bcrp.std.model.tramite.TrmMovimientoPK[ idenExpeTrm=" + idenExpeTrm + ", secuMoviMvm=" + secuMoviMvm + " ]";
    }
    
}
