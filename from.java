// import java.util.HashSet;
// import java.util.Set;

/*public class from{
    public static void solution(int n){
        /*for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(" * ");
            }
        
        System.out.println();
        }
        for(int i = 0;i<n;i++){
            for(int j = 2*(n-i);j>=0;j--){
                System.out.println(" ");
            }
        
        for(int j = 0;j<=i;j++){
            System.out.println("* ");
        }
        System.out.println();
    }
    }
    public static void main(String[]args){
        solution(5);
    }
}*/
/*public class from{
    static int solution(int arr1[],int arr2[],int n,int m){
        int i = 0 ;
        int j = 0;
        while(i<m&&j<n){
            if(arr1[i]<arr2[j]){
                System.out.println(arr1[i++]+ "");
            }
            else if(arr1[i]>arr2[j]){
                System.out.println(arr2[j] + "");
            }
            else{
                System.out.println(arr2[j++] + "");
                i++;
            }
        }
        while(i < m){
            System.out.println(arr1[i++] + "");
        }
        while(j < n){
            System.out.println(arr2[j++]  + "");
        }
        return 0;
    }
    public static void main(String[]args){
        int arr1[] = {1,2,3,4,5,6,7,8};
        int arr2[] = {2,4,5,7};
        int m = arr1.length;
        int n = arr2.length;
        solution(arr1, arr2, n, m);
    }
}*/
// import java.util.*;
/*public class from{
    public static void rowsorting(int mat[][],int n){
        for(int j = 0;j<n;j++){
            Arrays.sort(mat[j]);
        }
    }
    public static void transpose(int mat[][],int n){
        for(int i =0 ;i<n;i++){
            for(int j =i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public static void column(int mat[][],int n){
        rowsorting(mat, n);
        transpose(mat, n);
        rowsorting(mat, n);
        transpose(mat, n);
    }
    public static void printing(int mat[][],int n){
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(mat[i][j] + "");
            }
        }
        System.out.println();
    }
    public static void  main(String[]args){
        int mat[][] = { { 4, 1, 3 },
        { 9, 6, 8 },
        { 5, 2, 7 } };
        int n = 3;
        System.out.println("before sorted matrix");
       printing(mat, n);
        column(mat, n);
        System.out.println("after sorted matrix");
        printing(mat, n);
    }
}*/
// import java.util.*;
// import java.util.Collections;
// public class from{
//     public static void rowise(int mat[][] , int n, boolean ascending){
//         for(int i = 0;i<n;i++){
//             if(ascending){
//                 Arrays.sort(mat[i]);

//             }
//             else{
//                 Arrays.sort(mat[i],Collections.reverseOrder());
//             }
//         }
//     }
//     public static void transpose(int mat[][],int n){
//         for(int i =0;i<n;i++){
//             for(int j = i+1;j<n;j++){
//                 int temp = mat[i][j];
//                 mat[i][j] = mat[j][i];
//                 mat[j][i] = temp;
//             }
//         }
//     }
//     public static void column(int mat[][] , int n){
//         rowise(mat, n, true);
//         transpose(mat, n);
//         rowise(mat, n, false);
//         transpose(mat, n);
//     }
//     public static void printing(int mat[][],int n){
//         for(int i= 0;i<n;i++){
//             for(int j = 0;j<n;j++){
//                 System.out.print(mat[i][j] + "");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[]args){
//         int mat[][] =  {{3, 2, 1},
//         {9, 8, 7},
//         {6, 5, 4}};
//         int n = 3;
//         System.out.println("before sorting");
//         printing(mat, n);
//         column(mat, n);
//         System.out.println("after sorting");
//         printing(mat, n);
        
//     }
// }

// tower of hanoi problem


/*import java.util.*;
public class from{
    public static void towerofhanpoi(int n, String src, String helper,String dest){
        if(n==1){
            System.out.println("transfer disk " + n +"from " +src +"to" +dest);
            return;
        }
        towerofhanpoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n  +  "  from " + src + " to " + dest);
        towerofhanpoi(n-1, helper, src, dest);
    }
     public static void main(String[]args){
        int n = 3;
        towerofhanpoi( n , " s ", " h ", " d ");

    }
}*/

// reverse the string 



/*public class from{
    public static void print(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        print(str, idx-1);

    }
    public static void main(String[]args){
        String str = "hello";
        print(str, str.length()-1);
    }
}*/
//find its first and last oocurence


/*public class from{
    public static int first = -1;
    public static int last = -1;
    public static void print(String s , int idx, char ele){
        if(idx == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = s.charAt(idx);
        if(curr == ele){
            if(first==-1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        print(s, idx+1, ele);
    }
    public static void main(String[] args){
        String s = "abaabababzabbbb";
        print(s, 0, 'a');
    }
}*/

//return it is sorted(Strictly increasing)



/*public class from{
    public static boolean printi(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
           return printi(arr, idx+1);
            
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        int arr[] = {1,2,3,3};
        System.out.println(printi(arr, 0));
    }
}*/
/*public class from{
    public static void main(String[]args){
        try{
            int data1 = 50/0;
        }
        catch(Exception e){
            try{
            int data2 = 50/0;
            }
            catch(ArithmeticException q){
                System.out.println("exception is removed by");
            }
        }
        System.out.println("rest of the code");
    }
}*/
/*public class from{
    public static void print(int age){
        if(age<18){
            throw new ArithmeticException("person is not eligible to vote");
        }
        else{
            throw new ArithmeticException("person is eligible to vote");
        }
    }
    public static void main(String[]args){
        print(19);System.out.println("rest of the code");
    }
}*/ 
/*public class from{
    public static void print(String str,int idx,int count , String newstr){
        if(idx == str.length()){
            for(int i = 0;i<count;i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char curr = str.charAt(idx);
        if(curr == 'x'){
            count++;
            print(str, idx+1, count, newstr);
        }
        else{
            newstr += curr;
            print(str, idx+1, count, newstr);
        }
    }
    public static void main(String[]args){
String str = "axbxcxdx";
print(str, 0, 0, "");
    }
}*/

/*public class from{
    public static boolean[] map = new boolean[26];
    public static void remove(String str,int idx,String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar -'a']==true){
            remove(str, idx+1, newstr);
        }
        else{
            newstr += currchar;
            map[currchar - 'a'] = true;
            remove(str, idx+1, newstr);
        }
    }
        public static void main(String[]args){
            String str = "aabbccdda";
            remove(str, 0, "");
    }
}*/
/*import java.util.*;
public class from{
    public static void solution(String str,int idx,String newstr,HashSet<String>set){
        if(idx == str.length()){
           if(set.contains(newstr)){
            return;
           }
           else{
            System.out.println(newstr);
            set.add(newstr);
            return;
           }
            
        }
        char currchar = str.charAt(idx);
        solution(str, idx+1, newstr+currchar,set);
        solution(str, idx+1, newstr,set);
    }
    public static void main(String[]args){
        HashSet<String>set = new HashSet<>();
        String str = "aaa";
        solution(str, 0, "",set);
    }
}
public class from{
    /*public static String solution(String s,int numRows){
        //n create the string builder
     StringBuilder[] sb = new StringBuilder[numRows];
     for(int i = 0;i<numRows;i++){
        sb[i] = new StringBuilder();
     }
     // define varriable
     char a[] = s.toCharArray();
     int n = a.length;
     int index = 0;
     while(index<n){
        // move down
        for(int i = 0;i<numRows&&index<n;i++){
            sb[i].append(a[index++]);
        }
        //move down to up
        for(int i = numRows-2 ; i>0&&index<n;i--){
            sb[i].append(a[index++]);
        }
     }
     // merge the all the string
     StringBuilder res = sb[0];
     for(int i = 1;i<numRows;i++){
        res.append(sb[i].toString());
     }
     return res.toString();

    }
    public static ListNode solution(ListNode head){
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode current = head;
        while(current ! = null && current.next != null){
            prev.next = current.next;
            current.next = current.next.next;
            prev.next.next = current;
            current = current.next;
            prev = prev.next.next;

        }
        return dummy.next;
    }
    }
    public static void main(String[]args){

    }
}*/
// public class from{
    /*public static long solution(int arr[],int n,int k){
        n = arr.length;
        int t = 0;
        // making every element is arr
        for(int i = 0;i<n;i++){
            arr[i] = (arr[i]+k)%k;
        
        }
        // make hash table 
        int h[] = new int[k];
        // store the count of element in hash
        for(int i =0 ;i<n;i++){
            h[arr[i]]++;
        }
        //count the umber whose the absolute difference is k 
        for(int i = 0;i<k;i++){
            t += (h[i]*(h[i-1]))/2;
        }
        return t;
    }*/
   /*  public static void solution(int arr[],int n){
        Set<Integer> h = new HashSet<>();
        int s = 0;
        for(int i = 0;i<;i++){
            s += arr[i];
        
        if(arr[i]==0||s ==0 ||h.contains(s)){
            return true;
        }
        h.add(s);
    }
    return false;
    }
    public static void main(String[]args){

    }
}*/
// public class from{
   /*  public static final b = 32;
    public static int solution(int set[],int n){
        n = set.length;
        int idx = 0;
        for(int i = b-1;i>=0;i-- ){
            int mi = idx;
            int me = Integer.MIN_VALUE;
            for(int j = idx;j<n;j++){
                if((set[j]&(1<<i))!=0&&set[j]>me){
                    me = set[j];
                    mi = j;
                }
            }
        }
        if()
    }
    public static ListNode solution(ListNode l1,ListNode l2){
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null){
            curr.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            curr.next = l2;
            l2 = l2.next;
        }
        return temp.next;
    }*/
   /*  import java.util.*;
    public class from{
     public static void solution(int arr1[],int m,int n,int arr2[]){
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;
        while(p2>=0){
            if(p1>=0 && arr1[p1]>arr2[p2]){
                arr1[i--] = arr1[p1--];
            }
            else{
                arr1[i--] = arr1[p2--];
            }
        }
    }
    public static void solution(int arr1[],int arr2[]){
        HashSet<Integer> h = new HashSet<>();

        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0;i<arr1.length;i++){
            h.add(arr1[i]);
        }
        for(int j = 0;j<arr2.length;j++){
            l.add(arr2[j]);
            h.remove(arr2[j]);
        }
        int  arr[] = new int[l.size()];
        for(int i = 0;
        <)

    }
    public static void main(String[]args){
        int arr1[] = {3,5,6};
        int arr2[] = {1,3,5};
        int m = arr1.length;
        int n = arr2.length;
        solution(arr1, m, n, arr2);
        System.out.println(arr1);
    }
}*/
 /*class Node{
    int data;
    Node left,right;
    Node(int d){
        data = d;
        left = right = null;
    }
}
public class from{
Node root;
public static int solution(Node node){
    if(node==null){
        return 0;
    }
    int ov = node.data;
     node.data = solution(node.left)+solution(node.right);
    return node.data+ov;
}
void print(Node node){
    if(node == null){
        return;
    }
    print(node.left);
    System.out.println(node.data+"");
    print(node.right);
}

    public static void main(String[]args){
        from o = new from();
        o.root = new Node(10);
        o.root.left = new Node(-2);
        o.root.right = new Node(6);
        o.root.left.left = new Node(8);
        o.root.left.right = new Node(-4);
        o.root.right.left = new Node(7);
        o.root.right.right = new Node(5);
        o.solution(o.root);
        System.out.println("inorder traversal of the preorder");
        o.print(o.root);

    }
}*/
public class from{
    public int solution(int col[][],int n){
        // create a 2 d array
        int d[][]= new int[n][3];
        if(n==0){
            return;
        }
        d[0][0]= col[0][0];
        d[0][1]= col[0][1];
        d[0][2]= col[0][2];
        for(int i = 1;i<n;i++){
             d[i][0] = Math.min(d[i-1][1],d[i-1][2])+col[i][0];
             d[i][1] = Math.min(d[i-1][0],d[i-1][2])+col[i][1];
             d[i][2] = Math.min(d[i-1][0],d[i-1][1])+col[i][2];
        }
    }
       
    public static void main(String[]args){

    }
}