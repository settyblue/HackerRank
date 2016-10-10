/**
 * https://www.hackerrank.com/challenges/two-strings
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
            String s1 = input.next();
            String s2 = input.next();
            
            HashSet<Character> set1 = new HashSet<>();
            
            for(Character c: s1.toCharArray()){
                set1.add(c);
            }
            
            boolean found = false;
            for(int j=0; j<s2.length(); j++){
                char c = s2.charAt(j);
                if(set1.contains(c)){
                    System.out.println("YES");
                    found = true;
                    break;
                }
            }
            
            if(!found)System.out.println("NO");
        }
    }
}