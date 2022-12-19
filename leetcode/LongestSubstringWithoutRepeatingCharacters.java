//Ques-3
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0,maxL=0;
        while(i<s.length()&& j<s.length()){
            if(map.containsKey(s.charAt(j))){
                map.clear();
                i++;
                j=i;
            }
            else {
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                maxL=Math.max(maxL,j-i+1);
                j++;
               }
        }
        return maxL;
    }
}
