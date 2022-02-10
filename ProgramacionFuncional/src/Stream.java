import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Stream {

	public static void main(String[] args) {
		
		List<String> personas = new ArrayList<String>();
		
		personas.add("Juan");
		personas.add("Pepe");
		personas.add("Olga");
		
		
		
		
		List<String> list = personas.stream().filter(p->p.endsWith("n")).collect(Collectors.toList());
		System.out.println(list);
		
		
		DoubleStream stream = DoubleStream.of(5.2, 4.2, 6.3).map(p->p +2.5);
		
		stream.forEach(System.out::println);
		
		
	}

}
