package challenge.forum.alura.dto;

import jakarta.validation.constraints.NotBlank;

public record AtualizarTopicoDTO(
                                 Long id,

                                 @NotBlank
                                 String titulo,

                                 @NotBlank
                                 String mensagem,

                                 @NotBlank
                                 String data_criacao,


                                 boolean estado_topico,

                                 @NotBlank
                                 String autor,

                                 @NotBlank
                                 String curso ) {
}
