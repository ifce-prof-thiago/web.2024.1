public class Usuario {

    private String email;
    private String senha;

    public Usuario(String email, String senha) {

        if (!email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new RuntimeException("Email inválido");
        }

        if (senha.length() < 6) {
            throw new RuntimeException("Senha deve ter no mínimo 6 caracteres");
        }

        this.email = email;
        this.senha = senha;

    }

    public String email() {
        return email;
    }

    public String senha() {
        return senha;
    }
}
