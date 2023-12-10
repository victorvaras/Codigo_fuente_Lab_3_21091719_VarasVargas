package System_21091719_VarasVargas;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Identificadores_21091719_VarasVargas.Identificadores_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.List;
import java.util.ArrayList;
public class System_21091719_VarasVargas extends Identificadores_21091719_VarasVargas {

    private Integer inicial_chatbot;
    private List<ChatBot_21091719_VarasVargas> List_ChatBot;
    private User_21091719_VarasVargas TDA_Usuario;

    private boolean talk_Iniciado;
    private int ChatBot_actual;
    private int Flow_actual;

    private StringBuilder chatHistory;

    public System_21091719_VarasVargas(String nombre_chatbot, Integer inicial_chatbot) {
        super(0,nombre_chatbot);
        this.inicial_chatbot   = inicial_chatbot;
        this.List_ChatBot      = new ArrayList<>();
        this.TDA_Usuario       = new User_21091719_VarasVargas();
        this.talk_Iniciado     = false;
        this.chatHistory       = new StringBuilder();
    }


    public User_21091719_VarasVargas getTDA_Usuario() {
        return TDA_Usuario;
    }

    public List<ChatBot_21091719_VarasVargas> getList_ChatBot() {
        return List_ChatBot;
    }


    public int getChatBot_actual() {
        return ChatBot_actual;
    }

    public int getFlow_actual() {
        return Flow_actual;
    }

    public boolean getTalk_Iniciado() {
        return talk_Iniciado;
    }

    public String getChatHistory() {
        return chatHistory.toString();
    }

    public ChatBot_21091719_VarasVargas getChatBot_ID(int ID){

        for (ChatBot_21091719_VarasVargas elemento : this.List_ChatBot){
            if (elemento.getID() == ID){
                return elemento;
            }
        }
        System.out.println("ChatBot no encontrado \n");
        return null;
    }

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


    public void ModificarChathistory (String menu, String eleccion){

        this.chatHistory.append("\n\n");
        this.chatHistory.append(menu);
        this.chatHistory.append("\n");
        this.chatHistory.append("Eleccion de ");
        this.chatHistory.append(this.TDA_Usuario.getUsuario_logeado());
        this.chatHistory.append(" es: ");
        this.chatHistory.append(eleccion);
    }


    public String nombre_Chatbots(){
        StringBuilder nombre_chatbots = new StringBuilder();

        for ( ChatBot_21091719_VarasVargas chatbots : this.List_ChatBot){

            nombre_chatbots.append( chatbots.getID()).append(". ");
            nombre_chatbots.append(chatbots.getNombre()).append("\n");
        }
        return nombre_chatbots.toString();
    }


    @Override
    public String toString() {
        return "\n" + "System "+ this.getNombre() + "\n" +
                "   inicial chatbot = " + inicial_chatbot + "\n" +
                "   Chatbot en system: \n" + List_ChatBot + "\n" ;
    }


}




