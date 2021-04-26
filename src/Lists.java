import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = new String[3];
		cars[0]= "Camaro";
		cars[1]= "F150";
		cars[2]= "Mustang";
		
		//List<String> reads as `list of String`
		List<String> sports = new ArrayList<String>();
		sports.add("Basketball");
		sports.add("Soccer");
		sports.add("Baseball");
		//iterate we use size()method an get() method to print
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		// enhance for loop
		for ( String sport:sports) {
			System.out.println(sport);
			
		}
		// create int we use Integer
		List<Integer> numbers = new ArrayList<Integer>();
		
		

	}

}
