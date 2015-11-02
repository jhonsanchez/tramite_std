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

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pe.com.ebuho.model.AdmMenu;
import pe.com.ebuho.repository.AdmMenuRepository;

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

    private Logger logger = LoggerFactory.getLogger(HelloWorldBean.class);
    public String getHello() {
        logger.debug("iniciando: {}","HelloWorldBean");
        AdmMenu menu = admMenuRepository.findOne(BigDecimal.ONE);
        return "Hello from PrimeFaces and Spring Boot! "+menu.getPagiMenuMnu();
    }
}
