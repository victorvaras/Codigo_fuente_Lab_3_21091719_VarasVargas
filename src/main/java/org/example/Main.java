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







        System_21091719_VarasVargas system = new System_21091719_VarasVargas("Chatbots Paradigmas venta de automovil", 0);

        //Apartado para simplificar el logueo

        AccionesMenu_21091719_VarasVargas acciones = new AccionesMenu_21091719_VarasVargas();

        acciones.Cargar_system(system);

        Menu_21091719_VarasVargas ejecutar_Menu = new Menu_21091719_VarasVargas();
        ejecutar_Menu.Menu(system);






    }


}




