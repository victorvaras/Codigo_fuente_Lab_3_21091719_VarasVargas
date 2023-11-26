package System_21091719_VarasVargas;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.List;
import java.util.ArrayList;
public class System_21091719_VarasVargas {

    private String nombre_chatbot;
    private Integer inicial_chatbot;

    private List<ChatBot_21091719_VarasVargas> List_ChatBot;

    private User_21091719_VarasVargas TDA_Usuario;

    public System_21091719_VarasVargas(String nombre_chatbot, Integer inicial_chatbot) {
        this.nombre_chatbot    = nombre_chatbot;
        this.inicial_chatbot   = inicial_chatbot;
        this.List_ChatBot      = new ArrayList<>();
        this.TDA_Usuario       = new User_21091719_VarasVargas();
    }


    public User_21091719_VarasVargas getTDA_Usuario() {
        return TDA_Usuario;
    }

    public List<ChatBot_21091719_VarasVargas> getList_ChatBot() {
        return List_ChatBot;
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




