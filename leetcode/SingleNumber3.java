//package leetcode;
import java.util.*;
public class SingleNumber3 {
    public static int[] singleNumber(int[] nums) {
        int[] arr=new int[2];
        int k=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i++){
            if((nums[i]==nums[i+1]) ||(nums[i]==nums[i-1]))
                continue;
            else 
                arr[k++]=nums[i];
        }
        if(nums[0]!=nums[1])
            arr[k++]=nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) 
            arr[k++]=nums[nums.length-1];
        return arr;
    }
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size and array elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println("no.of split");
        int ans[]=singleNumber(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}   

