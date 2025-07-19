package challenge.forum.alura.model;

import challenge.forum.alura.dto.AtualizarTopicoDTO;
import challenge.forum.alura.dto.CadastroTopicoDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;


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

    @CreationTimestamp
    @Column(name = "data_criacao", updatable = false)
    private LocalDate data_Criacao;

    private String estado_topico;
    private String autor;
    private String curso;


    public Topico(){

    }
    public Topico(@Valid CadastroTopicoDTO dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
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

    public String getEstado_topico() {
        return estado_topico;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public LocalDate getData_Criacao() {
        return data_Criacao;
    }

    public void atualizarInformacoes(@Valid AtualizarTopicoDTO dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }

        if (dados.estado_topico() != null) {
            this.estado_topico = dados.estado_topico();
        }

        if (dados.autor() != null) {
            this.autor = dados.autor();
        }
        if (dados.curso() != null) {
            this.curso = dados.curso();
        }

    }

}
