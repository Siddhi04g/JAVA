package Questions;

public class MinCostLexicographical {
    public static void main(String args[]){
        String arr[]={"aa","ba","ca"};
        int revcost[]={1,2,3};
        String rev[]= new String(arr.length);
        for(int i=0;i<rev.length;i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            rev[i]=sb.reverse().toString();
        }
        int n = arr.length;
        int storage[][]=new int[arr.length][2];
        Arrays.fill(storage,Integer.MAX_VALUE);
        
    }
}
