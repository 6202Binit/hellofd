public class input{
      public static int solution(int[][] edges){
           /*  int a = edges[0][0];
            int b = edges[0][1];
            int c = edges[1][0];
            int d = edges[1][1];
            if(a==c||a==d){
                  return a;
            }
            else {
                  return b;
            }*/
            // brute force solution
            int n = edges.length+1;
            int cf[]= new int[n+1];
            for(int i = 0;i<edges.length;i++){
                  for(int j = 0;j<2;j++){
                        cf[edges[i][j]]++;
                  }
            }
            int centre = 0;
            for(int i = 1;i<=n;i++){
                  if(cf[i] == n-1 ){
                        centre = i;
                        break;
                  }
            }
            return centre;

      }
      public static void main(String[]args){

      }
}