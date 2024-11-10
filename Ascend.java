// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int minimum = 0;
		int middle = 0;
		int maximum = 0;

		minimum = Math.min(a , b);
		minimum = Math.min(minimum , c);
		maximum = Math.max(a , b);
		maximum = Math.max(maximum , c);
		middle  = (a + b + c) - minimum - maximum; 

		System.out.println(a + " " + b + " " + c);
		System.out.println(minimum + " " + middle + " " + maximum);
	}
}
