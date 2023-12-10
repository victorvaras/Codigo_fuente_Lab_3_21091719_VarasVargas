package Option_21091719_VarasVargas;

import Identificadores_21091719_VarasVargas.Identificadores_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Option_21091719_VarasVargas extends Identificadores_21091719_VarasVargas {

    private String mensaje;
    private int inicial_chatbot;
    private int inicial_flow;
    private List<String> palabras_claves;

    public Option_21091719_VarasVargas(int ID, String mensaje, int inicial_chatbot, int inicial_flow) {
        super(ID,"");
        this.mensaje = mensaje;
        this.inicial_chatbot = inicial_chatbot;
        this.inicial_flow = inicial_flow;
        this.palabras_claves = new ArrayList<>();
    }



    public int getInicial_chatbot() {
        return inicial_chatbot;
    }

    public int getInicial_flow() {
        return inicial_flow;
    }

    public String getMensaje() {
        return mensaje;
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
        return  "\n" + "               Option"+this.getID() +( "\n") +
                "               Mensaje: " + mensaje + ( "\n") +
                "               Inicial charbot: " + inicial_chatbot +( "\n") +
                "               Inicial flow: " + inicial_flow +( "\n") +
                "               Palabras claves= " + palabras_claves +( "\n");
    }
}
