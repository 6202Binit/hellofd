import java.util.Scanner;

/*public class exception {
    public static void main(String[]args){
        int a = 10,b=0;
        int c;
        try{
        c = a/b;
        System.out.println(c);
    }
         catch(Exception e){
        
        //System.out.println("you can not defin");}
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
        System.out.println(e);

    }
    finally{
        System.out.println("i am in finally block");
    }
}
}*/
/*public class exception{
    public static void main(String[]args){
        try{
            throw 10;
        }
        catch(int e){
            System.out.println("the error occur"+e);
        }
    }
}*/
/*class Base extends Exception{

} 
class Derived extends Base{

}
class exception{
    public static void main(String[]args){
        try{
            throw new Derived();
        }
        catch(Base b){

        }
        catch(Derived d){

        }
    }
}*/
/*import java.util.*;
class yException extends RuntimeException{
    yException(String msg){
        super(msg);
    }
}*/
/*class exception{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age :");
        int a = sc.nextInt();
        try{
        if(a<16){
        throw new yException("you are not eligible for vote");
        }
    
        else{
            System.out.println("you vote");
        }
    }
    catch(Exception e){
        System.out.println("hello");
    }
    
}
}*/
