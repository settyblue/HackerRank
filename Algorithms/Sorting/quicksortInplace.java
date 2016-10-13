/**
 * https://www.hackerrank.com/challenges/quicksort3
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
        quickSort(ar,0,n);
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
        printArraylist(ar);
        System.out.println();
        if(c-start-1 > 1){
            quickSort(ar,start,c-1);  
        }
        if(end-c > 1){
            quickSort(ar, c, end);
        }
        return;
    }
    
    public static void printArraylist(ArrayList<Integer> ar){
        for(int i=0; i<ar.size(); i++){
            System.out.print(ar.get(i)+" ");
        }
    }
}