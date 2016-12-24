/**
 * https://www.hackerrank.com/challenges/fun-game-1
 * 
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
        int T = input.nextInt();
        for(int t=0; t<T; t++){
            int n = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int aScore = 0, bScore = 0;
            TreeSet<Pair> c = new TreeSet<>();
            
            for(int i=0; i<n; i++){
                a[i] = input.nextInt();
            }
            
            for(int i=0; i<n; i++){
                b[i] = input.nextInt();
                c.add(new Pair(a[i]+b[i], i));
            }
            
            int turn = 0;
            for(Pair p:c){
                if(turn == 0)
                    aScore += a[p.index];
                else
                    bScore += b[p.index];
                turn = 1 - turn;
            }
            if(aScore > bScore){
                System.out.println("First");
            }else if(aScore == bScore){
                System.out.println("Tie");
            }else{
                System.out.println("Second");
            }
            //System.out.println(aScore+" "+bScore);
            //System.out.println(c);
        }
    }
    
    
    public static class Pair implements Comparable<Pair>{
        int sum;
        int index;
        
        Pair(int s, int i){
            this.sum = s;
            this.index = i;
        }
        
        @Override
        public int compareTo(Pair p){
            if(this.sum < p.sum){
                return 1;
            }else{
                return -1;
            }
        }
        
        public String toString(){
            return "{ s = "+sum+", i = "+index+" }";
        }
    }
}