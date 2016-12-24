/**
 * https://www.hackerrank.com/challenges/a-chessboard-game-1
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
        int t = input.nextInt();
        for(int i=0; i<t; i++){
            int p = input.nextInt();
            int q = input.nextInt();
            if(((p-1)/2)%2==0  && ((q-1)/2)%2==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}