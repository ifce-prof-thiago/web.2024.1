package application.usuarios;

public class Usuario {

    private UsuarioEmail email;
    private UsuarioSenha senha;

    public Usuario(UsuarioEmail email, UsuarioSenha senha) {
        this.email = email;
        this.senha = senha;
    }

    public String email() {
        return email.value();
    }

    public String senha() {
        return senha.value();
    }
}
