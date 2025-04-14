package com.example.crudproject.repository;

import com.example.crudproject.model.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {
}
