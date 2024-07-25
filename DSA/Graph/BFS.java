package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BFS {
    public static void breadthFirstSearch(int n,ArrayList<ArrayList<Integer>> adjList,int stratingNodde){
        ArrayList<Integer> bfs = new ArrayList<>();
        Boolean[] visited = new Boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }

        visited[stratingNodde] = true;
        queue.add(stratingNodde);

        while(!queue.isEmpty()){
            int node = queue.poll();
            bfs.add(node);

            for(Integer it: adjList.get(node)){
                if(visited[it]==false){
                    visited[it] = true;
                    queue.add(it);
                }
            }
        }

        for(Integer i : bfs){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of nodes");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            System.out.println("Enter the number for adjacent nodes for node"+i);
            int noOfAdjNodes = sc.nextInt();
            System.out.println("Enter the adjacent nodes");
            for(int j=0;j<noOfAdjNodes;j++){
                adjList.get(i).add(sc.nextInt());
            }
        }

        System.out.println("Enter the strating vertex");
        int stratingNode = sc.nextInt();

        breadthFirstSearch(n,adjList,stratingNode);
    }
}
