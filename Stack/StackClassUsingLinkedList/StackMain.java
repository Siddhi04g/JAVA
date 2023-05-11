package Stack.StackClassUsingLinkedList;

public class StackMain {
    public static void main(String[] args){
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        for(int i = 0 ; i <= 5 ; i++){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            try{
                System.out.print(stack.pop()+" ");
            } catch(StackEmptyException e){
                //Never Reach Here
            }
        }
    }
}
