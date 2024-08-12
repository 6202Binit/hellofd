import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.sql.rowset.spi.SyncResolver;

//import javax.print.event.PrintEvent;
//public class  s1 {
   // public static void solution(int arr[],int n, int k){
       /*  int temp[] = new int[n];
        int c = 0;
        for(int i = k;i<n;i++){
            temp[c] = arr[i];
            c++;
        }
        for(int i =0;i<k;i++){
            temp[c] = arr[i];
            c++;
        }
        for(int i =0;i<n;i++){
            arr[i] = temp[i];
        }
    }*/
    /*public static void solution(int arr[],int n, int d){
        int p = 1;
        while(p<=d){
            int last = arr[0];
            for(int i = 0;i<n-1;i++){
                arr[i] = arr[i+1];

            }
            arr[n-1] = last;
            p++;
        }
    }
    static void printarr(int arr[],int n){
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]+ "");
        }
    }
   public static void main(String[]args){
    int arr[] = {3,4,7,5,3,1,3};
    int n = arr.length;
    int d = 2;
    solution(arr, n, d);
    printarr(arr,n);
   }

}*/
/*public class s1{
    static int solution(int arr[],int n, int key,int capacity){
        if(n>=capacity){
            return n;
        }
        arr[n] = key;
        return n+1;
    }
    public static void main(String[]args){
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 8;
        int capacity = 20;
        int n = 5;
        int key = 26;
        for(int i = 0;i<n;i++){
            System.out.println(arr[i] + "");
        }
       n =  solution(arr, n, key,capacity);
        for(int i = 0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}*/
/*public class s1{
    static void solution(int arr[],int n , int x,int pos){
        for(int i = n-1;i>=pos;i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = x;
    }
    public static void main(String[]args){
        int arr[] = new int[20];
        arr[0] = 1;
        arr[1] = 4;
        arr[2]= 6;
        arr[3] = 9;
        arr[4] = 7;
        arr[5] = 8;
        int n = 6;
        int x = 78;
        int pos = 2;
        for(int i = 0;i<n;i++){
            System.out.println(arr[i] + "");
        }
        solution(arr, n, x, pos);
        n +=1;
        for(int i =0 ;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}*/
/*public class s1{
    static void solution(int arr[],int n,int x , int p){
        for(int i = n-1;i>=p;i--){
            arr[i+1] = arr[i];
        }
        arr[p] = x;
    }
    public static void main(String[]args){
        int arr[] = new int[20];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 8;
        arr[3] = 6;
        arr[4] = 8;
        arr[5] = 9;
        int n = 6;
        int x = 2;
        int p = 1;
        solution(arr, n, x, p);
        n +=1;
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}*/
/*public class s1{
    public static int findelement(int arr[],int n,int x){
        for(int i =0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static int delete(int arr[],int n,int x){
        int pos = findelement(arr, n, x);

        if(pos==-1){
            System.out.println("element not found");
            return n;
        }
        for(int i = pos;i<n;i++){
            arr[i] = arr[i+1];
        }
        return n-1;

    }

    public static void main(String[]args){
        int arr[] = {3,5,6,3,6,4};
        int n = 6;
        int x = 3;
        for(int i= 0;i<n;i++){
            System.out.println("the array id " + arr[i] + "");
        }
        n = delete(arr,n,x);
        for(int i = 0;i<n;i++){
            System.out.println(arr[i] + "");
        }

    }
}*/

/*public class s1{
    public static void main(String[]args){
      ExecutorService executor = Executors.newFixedThreadPool(5);
      for(int i = 0;i<10;i++){
        Runnable worker = new thread(""+i);
        executor.execute(worker);
        } 
        executor.shutdown();
        while(!executor.isTerminated());
        System.out.println("finished all thread"); 
    }
}*/
/*public class s1{
    public int solution(int arr[],int n){
        PriorityQueue<Integer> l = new PriorityQueue<>();
        int i = 0;
        int sum = 0;
        for(i = 0;i<n;i++){
            l.add(arr[i]);
        }
        while(l.size()>1){
            int m = l.poll();
            int q = l.poll();
            sum += m+q;
            l.add(m+q);
        }
        return sum;
    }
    public static void main(String[]args){

    }
}*/
/*public class s1{
    public static int solution(int arr[],int n ){
        if(n<2){
            return -1;
        }
        int res = arr[0]+arr[1];
        for(int i  = 1;i<n-1;i++){
            res = Math.max(res,arr[i]+arr[i+1]);
        }
        return res;
    }
}
*/
import java.util.*;
public class s1{
    public  Queue<Integer> r(Queue<Integer>q,int k){
        sol(q, k);
        int s = q.size()-k;
        while(s-->0){
            int x = q.poll();
            q.add(x);
        }
        return q;
    }
    public static void sol(Queue<Integer>q,int k){
        if(k==0){
            return;
        }
        int a = q.poll();
        sol(q, k-1);
        q.add(a);
    }
}