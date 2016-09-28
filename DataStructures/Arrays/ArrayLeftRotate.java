import java.io.*;
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/array-left-rotation
 */


/**
 * @author rakshith
 *
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        int[] array = new int[n];
        boolean[] check = new boolean[n];
        for(int i=0; i<n ; i++){
            array[i] = input.nextInt();
        }
        Integer temp;
        for(int i=0; i<n; i++){
            if(!check[i]){
                int index = i;
                temp = array[index];
                while(!check[index]){
                    int toIndex = (index+n-d)%n;
                    temp = exchange(temp,array,toIndex);
                    check[index] = true;
                    index = toIndex;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    
    public static int exchange(int a,int[] array,int index){
        int temp = array[index];
        array[index] = a;
        return temp;
    }
}