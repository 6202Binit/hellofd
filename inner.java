// public class inner{
//     private int data = 30;
//     public class from{
//         void msg(){
//             System.out.println(data);
//         }
//     }
//     public static void main(String[]args){
//         inner a = new inner();
//         inner.from b = a.new from();
//         b.msg();
//     }
//     }

    // anonymous class ecample
    /*abstract class person{
        abstract void eat();
    }
public class inner{
    public static void main(String[]args){
        person p = new person() {
            void eat(){
                System.out.println("nice eating");
            }
        };
        p.eat();
    }
}*/
// java local inner example
/*public class inner{
    private int data = 30;
    void display(){
        class hello{
            void eat(){
                System.out.println(data);
            }
            hello l = new hello();
            l.eat();
        }

    }
    public static void main(String[]args){
        inner m = new inner();
        m.display();
    }
}*/
/*import java.util.regex.*;
public class inner{
    public static void main(String[]args){
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "binitt"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "123456"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9995325432"));
    }
}*/
/*import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Matcher;
public class inner{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the regex pattern");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("enter the text line");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;
            while(matcher.find()){
                System.out.println("found the index"+matcher.group()+"starting index" + matcher.start()+"ending index" + matcher.end());
                found = true;

            }
            if(!found){
                System.out.println("not found the element");
            }
        }
    }
}*/
import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Matcher;
public class inner{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter the reagex");
            Pattern p =  Pattern.compile(sc.nextLine());
            System.out.println("enter the text line");
            Matcher m = p.matcher(sc.nextLine());
            boolean found = false;
            while(m.find()){
                System.out.println("the element is" +m.group()+"starting end"+m.start()+"ending element"+m.end());
                found = true;
            }
            if(!found){
                System.out.println("not found the element ");
            }
        }
    }
}

