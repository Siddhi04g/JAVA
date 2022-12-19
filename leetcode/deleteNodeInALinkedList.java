//Ques-
import LinkedList.LL.*;
public class deleteNodeInALinkedList {
    public void deleteNode(Node node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}