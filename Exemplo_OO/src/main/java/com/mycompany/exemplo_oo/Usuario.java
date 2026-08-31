/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_oo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Usuario {
    //DECLARAÇÃO DE ATRIBUTOS
    private String nome;
    private int idade;
    private String email;
    private String Telefone;
    
    //ENCAPSULAMENTO DOS ATRIBUTOS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    // CRIAR MÉTODO MOSTAR DADOS
    public void MostrarDados(){
        System.out.println("===Dados Usuário===");
        System.out.println("Nome Usuários: " + getNome()+ "\n" + "E-mail: " + getEmail() + "\n" + "Idade: " 
        + getIdade() + "\n" + "Telefone:" + getTelefone());
    }
    
      //CRIAR MÉTODO CADASTRAR DADOS
    public void cadastrarDados(){
     Scanner leia = new Scanner(System.in);
     System.out.println("Digite o nome: ");
     setNome(leia.nextLine());
     System.out.println("Digite a idade: ");
     setIdade(leia.nextInt());
     System.out.println("Digite o e-mail: ");
     setEmail(leia.next());
     System.out.println("Digite o telefone: ");
     setTelefone(leia.next());
     
    }
    
    
    
    
    
    
    
    
    
    
    
    
} 
