package Queue.QueueClassUsingLL;

public class QueueUsingLL<T> {
    private Node <T> front;
    private Node<T> rear;
    int size;
    
    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty() throws QueueEmptyException{
        return (front == null);
    }

    T peek() throws QueueEmptyException{
        if(front == null && rear == null){
            throw new QueueEmptyException();
        }
        return front.data;
    }

    void enqueue(T ele){
        Node<T> node = new Node<>(ele);
        if(front == null ){
            front = node;
            rear = node;
        }
        else{
            rear.next = node;
            rear = node;
        }
        size++;
    }

    T dequeue() throws QueueEmptyException{
        if(front == null){
            throw new QueueEmptyException();
        }

        T x = front.data;
        front = front.next;
        size--;
        return x;
    }
}
