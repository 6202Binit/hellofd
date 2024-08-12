// import java.util.ArrayList;

// import java.util.ArrayList;
// import java.security.Certificate;
// import java.security.cert.CertPath;

/*import java.beans.Visibility;
import java.util.*;

public class graph{
    static class Edge{
        int src;
        int dest;

        public  Edge(int s,int d){
            this.src = s;
            this.dest = d;

        }
    }
    /*public static void create(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2 , 3));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
        
    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
      graph[0].add(new Edge(0, 1));
      graph[0].add(new Edge(0, 2));
      graph[1].add(new Edge(1, 0));
      graph[1].add(new Edge(1, 3));
      graph[2].add(new Edge(2, 0));
      graph[2].add(new Edge(2, 4));
      graph[3].add(new Edge(3, 1));
      graph[3].add(new Edge(3, 4));
      graph[3].add(new Edge(3, 5));
      graph[4].add(new Edge(4, 2));
      
      graph[4].add(new Edge(4, 3));
      graph[4].add(new Edge(4, 5));
      graph[5].add(new Edge(5, 3));
      graph[5].add(new Edge(5, 4));
      graph[5].add(new Edge(5, 6));
      graph[6].add(new Edge(6, 5));
      

    }

    // breadth first search algorithm 


    // firstly i have to created a queue 
    // next i hava create a visited array
    // then i have to use loop until when the our empty is not null
    // then we have to find the curr element 
    // we remove the element from the queue this is a curr element 
    // then we have to implemt the condition that the visited element is false
    // then the print destination element
    // then vis of curr element is true 
    // then print the neighbours of the vidsited element 
    // then the add the element

    // in bfs algorithm time complexity is O(v+e)
    public static void bfs(ArrayList<Edge> graph[],int v){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.println(curr + "");
                vis[curr] = true;
                for(int i = 0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                q.add(e.dest);
            }
        }
        }
    }
    // dfs algorithm
    // in dfs algorithm time complexity is O(v+e)
    public static void dfs(ArrayList<Edge> graph[],boolean vis[],int curr){
       System.out.println(curr + "");
       vis[curr] = true;
       for(int i  = 0;i<graph[curr].size();i++){
        Edge e = graph[curr].get(i);
        if(vis[e.dest]==false){
            dfs(graph, vis, e.dest);
       }
       }
    }
    // hera the time complexity is O(v^v)
    // print the all the element from source to target element
    //using dfs traversal
    public static void printall(ArrayList<Edge>graph[],boolean vis[],int curr,String path,int tar){
        if(curr==tar){
            System.out.println(path +"");
            return;
        }
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest]==false){
                vis[curr] = true;
                printall(graph, vis, e.dest, path+e.dest, tar);
                vis[curr] = false;
            }
        }
    }
    
    
    public static void main(String[]args){
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        create(graph);

        int src = 0;
        int tar = 5;
        printall(graph, new boolean [v], src, "0", tar);


        // bfs(graph, v);
        // System.out.println();


       /*  boolean vis[] = new boolean[v];
        dfs(graph, vis, 0);
        System.out.println();*/

        // print the neightbours element
        // iterate the loop from i = 0 to i< size of those vertex
     /*    for(int i = 0;i<graph[0].size();i++){
            Edge e = graph[0].get(i);
            System.out.println(e.dest + "");
        }
        for(int i = 0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.dest + "");
        }
        for(int i = 0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest + "");
        }
        

    }
}*/


/*import java.util.*;
// find the topological sorting 

public class graph{
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;

        }
    }
    public static void   create(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void tosort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> stack){
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[curr]==false){
                tosort(graph, e.dest, vis, stack);
            }
            
        }
        stack.push(curr);

    }
    public static void topological(ArrayList<Edge> graph[],int v){
        boolean vis[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<v;i++){
            if(vis[i]==false){
                tosort(graph, i, vis, stack);
            }
            
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop() + "");
        }
    }

    // undirected cycloe detecting in graph
    public static boolean check(ArrayList<Edge> graph[],boolean vis[],int curr,int par){
        vis[curr] = true;

        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] && e.dest != par){
                return true;
            }
            else if(!vis[e.dest]){
                if(check(graph, vis, e.dest, curr)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        int v  = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        create(graph);
        // topological(graph, v);
        System.out.println(check(graph, new boolean[v], 0, -1));
    }
}*/
/*import java.util.*;

//dijkstra algorithm  implementation
// time complexity is O(v + eloge){
    // eloge comes because here uses priority queue 
    // it only works for positive wt it not works for negative case
    // for both we have to uses bellmann ford algorithm
    // dijkstra works on the basis of greedy algorithm
    //bellmann works on the basis of dynamic programming 

public class graph{
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
        public static void create(ArrayList<Edge>graph[]){
            for(int i = 0;i<graph.length;i++){
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));
            graph[1].add(new Edge(1, 3, 7));
            graph[1].add(new Edge(1, 2, 1));
            graph[2].add(new Edge(2, 4, 3));
            graph[3].add(new Edge(3, 5, 1));
            graph[4].add(new Edge(4, 3, 2));
            graph[4].add(new Edge(4, 5, 5));
            
        }
         static class pair implements Comparable<pair>{
            int node;
            int dist;

            public  pair(int n,int d){
                this.node = n;
                this.dist = d;
            }
            // compair to the pairing element
            
            @Override
            public int compareTo(pair p2) {
                
                return this.dist-p2.dist;
            }
        }
        public static void dijkstra(ArrayList<Edge> graph[],int src,int v){
            PriorityQueue<pair> pq = new PriorityQueue<>();
            int dist[] = new int[v];
            for(int i = 0;i<v;i++){
                if(i != src){
                    dist[i] = Integer.MAX_VALUE;
                }
            }
            boolean vis[] = new boolean[v];
            pq.add(new pair(0, 0));
            while(!pq.isEmpty()){
                pair curr = pq.remove();
                if(!vis[curr.node]){
                    vis[curr.node] = true;
                    for(int i = 0;i<graph[curr.node].size();i++){
                        Edge e = graph[curr.node].get(i);
                        int u = e.src;
                        int m = e.dest;
                        // relexation implementation

                        if(dist[u]+e.wt<dist[m]){
                            dist[m] = dist[u]+e.dest;
                            pq.add(new pair(m, dist[m]));
                        }
                    }
                }
            }
            for(int i = 0;i<v;i++){
                System.out.print(dist[i] + " ");
            }
            System.out.println();

        }
        // bellmann algorithm 


        public static void bellmann(ArrayList<Edge> graph[],int src,int v){
            int dist[] = new int[v];
            for(int i = 0;i<v;i++){
                if(i != src){
                    dist[i] = Integer.MAX_VALUE;
                }
            }
            for(int k = 0;k<v-1;k++){
                for(int i = 0;i<v;i++){
                    for(int j = 0;j<graph[i].size();j++){
                        Edge e = graph[i].get(j);
                        int m = e.src;
                        int n = e.dest;
                        if(dist[m]!= Integer.MAX_VALUE && dist[m]+e.wt<dist[n]){
                            dist[n] = dist[m]+e.wt;
                        }
                    }
                }
            }
            for(int i = 0;i<dist.length;i++){
                System.out.print(dist[i] + "");
            }
            System.out.println();
        }

    
    public static void main(String[]args){
        int v = 6;
        ArrayList<Edge>graph[] = new ArrayList[v];
        create(graph);
        // dijkstra(graph, 0, v);
        bellmann(graph, 0, v);
    }
}*/
/*import java.util.*;
public class graph{
   static class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int s,int d,int w){
        this.src =s;
        this.dest = d;
        this.wt = w;

    }
}
    public static void hello(ArrayList<Edge>graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }
    static class pair implements Comparable<pair>{
        int node;
        int cost;
        public pair(int n,int c){
            this.node = n;
            this.cost = c;
        }
        @Override
        public int compareTo(pair p2) {
            
            return this.cost-p2.cost;
        }
    
        
    }
    /*public static void primalgo(ArrayList<Edge>graph[],int v){
        PriorityQueue<pair> p = new PriorityQueue<>();
        boolean vis[] = new boolean[v];

        p.add(new pair(0, 0));
        int mstcost = 0;
        while(!p.isEmpty()){
            pair curr = p.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                mstcost += curr.cost;
            }
            for(int i = 0;i<graph[curr.node].size();i++){
                Edge e = graph[curr.node].get(i);
                if(!vis[e.dest]){
                    p.add(new pair(e.dest, e.wt));
                }
            }

        }
        System.out.println("mincowst " + mstcost);
        
    }*/
  /*   public static void primalgo(ArrayList<Edge>graph[],int v){
        PriorityQueue<pair> p = new PriorityQueue<>();
        boolean vis[] = new boolean[v];
        int mstcost = 0;
        p.add(new pair(0, 0));
        while(!p.isEmpty()){
            
        }
    }
   
    public static void main(String[]args){
        int v = 4;
        ArrayList<Edge>graph[] = new ArrayList[v];
        hello(graph);
        primalgo(graph, v);

        
    }
    
}*/

// kosaraju algorithm to find the strongly cponnectres eleemnt 
// its time complexity is O(v+e)



/*import java.util.*;

import javax.print.attribute.standard.Destination;
public class graph{
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void hello(ArrayList<Edge>graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 12));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }

    public static void topsort(ArrayList<Edge>graph[],int curr,boolean vis[],Stack<Integer>s){
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[curr]){
                topsort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    // dfs algorithm
    public static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[]){
        vis[curr] = true;
        System.out.print(curr + " ") ;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
                
            }
        }
    }
    public static void kosaraju(ArrayList<Edge>graph[],int v){
        // step - 1
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[v];
        for(int i = 0;i<v;i++){
            if(!vis[i]){
                topsort(graph,i,vis,s);
            }
        }
        // step 2
        ArrayList<Edge>transpose[] = new ArrayList[v];
        for(int i = 0;i<graph.length;i++){
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }
        for(int i = 0;i<v;i++){
            for(int j = 0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }
        // step 3
        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                dfs(graph, curr, vis);
                
                System.out.println();
            }
        }


    }
    public static void main(String[]args){
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        hello(graph);
        kosaraju(graph, v);
    }
}*/
import java.util.*;
import java.util.ArrayList;
public class graph{
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void create(ArrayList<Edge>graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[6].add(new Edge(5, 4));
    }
    public static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[],int dt[],int low[],int time, int parent){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(e.dest==parent){
                continue;
            }
            else if(!vis[e.dest]){
                dfs(graph, e.dest, vis, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if(dt[curr]<low[e.dest]){
                    System.out.println("bridge is " + curr + e.dest);
                }
            }
            else{
            low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }

    public static void getBridge(ArrayList<Edge>graph[],int v){
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean vis[] = new boolean[v];
        for(int i = 0;i<v;i++){
            if(!vis[i]){
                dfs(graph, i, vis, dt, low, time, -1);
            }
        }
    }
    public static void main(String[]args){
        int v = 6;
        ArrayList<Edge>graph[] = new ArrayList[v];
    
        getBridge(graph, v);
    }
}