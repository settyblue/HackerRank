/**
 * https://www.hackerrank.com/challenges/sparse-arrays
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
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String s = input.next();
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        int q = input.nextInt();
        for(int i=0; i<q; i++){
            String s = input.next();
            if(map.containsKey(s)){
                System.out.println(map.get(s));
            }else{
                System.out.println(0);
            }
        }
    }
}