import java.util.ArrayList;
import java.util.Comparator;
// import java.util.LinkedList;
import java.util.PriorityQueue;
public class P29ConnectingCities {
    static class Edge{
        int dest;
        int wt;
        Edge(int dest, int wt){
            this.dest=dest;
            this.wt=wt;
        }
    }
    static void makeGraph(int[][] matrix, ArrayList<ArrayList<Edge>> graph){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]!=0){
                    graph.get(i).add(new Edge(j, matrix[i][j]));
                }
            }
        }
    }
    static int findMinCost(int[][] matrix){
        ArrayList<ArrayList<Edge>> graph=new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            graph.add(new ArrayList<>());
        }
        makeGraph(matrix, graph);

        boolean[] visited=new boolean[graph.size()];
        int minCost=0; 
        //node, weight
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(o->o[1]));
        pq.add(new int[]{0, 0});

        while(!pq.isEmpty()){
            int[] curr=pq.remove();
            if(!visited[curr[0]]){
                visited[curr[0]]=true;
                minCost+=curr[1];
                for(Edge e : graph.get(curr[0])){
                    pq.add(new int[]{e.dest, e.wt});
                }
            }
        }
        return minCost;
    }

    //Direct way
    static int findMinCost2(int[][] matrix){
        boolean[] visited=new boolean[matrix.length];
        int minCost=0; 
        //node, weight
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(o->o[1]));
        pq.add(new int[]{0, 0});

        while(!pq.isEmpty()){
            int[] curr=pq.remove();
            if(!visited[curr[0]]){
                visited[curr[0]]=true;
                minCost+=curr[1];
                for(int i=0; i<matrix[curr[0]].length; i++){
                    if(matrix[curr[0]][i]!=0){
                        pq.add(new int[]{i, matrix[curr[0]][i]});
                    }
                }
            }
        }
        return minCost;
    }
    public static void main(String[] args) {
        int graph[][] = new int[][]{{0, 1, 2, 3, 4},
                                   {1, 0, 5, 0, 7},
                                   {2, 5, 0, 6, 0},
                                   {3, 0, 6, 0, 0},
                                   {4, 7, 0, 0, 0}};

        System.out.println(findMinCost(graph));
        System.out.println(findMinCost2(graph));
    }
}
