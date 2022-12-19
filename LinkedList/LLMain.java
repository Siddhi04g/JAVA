package LinkedList;
public class LLMain{
    public static void main(String[] args){
        LL list=new LL();   // right now linked list will be created with size=0 and head will be there and a tail will be there
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insertAtAnyIndex(100,3);
        list.display();
        System.out.println("deleted element=" +list.deleteFirst());
        list.display();
        System.out.println("deleted element=" +list.deleteLast());
        list.display();
        System.out.println("deleted element=" +list.deleteAtAnyIndex(2));
        list.display();
    }
}
