package avanade2025.projeto1.apirest_spring_boot.repository;

import avanade2025.projeto1.apirest_spring_boot.domain.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
}
