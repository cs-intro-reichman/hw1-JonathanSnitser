// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	   int originNum = Integer.parseInt(args[0]);
	   int hundreds = originNum / 100;
	   int tens = (originNum  / 10 ) % 10;
	   int ones = originNum % 10;

	   System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones."); 
	}
}
