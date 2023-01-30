import java.util.ArrayList;
import java.util.Stack;

public class Topologicalsort {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(2, 0));
        graph[4].add(new Edge(2, 1));


        graph[5].add(new Edge(2, 0));
        graph[5].add(new Edge(2, 2));


    }
      public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack){
          vis[curr]=true;
          for (int i=0;i<graph[curr].size();i++){
              Edge e=graph[curr].get(i);

              if(!vis[e.dest]){
                  topSortUtil(graph,e.dest,vis,stack);
              }
          }
          stack.push(curr);
      }

      public static void topSort(ArrayList<Edge> graph[],int v){
        boolean vis[]=new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<v;i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
      }
    public static void main(String args[]) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        topSort(graph,v);
    }
}
