/*import java.util.*;
class hii implements Runnable{
    public void run(){
        for(int i = 0;i<=5;i++){
        System.out.println("hii");
        try{
            Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class hello implements Runnable {
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("hello");
            try{
            Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }

            } 
    }
}

public class thread {
    public static void main(String[]args){
        Runnable obj1 = new hii();
        Runnable obj2 = new hello();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{
            Thread.sleep(10);
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
        // obj1.show();
        // obj2.show();
    }
    
}*/
/*import java.util.*;

public class thread{
    public static void main(String[]args) throws Exception{
        Thread t1 = new Thread(() -> {
for(int i = 0;i<5;i++){
    System.out.println("hii");
    try{
        Thread.sleep(500);
    }
    catch(Exception e){}
}
        });
        Thread t2 = new Thread(() ->{
            for(int i = 0;i<5;i++){
                System.out.println("hello");
                try{
                    Thread.sleep(500);
                }
                catch(Exception e){}
            }
        });
        
        // System.out.println(t1.getName());
        // System.out.println(t2.getName());
        // System.out.println(t1.getPriority());
        // System.out.println(t2.getPriority());
        // t1.setPriority(1);
        // t2.setPriority(10);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        try{
            Thread.sleep(10);
        }
        catch(Exception e){}
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());

        System.out.println("bye");
    

    }
}
public class thread{
    public static int solution(int arr[]){
        boolean a[] = new boolean[arr.length+1];
        for(int i = 0;i<arr.length;i++){
            a[arr[i]]= true;
        }
        for(int i = 0;i<a.length;i++){
            if(!a[i]){
                return i;
            }
        }
        return 0;
    }

    public static int solution(int arr[]){
        int n = arr.length;
        /*int sum = 0;
        int cal = (n*(n+1))/2;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        return cal - sum;
        int m = 0;
        for(int i = 0;i<arr.length;i++){
            m = m^i + 1;
            m = m^arr[i];
        }
        return m;
    }
    public static void main(String[]args){
        int arr[] = {3,0,2};
        System.out.println(solution(arr));
    }
}*/

/*class Solution {
    public String convert(String s, int numRows) {
        // create string builder 
        StringBuilder[] sb = new StringBuilder[numRows];
       for(int i = 0;i<numRows;i++){
           sb[i] = new StringBuilder();
       } 
      // define varraible
       char a[] = s.toCharArray();
       int n = a.length;
       int index = 0;
       while(index < n){
           // go down 
           for(int j = 0;j<numRows&&index<n;j++){
               sb[j].append(a[index++]);
           }
           // go up
           for(int j = numRow-1;j>0&&index<n;j++){
               sb[j].append(a[index++]);
           }
       }
       // combine the all string into one
       StringBuilder r = sb[0];
       for(int i = 1;i<numRows;i++){
           r.append(sb[i].toString());
       }
       return r.toString();

    }
}*/
/*class thread extends Thread{
    public void run(){
        System.out.println("running");
    }
    public static void main(String[]args){
        thread t1 = new thread();
        t1.start();
    }
}
public class thread implements Runnable{
    public void run(){
        System.out.println("running");
    }
    public static void main(String[]args){
        Runnable r1 = new thread(); // creating the object of the thread
        Thread t1 = new Thread(r1,"hello thread");
        t1.start();
        String s1 = t1.getName();

        System.out.println(s1);

    }
}*/
/*public class thread extends Thread{
   public void run(){
        for(int i =0;i<5;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[]args){
        thread t1 = new thread();
        thread t2 = new thread();
        t1.start();
        t2.start();
    }
}*/
/*class abc extends Thread{
    Thread threadTointerrupt;
    public void run(){
        // invoking the method interrupt
        threadTointerrupt.interrupt();
    }
}
public class thread{
    public static void main(String[]args){
        try{
            abc t1 = new abc();
            t1.threadTointerrupt = Thread.currentThread();
            t1.start();
            t1.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}*/
/*class thread extends Thread{
    public void run(){
        System.out.println("running");
    }
    public static void main(String[]args){
        thread t1 = new thread();
        thread t2 = new thread();
        System.out.println("the first thread name " + t1.getName());
        System.out.println("the second thread name is " + t2.getName());
        t1.start();
        t2.start();
        t1.setName("binit jha");
        t2.setName("ravi jha");
        System.out.println("the new thread is " + t1.getName());
        System.out.println("the second thread is " +t2.getName());
    }
}*/
/*import java.io.*;
class thread1 extends Thread{
    // constructor of the class 
    thread1(String threadname){
        super(threadname);
    }
    public void run(){
        System.out.println("running");
    }
}
public class thread{
    public static void main(String[]args){
        thread1 t1 = new thread1("hello");
        thread1 t2 = new thread1("hii");
        System.out.println("the first thread" + t1.getName());
        System.out.println("the second thread "+ t2.getName());
        t1.start();
        t2.start();
    }
}*/
/*class thread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[]args){
        thread t1 = new thread();
        thread t2 = new thread();
        t1.start();
        t2.start();
    }
}*/
/*import java.lang.*;;
public class thread extends Thread{
    public void run(){
        System.out.println("running");
    }
    public static void main(String[]args){
        thread t1 = new thread();
        thread t2 = new thread();
        thread t3 = new thread();
        System.out.println("the first priority" + t1.getPriority());
        System.out.println("the seocnd priority " + t2.getPriority());
        System.out.println("the third priority" + t3.getPriority());
        t1.setPriority(4);
        t2.setPriority(5);
        t3.setPriority(8);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println("the currently set the thread " + Thread.currentThread().getName());
        System.out.println("the current priority" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("the new priority" + Thread.currentThread().getPriority());
    }
}*/

// daemon thread : - it is service provider thread that provide service to the user service
// there are many deamon(like automatically) thread like gc , finallize etc;
/*public class thread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon is work");
        }
        else{
            System.out.println("user thread work");
        }
    }
    public static void main(String[]args){
        thread t1 = new thread();
        thread t2 = new thread();
        thread t3 = new thread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
    
}*/


/*import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class thread implements Runnable{
    private String msg;
    public thread(String s){
        this.msg = s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"(START) message" + msg);
        processmsg();
        System.out.println(Thread.currentThread().getName()+"(END)");
    }
        private void processmsg(){
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    
}*/



