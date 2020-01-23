package product;

public class Productt {

private int productNo;
private String productName;
private int price;
private int quantity;



public Productt(int productNo, String productName, int price, int quantity) {
	super();
	this.productNo = productNo;
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
}
public int getProductNo() {
	return productNo;
}
public void setProductNo(int productNo)
{
	this.productNo = productNo;
}
public String getProductName() 
{
	return productName;
}
public void setProductName(String productName) 
{
	this.productName = productName;
}
public int getPrice() 
{
	return price;
}
public void setPrice(int price)
{
	this.price = price;
}
public int getQuantity()
{
	return quantity;
}
public void setQuantity(int quantity)
{
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Productt [productNo=" + productNo + ", productName=" + productName + ", price=" + price + ", quantity="
			+ quantity + "]";
}


}