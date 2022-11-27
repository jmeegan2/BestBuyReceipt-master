package BestBuyReceiptDesign;

/**
 * Created by Wei on 11/5/18.
 */
public class Coupon100Get10Percent implements AddOn,Coupon{

    //If items' total cost is more than 100 dollars, then applies method will return true
    public boolean applies(PurchasedItems items){
        if(items.getTotalCost() >= 100){
            return true;
        }
        return false;
    }
    public String getLines(){
        return "Coupon with 10% of next purchase";
    }
}
