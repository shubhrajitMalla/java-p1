import java.util.Scanner;

public class a22 {

      public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("enter the time in minutes:");
            int m = s.nextInt();
            int h = m / 60;
            int d = h / 24;
            int y = d / 365;
            int b = d % 365;
            System.out.println("day is" + b + "\n" + "year is" + y);
            s.close();
      }

}
