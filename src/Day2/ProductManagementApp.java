package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagementApp {

	public static void main(String[] args) {
		
		
		ProductService service = new ProductService();
		
		service.addProduct( new Product("Asus Vivobook", "Laptop", "bed", 2021));
		service.addProduct( new Product("Dell", "Laptop", "table", 2022));
		service.addProduct( new Product("MacBook", "Laptop", "lightgreen table",2024));
		service.addProduct( new Product("Dell", "Mouse", "Brown table", 2022));
		service.addProduct( new Product("MacBook", "Tablet", "desk", 2025));
		service.addProduct( new Product("Boats", "Bluetooth", "desk", 2021));
		service.addProduct( new Product("Logitech", "Keyboard", "white table", 2023));
		service.addProduct( new Product("Asus", "Gaming Laptop", "table", 2023));
		service.addProduct( new Product("RealMe", "inverter AC", "wall", 2022));
		service.addProduct( new Product("LG", "Refigerator", "Black", 2026));
		service.addProduct( new Product("LG", "TV", "Brown table", 2023));
		service.addProduct( new Product("HP", "Laptop", "Grey table", 2023));
		service.addProduct( new Product("Dell", "Laptop", "white table", 2021));
		service.addProduct( new Product("Redmi", "Phone", "Brown table", 2022));
		service.addProduct( new Product("Asus", "Phone", "Green table", 2022));
		
		
		
		

	    //for getting all product
		List<Product> products =service.getAllProduct();
		for(Product p :products) {
	    System.out.println(p);
		}
		//for getting the specific product
		System.out.println("****************************************************************************");
	    System.out.println("A Particular product");
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Name of the Product:");
	    String name =sc.next();
		List<Product> p=service.getProduct(name);
    	System.out.println(p);
    	
    	//for getting the product with text
    	System.out.println("****************************************************************************");
    	System.out.println("A particular text");
    	System.out.println("Enter the Place or name or type of the Product:");
 	    String place =sc.next();
    	List<Product> datau=service.getProductWithText(place);
	    System.out.println(datau);
    	
	    //for getting product by searching place
    	System.out.println("****************************************************************************");
    	System.out.println("Enter the Place of the Product:");
 	    String place1 =sc.next();
    	List<Product> prodSearch = service.getProductByPlace(place1);
    	System.out.println(prodSearch);
    	
    	//for getting product which is out of warranty 
    	System.out.println("****************************************************************************");
    	System.out.println("Enter the Warranty of the Product:");
 	    int year =sc.nextInt();
        List<Product> prodoutOfWarranty = service.getProductByOutOfWarranty(year);
    	System.out.println(prodoutOfWarranty);

	}

}
