package ChatBot_21091719_VarasVargas;

import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Identificadores_21091719_VarasVargas.Identificadores_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.List;

public class ChatBot_21091719_VarasVargas extends Identificadores_21091719_VarasVargas {

    private final String mensaje_bienvenida;
    private final int star_flow;
    private List<Flow_21091719_VarasVargas> List_FLow;


    public ChatBot_21091719_VarasVargas(int ID, String nombre, String mensaje_bienvenida, int star_flow) {
        super(ID,nombre);
        this.mensaje_bienvenida = mensaje_bienvenida;
        this.star_flow = star_flow;
        this.List_FLow = new ArrayList<>();
    }


    public int getStar_flow() {
        return star_flow;
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

    public Flow_21091719_VarasVargas getFlow_ID(int ID){

        for (Flow_21091719_VarasVargas elemento : this.List_FLow){
            if (elemento.getID() == ID){
                return elemento;
            }
        }
        System.out.println("Flow no encontrado \n");
        return null;
    }


    @Override
    public String toString() {
        return "ChatBot_21091719_VarasVargas{" +( "\n") +
                "       ID=" + this.getID() +
                "       nombre='" + this.getNombre() + ( "\n") +
                "       mensaje_bienvenida='" + mensaje_bienvenida + ( "\n") +
                "       star_flow=" + star_flow +( "\n") +
                "       List_FLow=" + List_FLow +( "\n") +
                "       }";
    }
}

