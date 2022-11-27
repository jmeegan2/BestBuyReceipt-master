package BestBuyReceiptDesign;

/**
 * Created by Wei on 11/18/18.
 */
public class GeneralGreeting implements AddOn,SecondaryHeading{

    //When the date is one of the holiday, return true
    public boolean applies(PurchasedItems items){
        return true;
    }
    public String getLines(){
        return "* Thanks for shopping with BestBuy*";
    }
}
