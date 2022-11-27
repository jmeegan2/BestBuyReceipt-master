package BestBuyReceiptDesign;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;
import javax.swing.plaf.basic.BasicIconFactory;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by Wei on 11/5/18.
 */
public class BasicReceipt implements Receipt {
    private String storeHeader; // store name
    private String stateCode; // MD, DE, CA or MA
    private String phone; // store phone
    private String addr; // store address
    private String store_num; // store number



    private PurchasedItems items;
    private ReceiptDate date;
    private TaxComputation taxComputation;
    private static DecimalFormat df2 = new DecimalFormat("0.00#");


    //Alternate Constructor
    public BasicReceipt(PurchasedItems items){
        this.items = items;
    }

    //Set tax to specific state
    public void setTaxComputation(TaxComputation taxComputation){
        this.taxComputation = taxComputation;
    }
    //returns tax value
    public TaxComputation getTaxComputation(){
        return taxComputation;
    }
    //sets the current date
    public void setDate(ReceiptDate date){
        this.date = date;
    }
    //return subtotal cost of items
    public double subTotalCost(){
        return items.getTotalCost();
    }
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public void setStoreHeader(String storeInfo) {
        this.storeHeader = storeInfo;
    }

    public double setTax() {
        return subTotalCost()*taxComputation.computeTax(items,date);
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStore_num(String store_num) {
        this.store_num = store_num;
    }

    @Override
    public void prtReceipt() {
        System.out.println(storeHeader + "\n"+ store_num + " " +  addr + " " + stateCode + "\n" + phone);
        System.out.println("Item purchased on: " + date );
        items.printItems();
        System.out.println("Subtotal Cost: $" + df2.format(subTotalCost()));
        System.out.println("Tax: $" + df2.format(setTax()));
        System.out.println("Total Cost: $"+ df2.format(subTotalCost()+setTax()));
    }
}
