import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		int sum = 0, r = 0;
		while (n > 0) {
			n = n / 10;
			r = n % 10;
			sum += r;
			if (n < 10) {
				sum += n;
			}
		}
		System.out.println(sum);
		s.close();
	}

}
