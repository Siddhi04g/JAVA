package Recursion;

public class printarr{
    public static void print1(int arr[],int idx,int size){
        if(size == idx)
        return;
        System.out.print(arr[idx]);
        print1(arr,idx+1,size);
    }
    //public static  
    public static void main(String[] args){
        int arr[] = {1,3,5,7};
        int size = 4;
        print1(arr,0,size);
        reverseprint(arr,0,size);
    }
    public static void reverseprint(int[] arr,int idx,int size){
        if(idx == size-1)
        return;
        reverseprint(arr,++idx,size);
        System.out.print(arr[idx]);
    }
    public static void reverseprint1(int[] arr,int idx){
        if(idx<0)
        return;
        System.out.print(arr[idx]);
        reverseprint1(arr,idx-1);
    }
}
 