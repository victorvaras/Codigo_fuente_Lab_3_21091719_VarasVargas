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

    public int getID() {
        return ID;
    }


    public List<Option_21091719_VarasVargas> getList_option() {
        return List_option;
    }

    public void AddOption (Option_21091719_VarasVargas new_option){

        boolean validador = true;
        for (Option_21091719_VarasVargas elemento : this.List_option) {

            if ( elemento.getID() == new_option.getID()){
                System.out.println("Option con id duplicado en Flow \n");
                validador = false;
            }
        }
        if (validador == true){
            this.List_option.add(new_option);
        }
    }


    public Option_21091719_VarasVargas getOption_ID(int ID){

        for (Option_21091719_VarasVargas elemento : this.List_option){
            if (elemento.getID() == ID){
                return elemento;
            }
        }
        System.out.println("Option no encontrado \n");
        return null;
    }

    @Override
    public String toString() {
        return "Flow_21091719_VarasVargas{" +( "\n") +
                "           ID=" + ID +( "\n") +
                "           Nombre_mensaje='" + Nombre_mensaje +( "\n") +
                "           List_option=" + List_option +( "\n") +
                "       }";
    }
}
