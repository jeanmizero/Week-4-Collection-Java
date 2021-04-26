
public class StringBulider {

	public static void main(String[] args) {
		// Concatenate no change
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		//String builder is mutable/no change/ continue change
		
		StringBuilder fullName = new StringBuilder("Sam");
		// append method
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		// charAt method
		System.out.println(fullName.charAt(5));
		//delete method
		System.out.println(fullName.deleteCharAt(5));
		//indexOf method
		System.out.println(fullName.indexOf("it"));
		//replace method
		System.out.println(fullName.replace(4, 9, "Thompson"));
	
	}

}
