import java.util.ArrayList;
import java.util.*;

public class stack{
    // this using arraylist 
    /*public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean empty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            // if(empty()){
            //     return -1;
            // }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            // if(empty()){
            //     return -1;
            // }
            return list.get(list.size()-1);
        }
    }*/

    // now arraylist using linkedlidt

   public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{
        static Node head = null;
        public static boolean empty(){
            return head == null;
        }
        public static void push(int data){
            Node newnode = new Node(data);
            if(empty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        public static int pop(){
            if(empty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(empty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[]args){
        Stack s = new Stack();
        s.push(5);
        s.push(9);
        s.push(12);
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}