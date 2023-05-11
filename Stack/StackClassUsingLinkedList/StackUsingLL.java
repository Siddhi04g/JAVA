package Stack.StackClassUsingLinkedList;

public class StackUsingLL<T> {
    private Node <T> head;
    private int size;

    public StackUsingLL(){
        head = null;
        size = 0;
    }

    int size(){
        return size;
    }
    
    T top() throws StackEmptyException{
        if(head == null){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return head.data;
    }

    boolean isEmpty(){
        return (head == null);
    }

    void push(T element){
        Node<T> node = new Node<T>(element);
        node.next = head;
        head = node;
        size++;
    }

    T pop() throws StackEmptyException{
        if(head == null){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        T x = head.data;
        head = head.next;
        size--;
        return x;
    }

}
