import java.util.Scanner;

public class a2q1 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the tempreture in farenheit :");
		double f = s1.nextDouble();
		double c = (f - 32) * 0.556;
		System.out.println("the given tempreture in celcius:" + c);
		s1.close();
	}
}
