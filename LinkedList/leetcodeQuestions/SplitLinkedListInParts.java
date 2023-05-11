// Ques- 725
package LinkedList.leetcodeQuestions;
import LinkedList.LL.*;
public class SplitLinkedListInParts {
    public Node[] splitListToParts( Node head, int k) {
        Node node=head;
        Node arr[]=new  Node[k];
        int count=0;
        while(node!=null){
            count++;
            node=node.next;
        }
        node=head;
        int i=0;
        Node temp=head;
        if(count<=k){
            while(node!=null){
                temp=node.next;
                node.next=null;
                arr[i++]=node;
                node=temp;
            }
            return arr;
        }
        node=head;
        int c=0;
        if(count%k==0){
            while(node!=null){
                temp=node;
                c=0;
                while(c!=count/k-1){
                    node=node.next;
                    c++;
                }
                arr[i++]=temp;
                temp=node.next;
                node.next=null;
                node=temp;
            }
            return arr;
        }
        node=head;
        c=0;
        int rem=count%k;
        if(count%k!=0){
            while(rem-->0){
                temp=node;
                c=0;
                while(c!=count/k){
                    node=node.next;
                    c++;
                }
                arr[i++]=temp;
                temp=node.next;
                node.next=null;
                node=temp;
            }

            while(node!=null){
                temp=node;
                c=0;
                while(c!=count/k-1){
                    node=node.next;
                    c++;
                }
                arr[i++]=temp;
                temp=node.next;
                node.next=null;
                node=temp;
            }
            return arr;
        }
        return arr;
    }
}

