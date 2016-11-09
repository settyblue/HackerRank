/**
 * https://www.hackerrank.com/contests/university-codesprint/challenges/walking-the-approximate-longest-path
 */


/**
 * @author rakshith
 *
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int e = input.nextInt();
        Graph g = new Graph(v,e);
        for(int i=0; i<e; i++){
            g.addEdge(input.nextInt(),input.nextInt());
        }
        //System.out.println(g.toString());
        
        ArrayList<Integer> path = new ArrayList<>();
        int currentVertex = g.getMinVertex();
        //System.out.println(currentVertex);
        while(true){
            path.add(currentVertex);
            currentVertex = g.getNextVertex(currentVertex);
            //System.out.println(currentVertex);
            if(currentVertex == -1)break;
        }
        System.out.println(path.size());
        for(int i=0; i<path.size(); i++){
            System.out.print((path.get(i)+1)+" ");
        }
    }
    
    public static class Graph{
        int v;
        int e;
        int minV;
        ArrayList<HashSet<Integer>> adjList;
        boolean[] visited;
        Graph(int v, int e){
            this.v = v; this.e = e;
            adjList = new ArrayList<>(v);
            visited = new boolean[v];
            for(int i=0; i<v; i++){
                adjList.add(new HashSet<Integer>());
            }
        }
        
        public void addEdge(int v1, int v2){
            this.adjList.get(v1-1).add(v2-1);
            this.adjList.get(v2-1).add(v1-1);
        }
        
        public int getMinVertex(){
            int minVertex = 0;
            int minValue = Integer.MAX_VALUE;
            for(int i=0; i<v;i++){
                if(adjList.get(i).size() < minValue){
                    minValue = adjList.get(i).size();
                    minVertex = i;
                }
            }
            return minVertex;
        }
        
        public int getNextVertex(int v){
            this.visited[v] = true;
            int minVertex = -1;
            int minValue = Integer.MAX_VALUE;
            
            for(int i:this.adjList.get(v)){
                if(!visited[i]){
                    if(this.adjList.get(i).size() < minValue){
                        minValue = this.adjList.get(i).size();
                        minVertex = i;
                    }
                }
            }
            
            return minVertex;
        }
        
        public String toString(){
            StringBuffer s = new StringBuffer("");
            for(int i=0; i<v; i++){
                s.append(i+": "+this.adjList.get(i)+"\n");
            }
            return s.toString();
        }
    }
}