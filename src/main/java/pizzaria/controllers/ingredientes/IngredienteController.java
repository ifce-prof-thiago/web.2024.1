package pizzaria.controllers.ingredientes;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("ingredientes")
@RestController
public class IngredienteController {

    private final JdbcTemplate jdbcTemplate;

    public IngredienteController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping
    public void criarIngrediente(@RequestBody CriarIngredienteRequest request) {

        jdbcTemplate.update(
                "INSERT INTO ingrediente (id, nome) VALUES (?, ?)",
                UUID.randomUUID(),
                request.nome()
        );
    }
}
