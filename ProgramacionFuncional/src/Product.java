
public class Product {
	
	public String nombre;
	public Double precio;
	
	Product(String nombre, Double precio){
		this.nombre=nombre;
		this.precio=precio;	
	}
	
	public String getName() {
		return nombre;
	}
	
	public Double getPrice() {
		return precio;
	}
	
	public void setName(String name) {
		this.nombre = name;
	}
	
	public void setPrice(Double price) {
		this.precio = price;
	}
	
}
