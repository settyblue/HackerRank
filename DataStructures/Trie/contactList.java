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
        int q = input.nextInt();
        for(int i=0; i<q; i++){
            String instr = input.next();
            if(instr.equals("add")){
                root.add(input.next());
            }else{
                System.out.println(root.findCount(input.next()));
            }
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
            if(children[c-'a'] == null){
                children[c-'a'] = new Trie(c);
                this.leaf = false;
            }
            if(s.length() > 1){
                if(this.children[c-'a'].add(s.substring(1))){
                    this.count++;
                    return true;
                }else{
                    return false;
                }
            }else{
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
        
        public int findCount(String s){
            if(s.length() == 0){
                return count;
            }else{
                char c = s.charAt(0);
                if(children[c-'a'] != null){
                    return children[c-'a'].findCount(s.substring(1));
                }else{
                    return 0;
                }
            }
        }
    }
}
