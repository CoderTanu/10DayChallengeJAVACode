package Day2;

public class Product {
	
	private String name;
	private String typeOfProduct;
	private String place;
	private int warranty;
	
	public Product() {
		
	}
	
	
	public Product(String name, String typeOfProduct, String place, int warranty) {
		this.name = name;
		this.typeOfProduct = typeOfProduct;
		this.place = place;
		this.warranty = warranty;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTypeOfProduct() {
		return typeOfProduct;
	}


	public void setTypeOfProduct(String typeOfProduct) {
		this.typeOfProduct = typeOfProduct;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public int getWarranty() {
		return warranty;
	}


	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", typeOfProduct=" + typeOfProduct + ", place=" + place + ", warranty="
				+ warranty + "]";
	}
	
	
	
	
	
	

}
