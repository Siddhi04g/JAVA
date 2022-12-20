//Ques-160
import LinkedList.LL.*;
public class IntersectionOfTwoLinkedLists {
    public Node getIntersectionNode(Node headA, Node headB) {
        Node nodeA=headA;
        Node nodeB=headB;
        int countA=0,countB=0;
        while(nodeA!=null){
            countA++;
            nodeA=nodeA.next;
        }
        while(nodeB!=null){
            countB++;
            nodeB=nodeB.next;
        }
        nodeA=headA;
        nodeB=headB;
        while(countA>countB){
            nodeA=nodeA.next;
            countA--;
        }
        while(countB>countA){
            nodeB=nodeB.next;
            countB--;
        }
        while(nodeA!=nodeB){
            nodeA=nodeA.next;
            nodeB=nodeB.next;
        }
        return nodeA;
    }
}
