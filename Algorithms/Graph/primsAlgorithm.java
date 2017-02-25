/**
 * https://www.hackerrank.com/challenges/primsmstsub
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
        int n = input.nextInt();
        int m = input.nextInt();
        Graph g = new Graph(n,m);
        for(int i=0; i<m; i++){
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            int w = input.nextInt();
            g.addEdge(n1, n2, w);
        }
        int s = input.nextInt();
        int minWeight = g.primsAlgorithm(s);
        //System.out.println(g);
        System.out.println(minWeight);
     }
    
    public static class Graph{
        int n;
        int m;
        ArrayList<ArrayList<Edge>> adjList;
        
        Graph(int n, int m){
            this.n = n;
            this.m = m;
            this.adjList = new ArrayList<>();
            for(int i=0; i<n; i++){
                this.adjList.add(new ArrayList<Edge>());
            }
        }
        
        public void addEdge(int n1, int n2, int weight){
            this.adjList.get(n1-1).add(new Edge(n2-1, weight));
            this.adjList.get(n2-1).add(new Edge(n1-1, weight));
        }
        
        
        public int primsAlgorithm(int s){
            HashSet<Integer> doneSet = new HashSet<>();
            HashSet<Integer> notDoneSet = new HashSet<>();
            doneSet.add(s-1);
            for(int i=0; i<n; i++){
                if(i!=s-1)notDoneSet.add(i);
            }
            
            int curVertex;
            int answer = 0;
            while(!notDoneSet.isEmpty()){
                int minWeight = Integer.MAX_VALUE;
                int minIndex = -1;
                Iterator<Integer> iter = doneSet.iterator();
                while(iter.hasNext()){
                    curVertex = iter.next();
                    ArrayList<Edge> edgeList = this.adjList.get(curVertex);
                    for(int i=0; i<edgeList.size(); i++){
                        if(edgeList.get(i).weight < minWeight && notDoneSet.contains(edgeList.get(i).nodeId)){
                            minWeight = edgeList.get(i).weight;
                            minIndex = edgeList.get(i).nodeId;
                        }
                    }
                }
                notDoneSet.remove(minIndex);
                doneSet.add(minIndex);
                answer += minWeight;
            }
            return answer;
        }
        
        public String toString(){
            return this.adjList.toString();
        }
    }
    
    public static class Edge{
        int nodeId;
        int weight;
        
        Edge(int id, int w){
            nodeId = id;
            weight = w;
        }
        
        public String toString(){
            return "("+nodeId+", "+weight+")";
        }
    }
}