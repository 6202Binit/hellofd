import java.util.Arrays;

// import java.net.SocketTimeoutException;
// import java.util.*;

// import javax.xml.transform.Source;
// import javax.xml.transform.SourceLocator;

// // import java.util.Arrays;
// // import java.util.Scanner;

// // /*public class prb {
// //     public static void main(String[]args){
// //         Scanner sc = new Scanner(System.in);
// //         int arr[] = new int[5];
// //         int m = arr.length;
// //         System.out.println("the first array is :");
// //         for(int i = 0;i<5;i++){
// //             arr[i] = sc.nextInt();
// //         }
// //         int arr1[] = new int[5];
// //         int n = arr.length;
// //         System.out.println("the second array is:");
// //         for(int j = 0;j<5;j++){
// //             arr1[j] = sc.nextInt();
// //         }

// //         /*int arr[] = {2,34,5,6};
// //         int arr1[] = {4,57,8,34,57};
// //         int m = arr.length;
// //         int n = arr1.length;
// //          System.out.println("the first array is :");
// //         System.out.println(Arrays.toString(arr));
// //         System.out.println("the second array is:"+ Arrays.toString(arr1));
// //         Arrays.sort(arr);
// //         System.out.println("the first sorted array is:" + Arrays.toString(arr));
// //         Arrays.sort(arr1);
// //         System.out.println("the second sorted array is :" + Arrays.toString(arr1));
// //         int result[] = new int[m+n];
// //         System.arraycopy(arr, 0, result, 0, m);
// //         System.arraycopy(arr1, 0, result, m, n);
// //         Arrays.sort(result);
// //         System.out.println(Arrays.toString(result));
// //     }
    
// // }*/
// // public class prb{
// //     public static void main(String[]args){
// //         int arr[] = {2,3,4,3,5,6};
// //         int arr1[] = {34,56,78,23,45};
// //         int sa[],da[],sp,dp,len;
// //         sa = arr;
// //         da = arr1;
// //         sp = 2;
// //         dp = 5;
// //         len = 3;
// //         System.out.println("source array:");
// //         for(int i = 0;i<arr.length;i++){
// //             System.out.println(arr[i] + "");
// //             System.out.println();
// //         }
// //         System.out.println(sa+"source array");
// //         System.out.println("destination array");
// //         for(int i = 0;i<arr1.length;i++){
// //             System.out.println(arr[i] + "the destination array");
// //             System.out.println();
// //         }
// //         System.out.println(da+"destination array");
// //         System.out.println("length " + len);
// //         System.arraycopy(sa, sp, da, dp, len);
// //         System.out.println("the resultant array is :");
// //         for(int i = 0; i<arr1.length;i++){
// //             System.out.println(arr1[i] + "");
// //         }
// //     }
// // }
// /*public class prb{
//     public static void main(String[]args){
//     int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//     int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
//     int mul[][] = new int[1000][1000];
//     // int m = arr.length;
//     // int n = arr1.length;
//     for(int i = 0;i<3;i++){
//         for(int j =0 ;j<3;j++){
//             mul[i][j] = 0;
        
//         for(int k = 0;k<3;k++){
//             mul[i][j] += arr[i][j] * arr1[i][j];
//         }
//         System.out.print(mul[i][j] + " ");
//         }
//         System.out.println();
//     }
//     }
// }  */
// /*public class prb{
//     public static void main(String[]args){
//         boolean flag = true;
//         int  arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         int a = arr.length;
//         int b = arr[0].length;
//         int c = arr1.length;
//         int d = arr1[0].length;
//         if(a!=c && b !=d ){
//             System.out.println("element is not equal");
//         }
//         else{
//             for(int i = 0;i<a;i++){
//                 for(int j = 0;j<b;j++){
//                      if(arr[i][j] != arr1[i][j]){
//                          flag = false;
//                         break;
//                      }
//                 }
//             }
//             if(flag){
//                 System.out.println("matrix are equal");
//             }
//             else{
//                 System.out.println("matrix are not equal");
//             }
//         }
//     }
// }  */
// /*public class prb{
//     public static void main(String[]args){
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         int m = arr.length;
//         int n = arr[0].length;
//         if(m != n){
//             System.out.println("matrix should be equal");
//         }
//         else{
//             System.out.println("matrix is trangular matrix");
//             for(int i = 0;i<m;i++){
//                 for(int j = 0;j<n;j++){
//                     if(j<i){
//                         System.out.println(0);
//                     }
//                     else{
//                         System.out.print(arr[i][j] + " ");
//                     }
//                 }
//             }
//             System.out.println();
//         }

//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         int n = arr.length;
//         int m = arr[0].length;
//         int countodd = 0;
//         int countsum = 0;
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<m;j++){
//                 if(arr[i][j] % 2 == 0){
//                     countsum++;
//                 }
//                 else{
//                     countodd ++;
//                 }
//             }
//         }
//             System.out.println("the odd number is " + countodd);
//             System.out.println("the sum number is " + countsum);
        
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         int m = arr.length;
//         int n = arr[0].length;
//         for(int i = 0;i<m;i++){
//             int sumrow = 0;
//             for(int j = 0;j<n;j++){
//                 sumrow = sumrow + arr[i][j];
//             }
//             System.out.println("the sum of " + i+1+"row" + sumrow);
//         }
//         for(int j = 0;j<n;j++){
//             int sumcol = 0;
//             for(int i = 0;i<m;i++){
//                 sumcol = sumcol + arr[i][j];
//             }
//             System.out.println("the sum of" + j+1+"col"+sumcol);
//         }
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         int m = arr.length;
//         int n = arr[0].length;
//         System.out.println("the  matrix is");
//         for(int i = 0;i<m;i++){
//             for(int j =0;j<n;j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//         int t[][] = new int[n][m];
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<m;j++){
//                 t[i][j] = arr[j][i];
//             }
//         }
//         System.out.println("the transpose matrix is");
//         for(int i =0;i<n;i++){
//             for(int j = 0;j<m;j++){
//                 System.out.print(t[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[][] = {{1,0,0},{0,1,0},{0,0,1}};
//         boolean flag = true;
//         int m= arr.length;
//         int n = arr[0].length;
//         if(m!=n){
//             System.out.println("the matrix should be square");
//         }
//         else{
//             for(int i = 0;i<m;i++){
//                 for(int j=0 ;j<n;j++){
//                     if(i ==j && arr[i][j]!= 1){
//                         flag  = false;
//                         break;
//                     }
//                     if(i!=j&&arr[i][j]!=0){
//                         flag = false;
//                         break;
//                     }
//                 }
//             }
//             if(flag){
//                 System.out.println("the identity matrix");
//             }
//             else{
//                 System.out.println("not");
//             }
//         }
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[][]  = {{1,1,1},{0,1,0},{0,1,0}};
//         int m = arr.length;
//         int n = arr[0].length;
//         int count = 0;
//        int  size = m*n;
//         for(int i =0 ;i<m;i++){
//             for(int j = 0;j<n;j++){
//                 if(arr[i][j] == 0){
//                     count++;
//                 }
//             }
//         }
//         if(count>(size/2)){
//             System.out.println("sparse matrix ");
//         }
//         else{
//             System.out.println("not sparse matrix");
//         }
//     }
// }*//*public class prb{
//     public static void main(String[]args){
//        /*  int arr[] = {1,23,24,56,86,45,34,-1,-3};
//         Arrays.sort(arr,Collections.reverseOrder());
//         System.out.println(Arrays.toString(arr));
//         /*for(int i =0 ;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//             /*for(int i =0;i<arr.length;i++){
//                 for(int j =i+1;j<arr.length;j++){
//                     int temp = 0;
//                     if(arr[i]>arr[j]){
//                         temp = arr[i];
//                         arr[i] = arr[j];
//                         arr[j] = temp;
//                     }
//                 }
//                 System.out.print(arr[i] + " ");
//             }
//             System.out.println();

        
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[] = {1,2,8,3,2,2,2,5,1};
//         int arr1[] = new int[arr.length];
//         int visited = -1;
//         for(int i =0 ;i<arr.length;i++){
//             int count = 1;
//         for(int j = i+1;j<arr.length;j++){
//             if(arr[i] == arr[j]){
//                 count ++;
//                 arr1[j] = visited;
//             }
//         }
//         if(arr1[i] !=visited ){
//             arr1[i] = count;
//         }
//     }
//     System.out.println("------------------");
//     System.out.println("array || frequency");
//     System.out.println("--------------------");
//     for(int i = 0;i<arr.length;i++){
//         if(arr1[i]!=visited){
//             System.out.println( " " + arr[i] + "|"+" " + arr1[i] + "");
//         }
//     }
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[] = {1,2,3,4,5,6};
//         int n = 5;
//         for(int i= 0;i<arr.length;i++){
//             System.out.println(arr[i] + "");
//         }
//         for(int i = 0;i<n;i++){
//             int j,first;
//             first = arr[0];
//             for(j = 0;j<arr.length-1;j++){
//                 arr[j] = arr[j+1];
//             }
//             arr[j] = first;
//         }
//         System.out.println();
//         System.out.println("the rotate elemnt is ");
//         for(int i = 0;i<arr.length;i++){
//             System.out.println(arr[i] + "");
//         }
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[] = {1,2,3,4,2,7,8,8,3};
//         System.out.println("duplicate element is ");
//         for(int i = 0;i<arr.length;i++){
//             for(int j = i+1;j<arr.length;j++){
//                 if(arr[i] == arr[j]){
//                     System.out.println(arr[j]);
//                 }
//             }
//         }
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//        /*  int arr[] = {1,2,3,4,5};
//         System.out.println("the array is :");
//         for(int i = 0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//         System.out.println("reverse order is :");
//         for(int j = arr.length-1;j>=0;j--){
//             System.out.println(arr[j]);
//         }
//         int arr[] = {1,2,3,4,5,6};
//         System.out.println("odd place");
//         for(int i =0 ;i<arr.length; i = i+2){
//             System.out.println(arr[i]);
//         }
//         System.out.println("sum index");
//         for(int i =1;i<arr.length;i = i+2){
//             System.out.println(arr[i]);
//         }
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[] = {23,45,65,32,44,56};
//         int max = arr[0];
//         for(int i = 0;i<arr.length;i++){
//             if(arr[i]<max){
//                 max = arr[i];
//             }
//         }
//             System.out.println(max);
        

//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[] = {1,2,3,4,5,6};
//         int n = arr.length;
//         double sum= 0.0;
//         for(int i =0;i<n;i++){
//             sum += arr[i];
//         }
//         System.out.println(sum);
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[] = {1,2,3,4,5};
//         int n  = 3;
//         for(int i = 0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//         for(int i = 0;i<n;i++){
//             int j,last;
//             last = arr[arr.length-1];
//             for( j = arr.length-1;j>0;j--){
//                 arr[j] = arr[j-1];
//             }
//             arr[0] = last;
//             System.out.println();

//         }
//         for(int i = 0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }
// public class prb{
//     public static void solution(int[] arr,int n,int s){
//         for(int i = 0;i<n;i++){
//             int cs =  arr[i];
//             if(cs==s){
//                 System.out.println("array is present at the number "+i);
//             }
//             else{
//                 for(int j = i+1;j<n;j++){
//                     cs +=arr[j];
//                     if(cs==s){
//                         System.out.println("the element is present at the index"+i+"and"+j);
//                         return;
//                     }
//                 }
//             }
//         }
//         System.out.println("the lemnet is not found");
//         return;
//     }
//     public static void main(String[]args){*/
//        /*  int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
//         int n = arr.length;
//         int sum = 23;
//         solution(arr, n, sum);
//         // int n = arr.length;
//         int n;
//         Scanner sc = new Scanner(System.in);
//          n = sc.nextInt();
//         int arr[] = new int[n];

//         for(int i =0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int s = sc.nextInt();
//         solution(arr, n, s);

//     }
// }*/
// /*public class prb{
//     public static void solution(int arr[],int n,int s){
//         for(int i = 0;i<n;i++){
//             int cs = arr[i];
//             if(cs==s){
//                 System.out.println("elemnet is the found at the index is " + i);
//                 return;
//             }
//             else{
//                 for(int j = i+1;i<n;i++){
//                     cs +=arr[j];
//                     if(cs==s){
//                         System.out.println("the present at the index"+i+"and"+ j);
//                         return;
//                     }
//                 }
//             }
//         }
//         System.out.println("the elemt is not found");
//         return;
//     }
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0;i<n;i++){
//              arr[i] = sc.nextInt();
//         }
//         int s = sc.nextInt();
//         solution(arr, n, s);
//     }
// }*/
// /*public class prb{
//     public static void solutionj(int arr[],int n,int k){
//         for(int i =0;i<n;i++){
//             int l = i;
//             int r = Math.max(l+k-1, n-1);
//             int temp;
//             while(l<r){
//                 temp = arr[l];
                

//             }
//         }
//     }
//     public static void main(String[]args){
//         int arr[] = {1,2,3,4,5,6};
//         int n = 6;
//         int k = 3;
//         for(int i = 0;i<n;i++){
//         System.out.print(arr[i]);}
//          solutionj(arr, n, k);
//         for(int i =0 ;i<n;i++){
//             System.out.println(arr[i]);
//         }
//         // System.out.println(solutionj(arr, n, k));
//     }
// }*/
// /*public class prb{
//     public static int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         int closest = nums[0]+nums[1]+nums[2];
//         for(int i = 0;i<n-2;i++){
//             int j = i+1;
//             int k = n-1;
//             while(j<k){
//                 int sum = nums[i]+nums[j]+nums[k];
//                 if(sum<=target){
//                     j++;
//                 }
//                 else{
//                     k--;
//                 }
//             if (Math.abs(closest - target) > Math.abs(sum - target)) {
//                         closest = sum;
//                 }
//             }
//         }
//         return closest;
        
//     }
//     public static void main(String[]args){
//         int nums[] = {1,2,1,3,5};
//         int target = 3;
//         System.out.println(threeSumClosest(nums,target));
//     }
// }*/
// /*public class prb{
//     public static int solution(int arr[],int t){
//         Arrays.sort(arr);
//         int n = arr.length;
//         int closest = arr[0]+arr[1]+arr[2];
//         for(int i = 0;i<n-2;i++){
//           int   j = i+1;
//            int  k = n-1;
//            while(j<k){
//             int sum = arr[0]+arr[1]+arr[2];
//             if(sum<=t){
//                 j++;
//             }
//             else{
//                 k--;
//             }
//             if(Math.abs(closest-t)>Math.abs(sum-t)){
//                 closest =sum;
//             }
//            }


//         }
//         return closest;
//     }
//     public static void main(String[]args){
//         int arr[] = {1,2,3,45,6};
//         int t = 10;
//         System.out.println(solution(arr, t));
//     }
// }*/
// /*public class prb{
//     public static int solution(int arr[],int n){
//         int s = (((n+1)*(n+2))/2);
//         for(int i =0;i<n;i++){
//             s -=arr[i];
//         }
//         return s;
//     }
//     public static void main(String[]args){
//         int arr[] = {1,2,4,5,7};
//         int n = arr.length;
//         System.out.println(solution(arr, n));
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int ax = 5,ay = 0;
//         int bx = 1,by = 1;
//         int cx = 2,cy = 5;
//         System.out.println(ax+(cx-bx)+ ","+ ay+(cy-by));
//     }
// }*/
// /*public class prb{
//     public static int solution(int[] arr,int v){
//         int c = 0;
//         for(int i = 0;i<arr.length;i++){
//            /*  if(i<arr.length-1  && arr[i]==arr[i+1]){
//                 continue;
//             }
//             arr[c] = arr[i];
//            c++;
//            if(arr[i]!=v){
//             arr[c++] = arr[i];

//            }

//         }
//         return c;
//     }
//     public static void main(String[]args){
//         int arr[] = {0,1,1,2,2,3,4,6,6,6,7,7,7,7,8,8,8,3,3,3,3,3};
//         int v = 6;
//         System.out.println(solution(arr,v));
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
// 		    int k = sc.nextInt();
// 		    int arr[] = new int[n];
// 		    for(int j = 0;j<n;j++){
// 		        arr[j] = sc.nextInt();
// 		    }
// 		    Arrays.sort(arr);
// 		    int a = (n+k)/2;
// 		    System.out.println(arr[a]);
//     }
// }*/
// /*public class prb{
//     public int[] solution(int arr[]){
//         if(arr == null || arr.length==0){
//             int temp[] = {1};
//         return temp;
//         }
//         int carry = 1;
//         int i;
//         for(i = arr.length;i>=0;i--){
//             if(arr[i]==9){
//                 arr            }
//         }

//     }
//     public static void main(String[]args){

//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int a = 0;
//         int b =0 ;
//         for(int i = 0;i<n;i++){
//             if(arr[i] == 1){
//                 a++;
//             }
//             else{
//                 b++;
//             }
//         }
//         if(b>=a){
//             System.out.println(a);
//         }
//         else{
//             System.out.println(b+(a-b)/5);
//         }

//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr1[] = {233,45,1234,684,234,345};
//         String  arr2[] = {"java","python","cpp","ruby"};
//         System.out.println("the arr is " + Arrays.toString(arr1));
//         Arrays.sort(arr1);
//         System.out.println("the sorted array is"+Arrays.toString(arr1));
//         System.out.println("the atring is"+ Arrays.toString(arr2));
//         Arrays.sort(arr2);
//         System.out.println(Arrays.toString(arr2));
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[][] = new int[10][10];
//         for(int i = 0;i<arr.length;i++){
//             for(int j = 0;j<arr.length;j++){
//                 System.out.printf("%2d"+arr[i][j]);
//             }
//         }
//         System.out.println();
//     }
// }*/
// /*public class prb{
//     public static void main(String[]args){
//         int arr[] = {1,2,3,4,6,7};
//         int sum = 0;
//         int t = 7;
//         int ts;
//          ts = t*((t+1)/2);
//          for(int i =0;i<arr.length;i++){
//             sum +=i;
//          }
//          System.out.println( ts-sum);
//          System.out.println("\n");
//     }
// }*/
// /* 

// public class prb{
//     public static void main(String[]args){
//         /*boolean arr[] = new boolean[20];
//         for(int i = 0;i<=20;i++){
//             System.out.println(i + " " + arr[i] );
//         }
//         System.out.println("the gcd is :"+solution(3, 27));

//     }
//    /*  static int solution(int a,int b){
//         return a%b == 0 ? b : solution(b,a%b);
//        /*  if(b==0){
//             return a;
//         }
//             return solution(b,a%b);
        
//     }
//    /*  static boolean[] solution(int n){
//         boolean arr[] = new boolean[n+1];
//         Arrays.fill(arr, true);
//         arr[0] = false;
//         arr[1] = false;
//         for(int i = 2;i*i<=n;i++){
//             for(int j = 0;j<=n;j +=i){
//                 arr[j] = false;
//             }
//         }
//         return arr;
//     }
// }*/
// /*public class prb{
//     static void solution(int n){
//         for(int i=0;i<n;i++){
//             for(int j = 0;j<n;j++){
//                 System.out.println( " * ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[]args){
//         solution(5);
//     }
// }*/
// /*public class prb
// {
//     public static int solution(int arr[],int n){
// int ls,rs;
// for(int i = 0;i<n;i++){
//     ls = 0;
//     for(int j = 0;j<n;j++){
//         ls +=arr[j];
//     }
//     rs = 0;
//     for(int j=i+1;j<n;j++){
//         rs += arr[j];
//     }

// if(ls==rs){
//     return i;
// }
// }
    
//     return -1;
// }
//     public static void main(String[]args){
//         int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
//         int n = arr.length;
//         System.out.println(solution(arr, n));

//     }
// }*/
// /*public class prb{
//     public static int solution(int arr[],int n){
//         //  n = arr.length;
//          int ms = 0;
//          int cs = 0;
//          for(int i = 0;i<n;i++){
//             cs = cs+arr[i];
//             if(cs>ms){
//                 ms = cs;
//             }
//             if(cs<0){
//                 cs = 0;
//             }
//          }
//          return ms;

//     }
//     public static void main(String[]args){
//         int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
//         int n = arr.length;
//         System.out.println(solution(arr, n));

//     }
// }
// public class prb{
//     public static int solution(int arr[],int n){
//        /*  int c = 0;
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     c++;
//                 }
//             }
        
//         if(c%2!=0){
//             return arr[i];
//         }
//         }
//         int res = 0;
//         for(int i = 0;i<n;i++){
//             res = res ^ arr[i];
//         }
//         return res;
//     }
//     public static void main(String[]args){
//         int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
//         int n = arr.length;
//         System.out.println(solution(arr, n));
//     }
// }*/
// /*public class prb{
//     public static void solution(int arr1[],int arr2[],int m, int n,int x){
//         for(int i = 0;i<m;i++){
//             for(int j = 0;j<n;j++){
//                 if(arr1[i] + arr2[j]==x){
//                     System.out.println(arr1[i] + "" + arr2[j]);
//                 }
//             }
//         }
//     }
//     public static void main(String[]args){
//         int arr1[] = { 1, 2, 3, 7, 5, 4 };
//         int arr2[] = { 0, 7, 4, 3, 2, 1 };
//         int x = 8;
//         solution(arr1, arr2, arr1.length, arr2.length, x); 

//     }
// }*/
// /*public class prb{
//     public static void solution(int arr1[], int arr2[],int m, int n ,int x){
//         HashMap<Integer,Integer> l = new HashMap<>();
//         for(int i= 0;i<m;i++){
//             l.put(arr1[i],0);
//         }
//         for(int j = 0;j<n;j++){
//             if(l.containsKey(x-arr2[j])){
//                 System.out.println(x-arr2[j]+ "" +arr2[j]);
//             }
//         }
//     }
//     public static void main(String[]args){
//         int arr1[] = { 1, 2, 3, 7, 5, 4 };
//         int arr2[] = { 0, 7, 4, 3, 2, 1 };
//         int x = 8;
//        int m = arr1.length;
//         int n = arr2.length;
//         solution(arr1, arr2, m, n, x);

//     }
// }*/
// /*public class prb{
//     static boolean solution(int arr[],int n , int x){
//         int l,r;
//         Arrays.sort(arr);
//         l =0;
//         r = n-1;
//         while(l<=r){
//             if(arr[l]+arr[r]==x){
//                 return true;
//             }
//             else if(arr[l]+arr[r]<x){
//                 l++;
//             }
//             else{
//                 r--;
//             }
//         }
//         return false;
//     }
//     public static void main(String[]args){
//         int arr[] = { 1, 4, 45, 6, 10, -8 };
//         int x = 16;
//         int n = arr.length;
//         if(solution(arr,n,x)){
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }

//     }
// }*/
// /*public class prb{
//     public static boolean solution(int arr[],int n , int x){
//         for(int i =0;i<n-2;i++){
//             for(int j =  i+1;j<n;j++){
//                 for(int k =0 ;k<n;k++){
//                     if(arr[i] + arr[j] +arr[k] ==x){
//                         System.out.println(arr[i]+""+arr[j]+""+arr[k]);
//                         return2 true;
//                     7///82**//                 }
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[]args){
//         int arr[] = { 1, 4, 45, 6, 10, 8 };
//         int x = 22;
//         int n = arr.length;
//         solution(arr, n, x);

//     }
// }-*/
// /*public class prb{
//     public static void main(String[]args){
//         HashMap<String,Integer> map = new HashMap<>(); 
//         map.put("india", 120);
//         map.put("america", 65);
//         map.put("london",122);
//         /*System.out.println(map);
// /*- */
//         if(map.containsKey("indonesia")){
//             System.out.println("key is present in the map");
//         }
//         else{
//             System.out.println("not present in the map");
//         }
//         System.out.println(map.get("india"));
//         System.out.println(map.get("hello"));*/
//         /*for(Map.Entry<String,Integer> e : map.entrySet()){
//             System.out.println(e.getKey());
//             System.out.println(e.getValue());
//         }
//         Set<String> keys = map.keySet();
//         for(String key:keys){
//             System.out.println(key + ""+map.get(keys));
//         }
//         map.remove("india");
//         System.out.println(map);
//     }
// }*/
// /*/*import java.util.*;
// public class prb{
//     public static void main(String[]args){
//         Map map = new HashMap<>();
//         map.put(1, "hello");
//         map.put(2, "hii");
//         map.put(3, "yes");
//     }
//     Set set = map.entrySet
// }*/
/*public class prb{
    static final int INT_SIZE = 32;
    static int solution(int arr[],int n){
        int result = 0;
        int x;
        int sum;
        for(int i =0;i<INT_SIZE;i++){
            sum = 0;
            x = (1<<i);
for(int j =0;j<n;j++){
    if((arr[j] & x) !=0){
        sum++;
    }

}
if((sum % 3)!= 0){
result |= x;
}
        }
        return result;

    }
    public static void main(String[] args){
        int arr[] = { 12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7 };
        int n = arr.length;
        System.out.println("the element is " + ""+solution(arr, n));
    }
}*/
import java.util.*;
public class prb{
    public static void solution(int mat[][],int n){
        int temp[] = new int[n*n];
        int k = 0;
        for(int i= 0;i<n;i++){
            for(int j = 0;j<n;j++){
                temp[k++] = mat[i][j];

            }
        }
        Arrays.sort(temp);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                mat[i][j] = temp[k++];
            }
        }
    }
    static void hello(int mat[][],int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(mat[i][j] + "");

            }
        }
        System.out.println();
    }
    public static void  main(Static[] args){
        int mat[][] = {
            {4,3,5},
            {8,5,6},
            {9,4,6} 
        };
        int n = 3;
        System.out.println("befor sorting");
        hello(mat,n);
        solution(mat, n);
                System.out.println("after sorting");
        hello(mat, n);
    }
}
