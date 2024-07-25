package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
    public static void depthFirstSearch(int n,ArrayList<ArrayList<Integer>> adjList,int node,Boolean[] visited,ArrayList<Integer> dfs){
       
        visited[node] = true;
        dfs.add(node);

        for(int it : adjList.get(node)){
            if(!visited[it]){
                depthFirstSearch(n, adjList, it, visited,dfs);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of nodes");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            System.out.println("Enter the no. of adjacent nodes for "+i);
            int noOfAdjNodes = sc.nextInt();
            System.out.println("Enter the adjacent nodes");
            for(int j=0;j<noOfAdjNodes;j++){
                adjList.get(i).add(sc.nextInt());
            }
        }

        System.out.println("Enter the starting node");
        int startingNode = sc.nextInt();

        Boolean[] visited = new Boolean[n];
        for (int i = 0; i < n; i++) {
            visited[i] = false;  // Initialize all nodes as unvisited
        }
        ArrayList<Integer> dfs = new ArrayList<>();

        depthFirstSearch(n,adjList,startingNode,visited,dfs);

        for(Integer it: dfs){
            System.out.print(it +" ");
        }

    }
}
