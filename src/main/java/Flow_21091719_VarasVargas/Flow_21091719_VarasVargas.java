package Flow_21091719_VarasVargas;

import Option_21091719_VarasVargas.Option_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.List;

public class Flow_21091719_VarasVargas {

    private int ID;

    private String Nombre_mensaje;

    private List<Option_21091719_VarasVargas> List_option;

    public Flow_21091719_VarasVargas(int ID, String nombre_mensaje) {
        this.ID = ID;
        this.Nombre_mensaje = nombre_mensaje;
        this.List_option= new ArrayList<>();
    }
}
