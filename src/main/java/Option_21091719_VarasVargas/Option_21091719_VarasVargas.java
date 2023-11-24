package Option_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.List;

public class Option_21091719_VarasVargas {

    private int ID;

    private String mensaje;
    private int inicial_charbot;
    private int inicial_flow;
    private List<String> palabras_claves;

    public Option_21091719_VarasVargas(int ID, String mensaje, int inicial_charbot, int inicial_flow) {
        this.ID = ID;
        this.mensaje = mensaje;
        this.inicial_charbot = inicial_charbot;
        this.inicial_flow = inicial_flow;
        this.palabras_claves = new ArrayList<>();
    }
}
