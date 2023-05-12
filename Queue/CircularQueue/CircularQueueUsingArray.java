package Queue.CircularQueue;

public class CircularQueueUsingArray {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public CircularQueueUsingArray(){
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }
    public CircularQueueUsingArray(int capacity){
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
            //throw new QueueFullException();
            doubleCapacity();
        }
        if(size == 0) front = 0;
        rear++;
        rear = (rear + 1) % data.length;
        //if(rear == data.length) rear = 0;
        data[++rear] = element;
        size++;
    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2*temp.length];
        int idx = 0;
        for(int i = front; i < temp.length ; i ++){
            data[idx] = temp[i];
            idx++;
        }
    }

    int dequeue()throws QueueEmptyException{
        if(front == -1){
            throw new QueueEmptyException();
        }
        front ++;
        front = (front + 1) % data.length;
        // if(front == data.length) front = 0;
        int temp = data[front];
        size --;
        if(front > rear){ //size = 0
            front = -1;
            rear = -1;
        }
        return temp;
    }
}