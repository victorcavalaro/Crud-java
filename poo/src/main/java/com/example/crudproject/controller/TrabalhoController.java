package com.example.crudproject.controller;

import com.example.crudproject.model.Trabalho;
import com.example.crudproject.service.TrabalhoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabalhos")
public class TrabalhoController {

    private final TrabalhoService trabalhoService;

    public TrabalhoController(TrabalhoService trabalhoService) {
        this.trabalhoService = trabalhoService;
    }

    @GetMapping
    public ResponseEntity<List<Trabalho>> listarTrabalhos() {
        List<Trabalho> trabalhos = trabalhoService.findAll();
        return ResponseEntity.ok(trabalhos);
    }

    @PostMapping
    public ResponseEntity<Trabalho> criarTrabalho(@RequestBody Trabalho trabalho) {
        Trabalho novoTrabalho = trabalhoService.save(trabalho);
        return ResponseEntity.ok(novoTrabalho);
    }
}
