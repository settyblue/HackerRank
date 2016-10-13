/**
 * https://www.hackerrank.com/challenges/quicksort4
 */


/**
 * @author rakshith
 *
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static int insertionSortCount(ArrayList<Integer> A){
        int count = 0;
        for(int i = 1; i < A.size(); i++){
            int value = A.get(i);
            int j = i - 1;
            while(j >= 0 && A.get(j) > value){
                A.set(j+1, A.get(j));
                j = j - 1;
                count++;
            }
            A.set(j+1, value);
        }
        //System.out.println(count);
        return count;
    }
    
    public static int quickSortCount(ArrayList<Integer> ar, int start, int end){
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
        int count = c-start;
        if(c-start-1 > 1){
            count += quickSortCount(ar,start,c-1);  
        }
        if(end-c > 1){
            count += quickSortCount(ar, c, end);
        }
        return count;
    }
    
    public static void printArraylist(ArrayList<Integer> ar){
        for(int i=0; i<ar.size(); i++){
            System.out.print(ar.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp = in.nextInt();
            ar1.add(temp);
            ar2.add(temp);
        }
        int count = insertionSortCount(ar1) - quickSortCount(ar2,0,n);
        System.out.println(count);
    }
}