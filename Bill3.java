// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
	    String name2 = args[1]; 
		String name3 = args[2];  
		double bill = Double.parseDouble(args[3]);

		if (bill % 3 != 0) {
			bill = (bill / 3)+ 1;
		} else {
			bill = bill / 3;
		}
		int billRoundUp = (int) bill;
		double finalBill = (double) billRoundUp;

		
		
		System.out.println("Dear " + name1 + ", " + name2 + ", and " + name3 +
		                   ": please pay " + finalBill + " shekels each.");
	}
}
