package April_14_2026;

import java.util.Scanner;

public class Leetcode_76 {
    public static String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (n > m)
            return "";

        int[] freq = new int[128];
        for(char c : t.toCharArray()){
            freq[c]++;
        }

        int left = 0, right = 0, start = 0;
        int minLen = Integer.MAX_VALUE;
        int count = n;

        while(right < m){
            if(freq[s.charAt(right)] > 0){
                count--;
            }
            freq[s.charAt(right)]--;
            right++;

            while(count == 0){
                if(right-left < minLen){
                    minLen = right - left;
                    start = left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)] > 0){
                    count++;
                }
                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE) return "";
        return s.substring(start, start+minLen);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(minWindow(s,t));
    }
}
