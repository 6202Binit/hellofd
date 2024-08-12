/*import java.util.*;
public class reflection{
    public static void main(String[]args){
        /*Locale locale = Locale.getDefault();
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayScript());
        System.out.println(locale.getISO3Country());
        System.out.println(locale.getISO3Language());*/

        /*Locale en = new Locale("en","US");
        Locale fr = new Locale("fr","FR");
        Locale es = new Locale("es","ES");
        System.out.println("english language is " +en.getDisplayLanguage());
        System.out.println("english language is french " +en.getDisplayLanguage(fr));
        System.out.println("english language is spanish " + en.getDisplayLanguage(es));
        System.out.println("hello " + en.getDisplayLanguage(es));
        System.out.println("hello " + en.getDisplayLanguage(fr));


        Locale[] locale = {new Locale("en","US"),new Locale("fr","FR"),new Locale("es","ES")};
        for(int i = 0;i<locale.length;i++){
            String display = locale[i].getDisplayLanguage(locale[i]);
            System.out.println(locale[i].toString() + display);
        }
    }
}*/
import java.text.DateFormat;
import java.util.*;
public class reflection{
    public static void printdate(Locale locale){
       DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT,locale); 
    }
    public static void main(String[]args){

    }
}