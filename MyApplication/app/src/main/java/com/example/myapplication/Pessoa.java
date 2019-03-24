package com.example.myapplication;

public class Pessoa {
    String nome;
    String email;
    String telefone;

    Pessoa(){
        this.nome="";
        this.email="";
        this.telefone="";
    }

    Pessoa(String nome, String email, String telefone){
        this.nome=nome;
        this.email=email;
        this.telefone=telefone;

    }
}
