/**
 * https://www.hackerrank.com/challenges/game-of-stones-1
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
            if(p%7 == 1 || p%7 == 0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}