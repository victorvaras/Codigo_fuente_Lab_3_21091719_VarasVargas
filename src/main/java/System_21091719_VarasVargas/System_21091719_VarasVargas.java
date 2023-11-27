package System_21091719_VarasVargas;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.List;
import java.util.ArrayList;
public class System_21091719_VarasVargas {

    private String nombre_chatbot;
    private Integer inicial_chatbot;
    private List<ChatBot_21091719_VarasVargas> List_ChatBot;
    private User_21091719_VarasVargas TDA_Usuario;

    private boolean talk_Iniciado;
    private int ChatBot_actual;
    private int Flow_actual;

    public System_21091719_VarasVargas(String nombre_chatbot, Integer inicial_chatbot) {
        this.nombre_chatbot    = nombre_chatbot;
        this.inicial_chatbot   = inicial_chatbot;
        this.List_ChatBot      = new ArrayList<>();
        this.TDA_Usuario       = new User_21091719_VarasVargas();
        this.talk_Iniciado     = false;
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

    public void AddChatBot (ChatBot_21091719_VarasVargas New_Chatbot){

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


    public void talk(String eleccion){

        if (false == this.talk_Iniciado){

            ChatBot_21091719_VarasVargas ChatBot_actual = this.getChatBot_ID(this.inicial_chatbot);
            Flow_21091719_VarasVargas    Flow_actual    =ChatBot_actual.getFlow_ID(ChatBot_actual.getStar_flow());

            this.ChatBot_actual = ChatBot_actual.getID();
            this.Flow_actual    = Flow_actual.getID();
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


    @Override
    public String toString() {
        return "System_21091719_VarasVargas{" +"\n" +
                "   nombre_chatbot='" + nombre_chatbot + "\n" +
                "   inicial_chatbot=" + inicial_chatbot + "\n" +
                "   List_ChatBot=" + List_ChatBot + "\n" +
                "   TDA_Usuario=" + TDA_Usuario + "\n" +
                "   }";
    }


}




