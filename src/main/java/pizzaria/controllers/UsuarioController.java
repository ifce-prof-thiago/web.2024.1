package pizzaria.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {


    @Autowired
    private JdbcTemplate database;

    @PostMapping
    public void criarUsuario(@RequestBody UsuarioRequest request) {
        database.update(
                "INSERT INTO usuario (email, senha) VALUES (?, ?)",
                request.email(),
                request.senha()
        );
    }

    @PutMapping
    public void atualizarUsuario() {
        System.out.println("Deve ATUALIZAR um usuário");
    }

    @DeleteMapping
    public void deletarUsuario() {
        System.out.println("Deve apagar um usuário");
    }

    @GetMapping
    public void listarUsuarios() {
        System.out.println("Deve listar usuários");
    }

}
