/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculo_media;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        
       Mediaa med = new Mediaa();
       
       int op;
       
       //Comando Repetição DO-WHILE
       
       do{
       op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção \n 1 - Inseir notas \n 2 - Calcular média \n 3 -  Verificar Situação \n 0- Sair"));
       
       switch(op){
               case 1:
                   med.inserirNotas();
                   break;
               case 2:
                   JOptionPane.showMessageDialog(null, med.calcularMedia());
                   break;
               case 3:
                   med.verificarSituacao();
                   break;
               case 0:
                   JOptionPane.showMessageDialog(null, "Saindo do Sistema");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opção Incorreta");
                   break;
                }
       }
       while(op!=0);
       
       }
    }
