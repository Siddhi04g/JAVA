package Recursion;

public class maxinarr {
    public static int solve(int arr[], int size, int idx){
        if(idx == size )
        return Integer.MIN_VALUE;
        int mera_ans = arr[idx];
        int rec_ans = solve(arr,size,idx+1);
        int max = Math.max(mera_ans,rec_ans);
        return max;
    }
}
