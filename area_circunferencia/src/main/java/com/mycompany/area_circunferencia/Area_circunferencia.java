/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_circunferencia;
import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class Area_circunferencia {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double raio, PI, circ;
        
        System.out.println("Insira o valor do raio da circunferência: ");
        raio = leia.nextDouble();
        
        
       circ = (3.14*(raio*raio));
       
        System.out.printf("A área da cricunferência é igual a: %.2f", circ);
    }
}
