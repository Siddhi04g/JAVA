//Ques-2095 
import LinkedList.LL.*;
public class DeleteTheMiddleNodeOfALinkedList {
    public Node deleteMiddle(Node head) {
        Node slow=head;
        Node fast=head;
        Node prev=slow;
        if(head.next==null){
            return null;
        }  
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}
