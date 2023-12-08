package org.example;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Menu_21091719_VarasVargas.AccionesMenu_21091719_VarasVargas;
import Menu_21091719_VarasVargas.Menu_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;
import System_21091719_VarasVargas.System_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {







        System_21091719_VarasVargas system = new System_21091719_VarasVargas("Prueba chatot", 1);

        //Apartado para simplificar el logueo

        AccionesMenu_21091719_VarasVargas acciones = new AccionesMenu_21091719_VarasVargas();

        acciones.Cargar_system(system);

        Menu_21091719_VarasVargas ejecutar_Menu = new Menu_21091719_VarasVargas();
        ejecutar_Menu.Menu(system);






    }


}

/*
System_21091719_VarasVargas system = new System_21091719_VarasVargas("Prueba chatbot", 1);

        User_21091719_VarasVargas TDA_usuarios = system.getTDA_Usuario();
        TDA_usuarios.AddUser("user 1", "comun");
        TDA_usuarios.AddUser("user 1", "comun");
        TDA_usuarios.AddUser("user 2", "comun");
        TDA_usuarios.AddUser("user 3", "administrador");
        TDA_usuarios.Login("user 3");
        TDA_usuarios.Login("user 1");
        TDA_usuarios.Logout();

        ChatBot_21091719_VarasVargas ChatBot_1 = new ChatBot_21091719_VarasVargas(1,"Chatbot 1","Bienvenido",1);
        ChatBot_21091719_VarasVargas ChatBot_2 = new ChatBot_21091719_VarasVargas(2,"Chatbot 2","Chao",1);

        system.AddChatBot(ChatBot_1);
        system.AddChatBot(ChatBot_1);
        system.AddChatBot(ChatBot_2);

        ChatBot_21091719_VarasVargas chatbot_Actual = system.getChatBot_ID(1);

        Flow_21091719_VarasVargas flow_1 = new Flow_21091719_VarasVargas(1, "Flujo 1");
        Flow_21091719_VarasVargas flow_2 = new Flow_21091719_VarasVargas(2, "Flujo 2");

        chatbot_Actual.AddFlow(flow_1);
        chatbot_Actual.AddFlow(flow_1);
        chatbot_Actual.AddFlow(flow_2);

        Flow_21091719_VarasVargas flow_actual = chatbot_Actual.getFlow_ID(1);

        Option_21091719_VarasVargas option_1 = new Option_21091719_VarasVargas(1, "Option 1", 1,1);
        Option_21091719_VarasVargas option_2 = new Option_21091719_VarasVargas(2, "Option 2", 1,3);

        option_1.setPalabras_claves("palabra1, palabra2, palabra3");
        System.out.println("aqui validador:  " + option_1.validador_Palabra_Clave("palabra1"));

        flow_actual.AddOption(option_1);
        flow_actual.AddOption(option_2);
        flow_actual.AddOption(option_1);


        System.out.println("Inicial");
        System.out.println("ChatBot actual: "+ system.getChatBot_actual() + "\nFlow actual: "+ system.getFlow_actual());

        system.talk("hola");
        System.out.println("\nDespues de hola");
        System.out.println("ChatBot actual: "+ system.getChatBot_actual() + "\nFlow actual: "+ system.getFlow_actual());

        system.talk("1");
        System.out.println("\nDespues de 1");
        System.out.println("ChatBot actual: "+ system.getChatBot_actual() + "\nFlow actual: "+ system.getFlow_actual());

        system.talk("2");
        System.out.println("\nDespues de 2");
        System.out.println("ChatBot actual: "+ system.getChatBot_actual() + "\nFlow actual: "+ system.getFlow_actual());

        System.out.println(system.toString());
 */


