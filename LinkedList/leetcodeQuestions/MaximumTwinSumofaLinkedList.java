//Ques-2130
package LinkedList.leetcodeQuestions;
import LinkedList.LL.*;
public class MaximumTwinSumofaLinkedList {
    public int pairSum(Node head) {
        Node slow=head;
        Node fast=head;
        Node node=head;
        Node prev=null;
        while(fast!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
            // if(fast.next.next==null){
            //     node=slow;
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
        int sum=0,maxS=0;
        while(node!=null && prev!=null){
            sum=node.val+prev.val;
            maxS=Math.max(sum,maxS);
            node=node.next;
            prev=prev.next;
        }
        return maxS;
    }
}
