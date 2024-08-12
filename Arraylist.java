
// public class Arraylist{
// import java.util.*;

/*public class Arraylist{
    static boolean is(String s){
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i) == false)){
                return false;
            }
            // return true;
        }
         return true;
    }
    public static void main(String[]args){
            String s = "1234";
            if(is(s)){
                System.out.println("integer");
            }
            else{
                System.out.println("String");
            }
    }
}*/
/*public class Arraylist{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try{
            Integer.parseInt(s);
            System.out.println("integer");

        }
        catch(NumberFormatException e){
            System.out.println("string");
        }
    }
}*/
import java.util.*;
public class Arraylist{
    public static boolean is(String s){
        /*Set<Character> s1 = new HashSet<Character>();
        for(int i = 0;i<s.length();i++){
            s1.add(s.charAt(i));
        }
        if(s1.size()==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }*/
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(0)){
                return false;
            }
        }
            return true;
        
        
    }
    public static void main(String[]args){
        String s = "ggg";
        if(is(s)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}