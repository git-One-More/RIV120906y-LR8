package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = in.nextInt();

        System.out.println("Result:  " + (--num) + ", " + (++num) + ", " + (++num) + ", " + (int)Math.pow((num*3-3), 2));
    }
}
