// import java.util.Scanner;

public class Products {

    public static void main(String[] args){
        String nameProduct;
        float priceCost;
        float priceSells;
				float otherPrice;

        float totalCost = 0;
        float totalSells = 0;
        // Scanner reader = new Scanner(System.in);
				Scanner reader = new Scanner(System.in)

        	int i ;
        for ( i = 0;i < 2; i++){
            System.out.println("Write product name");
            nameProduct = reader.nextLine();

            System.out.println("Write price cost of product");
            priceCost = reader.nextFloat();

            System.out.println("Write price for sells product");
            priceSells = reader.nextFloat();
            
            totalCost = totalCost + priceCost;
            totalSells = totalSells + priceSells;

            if(priceSells == priceCost){
                System.out.println("The prices are: no gain and no harm ");
            }else{

                if(priceCost > priceSells){
                    System.out.println("You have damage");
                }
                else{
                    System.out.println("You have profit ");
                }
            }

            System.out.println(nameProduct + " price de cost: " + priceCost + ", price sells: " + priceSells);
        }

        System.out.println("The average of price coast and:" + (totalCost / i));
        System.out.println("The average of price sells and:" + (totalSells / i));
    }
}
