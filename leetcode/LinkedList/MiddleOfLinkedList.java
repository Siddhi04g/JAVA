//Ques- 876

import LinkedList.LL.*;
public class MiddleOfLinkedList {
    public Node middleNode(Node head) {
        Node slow,fast;
        slow=head;
        fast=head;
        while(fast!=null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
