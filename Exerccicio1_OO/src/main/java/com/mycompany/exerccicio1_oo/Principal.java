/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerccicio1_oo;

import javax.swing.JOptionPane;
/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
      //Instanciar objeto - cli da classe Cliente
      Cliente cli = new Cliente();
      //Dê o rg para passar por parâmetro
      String rg = JOptionPane.showInputDialog("Digite RG: ");
      //chama o método cadastrar passando o parÂmetro rg
      cli.cadastrarCliente(rg);
      
      System.out.println(cli.listarCliente());
      //Mostrar mensagens retornando os dados do método listar
      JOptionPane.showMessageDialog(null, cli.listarCliente());
    }
}
 