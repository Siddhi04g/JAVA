//Ques -2
import LinkedList.LL.*;
public class AddTwoNumbers {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node head=new Node(-1);   //dummy node
        Node ans=head;
        Node p=l1;
        Node q=l2;
        int sum=0;
        while(p!=null && q!=null){
            sum=p.val+q.val+sum/10;
            Node node=new Node(sum%10);
            ans.next=node; 
            ans=ans.next;
            p=p.next;
            q=q.next;
        }
        while(p!=null){
            sum=p.val+sum/10;
            Node node=new Node(sum%10);
            ans.next=node;
            ans=ans.next;
            p=p.next;
        }
        while(q!=null){
            sum=q.val+sum/10;
            Node node=new Node(sum%10);
            ans.next=node;
            ans=ans.next;
            q=q.next;
        }
        if(sum/10 !=0 ){
            ans.next=new Node(sum/10);
        }
        return head.next;
    }
}
