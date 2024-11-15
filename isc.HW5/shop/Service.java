package HW5.shop;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
public class Service {
	private static final Logger logger = Logger.getLogger(LogConcept.class.getName());
	private static List<product> products;
	static {
		product fridge = new product("fridge",productType.HomeStaff,120000,true);
		product Microwave = new product("Microwave",productType.HomeStaff,120000,false);
		product phone = new product("phone",productType.Digital,120000,true);
		product flash = new product("flash",productType.Digital,120000,true);
		product skirt = new product("skirt",productType.Clothes,120000,false);
		product shirt = new product("shirt",productType.Clothes,120000,true);
		product oven = new product("oven",productType.HomeStaff,120000,false);
		product headphone = new product("headphone",productType.Digital,120000,false);
		products = List.of(fridge,oven,phone,flash,shirt,skirt,headphone,Microwave);
	}
	public static void PrintList() {
		products.stream()
		.forEach(t->System.out.println(t));	
			
	}
	public static List <product> DigitalProducts(productType pt) throws ProductNotFoundException {
		List <product> customProduct;
		customProduct = products.stream()
				.filter(t->t.producttype==pt).collect(Collectors.toList());
		
		if( customProduct.size() == 0 ) {
			logger.warning("list empty");
			throw new ProductNotFoundException("The list is empty");}
		return customProduct;
	}
	
	public static void PrintSaleProducts() {
		System.out.println("for sale:");
		products.stream()
				.filter(t->t.isForSale()==true).forEach(t->System.out.println(t));
		
		products.stream()
		.filter(t-> t.productname.equals("Microwave")).forEach(t->System.out.println(t));		
		
	}
	

}
