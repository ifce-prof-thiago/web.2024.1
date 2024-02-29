package usuarios;

public record UsuarioSenha(String value) {
    public UsuarioSenha {
        if (value.length() < 6) {
            throw new RuntimeException("Nome deve ter no mínimo 6 caracteres");
        }
    }
}
