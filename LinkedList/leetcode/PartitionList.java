//Ques-83
package LinkedList.leetcode;
import LinkedList.LL.*;
public class PartitionList {
    public Node partition(Node head, int x) {
        Node list=new Node(-1);
        Node ans=list;
        Node node=head;
        while(node!=null){
            if(node.val<x){
                Node dummy=new Node(node.val);
                list.next=dummy;
                list=list.next;
            }
            node=node.next;
        }
        node=head;
        while(node!=null){
            if(node.val>=x){
                Node dummy=new Node(node.val);
                list.next=dummy;
                list=list.next;   
            }
            node=node.next;
        }
        return ans.next;
    }
    
}
