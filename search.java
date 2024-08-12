/*public class search {
    public static int solution(int arr[],int n,int x){
        for(int i = 0;i<n;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[] = {2,3,5,1,6,9,8};
        int n = arr.length;
        int x = 1;
        int result = solution(arr, n, x);
        if(result == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at the index " +result);
        }
    }
}*/
/*public class search{
    static int arr[] = {1,3,2,4,6,5};
    public static int sol(int arr[],int n , int x){
        if(n==0){
            return -1;
        }
        else if(arr[n-1]==x){
            return n-1;
        }
        else{
            return sol(arr, n-1, x);
        }
        
    }
    public static void main(String[]args){
        int x = 55;
        int n = arr.length;
        int i = sol(arr, n, x);
        if(i !=-1){
            System.out.println("element"+x+""+i);
        }
        else{
            System.out.println("not prsenrt");
        }

    }
}*/
/*public class search{
    public static int sol(int arr[],int l,int r,int x){
        if(r>=l){
            int m = l+(r-l)/2;
            if(arr[m]==x){
                return x;
            }
            else if(arr[m]>x){
                return sol(arr, l, m-1, x);
            }
            else{
                return sol(arr, m+1, r, x);
            }
        }
        return -1;
    }
    public static void main(String[]args){
        search ob = new search();
        int arr[] = {2,2,5,7,9,10};
        int n = arr.length;
        int x = 5;
        int p = ob.sol(arr, 0, n-1, x);
        if(p==-1){
            System.out.println("not presnet");
        }
        else{
            System.out.println("present"+p);
        }

    }
}*/
/*public class search{
    public static int sol(int arr[], int l, int r,int x){
        if(r>=l){
            int m1 = l+(r-l)/3;
            int m2 = r-(r-l)/3;
            if(arr[m1]==x){
                return m1;
            }
            if(arr[m2]==x){
                return m2;
            }
            if(arr[m1]>x){
                return sol(arr, l, m1-1, x);
            }
            else if(arr[m2])
        }
        return -1;
    }
    public static void main(String[]args){

    }
}*/
/*public class search{
    public static int solution(int arr[],int n,int x){
         n = arr.length;
         //finding block sized to be jump
         int step = (int)Math.floor(Math.sqrt(n));
         //finding the block where element the present

         int prev =0;
         while(arr[Math.min(step, n)-1]<x){
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));

            if(prev>=n){
                return -1;
            }
         }
         //doing a linear search for x in block
         while(arr[prev]<x){
            prev++;

            if(prev == Math.min(step, n)){
                return -1;
            }

         }
         if(arr[prev]==x){
            return prev;
         }
         return -1;

    }
    public static void main(String[]args){
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
            34, 55, 89, 144, 233, 377, 610};
            int n = arr.length;
int x = 55;

// Find the index of 'x' using Jump Search
int index = solution(arr,n, x);

// Print the index where 'x' is located
System.out.println("\nNumber " + x +
                    " is at index " + index);
    }
}*/
/*public class search{
    public static int jump(int arr[],int n , int x){
        n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while(arr[Math.min(step, n)-1]<x){
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if(prev>=n){
                return -1;
            }
        }
        while(arr[prev]<x){
            prev++;
            if(prev==Math.min(step, n)){
                return -1;
            }
        }
        if(arr[prev]==x){
            return prev;
        }
        return -1;

    }
    public static void main(String[]args){
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
            34, 55, 89, 144, 233, 377, 610};
            int n = arr.length;
int x = 55;

// Find the index of 'x' using Jump Search
int index = jump(arr,n, x);

// Print the index where 'x' is located
System.out.println("\nNumber " + x +
                    " is at index " + index);
    }
}*/
/*import java.util.*;
public class search{
    public static int interpolation(int arr[],int lo,int hi,int x){
        int pos;
        if(lo<=hi&& x>= arr[lo]&&x<=arr[hi]){
            pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]));
        
        if(arr[pos]==x){
            return pos;
        }
        if(arr[pos]<x){
            return interpolation(arr, pos+1, hi, x);
        }
        if(arr[pos]>x){
            return interpolation(arr, lo, pos-1, x);
        }
    }
    return -1;
    }
    public static void main(String[]args){
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,
            22, 23, 24, 33, 35, 42, 47 };

        int n = arr.length;

// Element to be searched
        int x = 18;
        int index = interpolation(arr, 0, n - 1, x);

// If element was found
if (index != -1)
  System.out.println("Element found at index "
                     + index);
else
  System.out.println("Element not found.");
    }
}*/
/*import java.util.Arrays;
  
public class search{
    public static int exponential(int arr[],int n,int x){
        if(arr[0]==x){
            return 0;
        }
        int i = 1;
        while(i<n&&arr[i]<x){
            i = i*2;
        }
        return Arrays.binarySearch(arr, i/2,Math.min(i, n-1),x);
    }
    public static void main(String[]args){

        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = exponential(arr, arr.length, x);
          
        System.out.println((result < 0) ? 
          "Element is not present in array" :
          "Element is present at index " + 
                             result);
    }
}
import java.util.*;
public class search{
    public static int f(int x){
        return x*x-10*x+20;
    }
    public static int first(){
        if(f(0)>0){
            return 0;
        }
        int i = 1;
        while(f(i)<=0){
            i = i*2;
        }
        return binary(i/2,i);
    }
    public static int binary(int l,int h){
        if(l>=h){
            int mid = (l + (h-l)/2);

            if(f(mid)>0 && (mid == l|| f(mid-1)<=l)){

            }
        }
    }
    public static void main(String[]args){

    }
}*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class search{
    public static void main(String[]args){
    /*List<Integer>list1 = List.of(1,2,3,4);
    List<Integer>list2 = Arrays.asList(2,3,4,5);
   // ArrayList<Integer>list3 =  ArrayList(1,2,3,4);

    System.out.println(list1);
    System.out.println(list2);
   // System.out.println(list3);
ArrayList<Integer>l = new ArrayList<>();
for(int i : list1){
    if( i%2==0){
        l.add(i);
    }
}
System.out.println(l);
Stream<Integer>s = list1.stream();
List<Integer>j = s.filter(i->i%2==0).collect(Collectors.toList());


//List<Integer> h = g.filter().sorted().collect(Collectors.toList());


System.out.println(j);
// cretae a stream objec
Stream<Object>news = Stream.empty();
news.forEach(e->{
    System.out.println(e);
});

// create string oject by using new way
String names[] = {"hello","binit","jha","ravi"};
Stream<String>st  = Stream.of(names);
st.forEach(e->{
    System.out.println(e);
});

Stream<Integer>a = list2.stream();
List<Integer>b = a.map(i->i*i).collect(Collectors.toList());
    System.out.println(b);*/

    String binit = "hello my name is binit";
    Optional<String>opt = Optional.ofNullable(binit);
    System.out.println(opt.isPresent());
    System.out.println(opt.get());
    System.out.println(opt.hashCode());
    System.out.println(opt.orElse("binit jha"));
    System.out.println(opt.isEmpty());

    }
}