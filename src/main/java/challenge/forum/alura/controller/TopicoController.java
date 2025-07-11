package challenge.forum.alura.controller;

import challenge.forum.alura.dto.CadastroTopicoDTO;
import challenge.forum.alura.model.Topico;
import challenge.forum.alura.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topico")
public class TopicoController {

  @Autowired
  private TopicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroTopicoDTO dados) {
        repository.save(new Topico(dados));
    }

}



