
import java.util.*;
public class sort_colors_75{
	  public static void sortColors(int[] nums) {
	        int zero=0,one=0,two=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==0)
	                zero++;
	            else if(nums[i]==1)
	                one++;
	            else
	                two++;
	        }
	        for(int i=0;i<nums.length;i++){
	        if(zero>0){
	            nums[i]=0;
	            zero--;
	        }
	        else if(one>0){
	            nums[i]=1;
	            one--;
	        }
	        else if(two>0){
	            nums[i]=2;
	            two--;
	        }
	      }
	        System.out.println("sorted colors");   
	        for(int i=0;i<nums.length;i++) {
	        	System.out.print(nums[i]+" ");
	        }
	    }
	public static void main(String args[]) {
		  Scanner sc=new Scanner (System.in);
		  System.out.println("Enter size and array elements");
		  int n=sc.nextInt();
		  int[] arr=new int[n];
		  for(int i=0;i<n;i++) {
			  arr[i]=sc.nextInt();
		  }
		  sortColors(arr);
		  sc.close();
	  }
}

