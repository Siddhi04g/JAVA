package Stack.StackClassUsingArray;

public class StackUsingArray {
    private int data[];
    private int top;

    public StackUsingArray(){
        data = new int[10];
        top = -1;
    }
    public StackUsingArray(int capacity){
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty(){ //O(1):time
        return (top == -1);
    }

    public int size(){ //O(1):time
        return top+1;
    }

    public int peek() throws StackEmptyException{ //O(1):time
        if(size() == 0){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }

    public void push(int ele) throws StackFullException{ //O(1):time
        if(size() == data.length){
            // //StackFullException
            // StackFullException e = new StackFullException();
            // throw e;
            doubleCapacity(); //O(n) :time
        }
        data[++top] = ele;
    }

    private void doubleCapacity(){ //O(n):time
        int temp[] = data; // original array save kiya h temp mei;
        data = new int[2*temp.length];
        for(int i = 0 ; i <= top ; i++){
            data[i] = temp[i];
        }
    }
    public int pop() throws StackEmptyException{ //O(1):time
        if(size() == 0){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }   
}

