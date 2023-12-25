import java.util.Scanner;

public class a2q2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the distance between two cities:");
		double d = s.nextDouble();
		double c = d * 10000.00;
		double m = d * 1000.00;
		double i = d * 39370.0787;
		double f = d * 3280.8399;
		System.out.println(
				"The given distance between two cities in inch :" + i + "\n" + "the given distance in centimeter:" + c
						+ "\n" + "the given distance in meter:" + m + "\n" + "the distance in feet:" + f);
		s.close();
	}

}
