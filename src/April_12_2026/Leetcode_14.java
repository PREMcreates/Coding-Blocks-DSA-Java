package April_12_2026;
import java.util.*;
public class Leetcode_14 {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix until it matches
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return ""; //if empty
            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i=0; i<n; i++){
            strs[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(strs));
    }
}
