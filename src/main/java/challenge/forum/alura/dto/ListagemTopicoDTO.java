package challenge.forum.alura.dto;

import challenge.forum.alura.model.Topico;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ListagemTopicoDTO(
                                Long id,
                                String titulo,
                                String mensagem,
                                LocalDate data_Criacao,
                                String estado_topico,
                                String autor,
                                String curso ) {

    public ListagemTopicoDTO(Topico topico){
        this(   topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getData_Criacao(),
                topico.getEstado_topico(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
