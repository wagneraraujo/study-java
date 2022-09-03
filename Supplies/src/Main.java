public class Main {
    public static void main(String[] args){

        Invoice inv = new Invoice(01,"Phone",3,680.99f);
        System.out.println("Valor = "+ inv.getInvoiceAmount());
    }
}
