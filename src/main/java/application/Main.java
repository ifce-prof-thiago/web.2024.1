package application;

import application.usuarios.Usuario;
import application.usuarios.UsuarioEmail;
import application.usuarios.UsuarioSenha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @RestController
    public class UsuarioController {

        @RequestMapping("usuarios")
        public void ok(String email, String senha) {

            Usuario u = new Usuario(
                    new UsuarioEmail(email),
                    new UsuarioSenha(senha)
            );

            System.out.println(u.email());
            System.out.println(u.senha());

        }

    }
}
