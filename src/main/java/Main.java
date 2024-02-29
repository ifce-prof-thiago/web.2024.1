import usuarios.Usuario;
import usuarios.UsuarioEmail;
import usuarios.UsuarioSenha;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                new UsuarioEmail("thiago@lar.ifce.edu.br88"),
                new UsuarioSenha("123456")
        );

        System.out.println(usuario.senha());
        System.out.println(usuario.email());


    }
}
