package Option_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Option_21091719_VarasVargas {

    private int ID;

    private String mensaje;
    private int inicial_chatbot;
    private int inicial_flow;
    private List<String> palabras_claves;

    public Option_21091719_VarasVargas(int ID, String mensaje, int inicial_chatbot, int inicial_flow) {
        this.ID = ID;
        this.mensaje = mensaje;
        this.inicial_chatbot = inicial_chatbot;
        this.inicial_flow = inicial_flow;
        this.palabras_claves = new ArrayList<>();
    }


    public int getID() {
        return ID;
    }

    public int getInicial_chatbot() {
        return inicial_chatbot;
    }

    public int getInicial_flow() {
        return inicial_flow;
    }

    public List<String> getPalabras_claves() {
        return palabras_claves;
    }

    public void setPalabras_claves(String palabras_claves) {
        String[] arrayElementos = palabras_claves.split(",");
        List<String> lista_palabras_Claves = Arrays.asList(arrayElementos);

        this.palabras_claves = lista_palabras_Claves;
    }

    public boolean validador_Palabra_Clave(String palabra_clave){
        return (this.palabras_claves.contains(palabra_clave));
    }


    @Override
    public String toString() {
        return "Option_21091719_VarasVargas{" +( "\n") +
                "               ID=" + ID +( "\n") +
                "               mensaje='" + mensaje + ( "\n") +
                "               inicial_charbot=" + inicial_chatbot +( "\n") +
                "               inicial_flow=" + inicial_flow +( "\n") +
                "               palabras_claves=" + palabras_claves +( "\n") +
                '}';
    }
}
