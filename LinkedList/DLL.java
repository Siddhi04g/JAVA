package LinkedList;


public class DLL {
    public Node head;
    public int size;

    public DLL(){
        this.size=1;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void insertLast(int val){
        Node newnode=new Node(val);
        Node last=head;
        newnode.next=null;
        if(head==null){
            head=newnode;
            head.prev=null;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=newnode;
        newnode.prev=last;
    }
    
    public Node find(int value){   //O(n)
        Node node=head;
        while(node!=null){
            if(node.val==value)
            return node;
            node=node.next;
        }
        return null;
    }

    public void insertAfterAValue(int value,int after){
        Node p=find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(value);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        head.prev=null;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int value=secondLast.next.val;
        secondLast.next=null;
        return value;
    }
    
    public int deleteAtAnyIndex(int index){   //O(n)
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node previous=get(index-1);
        int val=previous.next.val;
        previous.next=previous.next.next;
        previous.next.next.prev=previous;

        return val;

    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.val+"->");
            last=node;
            node=node.next;
        }
        System.out.print("END");
        System.out.println();

        System.out.println("Printing In reverse");
        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.print("END");
        System.out.println();
    }
   
    public class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    } 
}
