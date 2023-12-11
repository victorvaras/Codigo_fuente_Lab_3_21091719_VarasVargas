package User_21091719_VarasVargas;

public interface User_Interface_21091719_VarasVargas {

    /**
     * <p>Funcion la cual ingresa un nuevo usuario a la lista correspondiente, segun su tipo de usuario</p>
     * @param nombre_usuario
     * @param tipo_usuario
     */
    public void AddUser(String nombre_usuario, String tipo_usuario);

    /**
     * <p>Funcion la cual realiza login de un usuario particular</p>
     * @param nombre_usuario
     */
    public void Login(String nombre_usuario);

    /**
     * <p>Funcion la cual desloguea a usuario logueado</p>
     */
    public void Logout();

}
