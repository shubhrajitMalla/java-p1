import java.util.Scanner;

class Solution {
    // Just print the space seperated array elements
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = s.nextInt();
        int[] ar = new int[N];
        System.out.println("enter");
        for (int i = 0; i < N; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println(ar[N]);
        s.close();
    }
}
