package pizzaria.models;

public record UsuarioEmail(String value) {
    public UsuarioEmail {

        if (!value.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new RuntimeException("Email inválido");
        }
    }
}
