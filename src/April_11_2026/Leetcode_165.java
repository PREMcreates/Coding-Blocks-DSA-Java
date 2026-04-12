package April_11_2026;
import java.util.*;
public class Leetcode_165 {
    public static int compareVersion(String version1, String version2){
        String[] x = version1.split("\\.");
        String[] y = version2.split("\\.");
        int n = Math.max(x.length, y.length);
        for (int i = 0; i < n; i++) {
            int num1 = (i < x.length) ? Integer.parseInt(x[i]) : 0;
            int num2 = (i < y.length) ? Integer.parseInt(y[i]) : 0;
            if (num1 < num2)
                return -1;
            if (num1 > num2)
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String version1 = sc.nextLine();
        String version2 = sc.nextLine();

        System.out.println(compareVersion(version1, version2));

    }
}
