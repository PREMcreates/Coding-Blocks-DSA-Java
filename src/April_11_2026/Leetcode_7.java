package April_11_2026;

import java.util.Scanner;

public class Leetcode_7 {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int div = x % 10;
            if ((rev > Integer.MAX_VALUE / 10) || (rev < Integer.MIN_VALUE / 10)) {
                return 0;
            }
            rev = rev * 10 + div;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(reverse(x));
    }
}
