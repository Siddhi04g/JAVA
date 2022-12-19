package LinkedList;

public class CLL {
    public Node head;
    public Node tail;
    int size;

    public CLL(){
        size=1;
    }

    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }

    public void display(){   //O(n)
        Node node=head;
        if(head!=null){
            do{
                System.out.print(node.value+" -> ");
                node=node.next;
            }while(node!=head);
            System.out.print("HEAD");
            System.out.println();
        }
    }

    public void delete(int val){
        Node node=head;
        if(node==null){   //basically if head==null
            return;
        }
        if(node.value==val){
            head=head.next;
            tail.next=head;
        }

        do{
            Node n=node.next;
            if(n.value==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }

    public class Node{
        int value;
        Node next;

        public Node(int val){
            this.value=val;
        }
        public Node(int val,Node next){
            this.value=val;
            this.next=next;
        }
    }
}
