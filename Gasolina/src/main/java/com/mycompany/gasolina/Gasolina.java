/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gasolina;
import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class Gasolina {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double preco, val_pag, litros;
        
        preco = 6.49;
        
        System.out.println("Insira a quantidade de litros abastecida:");
        litros = leia.nextDouble();
        
        val_pag = litros*preco;
        
        System.out.printf("O valor a ser pago é: %.2f", val_pag);
        
    }
}
