package BestBuyReceiptDesign;

/**
 * Created by Wei on 11/5/18.
 */
public class HolidayGreeting implements AddOn,SecondaryHeading {
    public boolean applies(PurchasedItems items){
        return true;
    }
    public String getLines(){
        return "* Happy Holidays from BestBuy*";
    }
}
