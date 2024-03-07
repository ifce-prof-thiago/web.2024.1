package pizzaria.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @PostMapping
    public void criarUsuario() {
        System.out.println("Deve criar um novo usuário");
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
