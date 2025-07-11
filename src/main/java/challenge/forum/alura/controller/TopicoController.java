package challenge.forum.alura.controller;

import challenge.forum.alura.dto.CadastroTopicoDTO;
import challenge.forum.alura.dto.ListagemTopicoDTO;
import challenge.forum.alura.model.Topico;
import challenge.forum.alura.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

  @GetMapping
  public Page<ListagemTopicoDTO> listar(@PageableDefault(size = 10, sort=("titulo")) Pageable paginacao){
    return repository.findAll(paginacao).map(ListagemTopicoDTO::new);

  }

}



