package challenge.forum.alura.dto;

import jakarta.validation.constraints.NotBlank;

public record AtualizarTopicoDTO(
                                 Long id,

                                 @NotBlank
                                 String titulo,

                                 @NotBlank
                                 String mensagem,

                                 String estado_topico,
                                 @NotBlank
                                 String autor,

                                 @NotBlank
                                 String curso ) {
}
