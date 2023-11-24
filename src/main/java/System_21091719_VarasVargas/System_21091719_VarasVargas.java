package System_21091719_VarasVargas;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;

import java.util.List;
import java.util.ArrayList;
public class System_21091719_VarasVargas {

    private String nombre_chatbot;
    private Integer inicial_chatbot;

    private List <ChatBot_21091719_VarasVargas> List_ChatBot;

    public System_21091719_VarasVargas(String nombre_chatbot, Integer inicial_chatbot) {
        this.nombre_chatbot    = nombre_chatbot;
        this.inicial_chatbot   = inicial_chatbot;
        this.List_ChatBot      = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "System_21091719_VarasVargas{" +
                "nombre_chatbot='" + nombre_chatbot + '\'' +
                ", inicial_chatbot=" + inicial_chatbot +
                '}';
    }


}

