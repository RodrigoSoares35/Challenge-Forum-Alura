package challenge.forum.alura.repository;

import challenge.forum.alura.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
