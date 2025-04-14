package com.example.crudproject.service;

import com.example.crudproject.model.Pessoa;
import com.example.crudproject.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    // Injeção de dependência via construtor
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    // Cadastrar ou atualizar uma pessoa
    public Pessoa inserirPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    // Listar todas as pessoas
    public List<Pessoa> listarTodasPessoas() {
        return pessoaRepository.findAll();
    }

    // Buscar pessoa por ID
    public Pessoa buscarPessoaPorId(Long id) {
        Optional<Pessoa> pessoaOptional = pessoaRepository.findById(id);
        if (pessoaOptional.isPresent()) {
            return pessoaOptional.get();
        } else {
            throw new RuntimeException("Pessoa não encontrada.");
        }
    }

    // Deletar uma pessoa por ID
    public void deletarPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }

    // Método para aprovar uma pessoa (ainda não implementado)
    public Pessoa aprovarPessoa(Long id) {
        // Lógica de aprovação poderia ser implementada aqui
        throw new UnsupportedOperationException("Método 'aprovarPessoa' ainda não implementado.");
    }
}
