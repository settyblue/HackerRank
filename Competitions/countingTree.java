/**
 * https://www.hackerrank.com/contests/university-codesprint/challenges/counting-on-a-tree
 * having runtime issues.
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
        int q = input.nextInt();
        Tree tree = new Tree(n);
        for(int i=0; i<n; i++){
            tree.addNode(input.nextInt(),i+1);
        }
        
        for(int i=0; i<n-1; i++){
            tree.addEdge(input.nextInt(), input.nextInt());
        }
        
        tree.dfs();
        //System.out.println(tree.toString());
        
        for(int i=0; i<q; i++){
            int w = input.nextInt(); int x = input.nextInt(); int y = input.nextInt(); int z = input.nextInt();
            Node nw = tree.map.get(w);Node ny = tree.map.get(y);
            ArrayList<Integer> path1 = nw.getPath(x, tree);
            ArrayList<Integer> path2 = ny.getPath(z, tree);
            //System.out.println(path1+" "+path2);
            
            int count = 0;
            
            HashMap<Integer, HashSet<Integer>> xmap = new HashMap<>();
            for(int ni:path1){
                int value = tree.map.get(ni).value;
                if(xmap.containsKey(value)){
                    xmap.get(value).add(ni);
                }else{
                    HashSet<Integer> xset = new HashSet<>();
                    xset.add(ni);
                    xmap.put(value, xset);
                }
            }
            //System.out.println(xmap);
            for(int nj:path2){
                int value = tree.map.get(nj).value;
                if(xmap.containsKey(value)){
                    int setSize = xmap.get(value).size();
                    if(xmap.get(value).contains(nj)){
                        count += setSize-1;
                    }else{
                        count += setSize;
                    }
                }else{
                    continue;
                }
            }
            System.out.println(count);
        }
    }
    
    public static class Tree{
        int n;
        HashMap<Integer, Node> map;
        
        Tree(int n){
            this.n = n;
            this.map = new HashMap<>(n);
        }
        
        public void addNode(int value, int pos){
            Node node = new Node(pos,value);
            map.put(pos,node);
        }
        
        public void addEdge(int node1, int node2){
            map.get(node2).parentId = node1;
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node2);
            map.get(node1).childSet.add(node2);
            map.get(node1).pathToChild.put(node2,list);
        }
        
        public void dfs(){
            map.get(1).dfs(this);
        }
        
        public String toString(){
            return map.toString();
        }
    }
    
    public static class Node{
        int value;
        int nodeId;
        int parentId = 0;
        HashSet<Integer> childSet;
        HashMap<Integer, ArrayList<Integer>> pathToChild;
        
        Node(int i, int v){
            nodeId = i;
            value = v;
            pathToChild = new HashMap<>();
            childSet = new HashSet<>();
        }
        
        public void dfs(Tree tree){
            if(this.pathToChild.size() == 0){
                return;
            }
            for(int child:this.childSet){
                tree.map.get(child).dfs(tree);
                for(int grandchild: tree.map.get(child).pathToChild.keySet()){
                    this.pathToChild.put(grandchild, new ArrayList<Integer>());
                    this.pathToChild.get(grandchild).addAll(tree.map.get(child).pathToChild.get(grandchild));
                }
            }
            
            for(int childPath:this.pathToChild.keySet()){
                this.pathToChild.get(childPath).add(0,this.nodeId);
            }
        }
        
        public ArrayList<Integer> getPath(int in, Tree tree){
            if(this.nodeId == in){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(in);
                return list;
            }else if(this.pathToChild.containsKey(in)){
                return this.pathToChild.get(in);
            }else{
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(this.nodeId);
                if(this.parentId != in){
                    list.addAll(tree.map.get(this.parentId).getPath(in, tree));
                    return list;
                }else{
                    list.add(this.parentId);
                    return list;
                }
            }
        }
        
        public String toString(){
            return "["+nodeId+", "+value+", "+parentId+", "+childSet+", "+pathToChild+"]";
        }
    }
}
