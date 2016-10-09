/**
 * https://www.hackerrank.com/challenges/string-construction
 */


/**
 * @author rakshith
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            int cost = 0;
            HashSet<Character> set = new HashSet<>();
            for(char c: s.toCharArray()){
                if(!set.contains(c)){
                    set.add(c);
                    cost++;
                }
            }
            System.out.println(cost);
        }
    }
}
