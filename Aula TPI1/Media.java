import java.util.Scanner;

public class Media{

    public static void main(String[] args) {
        
        double m1, m2, n1, n2, n3, n4, n5, n6;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o Valor da Nota 1:");
        n1 = leia.nextInt();
        System.out.println("Digite o valor da Nota 2: ");
        n2 = leia.nextInt();
        System.out.println("Digite o valor da Nota 3: ");
        n3 = leia.nextInt();

        m1 = (n1+n2+n3)/3;
        
        
        System.out.println("Digite o valor da nota 4: ");
        n4 = leia.nextInt();
        System.out.println("Digite o valor da nota 5: ");
        n5 = leia.nextInt();
        System.out.println("Digite o valor da nota 6: ");
        n6 = leia.nextInt();

        m2 = (n4+n5+n6)/3;

        System.out.println("O valor da média 1 é:" +m1);
        System.out.println("O valor da média 2 é: " +m2);

       
    }

}