import java.util.List;

public class ListaFuncional {

	public static void main(String[] args) {
		
		
		List<Integer> numeros = List.of(18,8,2,20,7,14,22,86,12);
		
		Long filtro =numeros.stream().filter(n->n>10).count();
		
		System.out.println(filtro);

	}

}
