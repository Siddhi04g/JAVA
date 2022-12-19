
//Ques-19
package LinkedList.leetcode;
import LinkedList.LL.*;
public class RemoveNthNodeFromEndofList {
    public Node removeNthFromEnd(Node head, int n) {
        Node node=head;
        int count=0;
        while(node!=null){
            count++;
            node=node.next;
        }
        Node prev=head;
        int i=1;
        if(head.next==null && n==1){
           return null;
        }
        if(n==1){
           while(prev.next.next!=null){
               prev=prev.next;
           }
           prev.next=null;
           return head;
        }
        if(count==n){
            head=head.next;
            return head;
        }
        while(prev!=null){
            if(i==(count-n)){
                prev.next=prev.next.next;
            }
            i++;
            prev=prev.next;
        }
        //System.out.println(count);
        return head;
    }
}
