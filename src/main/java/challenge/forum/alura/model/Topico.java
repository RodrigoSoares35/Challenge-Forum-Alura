package challenge.forum.alura.model;

import challenge.forum.alura.dto.CadastroTopicoDTO;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;



@Entity
@Data
@Table(name="topico",uniqueConstraints = @UniqueConstraint(columnNames = {"titulo", "mensagem"}))

public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String mensagem;

    private String data_criacao;
    private String estado_topico;
    private String autor;
    private String curso;


    public Topico(){

    }
    public Topico(@Valid CadastroTopicoDTO dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.data_criacao = dados.data_criacao();
        this.estado_topico = dados.estado_topico();
        this.autor = dados.autor();
        this.curso = dados.curso();

    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public String getEstado_topico() {
        return estado_topico;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }
}
