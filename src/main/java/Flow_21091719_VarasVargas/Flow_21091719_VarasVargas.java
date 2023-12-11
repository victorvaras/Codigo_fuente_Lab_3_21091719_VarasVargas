package Flow_21091719_VarasVargas;

import Identificadores_21091719_VarasVargas.Identificadores_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase la cual contiene a un flow, con sus atributos y metodos. Implementa su interface y herencia mencionadas
 * @author Victor Varas
 */
public class Flow_21091719_VarasVargas extends Identificadores_21091719_VarasVargas implements Flow_Interface_21091719_VarasVargas {

    /**
     * Atributo privado List, que contiene lista de options
     */
    private List<Option_21091719_VarasVargas> List_option;

    /**
     * <p>Funcion la cual realiza una construccion de objeto flow</p>
     * @param ID
     * @param nombre_mensaje
     * @return Flow_21091719_VarasVargas
     */
    public Flow_21091719_VarasVargas(int ID, String nombre_mensaje) {
        super(ID,nombre_mensaje);
        this.List_option= new ArrayList<>();
    }

    /**
     * <p> Funcion getter, que retorna List_options</p>
     * @return List
     */
    public List<Option_21091719_VarasVargas> getList_option() {
        return List_option;
    }

    /**
     * <p>Funcion la cual toma un option y lo agrega a list_options</p>
     * @param new_option
     */
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


    /**
     * <p>Funcion la cual retorna el conjunto de mensajes de todos los option almacenados</p>
     * @return String
     */
    public String mensaje_options(){
        StringBuilder mensaje_options = new StringBuilder();

        for ( Option_21091719_VarasVargas options : this.List_option){

            mensaje_options.append( options.getMensaje()).append("\n");
        }
        return mensaje_options.toString();
    }

}
