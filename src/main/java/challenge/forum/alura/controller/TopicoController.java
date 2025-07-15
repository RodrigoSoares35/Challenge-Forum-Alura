package challenge.forum.alura.controller;

import challenge.forum.alura.dto.AtualizarTopicoDTO;
import challenge.forum.alura.dto.CadastroTopicoDTO;
import challenge.forum.alura.dto.ListagemTopicoDTO;
import challenge.forum.alura.model.Topico;
import challenge.forum.alura.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
  public Page<ListagemTopicoDTO> listar(@PageableDefault(size = 10, sort = ("titulo")) Pageable paginacao) {
    return repository.findAll(paginacao).map(ListagemTopicoDTO::new);

  }

  @GetMapping("/{id}")
  @Transactional(readOnly = true)
  public ResponseEntity<ListagemTopicoDTO> detalhe(@PathVariable Long id) {
    Optional<Topico> topico = repository.findById(id);
    return topico
            .map(t -> ResponseEntity.ok(new ListagemTopicoDTO(t)))
            .orElseGet(() -> ResponseEntity.notFound().build());

  }
  @PutMapping
  @Transactional
  public void atualizar(@RequestBody @Valid AtualizarTopicoDTO dados) {
    var topico = repository.getReferenceById(dados.id());
    topico.atualizarInformacoes(dados);
  }

  // ATUYALIZAR PARA FALSE
//  @DeleteMapping("/{id}")
//  @Transactional
//  public void excluir(@PathVariable Long id) {
//    var topico = repository.getReferenceById(id);
//    topico.excluir();
//  }

  // DELETA DO BANCO
  @DeleteMapping("/{id}")
  @Transactional
  public void excluir(@PathVariable Long id) {
    repository.deleteById(id);

  }
}



