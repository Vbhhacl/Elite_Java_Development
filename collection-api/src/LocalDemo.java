import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {
	public static void main(String[] args) {
		
		//ResourceBundle bundle = ResourceBundle.getBundle("msgs");
		//ResourceBundle bundle = ResourceBundle.getBundle("msgs",Locale.FRANCE);
		
		ResourceBundle bundle = ResourceBundle.getBundle("msgs",Locale.of("ma"));
		
		System.out.println(bundle.getString("greeeting"));
		System.out.println(bundle.getString("messages"));
	}
}
