package pizzaria.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    private final JdbcTemplate database;

    public UsuarioController(JdbcTemplate database) {
        this.database = database;
    }

    @PostMapping
    public void criarUsuario(@RequestBody UsuarioRequest request) {
        database.update(
                "INSERT INTO usuario (email, senha) VALUES (?, ?)",
                request.email(),
                request.senha()
        );
    }

}
