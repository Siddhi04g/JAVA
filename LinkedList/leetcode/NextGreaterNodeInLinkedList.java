//Ques - 1019
package LinkedList.leetcode;
import java.util.*;

import LinkedList.LL.*;
public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(Node head) {
        Node node=head;
        Node temp=head;
        Node size=head;
        int count=0;
        while(size!=null){
            count++;
            size=size.next;
        }

        int arr[]=new int[count];
        if(count==1){
            arr[0]=0;
            return arr;
        }
        node=head;
        int i=0;
        while(node.next!=null){
            temp=node.next;
            while(temp!=null && temp.val<=node.val ){
                temp=temp.next;
            }
            
            if(temp==null){
                arr[i++]=0;
            }
            else{
                arr[i++]=temp.val;
            }
            node=node.next;
        }
        arr[count-1]=0;
        return arr;
    }
}
// optimised :

class Solution {
    public int[] nextLargerNodes(Node head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        
        int n = values.size();
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && values.get(stack.peek()) < values.get(i)) {
                answer[stack.peek()] = values.get(i);
                stack.pop();
            }
            stack.add(i);
        }
        return answer;
    }
}

