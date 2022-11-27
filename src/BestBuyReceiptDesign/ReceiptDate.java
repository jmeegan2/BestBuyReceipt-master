package BestBuyReceiptDesign;
/**
 * Created by Wei on 11/5/18.
 */
import java.util.Date;
public class ReceiptDate {
    private int month;
    private int date;
    private int year;

    public ReceiptDate(){
        this.month = 0;
        this.date = 0;
        this.year = 0;
    }

    public ReceiptDate(int month, int date, int year) {
        this.month = month;
        this.date = date;
        this.year = year;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    @Override
    public String toString(){
        return getMonth() + "/" + getDate() + "/" + getYear();
    }
}

