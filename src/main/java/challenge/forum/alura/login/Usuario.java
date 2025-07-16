package challenge.forum.alura.login;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
