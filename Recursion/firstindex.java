package Recursion;

public class firstindex {
    public static int fi(int[] arr, int target, int idx){
        if(idx == arr.length)
        return -1;
        if(arr[idx] == target)
        return idx;
        fi(arr,target,idx+1);
    }   
}
