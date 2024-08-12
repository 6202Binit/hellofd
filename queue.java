import java.util.EnumSet;

/*public class queue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue (int n){
            arr = new int[n];
            this.size = n;
        }
        public Queue() {
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        // eneque(add) implementation
        public static void add(int data){
            if(isFull()){
                System.out.println("full queue");
                return ;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queqe");
                return -1;
            }
            int front = arr[0];
            for(int i = 0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        // add peek operation
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queuq");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[]args){
        Queue q = new Queue();
        q.add(4);
        q.add(5);
        q.add(8);
        // q.add(9);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}*/
import java.util.*;

enum days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class queue{
    public static void main(String[]args){
        Set<days> set = EnumSet.of(days.SUNDAY,days.MONDAY);
        Iterator<days>itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
