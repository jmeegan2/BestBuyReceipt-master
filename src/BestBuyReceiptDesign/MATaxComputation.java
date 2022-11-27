package BestBuyReceiptDesign;

/**
 * Created by Wei on 11/13/18.
 */
public class MATaxComputation extends TaxComputation {
    @Override
    public double computeTax(PurchasedItems items, ReceiptDate date) {
        double tax;
        //if items contain item code with 1406 and it is in tax holiday, return 0.
        if((taxHoliday(date))&&(items.containsItem("1406"))){
            tax = 0;
        }
        else
            tax = 0.0625;
        return tax;
    }

    @Override
    protected boolean taxHoliday(ReceiptDate date) {
        if(date.getMonth() == 8 && date.getDate() == 11 || date.getDate() == 12){
            return true;
        }
        else
            return false;
    }
}
