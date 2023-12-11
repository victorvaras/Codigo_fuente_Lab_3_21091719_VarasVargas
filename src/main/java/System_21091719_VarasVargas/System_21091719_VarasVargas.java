package System_21091719_VarasVargas;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Identificadores_21091719_VarasVargas.Identificadores_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class System_21091719_VarasVargas extends Identificadores_21091719_VarasVargas implements System_Interface_21091719_VarasVargas {

    /**
     * Atributo privado int, que almacena inicial chatbot
     */
    private int inicial_chatbot;

    /**
     * Atributo privado List, que contiene lista de chatbots
     */
    private List<ChatBot_21091719_VarasVargas> List_ChatBot;

    /**
     * Atributo privado que almacena a clase User
     */
    private User_21091719_VarasVargas TDA_Usuario;

    /**
     * Atributo privado boolean, almacena el estado del talk
     */
    private boolean talk_Iniciado;

    /**
     * Atributo privado int, que almacena a chatbot actual
     */
    private int ChatBot_actual;

    /**
     * Atributo privado int, que almacena a flow actual
     */
    private int Flow_actual;

    /**
     * Atributo privado StringBuilder, que almacena el historial del talk
     */
    private StringBuilder chatHistory;

    /**
     * <p> Funcion constructora que crea objeto System_21091719_VarasVargas</p>
     * @param nombre_chatbot
     * @param inicial_chatbot
     */
    public System_21091719_VarasVargas(String nombre_chatbot, Integer inicial_chatbot) {
        super(0,nombre_chatbot);
        this.inicial_chatbot   = inicial_chatbot;
        this.List_ChatBot      = new ArrayList<>();
        this.TDA_Usuario       = new User_21091719_VarasVargas();
        this.talk_Iniciado     = false;
        this.chatHistory       = new StringBuilder();
    }


    /**
     * <p> Funcion getter, que retorna TDA_Usuario</p>
     * @return TDA_Usuario
     */
    public User_21091719_VarasVargas getTDA_Usuario() {
        return TDA_Usuario;
    }

    /**
     * <p> Funcion getter, que retorna TDA_Usuario</p>
     * @return TDA_Usuario
     */
    public List<ChatBot_21091719_VarasVargas> getList_ChatBot() {
        return List_ChatBot;
    }


    /**
     * <p> Funcion getter, que retorna TDA_Usuario</p>
     * @return TDA_Usuario
     */
    public int getChatBot_actual() {
        return ChatBot_actual;
    }

    /**
     * <p> Funcion getter, que retorna Flow_actual</p>
     * @return Flow_actual
     */
    public int getFlow_actual() {
        return Flow_actual;
    }

    /**
     * <p> Funcion getter, que retorna talk_Iniciado</p>
     * @return talk_Iniciado
     */
    public boolean getTalk_Iniciado() {
        return talk_Iniciado;
    }

    /**
     * <p> Funcion getter, que retorna chatHistory</p>
     * @return chatHistory
     */
    public String getChatHistory() {
        return chatHistory.toString();
    }

    /**
     * <p> Funcion la cual obtiene a un chatbot particular por su ID dentro de la lista de chatbots</p>
     * @param ID
     * @return ChatBot_21091719_VarasVargas
     */
    public ChatBot_21091719_VarasVargas getChatBot_ID(int ID){

        for (ChatBot_21091719_VarasVargas elemento : this.List_ChatBot){
            if (elemento.getID() == ID){
                return elemento;
            }
        }
        System.out.println("ChatBot no encontrado \n");
        return null;
    }

    /**
     * <p> Funcion la cual realiza la agregacion de un chatbot a lisa de chatbots</p>
     * @param New_Chatbot
     * @return AddChatBot
     */
    public boolean AddChatBot (ChatBot_21091719_VarasVargas New_Chatbot){

        boolean validador = true;
        for (ChatBot_21091719_VarasVargas elemento : this.List_ChatBot) {

            if ( elemento.getID() == New_Chatbot.getID()){
                System.out.println("Chatbot con id duplicado en system");
                validador = false;
            }
        }
        if (validador == true){
            this.List_ChatBot.add(New_Chatbot);
        }
        return validador;
    }

    /**
     * <p>Funcion la cual realiza la interaccion del usuario por el sistema, actualizando los valoresw</p>
     * @param eleccion
     */
    public void talk(String eleccion){

        if (false == this.talk_Iniciado){

            ChatBot_21091719_VarasVargas ChatBot_actual = this.getChatBot_ID(this.inicial_chatbot);

            this.ChatBot_actual = this.inicial_chatbot;
            this.Flow_actual    = ChatBot_actual.getStar_flow();
            this.talk_Iniciado = true;
        }
        else{
            ChatBot_21091719_VarasVargas ChatBot_actual = this.getChatBot_ID(this.ChatBot_actual);
            Flow_21091719_VarasVargas    Flow_actual    =ChatBot_actual.getFlow_ID(this.Flow_actual);

            for (Option_21091719_VarasVargas Options : Flow_actual.getList_option()){

                try {
                    int eleccion_ID = Integer.parseInt(eleccion);
                    if (Options.getID() == eleccion_ID) {
                        this.ChatBot_actual = Options.getInicial_chatbot();
                        this.Flow_actual    = Options.getInicial_flow();
                        break;
                    }

                } catch (NumberFormatException e) {

                    if (Options.validador_Palabra_Clave(eleccion)){
                        this.ChatBot_actual = Options.getInicial_chatbot();
                        this.Flow_actual    = Options.getInicial_flow();
                        break;
                    }
                }

            }
        }

    }


    /**
     * <p>Funcion la cual va modificando y agregando los elemetnos nesesarios que se realzien en funcion talk</p>
     * @param menu
     * @param eleccion
     */
    public void ModificarChathistory (String menu, String eleccion){

        this.chatHistory.append("\n\n");
        this.chatHistory.append(menu);
        this.chatHistory.append("\n");
        this.chatHistory.append("Eleccion de ");
        this.chatHistory.append(this.TDA_Usuario.getUsuario_logeado());
        this.chatHistory.append(" es: ");
        this.chatHistory.append(eleccion);
    }


    /**
     * <p>Metodo el cual realiza la simulacion del system dado por un maximo de interacciones y una seed particular</p>
     * @param max_interacciones
     * @param seed
     */
    public void Simulate_System(int max_interacciones, int seed){


        Random random = new Random(seed);
        int num_minimo = 1;

        for (int i = 1; i <= max_interacciones;i++){

            ChatBot_21091719_VarasVargas chatbot_actual = this.getChatBot_ID(this.ChatBot_actual);
            Flow_21091719_VarasVargas flow_actual = this.getChatBot_ID(this.getChatBot_actual()).getFlow_ID(this.Flow_actual);

            int num_maximo = flow_actual.getList_option().size();
            int numeroAleatorio = random.nextInt(num_maximo - num_minimo + 1) + num_minimo;

            String eleccion = String.valueOf(numeroAleatorio);
            this.talk(eleccion);

            String mostrar = this.getFechaHoraActual() + " - " + this.getTDA_Usuario().getUsuario_logeado() + "  Generado por symulacion"+ "\n"+
                    "Chatbot: " + chatbot_actual.getNombre() + "\n" + "Flujo: " + flow_actual.getNombre() + "\n" +
                    flow_actual.mensaje_options();

            this.ModificarChathistory(mostrar, eleccion);
        }
    }


    /**
     * <p> Funcion la cual entrega la totalidad de nombres de chatbots que se encuentran en lista de chatbots</p>
     * @retur
     */
    public String nombre_Chatbots(){
        StringBuilder nombre_chatbots = new StringBuilder();

        for ( ChatBot_21091719_VarasVargas chatbots : this.List_ChatBot){

            nombre_chatbots.append( chatbots.getID()).append(". ");
            nombre_chatbots.append(chatbots.getNombre()).append("\n");
        }
        return nombre_chatbots.toString();
    }




}




