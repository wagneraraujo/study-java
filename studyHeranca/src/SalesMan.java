public class SalesMan extends Employee {

    private int totalItemsSales;
    private float commissionPerItems;

    public SalesMan(){
        super();
    }

    public float calcWages(){
        return super.getWages() + (this.commissionPerItems * totalItemsSales);
    }

    public int getTotalItemsSales() {
        return totalItemsSales;
    }

    public void setTotalItemsSales(int totalItemsSales) {
        this.totalItemsSales = totalItemsSales;
    }

    public float getCommissionPerItems() {
        return commissionPerItems;
    }

    public void setCommissionPerItems(float commissionPerItems) {
        this.commissionPerItems = commissionPerItems;
    }
}
