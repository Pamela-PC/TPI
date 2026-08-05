import java.util.Scanner;

import java.util.Scanner;
public class ExemploScanner {
    public static void main(String[] args) {

        //declaração de variável
        int soma, num1,num2,sub, resto, mult;
        double div;


        //comando para leitura de dados pelo teclado
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número:");
        num1 = leia.nextInt();
        System.out.println("Digite outro número:");
        num2 = leia.nextInt();

        soma = num1+num2;
        sub = num1-num2;
        div = num1/num2;
        mult = num1*num2;
        resto = num1%num2;

        System.out.println("O resultado da soma é: " +soma);
        System.out.println("O resultado da subtração é: " +sub);
        System.out.println("O resultado da divisão é: " +div);
        System.out.println("O resultado da multiplicação é: " +mult);
        System.out.println("O resto da divisão dos números é" +resto);
    }
}
