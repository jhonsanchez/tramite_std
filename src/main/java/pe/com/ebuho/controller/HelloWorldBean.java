package pe.com.ebuho.controller;/**
 * <pre>
 * HelloWorldBean.java
 * Copyright (c) 2015
 * Creado el: 02/11/2015
 * Propósito:
 * </pre>
 * @author: eBuho
 * @version 01.00.00
 */

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pe.com.ebuho.model.AdmMenu;
import pe.com.ebuho.model.MaeArea;
import pe.com.ebuho.repository.AdmMenuRepository;
import pe.com.ebuho.repository.MaeAreaRepository;

/**<pre>
 * Versión  |    Fecha    |   Modificado por   |  Método Modificado |  Desc. del cambio
 *-----------------------------------------------------------------------------------------------------------------
 *  01.00    02/11/2015       eBuho        Ninguno.	              Se creó la clase.
 *  01.01     
 * </pre>
 */
@Component("helloWorldBean")
@Scope("request")
public class HelloWorldBean implements Serializable{
    @Autowired
    private AdmMenuRepository admMenuRepository;
    @Autowired
    private MaeAreaRepository maeAreaRepository;

    private Logger logger = LoggerFactory.getLogger(HelloWorldBean.class);
    public String getHello() {
        String a="";
        logger.debug("iniciando: {}","HelloWorldBean");
        AdmMenu menu = admMenuRepository.findOne(BigDecimal.ONE);
        for(MaeArea area:maeAreaRepository.findByDescAreaAreIgnoreCaseAndFlagEstaAre("bcrp", new BigInteger("1"))){
            logger.debug("area: {}",area.toString());
        }
        for(MaeArea area:maeAreaRepository.findByFlagEstaAre(new BigInteger("1"))) {
            a = area.getDescAreaAre();
            logger.debug("area: {}",area.toString());
        }
        return "Hello from PrimeFaces and Spring Boot! "+menu.getPagiMenuMnu()+" "+a;
    }
}
