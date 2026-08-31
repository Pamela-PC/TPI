/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo1_java;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo1_Java {

    public static void main(String[] args) {
        //Comando para dar entrada de Dados
        Scanner leia = new Scanner(System.in);
        
        //Declarar variáveis
        
        double n1,n2,m;
        String aluno;
        
        //Comando para mostrar mensagem
        System.out.println("Digite o nome do aluno: ");
        aluno = leia.next();
        System.out.println("Digite a primeira nota: ");
        n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextDouble();
        
        m = (n1+n2)/2;
        
        System.out.println("A média do aluno" +aluno+ "é" +m);
    }
}
