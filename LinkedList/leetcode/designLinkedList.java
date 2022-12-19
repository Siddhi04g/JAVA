//Ques- 707
package LinkedList.leetcode;

class MyLinkedList {

Node head;
//Node tail;
public MyLinkedList(){
    this.head=null;
}

class Node{
    private int value;
    private Node next;
     
     Node(int value){
        this.value=value;
        next=null;
    } 
    // public Node(int val,Node next){
    //     this.value=val;
    //     this.next=next;
    // }
}

public int get(int index) {
    Node node=head;
    node=head;
    int i=0;
    while(node!=null){
        if(i==index){
        return node.value;
        }
        i++;
        node=node.next;
    }
    return -1;
}

public void addAtHead(int val) {

    Node newnode=new Node(val);
    if(head==null){
        head=newnode;
        return;
    }
    
    newnode.next=head;
    head=newnode;
}

public void addAtTail(int val) {
    if(head==null){
       addAtHead(val);
       return;
    }
    Node newnode=new Node(val);
    Node node=head;
    while(node.next!=null){
        node=node.next;
    }
    node.next=newnode;

}

public void addAtIndex(int index, int val) {
    if(index==0 ){
        addAtHead(val);
        return;
    }
    if(head==null){
        return;
    }
    Node node=head;
    
    Node newnode=new Node(val);
    int i=0;
    while(node!=null){
        if(i==index-1){
            newnode.next=node.next;
            node.next=newnode;
            break;
        }
        i++;
        node=node.next;
    }
}

public void deleteAtIndex(int index) {
    if(head==null){
        return;
    }
    if(index==0){
        head=head.next;
        return;
    }
    Node node=head;
    int i=0;
    while(node.next!=null){
        if(index==i+1){
        node.next=node.next.next;
        return;
        }
        node=node.next;
        i++;
    }
}
}

