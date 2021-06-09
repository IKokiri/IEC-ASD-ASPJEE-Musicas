package com.luiz.catalogo.service;

import java.util.List;
import com.luiz.catalogo.model.Musica;

public interface CatalogoService {
    List<Musica> findAll();
    Musica findById(long id);
    Musica save(Musica musica);
    void excluir(long id);
}

