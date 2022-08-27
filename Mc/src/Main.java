import java.util.Scanner;

public class Main {
    public static  void  main(String[] args){

        Mc objectMc = new Mc();
        Scanner reader = new Scanner(System.in);

        System.out.println("Write your weight");
        objectMc.weightPerson = reader.nextFloat();

        System.out.println("Write your Height");
        objectMc.heightPerson = reader.nextFloat();

        System.out.println("IMC: "+ objectMc.calculateIMC());
    }
}
