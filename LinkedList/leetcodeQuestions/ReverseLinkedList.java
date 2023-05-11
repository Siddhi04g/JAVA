
//Ques-206
package LinkedList.leetcodeQuestions;
import LinkedList.LL.*;
public class ReverseLinkedList {
    public Node reverseList(Node head) {
        Node prev=null;
        Node curr=head;
        Node temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
     }
}
