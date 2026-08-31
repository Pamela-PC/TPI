/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_perimetro;
import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class Area_perimetro {

    public static void main(String[] args) {
        
     Scanner leia = new Scanner(System.in);
    
     double lado_A, lado_B, per, area;
     
        System.out.println("Insira o valor do lado A do retângulo: ");
        lado_A = leia.nextDouble();
        
        System.out.println("Insira o valor do lado B do retângulo: ");
        lado_B = leia.nextDouble();
        
        per = 2*lado_A + 2*lado_B;
        area = lado_A*lado_B;
        
        System.out.printf("A área do retângulo é igual a: %.2f",area);
        System.out.printf(" e o perímetro do retâgulo e igual a: %.2f",per);
    }
}
