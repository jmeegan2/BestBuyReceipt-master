package BestBuyReceiptDesign;

import java.util.*;
public class Main {

    public static final int min = 0;
    public static final int max = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PurchasedItems items = new PurchasedItems();
        ReceiptFactory receiptFactory = new ReceiptFactory();
        int choice;
        choice = menu(input, min, max);
        while (choice != 0) {
            ReceiptDate date;
            switch (choice) {
                //Case 1 get the current date from users.
                case 1:
                    items.clearReceipt();
                    int currentDate = 0;
                    int currentMonth = 0;
                    int currentYear = 0;
                    System.out.print("Enter the month: ");
                    currentMonth = getInt(input,1,12);
                    System.out.print("Enter the date: ");
                    currentDate = getInt(input,1,31);
                    System.out.print("Enter the year: ");
                    currentYear = getInt(input,1,9999);
                    receiptFactory.getDate(currentMonth,currentDate,currentYear);   //Set the current date in ReceiptFacotry Object
                    break;
                //Case 2 Ask user inputs.
                case 2:
                    generateMenuItem(items,input);
                    break;
                //Case 3 Prints out receipt.
                case 3:
                    Receipt receipt = receiptFactory.getReceipt(items);
                    receipt.prtReceipt();
                    break;
            }
            choice = menu(input, min, max);
        }
        System.out.println("Menu Terminated");


    }

    //Menu that displays the options.
    public static int menu(Scanner input, int min, int max) {
        int ans;
        System.out.println("\t--------------------------------------------------------\n" +
                "\t1 – Start New Receipt\n" +
                "\t2 – Add items to cart\n" +
                "\t3 – Display Receipt\n" +
                "\t0 - Terminate menu\n" +
                "\t--------------------------------------------------------\n");
        System.out.print("    Enter your choice: ");
        ;
        ans = getInt(input, min, max);
        return ans;
    }

    //Input validation for interger choices.
    public static int getInt(Scanner input, int min, int max) {
        while (!input.hasNextInt()) {
            System.out.print("Invalid, Please re-enter: ");
            input.next();
        }
        int choice = input.nextInt();
        if (choice < min || choice > max) {
            System.out.print("Invalid range.Please re-enter: ");
            choice = getInt(input, min, max);
        }
        return choice;
    }

    //method that generates hardcoded menu items.
    public static void generateMenuItem(PurchasedItems items,Scanner input) {
        int ans;
        System.out.println("    Add items below to your cart.");
        System.out.println("\t--------------------------------------------------------\n" +
                "\t1 – Camera $200 Item code:1406\n" +
                "\t2 – T-shirt $58 Item code:1065\n" +
                "\t3 – Computer $1,000 Item code:1087\n" +
                "\t0 - Continue to Checkout\n" +
                "\t--------------------------------------------------------\n");
        System.out.print("    Enter your choice: ");
        ans = getInt(input, min, max);

        if(ans == 1)
            items.addItem(new StoreItem("1406","Camera",200));
        else if(ans == 2)
            items.addItem(new StoreItem("1065","T-shirt",58));
        else
            items.addItem(new StoreItem("1087","Computer",1000));

    }
}
