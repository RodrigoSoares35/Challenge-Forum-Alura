package challenge.forum.alura.model;

import challenge.forum.alura.dto.CadastroTopicoDTO;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;

@Entity
@Data
@Table(name="topico")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private String data_criacao;
    private String estado_topico;
    private String autor;
    private String curso;

    public Topico(@Valid CadastroTopicoDTO dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.data_criacao = dados.data_criacao();
        this.estado_topico = dados.estado_topico();
        this.autor = dados.autor();
        this.curso = dados.curso();

    }
}
