package HW5.shop;

public class product {
	productType producttype;
	String productname;
	int price;
	boolean ForSale;
	product(String productname,productType producttype,int price,boolean ForSale) {
		this.producttype=producttype;
		this.productname=productname;
		this.price=price;
		this.ForSale=ForSale;
	}
	public productType getProducttype() {
		return producttype;
	}
	public void setProducttype(productType producttype) {
		this.producttype = producttype;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isForSale() {
		return ForSale;
	}
	public void setForSale(boolean isForSale) {
		this.ForSale = isForSale;
	}
	@Override
	public String toString() {
		return "[productname=" + productname+", producttype=" + producttype  + ", price=" + price
				+ ", ForSale=" + ForSale + "]";
	}
	
				
	

}
