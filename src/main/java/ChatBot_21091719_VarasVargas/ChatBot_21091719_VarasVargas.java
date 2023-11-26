package ChatBot_21091719_VarasVargas;

import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.List;

public class ChatBot_21091719_VarasVargas {

    private final int ID;
    private final String nombre;
    private final String mensaje_bienvenida;
    private final int star_flow;
    private List<Flow_21091719_VarasVargas> List_FLow;


    public ChatBot_21091719_VarasVargas(int ID, String nombre, String mensaje_bienvenida, int star_flow) {
        this.ID = ID;
        this.nombre = nombre;
        this.mensaje_bienvenida = mensaje_bienvenida;
        this.star_flow = star_flow;
        this.List_FLow = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }


    public void AddFlow (Flow_21091719_VarasVargas new_Flow){

        boolean validador = true;
        for (Flow_21091719_VarasVargas elemento : this.List_FLow) {

            if ( elemento.getID() == new_Flow.getID()){
                System.out.println("Flow con id duplicado en ChatBot \n");
                validador = false;
            }
        }
        if (validador == true){
            this.List_FLow.add(new_Flow);
        }
    }


    @Override
    public String toString() {
        return "ChatBot_21091719_VarasVargas{" +( "\n") +
                "       ID=" + ID +
                "       nombre='" + nombre + ( "\n") +
                "       mensaje_bienvenida='" + mensaje_bienvenida + ( "\n") +
                "       star_flow=" + star_flow +( "\n") +
                "       List_FLow=" + List_FLow +( "\n") +
                "       }";
    }
}

