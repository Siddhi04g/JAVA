package Recursion;

public class add2strings {
    public static String addstrings(String str, String ctr, int i , int j, int carry, String ans){
        if(i < 0 &&  j < 0 && carry == 0)
        return " ";

        int first = 0;
        int second = 0;
        if(i >= 0)
        first = str.charAt(i)-'0';
        if(j >= 0)
        second = ctr.charAt(j)-'0';

        int sum = first + second + carry;
        int lastdigit = sum%10;
        carry = sum/10;
        ans = (lastdigit +'0') + ans;
        addstrings(str,ctr,i-1,j-1,carry,ans);
        return ans;
    }
    public static void main(String[] args){
        String ans = addstrings("123","45",2,1,0,"");
        System.out.print(ans);
    }
}
