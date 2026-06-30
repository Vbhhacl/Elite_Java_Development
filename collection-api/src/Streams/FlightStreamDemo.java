package Streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {
	public static void main(String[] args) throws Exception {
	    Stream<String> lines = Files.lines(Paths.get("src/Streams/Flights.txt"));
	    
	    List<Flight> flights = lines.map( line -> {
	        String[] record = line.split(",");
	        return new Flight (Integer.parseInt(record[0]),
	                record[1],record[2],record[3]);
	    }).collect(Collectors.toList());
	    
	    flights.forEach(System.out::println);
	   

	    // 1. print details of flight no 123
	    System.out.println("print details of flight no 123 : ");
	    flights.stream().filter(f -> f.getCode() == 123).forEach(System.out::println);
	    
	    // 2. print all flights by jet carrier
	    System.out.println("print all flights by jet carrier : ");
	    flights.stream().filter(f -> "jet".equalsIgnoreCase(f.getCarrier())).forEach(System.out::println);
	    
	    // 3. print flight going from pune to banglore
	    System.out.println("print flight going from pune to banglore : ");
	    flights.stream().filter(f -> "Pune".equals(f.getSource()) && "Banglore".equals(f.getDestination())).forEach(System.out::println);
	    
	    // 4. remove a flight no 920
	    System.out.println("remove a flight no 567 : ");
	    flights.removeIf(f -> f.getCode() == 567);
	    flights.stream().filter(f -> f.getCode() == 567).forEach(System.out::println);    

	}
	
}
