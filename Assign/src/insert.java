import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("size-");
        int size = s.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = s.nextInt();

        }
        for (int j = 0; j < size; j++) {

            System.out.println("the elements are" + ar[j]);
        }
        s.close();
    }
}
