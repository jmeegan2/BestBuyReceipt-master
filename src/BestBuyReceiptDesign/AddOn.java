package BestBuyReceiptDesign;

/**
 * Created by Wei on 11/5/18.
 */
public interface AddOn {
    public boolean applies(PurchasedItems items);
    public String getLines();
}
