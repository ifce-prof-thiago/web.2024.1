package pizzaria.controllers.tamanho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("tamanhos")
@RestController
public class TamanhoController {

    private final JdbcTemplate jdbcTemplate;

    public TamanhoController(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping
    public void criarTamanho(@RequestBody CriarTamanhoRequest request) {

        jdbcTemplate.update(
                "INSERT INTO tamanho (id, nome, valor) VALUES (?, ?, ?)",
                UUID.randomUUID(),
                request.nome(),
                request.valor()
        );

    }
}
