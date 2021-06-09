package com.luiz.catalogo.service.serviceimpl;

import java.util.List;

import com.luiz.catalogo.model.Musica;
import com.luiz.catalogo.repository.CatalogoRepository;
import com.luiz.catalogo.service.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogoServiceImpl implements CatalogoService{

    @Autowired    
    CatalogoRepository catalogoRepository;

    @Override
    public List<Musica> findAll() {
        return catalogoRepository.findAll();
    }

    @Override
    public Musica findById(long id) {
        // TODO Auto-generated method stub
        return catalogoRepository.findById(id).get();
    }

    @Override
    public Musica save(Musica musica) {
        // TODO Auto-generated method stub
        return catalogoRepository.save(musica);
    }

    @Override
    public void excluir(long id) {
        // TODO Auto-generated method stub
        catalogoRepository.deleteById(id);
        
    }
    
}
