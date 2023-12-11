package ChatBot_21091719_VarasVargas;

import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Identificadores_21091719_VarasVargas.Identificadores_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un ChatBot, el cual contiene diferentes atributos y metodos propios mencionados en su
 * interface. Hereda los metodos a atributos de identificadores_21091719_VarasVargas
 * @author Victor Varas
 */
public class ChatBot_21091719_VarasVargas extends Identificadores_21091719_VarasVargas implements ChatBot_Interfece_21091719_VarasVargas{

    /**
     * Atributo privado String, que contiene mensaje de bienvenida
     */
    private final String mensaje_bienvenida;

    /**
     * Atributo privado int, que contiene star flow
     */
    private final int star_flow;

    /**
     * Atributo privado List, que contiene lista de flows
     */
    private List<Flow_21091719_VarasVargas> List_FLow;


    /**
     * <p>Funcion que realiza la construccion de objeto ChatBot</p>
     * @param ID
     * @param nombre
     * @param mensaje_bienvenida
     * @param star_flow
     * @return ChatBot_21091719_VarasVargas
     */
    public ChatBot_21091719_VarasVargas(int ID, String nombre, String mensaje_bienvenida, int star_flow) {
        super(ID,nombre);
        this.mensaje_bienvenida = mensaje_bienvenida;
        this.star_flow = star_flow;
        this.List_FLow = new ArrayList<>();
    }


    /**
     * <p>Funcion getter, que retorna Star_flow</p>
     * @return star_flow
     */
    public int getStar_flow() {
        return star_flow;
    }

    /**
     *<p>
     *     Funcion la cual agrega un nuevo flow al chatbot particular.
     *</p>
     * @param new_Flow
     * @return boolean
     */
    public boolean AddFlow (Flow_21091719_VarasVargas new_Flow){

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
        return validador;
    }

    /**
     * <p>Funcion getter, que retorna un flow de acuerdo a su ID </p>
     * @param ID
     * @return star_flow
     */
    public Flow_21091719_VarasVargas getFlow_ID(int ID){

        for (Flow_21091719_VarasVargas elemento : this.List_FLow){
            if (elemento.getID() == ID){
                return elemento;
            }
        }
        System.out.println("Flow no encontrado \n");
        return null;
    }

    /**
     *<p>
     *     Funcion la cual retorna un string, que corresponde a los nombres de los flows que se encuentran almacenados
     *</p>
     * @return String
     */
    public String nombre_Flows(){
        StringBuilder nombre_flows = new StringBuilder();

        for ( Flow_21091719_VarasVargas flows : this.List_FLow){

            nombre_flows.append( flows.getID()).append(". ");
            nombre_flows.append( flows.getNombre()).append("\n");
        }
        return nombre_flows.toString();
    }


}

