import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("scott","tiger");
		map.put("jack","jill");
		map.put("polo","lili");
		map.put("jack","rose");
		
		System.out.println("Scott: "+map.get("scott"));
		System.out.println("Polo: "+map.get("polo"));
		System.out.println("Jack: "+map.get("jack"));
		
		//print all keys and values without manually feeding keys
		//for (String key : key.keySet())
		    //sysout(key+ ":" +map.get(key));
		//map.forEach((key,value) -> sys.out.println(key + ":" + value));
		
	     for (Entry<String, String> entry : map.entrySet())
	     {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	     }
	}
}
