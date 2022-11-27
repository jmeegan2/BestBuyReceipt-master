package BestBuyReceiptDesign;

/**
 * Created by Wei on 11/5/18.
 */
public class Decorator implements Receipt {
    private Receipt trailer;

    public Decorator(Receipt r){
        trailer = r;
        }
    public void callTrailer(){
        trailer.prtReceipt();
    }

    public void prtReceipt(){
        callTrailer();
    }
}
