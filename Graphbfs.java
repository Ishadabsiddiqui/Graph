

///   Breath First Search Program ///
/// *********************        ///

//     import java.util.*;

//      public class Graphbfs {

///       For Single Graph ///
//    static class Edge {
//        int src;
//        int dest;
//
//        public Edge(int s, int d) {
//            this.src = s;
//            this.dest = d;
//        }
//    }
//
//    public static void creategraph(ArrayList<Edge> graph[]) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
//
//        graph[1].add(new Edge(1, 0));
//        graph[1].add(new Edge(1, 3));
//
//        graph[2].add(new Edge(2, 0));
//        graph[2].add(new Edge(2, 4));
//
//        graph[3].add(new Edge(3, 1));
//        graph[3].add(new Edge(3, 4));
//        graph[3].add(new Edge(3, 5));
//
//        graph[4].add(new Edge(4, 2));
//        graph[4].add(new Edge(4, 3));
//        graph[4].add(new Edge(4, 5));
//
//        graph[5].add(new Edge(5, 2));
//        graph[5].add(new Edge(5, 4));
//        graph[5].add(new Edge(5, 6));
//
//
//        graph[6].add(new Edge(6, 5));
//
//    }
//
//    public static void bfs(ArrayList<Edge> graph[], int v) {
//        Queue<Integer> q = new LinkedList<>();
//        boolean vis[] = new boolean[v];
//        q.add(0);
//
//        while (!q.isEmpty()) {
//            int curr = q.remove();
//            if (vis[curr] == false) {
//                System.out.print(curr + "  ");
//                vis[curr] = true;
//                for (int i = 0; i < graph[curr].size(); i++) {
//                    Edge e = graph[curr].get(i);
//                    q.add(e.dest);
//                }
//            }
//        }
//    }
//
//    public static void main(String args[]) {
//        int v = 7;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        creategraph(graph);
//        bfs(graph, v);
//        System.out.println();
//    }
//  }

///   If bfs  Graph is Disconnected //////
///    ************************ //////
//     import java.util.*;

//      public class Graphbfs {
//    static class Edge {
//        int src;
//        int dest;
//
//        public Edge(int s, int d) {
//            this.src = s;
//            this.dest = d;
//        }
//    }
//
//    public static void creategraph(ArrayList<Edge> graph[]) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
//
//        graph[1].add(new Edge(1, 0));
//        graph[1].add(new Edge(1, 3));
//
//        graph[2].add(new Edge(2, 0));
//        graph[2].add(new Edge(2, 4));
//
//        graph[3].add(new Edge(3, 1));
//        graph[3].add(new Edge(3, 4));
//        graph[3].add(new Edge(3, 5));
//
//        graph[4].add(new Edge(4, 2));
//        graph[4].add(new Edge(4, 3));
//        graph[4].add(new Edge(4, 5));
//
//        graph[5].add(new Edge(5, 2));
//        graph[5].add(new Edge(5, 4));
//        graph[5].add(new Edge(5, 6));
//
//
//        graph[6].add(new Edge(6, 5));
//
//    }
//
//    public static void bfs(ArrayList<Edge> graph[], int v, boolean vis[],int start) {
//        Queue<Integer> q = new LinkedList<>();
//
//        q.add(start);
//
//        while (!q.isEmpty()) {
//            int curr = q.remove();
//            if (vis[curr] == false) {
//                System.out.print(curr + "  ");
//                vis[curr] = true;
//                for (int i = 0; i < graph[curr].size(); i++) {
//                    Edge e = graph[curr].get(i);
//                    q.add(e.dest);
//                }
//            }
//        }
//    }
//
//    public static void main(String args[]) {
//        int v = 7;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        creategraph(graph);
//        boolean vis[] = new boolean[v];
//        for(int i=0;i<v;i++){
//            if(vis[i]==false){
//                bfs(graph,v,vis,i);
//            }
//        }
//        System.out.println();
//    }
//  }

///   For Depth First Search Graph  /////


///// ******************************** /////
//     import java.util.*;

//      public class Graphbfs {
//    static class Edge {
//        int src;
//        int dest;
//
//        public Edge(int s, int d) {
//            this.src = s;
//            this.dest = d;
//        }
//    }
//
//    public static void creategraph(ArrayList<Edge> graph[]) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
//
//        graph[1].add(new Edge(1, 0));
//        graph[1].add(new Edge(1, 3));
//
//        graph[2].add(new Edge(2, 0));
//        graph[2].add(new Edge(2, 4));
//
//        graph[3].add(new Edge(3, 1));
//        graph[3].add(new Edge(3, 4));
//        graph[3].add(new Edge(3, 5));
//
//        graph[4].add(new Edge(4, 2));
//        graph[4].add(new Edge(4, 3));
//        graph[4].add(new Edge(4, 5));
//
//        graph[5].add(new Edge(5, 2));
//        graph[5].add(new Edge(5, 4));
//        graph[5].add(new Edge(5, 6));
//
//
//        graph[6].add(new Edge(6, 5));
//
//    }
//
//    public static void bfs(ArrayList<Edge> graph[], int v, boolean vis[], int start) {
//        Queue<Integer> q = new LinkedList<>();
//
//        q.add(start);
//
//        while (!q.isEmpty()) {
//            int curr = q.remove();
//            if (vis[curr] == false) {
//                System.out.print(curr + "  ");
//                vis[curr] = true;
//                for (int i = 0; i < graph[curr].size(); i++) {
//                    Edge e = graph[curr].get(i);
//                    q.add(e.dest);
//                }
//            }
//        }
//    }
//
//
//    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
//        System.out.print(curr + " ");
//        vis[curr] = true;
//        for(int i=0;i<graph[curr].size();i++){
//            Edge e = graph[curr].get(i);
//            if(vis[e.dest]==false)
//            dfs(graph,e.dest, vis);
//        }
//
//    }
//
//    public static void main(String args[]) {
//        int v = 7;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        creategraph(graph);
//        boolean vis[] = new boolean[v];
//        dfs(graph,0,vis);
//        System.out.println();
//    }
//  }


///   If Depth First Search Graph is disconnected /////

///// ******************************** /////


//     import java.util.*;
//
//    public class Graphbfs {
//    static class Edge {
//        int src;
//        int dest;
//
//        public Edge(int s, int d) {
//            this.src = s;
//            this.dest = d;
//        }
//    }
//
//    public static void creategraph(ArrayList<Edge> graph[]) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
//
//        graph[1].add(new Edge(1, 0));
//        graph[1].add(new Edge(1, 3));
//
//        graph[2].add(new Edge(2, 0));
//        graph[2].add(new Edge(2, 4));
//
//        graph[3].add(new Edge(3, 1));
//        graph[3].add(new Edge(3, 4));
//        graph[3].add(new Edge(3, 5));
//
//        graph[4].add(new Edge(4, 2));
//        graph[4].add(new Edge(4, 3));
//        graph[4].add(new Edge(4, 5));
//
//        graph[5].add(new Edge(5, 2));
//        graph[5].add(new Edge(5, 4));
//        graph[5].add(new Edge(5, 6));
//
//
//        graph[6].add(new Edge(6, 5));
//
//    }
//
//    public static void bfs(ArrayList<Edge> graph[], int v, boolean vis[], int start) {
//        Queue<Integer> q = new LinkedList<>();
//
//        q.add(start);
//
//        while (!q.isEmpty()) {
//            int curr = q.remove();
//            if (vis[curr] == false) {
//                System.out.print(curr + "  ");
//                vis[curr] = true;
//                for (int i = 0; i < graph[curr].size(); i++) {
//                    Edge e = graph[curr].get(i);
//                    q.add(e.dest);
//                }
//            }
//        }
//    }
//
//
//    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
//        System.out.print(curr + " ");
//        vis[curr] = true;
//        for(int i=0;i<graph[curr].size();i++){
//            Edge e = graph[curr].get(i);
//            if(vis[e.dest]==false)
//                dfs(graph,e.dest, vis);
//        }
//
//    }
//
//    public static void main(String args[]) {
//        int v = 7;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        creategraph(graph);
//        boolean vis[] = new boolean[v];
//        for (int i=0;i<v;i++){
//            if(vis[i]==false){
//                dfs(graph,i,vis);
//            }
//        }
//        System.out.println();
//    }
//
// }


//  ALL PATHS FROM SOURCE TO TARGET //


import java.util.*;

public class Graphbfs {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
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

        graph[5].add(new Edge(5, 2));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));


        graph[6].add(new Edge(6, 5));

    }
    public static void bfs(ArrayList<Edge> graph[], int v, boolean vis[], int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr + "  ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
        }

    }
    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar) {
        if (curr == tar) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true;
                printAllPath(graph, vis, e.dest, path + e.dest, tar);
                vis[curr] = false;
            }
        }
    }

    public static void main(String args[]) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);

        int src = 0;
        int tar = 5;
        printAllPath(graph,new boolean[v],src,"0",tar);
    }

}