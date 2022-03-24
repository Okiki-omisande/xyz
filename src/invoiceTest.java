//this program test the capabilities of class invoice
import java.util.Scanner;

public class invoiceTest {
    public static void main(String[] args) {
        invoice Apple = new invoice("avjgw","Mac book laptop", +0,+3000.00);

        //initial value
        System.out.printf("Applestore initial invoice details:%s, %s, %d, %.2f%n%n", Apple.getPartNumber(),Apple.getGoodsDescription(),Apple.getQuantity(),Apple.getPricePerGoods());

        Scanner input = new Scanner(System.in);

        System.out.println("Your AppleStore order");
        System.out.printf("item ordered for = %s%n", Apple.getGoodsDescription());
        System.out.printf("order code = %s%n%n", Apple.getPartNumber());
        System.out.println("please enter quantity:");
        int Quantity = input.nextInt();
        Apple.setQuantity(Quantity);

        System.out.printf("total price =$%.2f%n", Apple.Getinvoice());
        System.out.printf("Please pay $%.2f", Apple.Getinvoice());
    }
}