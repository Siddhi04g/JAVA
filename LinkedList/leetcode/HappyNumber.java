//Ques -202
package LinkedList.leetcode;
public class HappyNumber {
    public boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
           slow=findSquare(slow);
           fast=findSquare(findSquare(fast));
        }while(fast!=slow);
        if(slow==1)
        return true;
        else
        return false;
    }
    private int findSquare(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans+=rem*rem;
            number/=10;
        }
        return ans;
    }
}