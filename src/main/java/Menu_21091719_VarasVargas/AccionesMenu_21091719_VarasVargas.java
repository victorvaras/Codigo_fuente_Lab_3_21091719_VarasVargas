package Menu_21091719_VarasVargas;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;
import System_21091719_VarasVargas.System_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.Scanner;

public class AccionesMenu_21091719_VarasVargas {


    public void  Cargar_system(System_21091719_VarasVargas system){


        //Chatbot 1
        ChatBot_21091719_VarasVargas ChatBot_1 = new ChatBot_21091719_VarasVargas(1,"Automotora", "Bienvenido ¿Qué te gustaría hacer?",1);
        system.AddChatBot(ChatBot_1);

        Flow_21091719_VarasVargas flow_1_1 = new Flow_21091719_VarasVargas(1, "Flujo Principal Chatbot 0 Bienvenido  ¿Qué te gustaría hacer?");
        ChatBot_1.AddFlow(flow_1_1);

        Option_21091719_VarasVargas option_1_1 = new Option_21091719_VarasVargas(1, "1) Comprar", 2,1);
        option_1_1.setPalabras_claves("comprar, adquirir");
        Option_21091719_VarasVargas option_1_2 = new Option_21091719_VarasVargas(2, "2) Arrendar", 3,1);
        option_1_2.setPalabras_claves("arrendar, rentar, alquilar");

        flow_1_1.AddOption(option_1_1);
        flow_1_1.AddOption(option_1_2);


        //Chatbot 2
        ChatBot_21091719_VarasVargas ChatBot_2 = new ChatBot_21091719_VarasVargas(2,"Comprar de automovil", "Bienvenido ¿Qué te gustaría hacer?",1);
        system.AddChatBot(ChatBot_2);

        Flow_21091719_VarasVargas flow_2_1 = new Flow_21091719_VarasVargas(1, "flujo 1 chatbot 1 ¿Que modo de pago desea?");
        ChatBot_2.AddFlow(flow_2_1);

        Option_21091719_VarasVargas option_2_1_1 = new Option_21091719_VarasVargas(1, "1) Contado", 3, 1);
        option_2_1_1.setPalabras_claves("contado, efectivo, cheque");
        Option_21091719_VarasVargas option_2_1_2 = new Option_21091719_VarasVargas(2, "2) Credito", 2, 2);
        option_2_1_2.setPalabras_claves("credito, financiamiento, cuotas");

        flow_2_1.AddOption(option_2_1_1);
        flow_2_1.AddOption(option_2_1_2);

        Flow_21091719_VarasVargas flow_2_2 = new Flow_21091719_VarasVargas(2, "flujo 2 chatbot 1 ¿Cantidad de cuotas a pagar?");
        ChatBot_2.AddFlow(flow_2_2);

        Option_21091719_VarasVargas option_2_2_1 = new Option_21091719_VarasVargas(1, "1) 24 cuotas", 3, 1);
        option_2_2_1.setPalabras_claves("24, 2 años");
        Option_21091719_VarasVargas option_2_2_2 = new Option_21091719_VarasVargas(2, "2) 36 cuotas", 3, 1);
        option_2_2_2.setPalabras_claves("36, 3 años");
        Option_21091719_VarasVargas option_2_2_3 = new Option_21091719_VarasVargas(3, "3) 48 cuotas", 3, 1);
        option_2_2_3.setPalabras_claves("48, 4 años");

        flow_2_2.AddOption(option_2_2_1);
        flow_2_2.AddOption(option_2_2_2);
        flow_2_2.AddOption(option_2_2_3);


        //Chatbot 3

        ChatBot_21091719_VarasVargas chatbot_3 = new ChatBot_21091719_VarasVargas(3,"Cantidad plazas", "Bienvenido ¿Qué te gustaría hacer?", 1);
        system.AddChatBot(chatbot_3);

        Flow_21091719_VarasVargas flow_3_1 = new Flow_21091719_VarasVargas(1, "flujo 1 chatbot 2 ¿Que modo de pago desea?");
        chatbot_3.AddFlow(flow_3_1);

        Option_21091719_VarasVargas option_3_1_1 = new Option_21091719_VarasVargas(1, "1) 2 plazas", 3, 1);
        option_3_1_1.setPalabras_claves("dos, 2 acientos");
        Option_21091719_VarasVargas option_3_1_2 = new Option_21091719_VarasVargas(2, "2) 4 plazas", 3, 1);
        option_3_1_2.setPalabras_claves("cuatro, 4 acientos");
        Option_21091719_VarasVargas option_3_1_3 = new Option_21091719_VarasVargas(3, "3) 5 plazas", 3, 1);
        option_3_1_3.setPalabras_claves("cinco, 5 acientos");
        Option_21091719_VarasVargas option_3_1_4 = new Option_21091719_VarasVargas(4, "4) Volver inicio", 1, 1);
        option_3_1_4.setPalabras_claves("volver, inicio");

        flow_3_1.AddOption(option_3_1_1);
        flow_3_1.AddOption(option_3_1_2);
        flow_3_1.AddOption(option_3_1_3);
        flow_3_1.AddOption(option_3_1_4);
    }



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

        if (system.getTalk_Iniciado() == false){
            system.talk("");
        }

        boolean validador_talk = true;
        Scanner scanner = new Scanner(System.in);
        AccionesMenu_21091719_VarasVargas Acciones_menu = new AccionesMenu_21091719_VarasVargas();

        while (validador_talk == true){
            ChatBot_21091719_VarasVargas ChatBot_actual = system.getChatBot_ID(system.getChatBot_actual());
            Flow_21091719_VarasVargas    Flow_actual    = ChatBot_actual.getFlow_ID(system.getFlow_actual());

            String mostrar = system.getFechaHoraActual() + " - " + system.getTDA_Usuario().getUsuario_logeado() + "\n"+
                    "Chatbot: " + ChatBot_actual.getNombre() + "\n" + "Flujo: " + Flow_actual.getNombre() + "\n" +
                    Flow_actual.mensaje_options();

            System.out.println(mostrar);
            System.out.println("SI desea salir escribir: Salir");
            String eleccion = scanner.nextLine();

            if (eleccion.equals("salir") || eleccion.equals("Salir")){
                validador_talk=false;
            }
            else {
                system.talk(eleccion);
            }

            system.ModificarChathistory(mostrar, eleccion);


        }

    }

}