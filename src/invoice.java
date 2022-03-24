// A class called Invoice that a hardware store might use to represent
//an invoice for an item sold at the store. An Invoice that includes four pieces of information as
//instance variables—a part number (type String), a part description (type String), a quantity of the
//item being purchased (type int) and a price per item (double).
// the class have a constructor
//that initializes the four instance variables.
// Provide a set and a get method for each instance variable.
//In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e
//multiplies the quantity by the price per item), then returns the amount as a double value. If the
//quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0
//Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities

public class invoice {

//instance variable
private String partNumber;
private String goodsDescription;
private int quantity;
private double pricePerGoods;

//constructor
public invoice (String partNumber,String goodsDescription,int quantity,double pricePerGoods)
{
    this.partNumber = partNumber;//connect to instance variable partNumber

    this.goodsDescription = goodsDescription;//connect to instance variable partNumber

    if (quantity > 0)
    this.quantity = quantity;

    if (pricePerGoods > 0.00)
        this.pricePerGoods = pricePerGoods;
}
//set and get method for partnumber
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

//set and get method of goodsdescription
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }
//set and get method for quantity
    public void setQuantity(int quantity) {
    if (quantity > 0)
    this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
   }

//set and get method for pricepergoods
    public void setPricePerGoods(double pricePerGoods) {
    if (pricePerGoods > 0.00)
    this.pricePerGoods = pricePerGoods;
    }

    public double getPricePerGoods() {
        return pricePerGoods;
    }

    //method Getinvoice
    public double Getinvoice() {
     return quantity * pricePerGoods;
    }


}
