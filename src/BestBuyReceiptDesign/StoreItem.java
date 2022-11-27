package BestBuyReceiptDesign;
/**
 * Created by Wei on 11/5/18.
 */
public class StoreItem {
    private String itemCode;
    private String itemDescription;
    private double itemPrice;

    public StoreItem(String code, String descript, double price){
        this.itemCode = code;
        this.itemDescription  = descript;
        this.itemPrice = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void printItem(){
        System.out.println(itemDescription + ": " + itemCode + " $" + itemPrice);
    }
}
