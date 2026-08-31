/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produto_pagamento;
import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class Produto_pagamento {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        String nomeProduto;
        int quant;
        double preco_uni, total;
        
        System.out.println("Insira o nome do produto: ");
        nomeProduto = leia.next();
        
        System.out.println("Insira a quantidade de produtos: ");
        quant = leia.nextInt();
        
        System.out.println("Insisra o preço: ");
        preco_uni = leia.nextDouble();
        
        total = preco_uni*quant;
        
        System.out.printf("Ao comprar o(a)"+nomeProduto+", você irá pagar: %.2f", total);
    }
}
