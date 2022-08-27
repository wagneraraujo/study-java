import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner leitorScanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's'){
            System.out.println("Dgite um numero8");
            int numero = leitorScanner.nextInt();
            if(numero == 0){
                System.out.println("O numero e zero");
            }
            else{
                if(numero > 0){
                    System.out.println("O número e maior");
                }
                else{

                    System.out.println("O número e menor que zero");
                }
            }

            System.out.println("Deseja sontinuar, S ou N?");
            desejaContinuar = leitorScanner.next().charAt(0);
        }

    }
}
