//Ques-83

/* Approach
Question asks you to put nodes whose value is smaller than x first and then the ones whose value is larger or equal to x
So, just create a newList 'list'
Now just traverse the whole Linked List and if my value of node is less than the x the add that node's value to that new List
same thing do for adding nodes whose value larger or equal to x by traversing the whole linkedlist again and adding the required node's value to the new list.
Now you r good to go!!!

Complexity
Time complexity: O(n)

Space complexity: O(n) 
*/
package LinkedList.leetcodeQuestions;
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
