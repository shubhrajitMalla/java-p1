import java.util.Scanner;

public class p0 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("GIVE THE SECURED NUNBER IN THE MANNER OF P,C,M,CS,G");
		double p = s.nextDouble();
		double c = s.nextDouble();
		double m = s.nextDouble();
		double cs = s.nextDouble();
		double g = s.nextDouble();
		double sum = p + c + g + m + cs;
		double per = (sum / 500.0) * 100.0;
		System.out.println("THE SECURED PERSENTAGE OF THE STUDENT:" + per);
		double C = per / 9.5;
		System.out.println("The CGPA of the given person :" + C);
		s.close();
	}

}
