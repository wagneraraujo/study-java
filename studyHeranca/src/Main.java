import java.util.Date;

public class Main {

    public static void main(String[] args){
        SalesMan sellsMan = new SalesMan();
        sellsMan.setName("Wagner");
        sellsMan.setWages(10000.0f);
        sellsMan.setCpf("02585415800");
        sellsMan.setBirthday(new Date());
        sellsMan.setCommissionPerItems(8);
        sellsMan.setTotalItemsSales(6);

        System.out.println("The salary of " + sellsMan.getName() + " is :"+ sellsMan.calcWages() );


//        sellsMan.calcWages();




    }
}
