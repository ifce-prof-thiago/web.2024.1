package pizzaria.controllers;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class PizzaController {

    private final JdbcTemplate database;

    public PizzaController(JdbcTemplate database) {
        this.database = database;
    }

    //  Criar um método POST para salvar uma pizza no banco de dados
    // A pizza deve ter apenas o nome
    // Coloque o código aqui....


}
