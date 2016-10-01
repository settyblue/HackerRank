/**
 * https://www.hackerrank.com/challenges/simple-text-editor
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
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Command> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        StringBuffer str = new StringBuffer();
        int q = input.nextInt();
        for(int i=0; i<q; i++){
            int c = input.nextInt();
            if(c == 1){
                String arg = input.next();
                stack.push(new Command(c,arg));
                str.append(arg);
            }else if(c == 2){
                int k = input.nextInt();
                stack.push(new Command(c,str.substring(str.length()-k)));
                str.delete(str.length()-k,str.length());
            }else if(c == 3){
                int k = input.nextInt();
                System.out.println(str.charAt(k-1));
            }else{
                Command cmd = stack.pop();
                if(cmd.code == 1){
                    str.delete(str.length()-cmd.arg.length(),str.length());
                }else{
                    str.append(cmd.arg);
                }
            }
            
            //System.out.println(str);
        }
    }
    
    public static class Command{
        public int code;
        public String arg;
        
        Command(int code, String arg){
            this.code = code;
            this.arg = arg;
        }
    }
}