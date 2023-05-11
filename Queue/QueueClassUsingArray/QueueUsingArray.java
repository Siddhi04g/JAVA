package Queue.QueueClassUsingArray;

public class QueueUsingArray {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }
    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
       return size==0;
    }

    int peek() throws QueueEmptyException{
        if(front == -1){  //size == 0
            throw new QueueEmptyException();
        }
        return data[front];
    }

    void enqueue(int element) throws QueueFullException{
        if(size == data.length){
            throw new QueueFullException();
        }
        if(size == 0) front = 0;

        data[++rear] = element;
        size++;
    }

    int dequeue()throws QueueEmptyException{
        if(front == -1){
            throw new QueueEmptyException();
        }

        int temp = data[front++];
        size --;
        if(front > rear){ //size = 0
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
