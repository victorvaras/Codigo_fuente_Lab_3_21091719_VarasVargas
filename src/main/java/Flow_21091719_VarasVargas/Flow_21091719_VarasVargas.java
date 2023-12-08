package Flow_21091719_VarasVargas;

import Identificadores_21091719_VarasVargas.Identificadores_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.List;

public class Flow_21091719_VarasVargas extends Identificadores_21091719_VarasVargas {



    private List<Option_21091719_VarasVargas> List_option;

    public Flow_21091719_VarasVargas(int ID, String nombre_mensaje) {
        super(ID,nombre_mensaje);
        this.List_option= new ArrayList<>();
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
                "           ID=" + this.getID() +( "\n") +
                "           Nombre_mensaje='" + this.getNombre() +( "\n") +
                "           List_option=" + List_option +( "\n") +
                "       }";
    }
}
