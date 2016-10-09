/**
 * https://www.hackerrank.com/challenges/anagram
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
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            String s = input.next();
            if(s.length()%2 == 1){
                System.out.println("-1");
                continue;
            }
            String s1 = s.substring(0,s.length()/2);
            String s2 = s.substring(s.length()/2,s.length());
            HashMap<Character, Integer> map1 = new HashMap<>();
            for(Character c: s1.toCharArray()){
                if(map1.containsKey(c)){
                    map1.put(c,map1.get(c)+1);
                }else{
                    map1.put(c,1);
                }
            }
            int diff = 0;
            for(Character c: s2.toCharArray()){
                if(map1.containsKey(c)){
                    if(map1.get(c) == 0){
                        diff++;
                    }else{
                        map1.put(c,map1.get(c)-1);
                    }
                }else{
                    diff++;
                }
            }
            System.out.println(diff);
        }
    }
}