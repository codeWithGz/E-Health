
package Classes;

public class UsuarioLogado {
    private static boolean isAdmin = false;

    public static boolean isAdministrador() {
        return isAdmin;
    }

    public static void setAdministrador(boolean isAdmin) {
        UsuarioLogado.isAdmin = isAdmin;
    }
}
