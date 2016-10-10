/**
 * https://www.hackerrank.com/challenges/making-anagrams
 */


/**
 * @author rakshith
 *
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s1.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        
        int count =0;
        for(char c:s2.toCharArray()){
            if(map.containsKey(c)){
                if(map.get(c)==1){
                    map.remove(c);
                }else{
                    map.put(c,map.get(c)-1);
                }
            }else{
                count++;
            }
        }
        if(map.size() != 0){
            for(char c:map.keySet()){
                count += map.get(c);
            }
        }
        
        System.out.println(count);
    }
}