package Menu_21091719_VarasVargas;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;
import System_21091719_VarasVargas.System_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.Scanner;

public class AccionesMenu_21091719_VarasVargas {
    //public System_21091719_VarasVargas menu_system;


    public void  Cargar_system(System_21091719_VarasVargas system){

        boolean validador = false;
        User_21091719_VarasVargas TDA_usuarioss = system.getTDA_Usuario();
        TDA_usuarioss.AddUser("user 1", "administrador");

        ChatBot_21091719_VarasVargas ChatBot_1 = new ChatBot_21091719_VarasVargas(0,"Automotora", "Bienvenido ¿Qué te gustaría hacer?",1);
        system.AddChatBot(ChatBot_1);

        Flow_21091719_VarasVargas flow_1 = new Flow_21091719_VarasVargas(1, "Flujo Principal Chatbot 0 Bienvenido  ¿Qué te gustaría hacer?");
        ChatBot_1.AddFlow(flow_1);

        Option_21091719_VarasVargas option_1 = new Option_21091719_VarasVargas(1, "1) Comprar", 1,1);
        Option_21091719_VarasVargas option_2 = new Option_21091719_VarasVargas(2, "2) Arrendar", 2,1);

        option_1.setPalabras_claves("comprar, adquirir");
        option_2.setPalabras_claves("arrendar, rentar, alquilar");

        flow_1.AddOption(option_1);
        flow_1.AddOption(option_2);

    }

    /*


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


    public String Registro_usuarios(System_21091719_VarasVargas system){
        boolean estado_registro_usuario = true;
        Scanner scanner = new Scanner(System.in);
        String eleccion;
        String menu_seleccionado = "";

        do{
            System.out.println(
                    "\n\n~~~ Sistema de chatbot - Inicio ~~~\n" +
                            "Que accion desea realizar\n" +
                            "1. Login usuario\n" +
                            "2. Registrar usuario\n" +
                            "3. Salir de sistema de chatbot" + "\n"+
                            "Ingrese su eleccion: "
            );
            eleccion = scanner.nextLine();

            switch (eleccion) {

                case "1": {


                    System.out.println("\nIngrese nombre de usuario: ");
                    String nombre = scanner.nextLine();

                    User_21091719_VarasVargas TDA_usuarios = system.getTDA_Usuario();
                    TDA_usuarios.Login(nombre);

                    if (TDA_usuarios.getTipo_usuario().equals("comun")) {

                        menu_seleccionado = "menu user comun";
                        estado_registro_usuario = false;
                    }
                    else if (TDA_usuarios.getTipo_usuario().equals("administrador")) {

                        menu_seleccionado = "menu user administrador";
                        estado_registro_usuario = false;

                    }


                    break;
                }

                case "2": {

                    System.out.println("\nIngrese nombre de usuario: ");
                    String nombre = scanner.nextLine();

                    System.out.println("\nIngrese tipo de usuario \n 1. Comun \n 2. Administrador\nIngrese su eleccion: ");
                    String tipo_usuario = scanner.nextLine();

                    if ("1".equals(tipo_usuario)) {
                        tipo_usuario = "comun";
                        User_21091719_VarasVargas TDA_usuarios = system.getTDA_Usuario();
                        TDA_usuarios.AddUser(nombre, tipo_usuario);

                    } else if ("2".equals(tipo_usuario)) {
                        tipo_usuario = "administrador";
                        User_21091719_VarasVargas TDA_usuarios = system.getTDA_Usuario();
                        TDA_usuarios.AddUser(nombre, tipo_usuario);

                    } else {
                        System.out.println("Usuario no registrado, entrada tipo usuario equivocada");
                    }

                    break;

                }

                case "3": {
                    System.out.println("\nGracias por usar el sistema de chatbots");
                    System.exit(0);
                }

                default: {
                    System.out.println("Opcion invalida.");
                }

            }

        } while (estado_registro_usuario == true);

        return menu_seleccionado;

    }



    public ChatBot_21091719_VarasVargas Menu_Crear_Chatbot(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n~~~ Creacion de nuevo ChatBot ~~~");

        System.out.println("Ingrese ID chatbot: ");
        int ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nIngrese Nombre chatbot:");
        String Nombre = scanner.nextLine();

        System.out.println("\nIngrese mensaje de chatbot:");
        String Mensaje = scanner.nextLine();

        System.out.println("\nIngrese star flow");
        int Star_flow = scanner.nextInt();
        scanner.nextLine();

        ChatBot_21091719_VarasVargas new_ChatBot= new ChatBot_21091719_VarasVargas(ID,Nombre,Mensaje,Star_flow);
        return new_ChatBot;
    }


    public Flow_21091719_VarasVargas Menu_Crear_Flow(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCreacion nuevo flow para chatbot actual");

        System.out.println("Ingrese ID");
        int ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nIngrese nombre");
        String Nombre = scanner.nextLine();

        Flow_21091719_VarasVargas new_flow= new Flow_21091719_VarasVargas(ID, Nombre);
        return new_flow;
    }


    public Option_21091719_VarasVargas Menu_Crear_Option() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCreacion nuevo option para chatbot actual");

        System.out.println("Ingrese ID");
        int ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nIngrese mensaje de option");
        String Mensaje = scanner.nextLine();

        System.out.println("\nIngrese inicial chatbot");
        int Inicial_chatbot = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nIngrese inicial flujo");
        int Inicial_flujo = scanner.nextInt();
        scanner.nextLine();

        Option_21091719_VarasVargas new_option = new Option_21091719_VarasVargas(ID, Mensaje, Inicial_chatbot,Inicial_flujo);

        System.out.println("\nDesea agregar palabras claves a option\n 1. Si \n 2. No");
        int eleccion_palabras_claves = scanner.nextInt();
        scanner.nextLine();

        if (eleccion_palabras_claves == 1){
            System.out.println("\nIngrese las palabras claves separadas por comas (,), tantas como desee");

            String palabras_claves = scanner.nextLine();
            new_option.setPalabras_claves(palabras_claves);
        }

        return new_option;
    }


    public void Menu_talk(System_21091719_VarasVargas system){

        if (system.getTalk_Iniciado() == true){
            system.talk("");
        }
        else {

            String mostrar = system.getFechaHoraActual() + " - " + system.getTDA_Usuario().getUsuario_logeado() + "\n"+
                            
        }

        System.out.println("");

    }
}
