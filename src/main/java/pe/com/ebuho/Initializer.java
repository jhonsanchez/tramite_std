package pe.com.ebuho; /**
 * <pre>
 * pe.com.ebuho.Initializer.java
 * Copyright (c) 2015
 * Creado el: 02/11/2015
 * Propósito:
 * </pre>
 * @author: eBuho
 * @version 01.00.00
 */

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.boot.context.embedded.ServletContextInitializer;

/**<pre>
 * Versión  |    Fecha    |   Modificado por   |  Método Modificado |  Desc. del cambio
 *-----------------------------------------------------------------------------------------------------------------
 *  01.00    02/11/2015       eBuho        Ninguno.	              Se creó la clase.
 *  01.01     
 * </pre>
 */

public class Initializer implements ServletContextInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.err.println("------------------------------------");
        servletContext.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
    }
}
