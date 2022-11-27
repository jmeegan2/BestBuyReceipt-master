package BestBuyReceiptDesign;

/**
 * Created by Wei on 11/5/18.
 */
public class PreDecorator extends Decorator {

    private AddOn a;
    public PreDecorator(AddOn a, Receipt r){
        super(r);
        this.a = a;
    }


    @Override
    public void prtReceipt() {
        System.out.println(a.getLines());
        callTrailer();
    }
}
