/**
 * https://www.hackerrank.com/challenges/runningtime
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
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<n; i++){
            int key = input.nextInt();
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        int m = input.nextInt();
        for(int i=0; i<m; i++){
            int key = input.nextInt();
            if(map.containsKey(key)){
                map.put(key, map.get(key)-1);
                if(map.get(key) == 0)map.remove(key);
            }else{
                set.add(key);
            }
        }
        for(Integer element:set){
            System.out.print(element+" ");
        }
    }
}