package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapStreamDemo {
	public static void main(String[] args) {
		Map<String,String> people = new HashMap<>();
		people.put("Polo","Pune");
		people.put("Millie","Mumbai");
		people.put("Deny","Delhi");
		
		people.values().stream().forEach(System.out::println);
		
		List<String>cities = people.values().stream().map(c->c.toUpperCase()).sorted().collect(Collectors.toList());
		
		cities.forEach(System.out::println);
		
		Map<String,List<String>> contacts = new HashMap<>();
		contacts.put("Frudo",Arrays.asList("1234-567889","34465-77879"));
		contacts.put("Sen",Arrays.asList("34667-322889","7654-47879","8989-89898"));
		contacts.put("Ben",Arrays.asList("22222-27889","8000-046879","54455-44553"));
		
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		
		System.out.println("--lucky numbers");

		//print all numbers containing 8
		//contacts.values().stream().filter(s->s.contains("8")).forEach(System.out::println);
		Set<String> lucky = contacts.values().stream().flatMap(Collection::stream).filter(n->n.contains("8")).collect(Collectors.toSet());
		
		lucky.forEach(System.out::println);
		
		//print all numbers removing -
		contacts.values().stream().flatMap(Collection::stream).map(s->s.replace("-","")).forEach(System.out::println);
	} 
}
