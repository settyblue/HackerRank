/**
 * https://www.hackerrank.com/challenges/palindrome-index
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
        for(int i=0; i<n; i++){
            String s = input.next();
            int start=0, end=s.length()-1;
            int diffStart=0, diffEnd=0;
            while(start < end){
                if(s.charAt(start) != s.charAt(end)){
                    diffStart = start;
                    diffEnd = end;
                    break;
                }
                start++;end--;
            }
            if(start < end){
                int oldDiffEnd = diffEnd;
                int oldDiffStart = diffStart;
                if(s.charAt(diffStart) == s.charAt(diffEnd-1) ){
                    boolean errorfound= false;
                    diffEnd = diffEnd-1;
                    while(diffStart < diffEnd){
                        if(s.charAt(diffStart) != s.charAt(diffEnd)){
                            errorfound = true;
                        }
                        diffStart++;diffEnd--;
                    }
                    if(errorfound){
                        System.out.println(oldDiffStart);
                        continue;
                    }else{
                        System.out.println(oldDiffEnd);
                        continue;
                    }
                }
                System.out.println(oldDiffStart);
                continue;
            }
            System.out.println("-1");
        }
    }
}