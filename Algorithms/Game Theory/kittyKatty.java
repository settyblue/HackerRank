/**
 * https://www.hackerrank.com/challenges/kitty-and-katty
 * 
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
        int T = input.nextInt();
        for(int t=0; t<T; t++){
            int n = input.nextInt();
            if(n==1){
                System.out.println("Kitty");
            }else if(n%2==0){
                System.out.println("Kitty");
            }else{
                System.out.println("Katty");
            }
        }
    }
}