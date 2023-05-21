package Recursion;

public class lastindex {
    public static void ls(int arr[],int idx,int target,int ans){
        if(idx == arr.length)
        ans = -1;
        if(arr[idx] == target)
        ans = idx;
        ls(arr, idx+1 ,target,ans);
    }
}
