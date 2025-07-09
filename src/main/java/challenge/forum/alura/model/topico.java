package challenge.forum.alura.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="topico")
public class topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String titulo;
    private String mensagem;
    private String data_criacao;
    private String estado_topico;
    private String autor;
    private String curso;
}
