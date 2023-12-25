import java.util.Scanner;

public class h1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("give the marks of the given student");
		float p = s.nextFloat();
		float c = s.nextFloat();
		float m = s.nextFloat();
		float cs = s.nextFloat();
		float o = s.nextFloat();
		float e = s.nextFloat();
		float sum = p + c + m + cs + o + e;
		float per = (sum / 600) * 100;
		System.out.println("the persentage of the student is:" + per);

		s.close();
	}

}
