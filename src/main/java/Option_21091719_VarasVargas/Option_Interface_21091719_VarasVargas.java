package Option_21091719_VarasVargas;

import java.util.Arrays;
import java.util.List;

/**
 * Interface que muestra los metodos en clase Option_21091719_VarasVargas
 */
public interface Option_Interface_21091719_VarasVargas {


    /**
     * <p>Funcion la cual realiza la agregacion de palabras claves al option</p>
     * @param palabras_claves
     */
    public void setPalabras_claves(String palabras_claves);

    /**
     * <p>Funcion la cual verifica si se encuentra o no una palabra dentro de las palabras claves</p>
     * @param palabra_clave
     * @return boolean
     */
    public boolean validador_Palabra_Clave(String palabra_clave);

}
