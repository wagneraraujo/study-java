import java.util.Scanner;

public class Main {
    public static  void  main(String[] args){

        Mc objectMc = new Mc();
        // Scanner reader = new Scanner(System.in);

				// Scanner reader = new Scanner(System.in);
		Scanner reader = new Scanner(System.in);
        System.out.println("Write your weight");
        objectMc.setWeightPerson(reader.nextFloat());

        System.out.println("Write your Height");
        objectMc.setHeightPerson(reader.nextFloat());

        System.out.println("IMC: "+ objectMc.calculateIMC());

    }
}
