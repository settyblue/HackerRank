/**
 * https://www.hackerrank.com/challenges/richie-rich/
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
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        boolean[] check = new boolean[n];
        int diffCount = 0;
        for(int i=0; i<n/2; i++){
            if(number.charAt(i) != number.charAt(n-1-i)){
                diffCount++;
            }
        }
        if(diffCount > k){
            System.out.println("-1");
            return;
        }
        if(k>n){
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<n; i++){
                sb.append('9');
            }
            System.out.println(sb);
            return;
        }
        
        StringBuffer sb = new StringBuffer(number);
        for(int i=0; i<n/2; i++){
            if(sb.charAt(i) > sb.charAt(n-1-i)){
                sb.setCharAt(n-1-i, sb.charAt(i));
                check[i] = true;
            }else if(sb.charAt(i) < sb.charAt(n-1-i)){
                sb.setCharAt(i, sb.charAt(n-1-i));
                check[i] = true;
            }
        }
        
        int left = k-diffCount;
        
        int start = 0;
        while(left > 1 && start < n/2){
            if(sb.charAt(start) != '9'){
                sb.setCharAt(start,'9');
                sb.setCharAt(n-1-start,'9');
                if(!check[start])left = left-2;
                else left = left-1;
            }
            start++;
        }
        
        if(left==1){
            while(left > 0 && start < n/2){
                if(check[start] && sb.charAt(start) != '9'){
                    sb.setCharAt(start,'9');
                    sb.setCharAt(n-1-start,'9');
                    left--;
                }
                start++;
            }
        }
        
        if(left==1 && n%2==1){
            sb.setCharAt((n-1)/2,'9');
            left--;
        }
        System.out.println(sb.toString());
        
    }
}
