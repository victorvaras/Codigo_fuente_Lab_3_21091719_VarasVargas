package ChatBot_21091719_VarasVargas;

import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;


/**
 * Esta interface satisface las funcionalidedes para la clase ChatBot_21091719_VarasVargas
 * @author Victor Varas
 */
public interface ChatBot_Interfece_21091719_VarasVargas {

     /**
     *<p>
     *     Funcion la cual agrega un nuevo flow al chatbot particular.
     *</p>
     * @param new_Flow
     * @return boolean
     */
    public boolean AddFlow (Flow_21091719_VarasVargas new_Flow);

    /**
     *<p>
     *     Funcion la cual retorna un Flow particular, el cual tiene un ID particular
     *</p>
     * @param ID
     * @return Flow_21091719_VarasVargas
     */
    public Flow_21091719_VarasVargas getFlow_ID(int ID);


    /**
     *<p>
     *     Funcion la cual retorna un string, que corresponde a los nombres de los flows que se encuentran almacenados
     *</p>
     * @return String
     */
    public String nombre_Flows();

}
