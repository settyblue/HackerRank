/**
 * https://www.hackerrank.com/challenges/merging-communities
 */


/**
 * @author rakshith
 *
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = -1;
        }
        
        for(int i=0; i<q; i++){
            if(scan.next().equals("Q")){
                int p = scan.nextInt()-1;
                while(array[p] >= 0){
                    p = array[p];
                }
                System.out.println(array[p]*(-1));
            }else{
                int p = scan.nextInt()-1;
                int pc = 0;
                int r = scan.nextInt()-1;
                int rc = 0;
                
                while(array[p] >= 0){
                    p = array[p];
                    pc++;
                }
                while(array[r] >= 0){
                    r = array[r];
                    rc++;
                }
                if(p==r){
                    continue;
                }else{
                    if(rc > pc){
                        int c = array[p]*(-1);
                        array[p] = r;
                        array[r] -= c;
                    }else{
                        int c = array[r]*(-1);
                        array[r] = p;
                        array[p] -= c;
                    }
                }
            }
        }
    }
}