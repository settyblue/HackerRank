/**
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
        Trie root = new Trie();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str="";
        boolean passed = true;
        for(int i=0; i<n; i++){
            str = input.next();
            passed = root.add(str);
            if(!passed)break;
        }
        if(passed){
            System.out.println("GOOD SET");
        }else{
            System.out.println("BAD SET");
            System.out.println(str);
        }
    }
    
    public static class Trie{
        public char data;
        public boolean leaf = true;
        public boolean wordhere = false;
        public int count = 0;
        public Trie[] children = new Trie[26];
        Trie(){}
        Trie(char c){
            this.data = c;
        }
        
        public boolean add(String s){
            char c = s.charAt(0);
            if(s.length() == 1 && children[c-'a'] != null && children[c-'a'].wordhere){
                return false;
            }
            if(wordhere){
                return false;
            }
            if(s.length() > 1){
                if(children[c-'a'] == null){
                    children[c-'a'] = new Trie(c);
                    this.leaf = false;
                }
                if(this.children[c-'a'].add(s.substring(1))){
                    this.count++;
                    return true;
                }else{
                    return false;
                }
            }else{
                if(children[c-'a'] != null){
                    return false;
                }else if(children[c-'a'] == null){
                    children[c-'a'] = new Trie(c);
                    this.leaf = false;
                }
                if(!this.children[c-'a'].wordhere){
                    this.children[c-'a'].wordhere = true;
                    this.children[c-'a'].count++;
                    this.count++;
                    return true;
                }else{
                    return false;
                }
            }
        }
        
        public void print(String s){
            if(leaf){
                System.out.println(s+this.data);
            }else{
                if(wordhere){
                    System.out.println(s+this.data);
                }
                for(int i=0; i<26; i++){
                    if(children[i] != null){
                        System.out.print(data+"->"+count+" ");
                        children[i].print(s+this.data);
                    }
                }
            }
        }
    }
}
