import java.util.Scanner;

public class a2q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base salary of the employee :");
        double e = s.nextDouble();
        double DA = (40 / 100.00) * e;
        double HRA = (20 / 100.00) * e;
        double G = e + HRA + DA;
        System.out.println(
                "the DA is:" + DA + "\n" + "The HRA is:" + HRA + "\n" + "The Grss salery of the employee:" + G);
        s.close();
    }

}
