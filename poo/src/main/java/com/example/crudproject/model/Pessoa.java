package com.example.crudproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nome;
    private double idade;
    private String civil = "solteiro";

    public int getId() {
        return id;
    }

    public String getnomeString() {
        return nome;
    }

    public double getidade() {
        return idade;
    }

    public String getcivil() {
        return civil;
    }

    public void setcivil(String civil) {
        this.civil = civil;
    }
}
