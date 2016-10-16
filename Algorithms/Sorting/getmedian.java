/**
 * https://www.hackerrank.com/challenges/find-the-median
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
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0; i<n; i++){
            ar.add(input.nextInt());
        }
        System.out.println(getMedian(ar,0,n));
    }
    
    public static int getMedian(ArrayList<Integer> ar, int start, int end){
        
        int value = ar.get(end-1);
        int c=start;
        for(int i=start; i<end; i++){
            if(ar.get(i) > value){
                continue;
            }else{
                int temp = ar.get(i);
                ar.set(i,ar.get(c));
                ar.set(c,temp);
                c++;
            }
        }
        int medPosition = ar.size()/2;
        if(c-1 == medPosition){
            return ar.get(c-1);
        }
        int median = 0;
        if(c-start-1 > 1 && start <= medPosition && medPosition < c){
            median = getMedian(ar,start,c-1);  
        }
        if(end-c > 1 && c <= medPosition && medPosition <= end){
            median = getMedian(ar, c, end);
        }
        if(c == start+2)median = ar.get(c-2);
        if(end == c+1)median = ar.get(c-2);
        return median;
    }
    
    public static void printArraylist(ArrayList<Integer> ar){
        for(int i=0; i<ar.size(); i++){
            System.out.print(ar.get(i)+" ");
        }
    }
}