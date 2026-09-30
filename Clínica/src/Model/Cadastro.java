/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Cadastro {
    
    private final Conexao con = new Conexao();
    
    private String nomePaciente;
    private int codigo;
    private String endereco;
    private String complemento;
    private String rg;
    private String cpf;
    private String nascimento;

   
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    public void cadastrar(){
        String sql;
        sql= "Insert into cadastroPaciente(nome, codigo, endereco, complemento, rg, cpf, dataNascimento)values"+ "( "
                + "" + getNomePaciente()+ " ,'" + getCodigo()+ "' ,'" + getEndereco()+ "', '" + getComplemento()+ "', '" + getRg()+ "', '" + getCpf()+ "', '" + getNascimento()+ "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Gravado com Sucesso...");              
    }
    
    
     public void excluir(){
        String sql;
        sql = "Delete FROM cadastroPaciente WHERE codigo=" +getCodigo()+ "";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Excluido com sucesso...");
        
       }
    public void Alterar(){
        String sql;
        sql = "UPDATE cadastroPaciente set nome='" + getNomePaciente()+   "' ,codigo= '" + getCodigo()+ "' ,endereco= '" + getEndereco()+  "' ,complemento= '" + getComplemento()+ "' ,rg= '" 
                + getRg()+ "' ,cpf= '" + getCpf()+  "' ,dataNascimento= '" + getNascimento() +    "' WHERE codigo='" +this.getCodigo()+"' ";
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Alterado com sucesso...");
    }
    
    public ResultSet Limpar()
    {
      
    }
    
    
 
    
    
}
