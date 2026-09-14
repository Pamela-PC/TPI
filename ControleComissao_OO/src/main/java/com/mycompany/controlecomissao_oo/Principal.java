/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlecomissao_oo;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

   
    
    public static void main(String[] args) {
        
        ControleComissao contr = new ControleComissao();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao: \n 1- Nome \n 2- Salario Base \n 3- Valor Vendido \n 4- Calcular Comissão \n 0- Sair"));
            
            switch(op){
            case 1:
                contr.entrarNome();
                break;    
            case 2: 
                contr.entrarSalarioBase();
                break;
            case 3:
                contr.entrarValorVendido();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "O funcionario " + contr.getNome() + " teve salario final de: " + contr.calculoComissao());
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Finalizando");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao incorreta");
                break;
            }
          
        }while(op!=0);
    }
}
