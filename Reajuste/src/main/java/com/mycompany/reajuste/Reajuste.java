/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajuste;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Reajuste {

    public static void main(String[] args) {
        
        Scanner leia =  new Scanner(System.in);
        
        double sal, Nsal, perc;
        
        System.out.println("Insira o valor do seu salário: ");
        sal = leia.nextDouble();
        
        System.out.println("Insira o percentual de reajuste do salário: ");
        perc = leia.nextDouble();
        
        Nsal = sal+(sal*perc)/100;
        
        System.out.printf("O valor do novo salário é: %.2f", Nsal);
    } 
}
