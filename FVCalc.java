// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = (Double.parseDouble(args[1])/100);
		double yearNum = Double.parseDouble(args[2]);
		double futureValue = 0;
		double pow = 0;

		pow = 1 + rate;
		futureValue = currentValue * (Math.pow(pow , yearNum));
		System.out.println("After " + (int) yearNum + " years, " + currentValue + "$ " + "saved at " +
						   (rate * 100) + "% will yield " + (int) futureValue + "$");
	}
}