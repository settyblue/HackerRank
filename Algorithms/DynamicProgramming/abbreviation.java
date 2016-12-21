/**
 * https://www.hackerrank.com/challenges/abbr
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
            String a = input.next();
            String b = input.next();
            if(canAbbreviate(a,b,0,0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
    public static boolean canAbbreviate(String a,String b,int x, int y){
        if(y == b.length()){
            return checkUpperCaseInResidue(a,x);
        }
        if(x == a.length()){
            return false;
        }
        boolean answer = false;
        if(Character.isLowerCase(a.charAt(x))){
            if(Character.toUpperCase(a.charAt(x)) == b.charAt(y)){
                answer = canAbbreviate(a,b,x+1,y+1) || canAbbreviate(a,b,x+1,y);
            }else{
                answer = canAbbreviate(a,b,x+1,y);
            }
        }else{
            if(a.charAt(x) == b.charAt(y)){
                answer = canAbbreviate(a,b,x+1,y+1);
            }else{
                answer = false;
            }
        }
        return answer;
    }
    
    public static boolean checkUpperCaseInResidue(String a, int x){
        for(int i=x; i<a.length(); i++){
            if(Character.isUpperCase(a.charAt(i))){
                return false;
            }
        }
        return true;
    }
}