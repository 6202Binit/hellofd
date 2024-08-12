

// import java.util.Arrays;

/*public class hashing{   //time complecity is O(n*m)
    public static boolean issubset(int arr1[],int arr2[],int m, int n){
        int j = 0;
        for(int i = 0;i<m;i++){
            for( j = 0;j<n;j++){
                if(arr1[i]==arr2[j]){
                    break;
                }
            }
            if(j==m){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
       int m = arr1.length;
       int n = arr2.length;
       if(issubset(arr1, arr2, m, n)){
        System.out.println("subset");

       }
       else{
        System.out.println("not subset");
       }
    }
}*/
/*public class hashing{
    public static boolean issubset(int arr1[],int arr2[],int m,int n){
        int i = 0;
        sort(arr1, 0, m-1);
        for(i = 0;i<n;i++){
            if(binarysearch(arr1, 0, n-1, arr1[i])==-1){
                return false;
            }
        }
        return true;
    }
    public static int binarysearch(int arr[],int low,int high,int x){
        if(low>=high){
            int mid = (low+high)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(x>arr[mid]){
                binarysearch(arr, mid+1, high, x);
            }
            else{
                binarysearch(arr, low, mid-1, x);
            }
        }
        return -1;
    }
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void sort(int arr[],int low,int high){
        if(low<high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    public static void main(String[]args){
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
       int m = arr1.length;
       int n = arr2.length;
       if(issubset(arr1, arr2, m, n)){
        System.out.println("subset");

       }
       else{
        System.out.println("not subset");
       }
    }
}*/
/*public class hashing{
    public static boolean issubset(int arr1[],int arr2[],int m,int n){
        int i = 0;
        int j = 0;
        if(m<n){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr1);
        while(i<n && j<m){
            if(arr1[j]<arr2[i]){
                j++;
            }
            else if(arr1[j] == arr2[i]){
                i++;
                j++;
            }
            else if(arr1[j]>arr2[i]){
                return false;
            }
        }
        if(i<n){
            return false;
        }
        else{
            return true;
        }

    }
    public static void main(String[]args){
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
       int m = arr1.length;
       int n = arr2.length;
       if(issubset(arr1, arr2, m, n)){
        System.out.println("subset");

       }
       else{
        System.out.println("not subset");
       }
    }
}*/
/*import java.util.*;
public class hashing{
    public static boolean issubset(int arr1[],int arr2[],int m ,int n){
        HashSet<Integer> al = new HashSet<>();
        for(int i= 0;i<m;i++){
            if(!al.contains(arr1[i])){
                al.add(arr1[i]);
            }
        }
        for(int j = 0;j<n;j++){
            if(!al.contains(arr2[j]))
            return false;
        }
        return true;
    }
    public static void main(String[]args){
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7,56 };
       int m = arr1.length;
       int n = arr2.length;
       if(issubset(arr1, arr2, m, n)){
        System.out.println("subset");

       }
       else{
        System.out.println("not subset");
       }
    }
}*/
/*import java.io.*;
import java.util.*;
public class hashing{
    public static void main(String[]args){
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
        int m = arr1.length;
        int n = arr2.length;
        Set<Integer> al = new HashSet<>();
        for(int i  =0;i<m;i++){
            al.add(arr1[i]);
        }
        int p = al.size();
        for(int j = 0;j<n;j++){
            al.add(arr2[j]);
        }
        if(p==al.size()){
            System.out.println("contains");
        }
        else{
            System.out.println("Not contains");
        }
    }
}*/
/*import java.io.*;
import java.util.*;
public class hashing{
    public static boolean isSubset(int arr1[],int arr2[],int m , int n){
       HashMap<Integer,Integer> al = new HashMap<Integer,Integer>(); 
       for(int i = 0;i<m;i++){
        al.put(arr1[i], al.getOrDefault(arr1[i], 0+1));
       }
       for(int i = 0;i<n;i++){
        if (al.getOrDefault(arr2[i], 0) > 0){
                al.put(arr2[i],
                      al.get(arr1[i]) - 1);
        }
        else{
            return false;
        }
       }
      
       return true;
    }
    public static void main(String[]args){
        int[] arr1 = { 11, 1, 13, 21, 3, 7 };
        int[] arr2 = { 11, 3, 7, 1 };
 
        int m = arr1.length;
        int n = arr2.length;
 
        if (isSubset(arr1, arr2, m, n))
            System.out.println(
                "arr2[] is subset of arr1[] ");
        else
            System.out.println(
                "arr2[] is not a subset of arr1[] ");
    }
}*/
/*public class hashing{
    public static boolean isdisjoint(int set1[],int set2[]){
        int i = 0;
        int j = 0;
        Arrays.sort(set1);
        Arrays.sort(set2);
        while(i<set1.length&&j<set2.length){
            if(set1[i]<set2[j]){
                i++;
            }
            else if(set1[i]>set2[j]){
                j++;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[]args){
        hashing dis = new hashing();
        int set1[] = { 12, 34, 11, 9, 3 };
        int set2[] = { 7, 2, 1, 9 };
  
        boolean result = dis.isdisjoint(set1, set2);
        if (result)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
public class hashing{
    //here time complexity is O(n**2)
    /*public static int issolution(int arr[],int m){
        int maxcount = 0;
        int max_frequency = 0;
        for(int i = 0;i<m;i++){
            int count = 0;
            for(int j = 0;j<m;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount = count;
                max_frequency = arr[i];
            }
        }
        return max_frequency;
    }
    //time complexity is O(nlogn)
    public static int issoluton(int arr[],int m){
        Arrays.sort(arr);
        int max_count = 1;
        int res = arr[0];
        int curr_count = 1;
        for(int i = 0;i<m;i++){
            if(arr[i]==arr[i-1]){
                curr_count++;
            }
            else{
                curr_count = 1;
            }
            if(curr_count>max_count){
                max_count = curr_count;
                res = arr[i-1];
            }
        }
        return res;
    }
    public static void main(String[]args){
        int arr[] = { 40,50,30,40,50,30,30};
        int m = arr.length;
        System.out.println(issoluton(arr, m));
    }
}*/
// import java.util.HashMap;
// import java.util.*;
/*public class hashing{
    class pair{
        int first;
        int second;
        pair(int f , int s){
            first = f;
            second = s;
        }
    }
    public boolean solution(int arr[]){
        int n = arr.length;
        HashMap<Integer,pair> list = new HashMap<>();
        for(int i= 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int sum = arr[i]+arr[j];
                if(!list.containsKey(sum)){
                    list.put(sum, new pair(i, j));
            }
            else{
                pair p = list.get(sum);
                System.out.println((arr[p.first] +","+arr[p.second] +",") + arr[i] +","+ arr[j]);
                return true;
            }
        }
    }
return false;
    }
    public static void main(String[]args){
        int arr[] = {3, 4, 7, 1, 2, 9, 8};
        hashing p = new hashing();
        p.solution(arr);
    }
}*/
/*import java.util.HashMap;
import java.util.*;
public class hashing{
    class pair{
        int first;
        int second;
        pair(int f,int s){
            first = f;
            second = s;
        }
    }
    public boolean solution(int arr[]){
        int n = arr.length;
        HashMap<Integer,pair> list =new HashMap<>();
        for(int i = 0;i<n;i++)
        for(int j = i+1;j<n;j++){
            int sum  = arr[i]+arr[j];
            if(!list.containsKey(sum)){
                list.put(sum, new pair(i,j));
            }
            else{
                pair p = list.get(sum);
                System.out.println((arr[p.first] +","+arr[p.second] +",") + arr[i] +","+ arr[j]);
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
      
            int arr[] = {3, 4, 7, 1, 2, 9, 8};
            hashing p = new hashing();
            p.solution(arr);
    }
}*/
/*import java.util.HashMap;
import java.util.*;
public class hashing{
    public static int solution(int arr[],int n){
        int max_sum = 0;
        for(int i = 0;i<n;i++){
            int curr_sum=0;
            for(int j = 1;j<n;j++){
                curr_sum += arr[j];
            
            if(curr_sum==0){
                max_sum = Math.max(max_sum, j-i+1);
            }
            }
        }
        return max_sum;
    }
    public static void main(String[]args){
        
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
       
      // Function call
        System.out.println("Length of the longest 0 sum "
                           + "subarray is " + solution(arr, n));
    }
}*/
/*import java.util.HashMap;
import java.util.*;
public class hashing{
    public static int solution(int arr[],int n){
        HashMap<Integer,Integer>list = new HashMap<>();
        int sum = 0;
        int max_len = 0;
        for(int  i= 0;i<n;i++){
            sum  += arr[i];
            if(sum == 0){
                max_len = i+1;
            }
            Integer al = list.get(sum);
            if(al != null){
                max_len = Math.max(max_len, i-al);
            }
            else{
                list.put(sum, i);
            }
        }
        return max_len;
    }
    public static void main(string[]args){
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
       
      // Function call
        System.out.println("Length of the longest 0 sum "
                           + "subarray is " + solution(arr, n));
    }
}*/
/*import java.util.HashMap;

import javax.crypto.Mac;

import java.util.*;
public class hashing{
    public static int solution(int arr[],int n){
        HashMap<Integer,Integer>list = new HashMap<>();
        int sum = 0;
        int max_len = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
            if(sum == 0){
                max_len = i+1;
            }
            Integer j = list.get(sum);
            if(j != null){
            max_len = Math.max(max_len, i-j);
            }
            else{
                list.put(sum, i);
            }
        }
        return max_len;
    }
    public static void main(String[]args){
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
       
      // Function call
        System.out.println("Length of the longest 0 sum "
                           + "subarray is " + solution(arr, n));
    }

}*/ 
/*import java.util.*;
public class hashing{
    public static int solution(int arr[],int n){
        int si= 0;
        int ei = 0;
        int sum = 0;
        int max_size = -1;
        for(int i = 0;i<n-1;i++){
            sum = (arr[i]==0)? -1:1;
            for(int j = i+1;j<n;j++){
                if(arr[j]==0){
                    sum += -1;
                }
                else{
                    sum += 1;
                }
                if(sum==0&&max_size<i-j+1){
                    max_size = i-j+1;
                    si = i;
                }
            }
        }
        ei = si+max_size-1;
        if(max_size==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println(si +"to"+ei);
        }
        return max_size;

    }
    public static void main(String[]args){
        int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        int n = arr.length;
 
        solution(arr, n);
    }
}*//* */
/*import java.util.HashMap;
import java.util.*;
public class hashing{
    public static int solution(int arr[],int n){
        HashMap<Integer,Integer> list = new HashMap<>();

        int sum = 0;
        int si = 0;
        int ei = 0;
        int max_len = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i] = -1;

            }else{
                arr[i] = 1;
            }
        }
        for(int i  =0;i<n;i++){
            sum += arr[i];
            if(sum ==0){
                max_len = i+1;
                ei =  i;
            }
            if(list.containsKey(sum)){
                if(max_len<i-list.get(sum)){
                    max_len = i - list.get(sum);
                    ei = 1;
                }
                
            }
            else{
                list.put(sum, i);
            }

        }
        for(int i = 0;i<n;i++){
            if(arr[i] == -1){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
        
        int end = ei - max_len + 1;
        System.out.println(end + " to " +ei);
 
        return max_len;
    }
    public static void main(String[]args){
        int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        int n = arr.length;
 
        solution(arr, n);
    }
}*/
/*import java.util.HashMap;
import java.util.*;
public class hashing{
    public static int solution(int arr[],int n){
        HashMap<Integer,Integer>list = new HashMap<>();
        int sum = 0;
        int si = 0;
        int ei  =0;
        int max_len = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                arr[i] = -1;
            }
            else{
                arr[i] = 1;
            }
        }
        for(int i = 0;i<n;i++){
            sum += arr[i];
            if(sum ==0){
                max_len = i+1;
                ei = i;
            }
            if(list.containsKey(sum)){
                if(max_len<i-list.get(sum)){
                    max_len = i-list.get(sum);
                    ei = i;
                }
            }
            else{
                list.put(sum, i);
            }
        }
        for(int i = 0;i<n;i++){
            if(arr[i] ==-1){
                arr[i] = -0;
            }
            else{
                arr[i] = 1;
            }
        }
        
        int end =ei - max_len + 1;
        System.out.println(end + " to " + ei);
        return max_len;
    }
    public static void main(String[]aStrings) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        int n = arr.length;
 
        solution(arr, n);
    }
}*/
import java.util.*;
public class hasing{
    public static void main()
}