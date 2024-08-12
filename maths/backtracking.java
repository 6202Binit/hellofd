/*public class backtracking {
    public static void  solution(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i =0;i<str.length();i++){
            char currchar = str.charAt(i);
            String next = str.substring(0,i)+str.substring(i+1);
            solution(next, perm+currchar, idx+1);

        }
    }
    public static void main(String[]args){
        String str =  "abc";
        solution(str,"", 0);;
    }
}*/
/*public class backtracking{
    public  static void solution(String str , String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char ci = str.charAt(i);
            String next = str.substring(0,i)+str.substring(i+1);
            solution(next, perm+ci, idx+1);

        }
    }
    public static void main(String[]args){
        String str = "abcd";
        solution(str, "", 0);
    }
}*/
/*public class backtracking{
    public static void print(String str,String perm , int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i =0;i<str.length();i++){
            char ci  = str.charAt(i);
            String nexString = str.substring(0,i)+str.substring(i+1);
            print(nexString, perm+ci, idx+1);
        }
    }
    public static void main(String[]args){
        String str = "abcde";
        print(str, " ", 0);
    }
*/
