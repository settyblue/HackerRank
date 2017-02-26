/**
 * https://www.hackerrank.com/challenges/fraudulent-activity-notifications
 * The solution below is working, but takes lot of time.
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
        int d = input.nextInt();
        int count = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0; i<n; i++){
            //System.out.println(ar);
            double median = 0;
            if(i>=d){
                ArrayList<Integer> ar2 = new ArrayList<>(ar);
                quickSort(ar2,0,d);
                if(d%2==1){
                    median = ar2.get(d/2);
                }else{
                    median = (ar2.get(d/2-1) + ar2.get(d/2))/2.0;
                }
                //System.out.println(median);
                ar.remove(0);
            }
            int temp = input.nextInt();
            ar.add(temp);
            if(i >= d && temp >= 2*median){
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static void quickSort(ArrayList<Integer> ar, int start, int end){
        
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
        if(c-start-1 > 1){
            quickSort(ar,start,c-1);  
        }
        if(end-c > 1){
            quickSort(ar, c, end);
        }
        return;
    }
    
}