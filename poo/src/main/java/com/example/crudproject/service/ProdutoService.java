package com.example.crudproject.service;

import com.example.crudproject.model.Trabalho;
import com.example.crudproject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository productRepository;

    public List<Trabalho> findAll() {
        return productRepository.findAll();
    }

    public Trabalho findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Trabalho save(Trabalho product) {
        return productRepository.save(product);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
