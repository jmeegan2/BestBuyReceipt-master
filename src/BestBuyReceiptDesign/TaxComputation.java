package BestBuyReceiptDesign;

/**
 * Created by Wei on 11/5/18.
 */
public abstract class TaxComputation{
    public abstract double computeTax(PurchasedItems items, ReceiptDate date);
    protected abstract  boolean taxHoliday(ReceiptDate date);
}
