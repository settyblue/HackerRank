import java.io.*;
import java.util.*;
/**
 * https://www.hackerrank.com/challenges/pairs
 */


/**
 * @author rakshith
 *
 */

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        Arrays.parallelSort(array);
        int count = 0;
        int i=0; int j=1;
        while(j<n){
            if(array[i] == array[j]-k){
                count++;
                i++;j++;
                continue;
            }
            if(array[i] < array[j]-k){
                i++;
                continue;
            }
            if(array[i] > array[j]-k){
                j++;
                continue;
            }
        }
        System.out.println(count);
    }
}