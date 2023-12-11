package User_21091719_VarasVargas;

import java.util.ArrayList;
import java.util.List;

public class User_21091719_VarasVargas implements User_Interface_21091719_VarasVargas {

    /**
     * Atributo privado string, que contiene nombre de usuario logueado
     */
    private String usuario_logeado;

    /**
     * Atributo privado string, que contiene nombre de tipo de usuario
     */
    private String tipo_usuario;

    /**
     * Atributo privado List, que contiene lista de usuarios administradires
     */
    private List<String> Usuarios_Administradores;

    /**
     * Atributo privado List, que contiene lista de usuarios comunes
     */
    private List<String> Usuarios_Comunes;

    /**
     * <p>Funcion constructora, la cual realiza cracion de nuevo objeto User_21091719_VarasVargas </p>
     * @return User_21091719_VarasVargas
     */
    public User_21091719_VarasVargas() {
        this.usuario_logeado = "sin usuario";
        this.tipo_usuario = "sin usuario";
        this.Usuarios_Administradores = new ArrayList<>();
        this.Usuarios_Comunes = new ArrayList<>();
    }

    /**
     * <p> Funcion getter, que retorna usuario_logeado</p>
     * @return usuario_logeado
     */
    public String getUsuario_logeado() {
        return usuario_logeado;
    }

    /**
     * <p> Funcion getter, que retorna tipo_usuario</p>
     * @return tipo_usuario
     */
    public String getTipo_usuario() {
        return tipo_usuario;
    }

    /**
     * <p>Funcion la cual ingresa un nuevo usuario a la lista correspondiente, segun su tipo de usuario</p>
     * @param nombre_usuario
     * @param tipo_usuario
     */
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

    /**
     * <p>Funcion la cual realiza login de un usuario particular</p>
     * @param nombre_usuario
     */
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

    /**
     * <p>Funcion la cual desloguea a usuario logueado</p>
     */
    public void Logout(){

        if ( ! ("sin usuario".equals(this.usuario_logeado) ) ) {
            this.usuario_logeado    = "sin usuario";
            this.tipo_usuario       = "sin usuario";

        }else {
            System.out.println("Sin usuario logeado con anterioridad\n");
        }
    }


}



