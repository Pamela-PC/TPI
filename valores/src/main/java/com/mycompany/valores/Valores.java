/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valores;
import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class Valores {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        String nome1, nome2, nome3;
        double vlr1, vlr_prod1, vlr2, vlr_prod2, vlr3, vlr_prod3, vlr_total;
        int qtd1, qtd2, qtd3;
        
        System.out.println("Insira o nome do primeiro produto: ");
        nome1 = leia.next();
        System.out.println("Insira o nome do segundo produto: ");
        nome2 = leia.next();
        System.out.println("Insira o nome do terceiro produto: ");
        nome3 = leia.next();
        
        System.out.println("Insira o valor do primeiro produto: ");
        vlr1 = leia.nextInt();
        System.out.println("Insira o valor do segundo produto: ");
        vlr2 = leia.nextInt();
        System.out.println("Insira o valor terceiro produto: ");
        vlr3 = leia.nextInt();
        
        System.out.println("Insira a quantidade do primeiro produto: ");
        qtd1 = leia.nextInt();
        System.out.println("Insira a quantidade do segundo produto: ");
        qtd2 = leia.nextInt();
        System.out.println("Insira a quantidade terceiro produto: ");
        qtd3 = leia.nextInt();
        
        vlr_prod1 = vlr1*qtd1;
        vlr_prod2 = vlr2*qtd2;
        vlr_prod3 = vlr3*qtd3;
        
        System.out.println("O valor total do produto 1 é: " +vlr_prod1);
        System.out.println("O valor total do produto 2 é: " +vlr_prod2);
        System.out.println("O valor total do produto 3 é: " +vlr_prod3);
                
        
        
    }
}
