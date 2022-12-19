//Ques- 21
package LinkedList.leetcode;
import LinkedList.LL.*;
public class MergeTwoSortedList {
    public Node mergeTwoLists(Node list1,Node list2) {
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
}

