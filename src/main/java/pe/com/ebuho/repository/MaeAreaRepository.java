package pe.com.ebuho.repository;/**
 * <pre>
 * MaeAreaRepository.java
 * Copyright (c) 2015
 * Creado el: 02/11/2015
 * Propósito:
 * </pre>
 * @author: eBuho
 * @version 01.00.00
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.ebuho.model.MaeArea;

/**<pre>
 * Versión  |    Fecha    |   Modificado por   |  Método Modificado |  Desc. del cambio
 *-----------------------------------------------------------------------------------------------------------------
 *  01.00    02/11/2015       eBuho        Ninguno.	              Se creó la clase.
 *  01.01     
 * </pre>
 */

public interface MaeAreaRepository extends JpaRepository<MaeArea,BigDecimal> {
    List<MaeArea> findByDescAreaAre(String descAreaAre);
    List<MaeArea> findByDescAreaAreIgnoreCaseAndFlagEstaAre(String descAreaAre,BigInteger flagEstaAre);
    List<MaeArea> findByFlagEstaAre(BigInteger flagEstaAre);
}
