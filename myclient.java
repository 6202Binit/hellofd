/*import java.io.*;
import java.net.*;
public class myclient {
    public static void main(String[]args){
        try{
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("hello server");
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}*/
/*2import java.io.*;
import java.net.*;
import java.net.Socket;
// import java.util.*;
public class myclient{
    public static void main(String[]args){
        try{
            System.out.println("client started");
            Socket s = new Socket("localhost",6666);

            /*BufferedReader use = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the string");
            String str = use.readLine();
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            out.println(str);
            BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(b.readLine());

            // System.out.println("connection establishede");
            BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the number");
            int Number = Integer.parseInt(user.readLine());
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            out.println(Number);
            BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(b.readLine());


        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
import java.io.*;
import java.net.*;

public class myclient{
    public static void main(String[]args){
        try{
            URL url = new URL("https://www.youtube.com/");
            System.out.println(url.getProtocol());
            System.out.println(url.getPath());
            System.out.println(url.getAuthority());
            System.out.println(url.getPort());
            System.out.println(url.getQuery());
            System.out.println(url.getHost());
            System.out.println(url.getFile());
            System.out.println(url.getContent());
            System.out.println(url.toURI());

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
*/
class simple{}
public class myclient{
    public static void main(String[]args) throws ClassNotFoundException{
        Class c = Class.forName("simple");
        System.out.println(c.getName());
    }
}