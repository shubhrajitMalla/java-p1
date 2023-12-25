import java.util.Scanner;

public class a23 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("num of eggs:");
		int n = s.nextInt();
		int g = n / 144;
		int r = n % 144;
		int d = r / 12;
		int l = r % 12;
		System.out.println("groos" + g + "dozen" + d + "left" + l);
		s.close();

	}

}
