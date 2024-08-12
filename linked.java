public class linked{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
    
        public void addfirst(int data){
            // step 1
            Node newnode = new Node(data);
            size++;
            if(head==null){
                head = tail = newnode;
                return;
            }
            // step 2 
            newnode.next = head;
            // step 3
            head = newnode;

        }
        public void addlast(int data){
            Node newnode = new Node(data);
            size++;
            if(head == null){
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }
        public void print(){
            if(head==null){
                System.out.println("empty");
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();

        }
        public void middle(int idx , int data){
            Node newnode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while(i<idx-1){
                temp =temp.next;
                i++;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
        public int removefirst(){
            if(size==0){
                System.out.println("empty");
                return Integer.MIN_VALUE;
            }
            if(size==1){
                int val = head.data;
                head = tail = null;
                return val;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        /*public int removelast(){
            Node prev = head;
            for(int i = 0;i<size-2;i++){
                prev = prev.next;
            }
            int val = prev.next.next;
            prev.next = null;
            tail = prev;
            size--;
            return prev;
        }*/
// search - iterative
        public int search(int key){
            Node temp = head;
            int i = 0;
            while(temp != null){
                if(temp.data==key){
                    return i ;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }
        public int recsearch(int key){
            return helper(head,key);
        }
        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx = helper(head.next, key);
            if(idx == -1){
                return -1;
            }
            return idx+1;
        }

        public void reverse(){
            Node prev = null;
            Node curr  = tail = head;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        public void delete(int n){
            int sz = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                sz++;
            }
            if(n == sz){
                head = head.next;
            }
            int i = 1;
            int tofind = sz-n;
            Node prev = head;
            while(i<tofind){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }


    public static void main(String[]args){
        linked l = new linked();
        l.addfirst(5);
        l.addfirst(8);
        l.addlast(3);
        l.addlast(9);
        l.print();
        l.middle(2, 9);
        l.print();
        System.out.println(l.size);
        l.removefirst();
        
        l.print();
    }
   
}