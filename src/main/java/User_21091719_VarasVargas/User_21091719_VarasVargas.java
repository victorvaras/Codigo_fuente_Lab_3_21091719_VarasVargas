package User_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.List;

public class User_21091719_VarasVargas {

    private String usuario_logeado;
    private String tipo_usuario;

    private List<String> Usuarios_Administradores;
    private List<String> Usuarios_Comunes;

    public User_21091719_VarasVargas() {
        this.usuario_logeado = "sin usuario";
        this.tipo_usuario = "sin usuario";
        this.Usuarios_Administradores = new ArrayList<>();
        this.Usuarios_Comunes = new ArrayList<>();
    }


    public void AddUser(String nombre_usuario, String tipo_usuario){

         if ( ! ((this.Usuarios_Administradores.contains(nombre_usuario)) || this.Usuarios_Comunes.contains(nombre_usuario))) {
             switch (tipo_usuario){

                 case "administrador":
                     this.Usuarios_Administradores.add(nombre_usuario);
                     break;


                 case "comun":
                     this.Usuarios_Comunes.add(nombre_usuario);
                     break;
             }
         }else {
             System.out.println("Usuario ya se encuentra registrado\n");
         }
    }


    public void Login(String nombre_usuario){

        if ("sin usuario".equals(this.usuario_logeado)) {

            if ((this.Usuarios_Administradores.contains(nombre_usuario))){
                this.usuario_logeado    = nombre_usuario;
                this.tipo_usuario       = "administrador";

            } else if (this.Usuarios_Comunes.contains(nombre_usuario)) {
                this.usuario_logeado    = nombre_usuario;
                this.tipo_usuario       = "comun";

            }else {
                System.out.println("Usuario no registrado\n");
            }

        }else {
            System.out.println("No es posible logear, dado que ya hay un usuario logeado \n");
        }
    }


    public void Logout(){

        if ( ! ("sin usuario".equals(this.usuario_logeado) ) ) {
            this.usuario_logeado    = "sin usuario";
            this.tipo_usuario       = "sin usuario";

        }else {
            System.out.println("Sin usuario logeado con anterioridad\n");
        }
    }

    @Override
    public String toString() {
        return "User_21091719_VarasVargas{" +
                "usuario_logeado='" + usuario_logeado + "\n" +
                ", tipo_usuario='" + tipo_usuario + "\n" +
                ", Usuarios_Administradores=" + Usuarios_Administradores + "\n" +
                ", Usuarios_Comunes=" + Usuarios_Comunes + "\n" +
                '}';
    }
}



