
package beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author claudio.vilas
 */
public class HolaMundoAction {
    
    Logger log = LogManager.getLogger(HolaMundoAction.class);
    private String saludoAtr;
    
    public String execute(){
        log.info("ejecutando metodo execute desde strut 2");
        saludoAtr = "saludos desde struts2";
        return "exito";
    }

    public String getSaludoAtr() {
        return saludoAtr;
    }

    public void setSaludoAtr(String saludoAtr) {
        this.saludoAtr = saludoAtr;
    }
    
}
