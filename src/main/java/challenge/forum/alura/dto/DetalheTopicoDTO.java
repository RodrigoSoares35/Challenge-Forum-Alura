package challenge.forum.alura.dto;

import challenge.forum.alura.model.Topico;

public record DetalheTopicoDTO(
                               Long id,
                               String titulo,
                               String mensagem,
                               String data_criacao,
                               String estado_topico,
                               String autor,
                               String curso ) {

    public DetalheTopicoDTO(Topico topico){
        this(   topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getData_criacao(),
                topico.getEstado_topico(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
