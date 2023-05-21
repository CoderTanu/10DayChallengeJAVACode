package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductService {

	// By using Stream API start
	List<Product> products = new ArrayList<>();
	public void addProduct(Product p) {
	products.add(p);
	}
	
	//for getting all product
	public List<Product> getAllProduct(){
		return products;
	}
	
	//for getting the specific product
		public List<Product> getProduct(String name) {
			
		List<Product> pro=	products.stream()
			.filter(p -> p.getName().equals(name))
			.collect(Collectors.toList());
		
		return pro;
	}
		
	  //for getting the product with text
	  public List<Product>  getProductWithText( String text){
		  
		  
		  List<Product> product=products.stream()
					.filter(p -> (p.getName().toLowerCase()).contains(text.toLowerCase()) ||
							     (p.getTypeOfProduct().toLowerCase()).contains(text.toLowerCase())||
							     (p.getPlace().toLowerCase()).contains(text.toLowerCase()))
					.collect(Collectors.toList());
		  
		return product;
		}
	  
	  
	 //for getting product by searching place
	   public List<Product> getProductByPlace(String place){
		   List<Product> product=products.stream()
					.filter(p ->(p.getPlace().toLowerCase()).contains(place.toLowerCase()))
					.collect(Collectors.toList());
		   
		   return product;
	  }
	   
	   
	   //for getting product which is out of warranty 
	   public List<Product> getProductByOutOfWarranty(int year){
	 	  
		   
		   
		   List<Product> product=products.stream()
					.filter(p ->(p.getWarranty() == year))
					.collect(Collectors.toList());
		   
		   return product;
	 	 
	 	 }
	 	
		// By using Stream API end
		
//		//for getting the specific product
//		public Product getProduct(String name) {
//			
//			for(Product p:products) {
//				if(p.getName().equals(name)) {
//					return p;
//				}
//			}
//			return null;
//		}		
//  //for getting the product with text
//  public List<Product>  getProductWithText( String text){
//	  
//	  List<Product> pr = new ArrayList<>();
//	  String textdata= text.toLowerCase();
//	  for(Product p: products) {
//		  
//		  String name= p.getName().toLowerCase();
//		  String place=p.getPlace().toLowerCase();
//		  String type= p.getTypeOfProduct().toLowerCase();
//		  
//		  if(name.contains(textdata)|| place.contains(textdata)||type.contains(textdata)){
//			  pr.add(p);
//		 }
//	}
//	return pr;
//		
//	}	
//
//   //for getting product by searching place
//   public List<Product> getProductByPlace(String place){
//	  List<Product> produ = new ArrayList<>();
//	  String str=place.toLowerCase();
//	  for(Product p :products) {
//		  String placeValue =p.getPlace().toLowerCase();
//		 if( placeValue.contains(place)) {
//			 produ.add(p);
//		 }
//	  }
//	  return produ;
//  }  
// //for getting product which is out of warranty 
//  public List<Product> getProductByOutOfWarranty(int year){
//	  
//	  List<Product> prod = new ArrayList<>();
//	  
//	  for(Product p :products) {
//		  int yearvalue =p.getWarranty();
//		 if( yearvalue == year) {
//			 prod.add(p);
//		 }
//	  }
//	   return prod;
//	 }
//	
}
