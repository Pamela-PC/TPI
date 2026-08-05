import java.util.Scanner;


public class idade{
    
    public static void main(String[] args){

        int idd, dias;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade");
        idd = leia.nextInt();

        dias = idd*365;

        System.out.println("A sua idade em dias equivale a: " +dias);
    }
}