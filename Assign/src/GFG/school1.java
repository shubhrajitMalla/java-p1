package GFG;

import java.util.*;

public class school1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        float a = s.nextFloat();
        float b = s.nextFloat();
        float result = a / b;
        System.out.print(result + " ");
        System.out.format(" %.3f", result);
        s.close();
    }
}
