/*import java.util.*;
 class oops{
    
    oops get(){
        return this;
    }
    class B extends oops{
        B get(){
            return this;
        }
    }
        void msg(){
            System.out.println("welcome to the covariant return type");
        }
    
    public static void main(String[]args){
       new B().get().msg();
    }

       
}
*/
// super keyword in java used to refer immediate parent class

//  here super keyword used to refer immediate parent class and instance varrible
class animal{
    // String color = "white";
    void eat(){
        System.out.println("eating ...");
    }
}
// class animal3 extends animal{
//     String color = "red";

// }
class animal2 extends animal{
    
        void eat(){
            System.out.println("eating...");
        }
        void bark(){
            System.out.println("barking");
        }
    
        void work{
            super.eat();
            bark();
        }
}
    

public class oop{
    public static void main(String[]args){
      animal2 h = new animal2();
      h.work();

    }
}