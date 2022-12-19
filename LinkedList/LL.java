package LinkedList; 
public class LL{
    public Node head;
    public Node tail;
    public int size;

    public LL(){
        this.size=1;
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null)
        tail=head;

        size+=1;
    }  
    
    public  void insertLast(int val){  //O(1) when using tail while O(n) if you dont have tail only head val is present
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAtAnyIndex(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;   //index=0;
        //Node newNode,org;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node newnode=new Node(val,temp.next);
        temp.next=newnode;
        // org=temp.next;
        // temp.next=newNode;
        // newNode.next=org;
    }
    
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int value=tail.val;
        tail=secondLast;
        tail.next=null;
        return value;
    }
    
    public int deleteAtAnyIndex(int index){   //O(n)
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.val;
        prev.next=prev.next.next;

        return val;
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

    public Node get(int index){   //return the reference pointer to that node
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        if(head==null){
           tail=null;
        }
        size--;
        return val;
    }
     
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
      
public static class Node{
        public int val;
        public Node next;
    
        public Node(int value){  //Constructor
           this.val=value;
           next=null;
        }

        public Node(int value,Node next){
            this.val=value;
            this.next=next;
        }
    }
 }