/**
 * https://www.hackerrank.com/contests/university-codesprint/challenges/kindergarten-adventures
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
        int[] t = new int[n];
        TreeSet<Node> set = new TreeSet<Node>();
        for(int i=0; i<n; i++){
            t[i] = input.nextInt();
            if(t[i] == 0){
                set.add(new Node(0,true));
                set.add(new Node(n,false));
            }else if((n-t[i]+i+1) < n+1){
                set.add(new Node(i+1,true));
                set.add(new Node(n-t[i]+i+1,false));
            }else{
                set.add(new Node(i+1,true));
                set.add(new Node(n,false));
                set.add(new Node(0,true));
                set.add(new Node(i-t[i]+1,false));
            }
            //System.out.println(set);
        }
        //System.out.println(set);
        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        int count = 0;
        for(Node node: set){
            if(node.isStart){
                count++;
                if(count > maxValue){
                    maxValue = count;
                    maxIndex = node.index;
                }
            }else{
                count--;
            }
        }
        
        System.out.println(maxIndex+1);
    }
    
    public static class Node implements Comparable<Node>{
        int index;
        boolean isStart;
        
        Node(int i, boolean b){
            this.index  =i;
            this.isStart = b;
        }
        
        public int compareTo(Node a){
            if(this.index < a.index){
                return -1;
            }else if(a.index < this.index){
                return 1;
            }else{
                if(!this.isStart){
                    return -1; 
                }else{
                    return 1;
                }
            }
        }
        
        public String toString(){
            char c = 'e';
            if(isStart) c = 's';
            return ""+index+c;
        }
    }
}