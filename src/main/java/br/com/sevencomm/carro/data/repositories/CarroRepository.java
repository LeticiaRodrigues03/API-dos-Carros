package br.com.sevencomm.carro.data.repositories;

import br.com.sevencomm.carro.domain.models.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarroRepository extends JpaRepository<Carro, Long> {
    List<Carro> findByUserId(Long id);
}
