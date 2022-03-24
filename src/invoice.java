
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
