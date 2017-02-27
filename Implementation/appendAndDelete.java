/**
 * https://www.hackerrank.com/challenges/append-and-delete
 * 
 */

/**
 * @author rakshith
 *
 */
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        
        int i = 0;
        while(i<s.length() && i<t.length() && s.charAt(i)==t.charAt(i)){
            i++;
        }
        
        int x = s.length()-i;
        int y = t.length()-i;
        
        int temp = k-x-y;
        
        if(temp == 0){
            System.out.println("Yes");
        }else if(temp<0){
            System.out.println("No");
        }else{
            if(temp%2==0){
                System.out.println("Yes");
            }else{
                if(temp>=2*i){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
