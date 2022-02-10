import java.util.List;

public class MainProduct {

	public static void main(String[] args) {
		
		
		List<Product> productos=List.of(new Product("Queso",2.0),new Product("Calamares",8.0),new Product("Tomate",9.0),new Product("Cereza",1.0));
		
		Double sumar = productos.stream().mapToDouble(l->l.getPrice()).sum();
		
		System.out.println(sumar);
				
	}

}
