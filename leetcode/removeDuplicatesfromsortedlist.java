//  Ques- 83
import LinkedList.LL.*;
class rermoveDuplicatesFromSortedList {
    public Node deleteDuplicates(Node head) {
        Node node=head;
        Node prev=head;
        if(head==null){
            return null;
        }
        while(node.next!=null){
            if(node.next.val==prev.val){
                node=node.next;
            }
            else{
            prev.next=node.next;
            prev=node.next;
            node=node.next;
            }
        }
        if(prev.next!=null)
           prev.next=node;
        prev=null;
        node=head;
        while(node.next!=null){
            prev=node;
            node=node.next;
        }
        if( head.next!=null && prev.val==node.val){
            prev.next=null;
        }
        return head;
    }
}