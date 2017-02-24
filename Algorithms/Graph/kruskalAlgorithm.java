/**
 * https://www.hackerrank.com/challenges/kruskalmstrsub
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
        //int s = input.nextInt();
        //System.out.println(g);
        int minWeight = g.kruskalsAlgorithm();
        System.out.println(minWeight);
     }
    
    public static class Graph{
        int n;
        int m;
        ArrayList<Edge> edgeList;
        
        Graph(int n, int m){
            this.n = n;
            this.m = m;
            this.edgeList = new ArrayList<>();
        }
        
        public void addEdge(int n1, int n2, int weight){
            this.edgeList.add(new Edge(n1,n2,weight));
        }
        
        
        public int kruskalsAlgorithm(){
            DisJointSet unionSet = new DisJointSet(n);
            TreeSet<Edge> edgeSet = new TreeSet<>(this.edgeList);
            
            int answer = 0;
            Iterator<Edge> iter = edgeSet.iterator();
            while(true){
                Edge curEdge = null;
                boolean hasEdge = false;
                while(iter.hasNext()){
                    curEdge = iter.next();
                    //System.out.println(curEdge);
                    if(unionSet.getParent(curEdge.n1) != unionSet.getParent(curEdge.n2)){ 
                        hasEdge = true;
                        break;
                    }
                }
                if(!hasEdge)break;
                unionSet.merge(curEdge.n1, curEdge.n2);
                answer += curEdge.weight;
            }
            return answer;
        }
        
        public String toString(){
            return this.edgeList.toString();
        }
    }
    
    public static class Edge implements Comparable<Edge>{
        int n1;
        int n2;
        int weight;
        int x;
        
        Edge(int n1, int n2, int w){
            this.n1 = n1;
            this.n2 = n2;
            this.weight = w;
            this.x = n1 + n2 + w;
        }
        
        @Override
        public int compareTo(Edge e){
            if(this.weight < e.weight){
                return -1;
            }else if(this.weight > e.weight){
                return 1;
            }else{
                if(this.x < e.x){
                    return -1;
                }else{
                    return 1;
                }
            }
        }
        
        public String toString(){
            return "("+n1+", "+n2+", "+weight+")";
        }
    }
    
    public static class DisJointSet{
        int n;
        int[] array;
        
        DisJointSet(int n){
            this.array = new int[n];
            Arrays.fill(this.array, -1);
            this.n = n;
        }
        
        public int getParent(int c){
            int p = c-1;
            while(this.array[p] >= 0){
                p = this.array[p];
            }
            return p+1;
        }
        
        public void merge(int c1, int c2){
            int a = c1-1; int b = c2-1;
            int ha = 0; int hb = 0;
            while(array[a] >= 0){
                a = array[a];
                ha++;
            }
            while(array[b] >= 0){
                b = array[b];
                hb++;
            }
            if(a==b){
                return;
            }else{
                if(ha > hb){
                    int c = array[b];
                    array[b] = a;
                    array[a] += c;
                }else{
                    int c = array[a];
                    array[a] = b;
                    array[b] += c;
                }
            }
        }
        
    }
}