package Recursion;

public class subsequence { 
    void printsubsequence(String str,int idx,String ans){
        if(idx == str.length()){
        System.out.print(ans+" ");
        return;
        }
        //include
        printsubsequence(str, idx+1 , ans + str.charAt(idx));
        //exclude
        printsubsequence(str, idx+1  , ans);

    }
}
