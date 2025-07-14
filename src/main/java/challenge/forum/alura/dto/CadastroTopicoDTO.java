package challenge.forum.alura.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public record CadastroTopicoDTO(
                                @NotBlank
                                String titulo,

                                @NotBlank
                                String mensagem,

                                @NotBlank
                                String data_criacao,

                                @NotBlank
                                String estado_topico,

                                @NotBlank
                                String autor,

                                @NotBlank
                                String curso ) {
}
