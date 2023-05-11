
//Ques- 234
package LinkedList.leetcodeQuestions;
import LinkedList.LL.*;
public class palindromeLinkedList {
    public boolean isPalindrome(Node head) {
        Node list=new Node(-1);
        Node traverse=head;
        Node newHead=list;
        while(traverse!=null){
            Node node=new Node(traverse.val);
            list.next=node;
            traverse=traverse.next;
            list=list.next;
        }
        newHead=newHead.next;
        Node prev=null;
        Node node=head;
        Node temp;
        while(node!=null){
           temp=node.next;
           node.next=prev;
           prev=node;
           node=temp;
        }
        while(prev!=null && newHead!=null){
            if(prev.val!=newHead.val)
            return false;
            prev=prev.next;
            newHead=newHead.next;
        }
        return true;
    }
}
//optimised :
class Solution {
    public boolean isPalindrome(Node head) {
        if(head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        Node node=head;
        Node prev=null;
       
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=null;
        System.out.println(prev.val);
        prev=null;
        Node temp=slow;
        while(temp!=null){
            temp=temp.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        while(prev!=null && node!=null){
            if(prev.val!=node.val)
            return false;
            prev=prev.next;
            node=node.next;
        }
        return true;
    }
}

