package Flow_21091719_VarasVargas;

import Option_21091719_VarasVargas.Option_21091719_VarasVargas;

import java.util.List;

/**
 * Interface que implementa los diferentes metodos utilizados en Flow_21091719_VarasVargas
 */
public interface Flow_Interface_21091719_VarasVargas {

    /**
     * <p> Funcion getter, que retorna List_options</p>
     * @return List
     */
    public List<Option_21091719_VarasVargas> getList_option();

    /**
     * <p>Funcion la cual toma un option y lo agrega a list_options</p>
     * @param new_option
     */
    public void AddOption (Option_21091719_VarasVargas new_option);


    /**
     * <p>Funcion la cual retorna el conjunto de mensajes de todos los option almacenados</p>
     * @return String
     */
    public String mensaje_options();
}
