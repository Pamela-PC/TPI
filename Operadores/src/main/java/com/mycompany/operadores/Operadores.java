/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package com.mycompany.operadores;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Operadores {

    public static void main(String[] args) {
        
        double n1,n2, ad, sub, mult, div;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        n1 = leia.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = leia.nextDouble();
        
        ad = n1+n2;
        sub = n1-n2;
        mult = n1*n2;
        div = n1/n2;
        
        System.out.println("O resultado da adição de"+n1+"e"+n2+"é:"+ad);
        System.out.println("O resultado da subtração de"+n1+"e"+n2+"é:"+sub);
        System.out.println("O resultado da divisão de"+n1+"e"+n2+"é:"+div);
        System.out.println("O resultado da multiplicação de"+n1+"e"+n2+"é:"+mult);
        
        
    }
}
