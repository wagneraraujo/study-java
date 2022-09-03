public class Invoice {

    private int codeItem;
    private String description;
    private int qtd;
    private float priceUnit;

    public Invoice(int codeItem, String description, int qtd, float priceUnit) {

        this.setDescription(description);
        this.setCodeItem(codeItem);
        this.setPriceUnit(priceUnit);
        this.setQtd(qtd);

    }

    public double getInvoiceAmount() {
        return qtd * priceUnit;
    }


    public int getCodeItem() {
        return codeItem;
    }

    public void setCodeItem(int codeItem) {
        this.codeItem = codeItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if (qtd < 0) {
            this.qtd = 0;
        } else {
            this.qtd = qtd;
        }
    }

    public float getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit) {
        //this.priceUnit = priceUnit;
        if (priceUnit < 0) {
            this.priceUnit = 0;
        } else {
            this.priceUnit = priceUnit;
        }
    }
}
