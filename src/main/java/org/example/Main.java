package org.example;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import System_21091719_VarasVargas.System_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        System_21091719_VarasVargas system = new System_21091719_VarasVargas("Prueba chatbot", 0);

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

        String salida = system.toString();
        System.out.println(salida);

    }
}

/*
while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione una opción:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la Opción 1");
                    // Lógica de la Opción 1
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2");
                    // Lógica de la Opción 2
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3");
                    // Lógica de la Opción 3
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
 */
