package com.mycompany.controlecomissao_oo;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fatec-dsm2
 */
public class ControleComissao {
    
    private String nome;
    private double salarioBase;
    private double valorVendido;
    private double novoSalario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
    
    public void entrarNome(){
        
        setNome(JOptionPane.showInputDialog("Insira o nome do funcionário: "));
    
    }
        
    public void entrarSalarioBase(){
        
        setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário base: ")));
    
    }
    
    public void entrarValorVendido(){
        
        setValorVendido(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor vendido: ")));
    
    }
    
    public double calculoComissao(){
        
        setNovoSalario(((getValorVendido() *10)/100) + getSalarioBase());  
        return getNovoSalario();
        
    }
            
}
