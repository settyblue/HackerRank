/**
 * https://www.hackerrank.com/challenges/dynamic-array
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
        int n,q;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        q = input.nextInt();
        ArrayList<Integer>[] sequenceList = new ArrayList[n];
        for(int i=0; i<n; i++){
            sequenceList[i] = new ArrayList<Integer>();
        }
        int lastAnswer = 0;
        for(int i=0; i<q; i++){
            int queryType = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            if(queryType == 1){
                int index = (x ^ lastAnswer)%n;
                sequenceList[index].add(y);
            }else{
                int index = (x ^ lastAnswer)%n;
                lastAnswer = sequenceList[index].get(y%sequenceList[index].size());
                System.out.println(lastAnswer);
            }
        }
    }
}