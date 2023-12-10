package org.example;

import Menu_21091719_VarasVargas.AccionesMenu_21091719_VarasVargas;
import Menu_21091719_VarasVargas.Menu_21091719_VarasVargas;
import System_21091719_VarasVargas.System_21091719_VarasVargas;



public class Main {

    public static void main(String[] args) {







        System_21091719_VarasVargas system = new System_21091719_VarasVargas("Chatbots Paradigmas venta de automovil", 1);

        //Apartado para simplificar el logueo
        7



        AccionesMenu_21091719_VarasVargas acciones = new AccionesMenu_21091719_VarasVargas();

        acciones.Cargar_system(system);

        Menu_21091719_VarasVargas ejecutar_Menu = new Menu_21091719_VarasVargas();
        ejecutar_Menu.Menu(system);






    }


}




