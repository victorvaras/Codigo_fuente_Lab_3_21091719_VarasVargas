package System_21091719_VarasVargas;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.List;
import java.util.Random;

/**
 * Interface que muestra los metodos que son utilizados en clase System_21091719_VarasVargas
 */
public interface System_Interface_21091719_VarasVargas {


    /**
     * <p> Funcion la cual obtiene a un chatbot particular por su ID dentro de la lista de chatbots</p>
     * @param ID
     * @return ChatBot_21091719_VarasVargas
     */
    public ChatBot_21091719_VarasVargas getChatBot_ID(int ID);

    /**
     * <p> Funcion la cual realiza la agregacion de un chatbot a lisa de chatbots</p>
     * @param New_Chatbot
     * @return AddChatBot
     */
    public boolean AddChatBot (ChatBot_21091719_VarasVargas New_Chatbot);

    /**
     * <p>Funcion la cual realiza la interaccion del usuario por el sistema, actualizando los valoresw</p>
     * @param eleccion
     */
    public void talk(String eleccion);


    /**
     * <p>Funcion la cual va modificando y agregando los elemetnos nesesarios que se realzien en funcion talk</p>
     * @param menu
     * @param eleccion
     */
    public void ModificarChathistory (String menu, String eleccion);

    /**
     * <p>Metodo el cual realiza la simulacion del system dado por un maximo de interacciones y una seed particular</p>
     * @param max_interacciones
     * @param seed
     */
    public void Simulate_System(int max_interacciones, int seed);


    /**
     * <p> Funcion la cual entrega la totalidad de nombres de chatbots que se encuentran en lista de chatbots</p>
     * @return
     */
    public String nombre_Chatbots();
}
