package com.luiz.catalogo.repository;
import com.luiz.catalogo.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Musica, Long> {
    
}
