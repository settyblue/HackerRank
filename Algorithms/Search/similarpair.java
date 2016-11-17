/**
 * https://www.hackerrank.com/challenges/similarpair
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
        int k = input.nextInt();
        ArrayList<TreeSet<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new TreeSet<Integer>());
        }
        for(int i=0; i<n-1; i++){
            int p = input.nextInt()-1;
            int c = input.nextInt()-1;
            list.get(c).add(p);
            list.get(c).addAll(list.get(p));
        }
        int count = 0;
        for(int i=0; i<n; i++){
           count += list.get(i).subSet(i-k,true,i+k,true).size(); 
        }
        //System.out.println(list);
        System.out.println(count);
    }
}