package April_12_2026;

import java.util.*;

public class Leetcode_179 {
    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if(arr[0].equals("0")) return "0";

        StringBuilder ans = new StringBuilder();

        for(String s : arr){
            ans.append(s);
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(largestNumber(nums));
    }
}
