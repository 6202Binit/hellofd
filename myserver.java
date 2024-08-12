/*import java.io.*;
import java.net.*;
import java.util.*;
public class myserver {
  public static void main(String[]args){
    try{
        System.out.println("waiting clients");
        ServerSocket s = new ServerSocket(6666);
        Socket a = s.accept();
        DataInputStream din = new DataInputStream(a.getInputStream());
        String str = (String)din.readUTF();
        System.out.println("message = "+ str);
        s.close();

    }
    catch(Exception e){
        System.out.println(e);
    }
  } 
}*/
import java.net.*;
import java.io.*;
import java.util.*;
public class myserver{
    public static void main(String[]args){
        try{
            System.out.println("waiting client");
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
         System.out.println("connection established");
       /*  BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = b.readLine();
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        out.println("server says" + str);
        System.out.println("connection established");*/
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        int number = Integer.parseInt(in.readLine());
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        out.println("the factorial of " + number + "is" + factorial(number));
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}
