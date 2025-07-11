package challenge.forum.alura.dto;

public record CadastroTopicoDTO(
                                String titulo,
                                String mensagem,
                                String data_criacao,
                                String estado_topico,
                                String autor,
                                String curso ) {
}
