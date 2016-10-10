/**
 * https://www.hackerrank.com/challenges/game-of-thrones
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
        String s = input.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int oddCount = 0;
        boolean possible = true;
        for(int v:map.values()){
            if(v%2==1){
                oddCount++;
                if(oddCount>1){
                    possible = false;
                    break;
                }
            }
        }
        
        if(possible){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}