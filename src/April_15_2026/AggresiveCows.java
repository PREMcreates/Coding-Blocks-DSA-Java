package April_15_2026;

import java.util.*;

public class AggresiveCows {
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int low = 0;
        int high = position[position.length-1] - position[0];
        int ans = 0;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(canPlace(position, m, mid)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static boolean canPlace(int[] position, int m, int mid){
        int count = 1;
        int lastpos = position[0];

        for(int i=1; i<position.length; i++){
            if(position[i]-lastpos >= mid){
                count++;
                lastpos = position[i];
            }
            if(count >= m) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        System.out.println(maxDistance(arr, m));
    }
}
