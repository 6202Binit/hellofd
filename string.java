import java.util.Arrays;
import java.util.Scanner;

// import java.util.StringJoiner;

// /*public class string{
//     static void hello(char s1[],char s2[],int id){
//        /*  for(int i =0;i<s1.length;i++){
//             s2[i] = s1[i];
//         }
//         s2[id] = s1[id];
//         if(id == s1.length-1){
//             return;
//         }
//         hello(s1, s2, id+1);

//     }
//     public static void main(String[] args) {
//         char s1[] = "hello world".toCharArray();
//         char s2[] = new char[s1.length];
//         int id = 0;
//         hello(s1,s2,id);
//         System.out.println(String.valueOf(s2));


//     }
// }*/
// import java.util.*;
// public class string{
//     public static void main(String[]args){
//         String text = new String("hello, i am a good coder ");
//         String[] sentences = text.split("\\.");
//         System.out.println(Arrays.toString(sentences));
//         /*StringBuilder str = new StringBuilder("hello");
//         StringBuilder str2 = new StringBuilder("world");
//         StringBuilder s = str.append(str2);
//         System.out.println(s.toString());*/
//         // String s1 = new String("hello");
//         // String s2 = new String("world");
//         // // String s = String.format("%s %s", s1, s2);
//         // String s = String.join("",s1,s2);
//     //     StringJoiner s = new StringJoiner("");
//     //     s.add("hello");
//     //     s.add("world");

//     // System.out.println(s.toString());
//     }
// }
/*import java.util.*;
public class string{
    public static void main(String[]args){
        //  String s = new String("helllo , i am a good coder and you also ");
        //  String[] s1 = s.split("\\.");
        //  System.out.println(Arrays.toString(s1));
        //  System.out.println(s.toUpperCase());
        //  System.out.println(s.toLowerCase());
        // int a = 10;
        // String s = String.valueOf(a);
        // System.out.println(s+10);
        String s = "java is good language , java is used by maximum developer used , java is open source langauge";
        String c = s.replace("java", "kava");
        System.out.println(c.toString());
    }
}*/
/*public class string{
    public static String concat(){
        // StringBuilder htr = new StringBuilder("hellp");
        // htr.append("java");
        // htr.insert(2, "java");
        // htr.reverse();
        // System.out.println(htr);
        String t = "java";
        for(int i = 0;i<10000;i++){
            t =  t + "hello";

        }
        return t;
    }
    public static String concatwith(){
        StringBuffer str = new StringBuffer("hello");
    for(int i = 0;i<10000;i++){
        str.append("java");
    }  
    return str.toString();
  }
    public static void main(String[]args){
        long start = System.currentTimeMillis();
        concatwith();
        System.out.println("time duration using " + (System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        concatwith();
        System.out.println("time duration using string buffer" + (System.currentTimeMillis()-start));
    }
}*/
/*import java.util.*;
public class string{
    public static void main(String[]args){
        // System.out.print("enter the name : ");
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // // System.out.println(s);
        // // // System.out.println(s.charAt(3));
        // // char ch = s.charAt(4);
        // // System.out.println(ch);
        // // System.out.println(s.charAt(1));
        // System.out.println(s.charAt(0));
        // System.out.println(s.charAt(s.length()-1));
        String str = "hello java is very popular language";
        // for(int i = 0;i<str.length();i++){
        //     if(i%2!=0){
        //         System.out.println(" char at " + i +" place " + str.charAt(i) );
        //     }
        // }
        int count = 0;
        for(int i =0 ;i<str.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("the number of character is " + count);
    }
}*/
import java.util.*;
/*public class string{
     static ArrayList<Character> al;
       
    public static  boolean isvowel(char c){
        for(int i =0;i<al.size();c++){
            if(c==al.get(i)){
                return true;
            }
        }
        return false;
    }
    public static int count(String s){
        int d = 0;
        for(int j = 0;j<s.length();j++){
          char c = s.charAt(j);
          if(isvowel(c)){
            d = d+1;
          }

        }
        return d;
    }
    public static void main(String[]args){
        string obj = new string();
ArrayList<Character> al = new ArrayList<>();
        al.add('a');al.add('A');
        al.add('e');al.add('E');
        al.add('i');al.add('I');
        al.add('o');al.add('O');
        al.add('u');al.add('U');
        String str = "java is very beautiful language and very popular langhuge";
        System.out.println(str);
        int h = obj.count(str);
        System.out.println(h);
    }
}*/
public class string{
    public static void main(String[]args){
    //     String s = "java developer";
    //   s=   s.concat(" is good thought");
    //     System.out.println(s);
    //    s =  s.concat(" hello languge is good so");
    //    System.out.println(s);
    String str1 = "hello java";
    String str2= "i am java developer";
    String str3 = "hello java is very popular language";
    String str4 = str1.concat(str2);
    System.out.println(str4);
    String str5 = str1.concat(str2).concat(str3);
    System.out.println(str5);

    }
}