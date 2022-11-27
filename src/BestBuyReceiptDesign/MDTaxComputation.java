package BestBuyReceiptDesign;

/**
 * Created by Wei on 11/5/18.
 */
public class MDTaxComputation extends TaxComputation{
    @Override
    public double computeTax(PurchasedItems items, ReceiptDate date) {
        double tax;
        if((taxHoliday(date))&&(items.containsItem("1406"))){
            tax = 0;
        }
        else
            tax = 0.06;
        return tax;
    }

    @Override
    protected boolean taxHoliday(ReceiptDate date) {
        if(date.getMonth() == 8 && date.getDate() == 14||date.getDate() == 15||date.getDate() == 16||
                date.getDate()==17||date.getDate() ==18|| date.getDate() == 19 || date.getDate()==20){
            return true;
        }
        else
            return false;
    }

}
