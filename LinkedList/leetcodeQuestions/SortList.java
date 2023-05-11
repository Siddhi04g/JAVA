//Ques- 148
package LinkedList.leetcodeQuestions;
import LinkedList.LL.*;
public class SortList {
    public Node sortList(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node mid=getMid(head);
        Node left=sortList(head);
        Node right=sortList(mid);
        return merge(left,right);
    }
    public Node merge(Node list1, Node list2) {
        Node f=list1;
        Node s=list2;
        // LinkedList<Integer> ans = new LinkedList<Integer>();
        Node ans=new Node(-1);
        Node temp=ans;
        while(f!=null && s!=null){
            if(f.val<=s.val){
                ans.next=f;
                ans=ans.next;
                f=f.next;
            }else{
                ans.next=s;
                ans=ans.next;
                s=s.next;
            }
        }
        while(f!=null){
            ans.next=f;
            ans=ans.next;
            f=f.next;
        }
        while(s!=null){
            ans.next=s;
            ans=ans.next;
            s=s.next;
        }
        return temp.next;
    }
    public Node getMid(Node head) {
        // ListNode slow,fast;
        // slow=head;
        // fast=head;
        // while(fast!=null && fast.next!=null ){
        //     fast=fast.next.next;
        //     slow=slow.next;
        // }
        // return slow;
        Node midPrev=null;
        while(head!=null && head.next!=null){
            midPrev=(midPrev==null)? head : midPrev.next;
            head=head.next.next;
        }
        Node mid=midPrev.next;
        midPrev.next=null;
        return mid;
    }
}

