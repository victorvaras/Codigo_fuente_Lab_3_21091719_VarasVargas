package Option_21091719_VarasVargas;

import Identificadores_21091719_VarasVargas.Identificadores_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase la cual contiene a un option, con sus atributos y metodos. Implementa su interface y herencia mencionadas
 * @author Victor Varas
 */
public class Option_21091719_VarasVargas extends Identificadores_21091719_VarasVargas implements Option_Interface_21091719_VarasVargas{

    /**
     * Atributo privado string, la cual contiene al mensaje
     */
    private String mensaje;

    /**
     * Atributo privado int, que contiene el inicial chatbot
     */
    private int inicial_chatbot;

    /**
     * Atributo privado int, que contiene inicial flow
     */
    private int inicial_flow;

    /**
     * Atributo privado List, que contiene lista de palabras claves
     */
    private List<String> palabras_claves;

    /**
     * <p>Funcion constructora, la cual realiza la creacion de un objeto Option_21091719_VarasVargas </p>
     * @param ID
     * @param mensaje
     * @param inicial_chatbot
     * @param inicial_flow
     * @return Option_21091719_VarasVargas
     */
    public Option_21091719_VarasVargas(int ID, String mensaje, int inicial_chatbot, int inicial_flow) {
        super(ID,"");
        this.mensaje = mensaje;
        this.inicial_chatbot = inicial_chatbot;
        this.inicial_flow = inicial_flow;
        this.palabras_claves = new ArrayList<>();
    }


    /**
     * <p>Funcion getter, la cual retorna inicial_chatbot</p>
     * @return inicial_chatbot
     */
    public int getInicial_chatbot() {
        return inicial_chatbot;
    }

    /**
     * <p>Funcion getter, la cual retorna inicial_flow</p>
     * @return inicial_flow
     */
    public int getInicial_flow() {
        return inicial_flow;
    }

    /**
     * <p>Funcion getter, la cual retorna mensaje</p>
     * @return mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * <p>Funcion getter, la cual retorna palabras_claves</p>
     * @return palabras_claves
     */
    public List<String> getPalabras_claves() {
        return palabras_claves;
    }

    /**
     * <p>Funcion la cual realiza la agregacion de palabras claves al option</p>
     * @param palabras_claves
     */
    public void setPalabras_claves(String palabras_claves) {
        String[] arrayElementos = palabras_claves.split(",");
        List<String> lista_palabras_Claves = Arrays.asList(arrayElementos);

        this.palabras_claves = lista_palabras_Claves;
    }

    /**
     * <p>Funcion la cual verifica si se encuentra o no una palabra dentro de las palabras claves</p>
     * @param palabra_clave
     * @return boolean
     */
    public boolean validador_Palabra_Clave(String palabra_clave){
        return (this.palabras_claves.contains(palabra_clave));
    }



}
