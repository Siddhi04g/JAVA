/*Ques: Check redundant brackets

For a given expression in the form of a string, find if there exist any redundant brackets or not. It is given that the expression contains only rounded brackets or parenthesis and the input expression will always be balanced.
A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.

Example:
Expression: (a+b)+c
Since there are no needless brackets, hence, the output must be 'false'.

Expression: ((a+b))
The expression can be reduced to (a+b). Hence the expression has redundant brackets and the output will be 'true'.
*/
package Stack.Questions;
import java.util.*;
public class CheckRedundantBrackets {
    public static boolean checkRedundantBrackets(String exp){
		Stack<Character> stack=new Stack<Character>();
        int count=0;
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            
            if (c==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    count=count+1;
                    stack.pop();
                }
                if (count==0 || count==1)
                {
                    return true;
                }
                stack.pop();
                count=0;
                
            }
            else
            {
                stack.push(c);
            }
        }
        return false;
	}
}
