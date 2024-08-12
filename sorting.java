import javax.sql.StatementEventListener;

/*import java.util.*;
// selection sort

import javax.print.event.PrintEvent;


public class sorting {
    public static void solution(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int mi = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[mi]){
                    mi = j;
                }
               int temp = arr[mi];
               arr[mi] = arr[i];
               arr[i] = temp; 
            }
        }
    }
         void array(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"");
            System.out.println();
        }
    }
    public static void main(String[]args){
        sorting o = new sorting();
        int arr[] = {3,5,7,3,2,0,5};
        o.solution(arr);
        System.out.println("sorted array");
        o.array(arr);
        // System.out.println(solution(arr));
    }  
}*/
/*public class sorting{
    public static void solution(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int mi =i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[mi]){
                    mi=j;
                }
            }
                int temp = arr[mi];
                arr[mi] = arr[i];
                arr[i] = temp;
        
        }
    }
    static void prin(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
            System.out.println();
        }
    }
    public static void main(String[]args){
       /*  int arr[] = {23,54,4,68,6,53,5,78,97,4};
        solution(arr);
        System.out.println("the sorted array is");
        prin(arr);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        solution(arr);
        System.out.println("the sorted array is");
        prin(arr);
    }
}*/
/*public class sorting{
    public static void solution(int arr[],int n){
        n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void prin(int arr[],int n){
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + "");
            System.out.println();
        }
    }
    public static void main(String[]args){
        int arr[] = {12,32,1,22,12,3,4,532,21};
        int n = arr.length;
        solution(arr, n);
        System.out.println("the sorted array is");
        prin(arr, n);
    }
}*/
/*public class sorting{
    public static void solution(int arr[]){
       int n = arr.length;
        for(int i =1;i<n;i++){
            int k =arr[i];
            int j = i-1;
            while(j>0  && arr[j]>k){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = k;
            
        }
    }
    static void prin(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[]args){
        int arr[] = {21,3,2,1,5,4,7,6,8};
        int n = arr.length;
        solution(arr);
        System.out.println("the sorted array is");
        prin(arr);
    }
}
public class sorting{
    public static void conquer(int arr[],int si,int mid,int li){
        int merge[] =  new int[li-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx1<=mid&&idx2<=li){
            if(arr[idx1]<=arr[idx2]){
                merge[x++] = arr[idx1++];
            }
            else{
                merge[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merge[x++] = arr[idx1++];
        }
        while(idx2<=li){
            merge[x++] = arr[idx2++];
        }
        for(int i = 0,j = si;i<merge.length;i++,j++){
            arr[j] = merge[i];
        }

    }
    public static void divide(int arr[],int si ,int li){
        if(si>=li){
            return;
        }
       int mid = si+(li-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,li);
        conquer(arr,si,mid,li);
    }
    public static void main(String[]args){
        int arr[] = {3,2,5,4,9,6,5};
        int n = arr.length;
        divide(arr, 0, n-1);
        for(int i= 0;i<n;i++){
            System.out.println(arr[i] + "");

        }
        System.out.println();
    }
}
public class sorting{
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
         arr[high]= temp;
         return i;
    }
    public static void quick(int arr[],int low,int high){
        if(low<=high){
            int pidx = partition(arr,low,high);

            quick(arr, low, pidx-1);
            quick(arr, pidx+1, high);
        }
    }
    public static void main(String[]args){
        int arr[] = {3,1,5,4,8,7};
        int n = arr.length;
        quick(arr, 0, n-1);
        for(int i= 0;i<n;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();

    }
}
public class sorting{
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[]args){
        int n = 9;
        System.out.println(fib(n));
    }
}*/
// selection sort 
/*public class sorting{
    public static void solution(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int mi = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[mi]){
                    mi = j;
                }
            }
            int temp = arr[mi];
            arr[mi] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void main(String[]args){
        int arr[] = {64,25,12,22,11};
        solution(arr);
        System.out.println("sorted array");
        print(arr);
    }
}*/
//bubble sort : time complexity is O(n*n);
// this algorithm is applicable samll number of array


/*public class sorting{
    public static void bubble(int arr[]){
        int n  = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j =  0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
       
        int arr[] = { 5, 1, 4, 2, 8 };
        bubble(arr);
        System.out.println("sorted array");
        print(arr);
    }
}*/
/*public class sorting{
    public static void bubble(int arr[]){
        int n = arr.length;
        int i , j,temp;
        boolean swap;
        for( i = 0;i<n-1;i++){
            swap = false;
            for(j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
        }
    }
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[]args){

        int arr[] = { 5, 1, 4, 2, 8 };
        bubble(arr);
        System.out.println("sorted array");
        print(arr);
    }
}*/
/*public class sorting{
    public static void bubble(int arr[],int n){
       n = arr.length;
       if(n==0||n==1){
        return ;
       } 
       for(int i = 0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            swap(arr, i, i+1);
        }
       }bubble(arr, n-1);
    }
    public static final void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
     
    public static void main(String[]args){
        int arr[] = { 5, 1, 4, 2, 8 };
        int n = arr.length;
        bubble(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}*/
// insertion sorting

/*public class sorting{
    public static void insertion(int arr[]){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int arr[] = { 12, 11, 13, 5, 6 };
        insertion(arr);
        System.out.println("sorted array");
        print(arr);
    }
}*/

