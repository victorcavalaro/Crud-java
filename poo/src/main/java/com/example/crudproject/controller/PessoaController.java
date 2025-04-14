package com.example.crudproject.controller;

import com.example.crudproject.model.Pessoa;
import com.example.crudproject.service.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
publicorcamento PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public ResponseEntity<Pessoa> criarPessoa(@RequestBody Pessoa pessoa) {
        Pessoa novaPessoa = pessoaService.insertPessoa(pessoa);
        return ResponseEntity.ok(novaPessoa);
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> listarPessoas() {
        return ResponseEntity.ok(pessoaService.selectAllPessoa());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id) {
        Pessoa pessoa = pessoaService.selectPessoaById(id);
        return ResponseEntity.ok(pessoa);
    }

    @PutMapping("/{id}/aprovar")
    public ResponseEntity<Pessoa> aprovarPessoa(@PathVariable Long id) {
        Pessoa pessoaAprovada = pessoaService.aprovarPessoa(id);
        return ResponseEntity.ok(pessoaAprovada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        pessoaService.deletarPessoa(id);
        return ResponseEntity.noContent().build();
    }
}
