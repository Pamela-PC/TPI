/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4_aula01;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio4_aula01 {

    public static void main(String[] args) {
        
        //declarar o scanner
        Scanner leia = new Scanner(System.in);
        
        double qtd, sal_m, sal_f;
        
        System.out.println("Informe o valor do salário mínimo: "); 
        sal_m = leia.nextDouble();
        
        System.out.println("Informe o valor do salário do funcionário: ");
        sal_f = leia.nextDouble();
        
        qtd = sal_m/sal_f;
        
        System.out.printf("A quantidade de salário(s) minímo(s) que o funcionário recebe é: %.2f",qtd);
    }
}
