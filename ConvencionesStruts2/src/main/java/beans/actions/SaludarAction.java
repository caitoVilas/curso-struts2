
package beans.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author claudio.vilas
 */
public class SaludarAction {
    
    Logger log = LogManager.getLogger(SaludarAction.class);
    private String saludoAtr;
    
    public String execute(){
        log.info("ejecutando metodo execute desde strut 2");
        saludoAtr = "hola desde struts2 con convecciones";
        return "exito";
    }

    public String getSaludoAtr() {
        return saludoAtr;
    }

    public void setSaludoAtr(String saludoAtr) {
        this.saludoAtr = saludoAtr;
    }
    
}
