/**
 * https://www.hackerrank.com/challenges/apple-and-orange
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
        int oday = input.nextInt();
        int omonth = input.nextInt();
        int oyear = input.nextInt();
        int eday = input.nextInt();
        int emonth = input.nextInt();
        int eyear = input.nextInt();
        if(eyear>oyear){
            System.out.println("0");
        }else if(eyear==oyear){
            if(emonth>omonth){
                System.out.println("0");
            }else if(emonth==omonth){
                if(eday>oday){
                    System.out.println("0");
                }else if(eday==oday){
                    System.out.println("0");
                }else{
                    System.out.println((oday-eday)*15);
                }
            }else{
                System.out.println((omonth-emonth)*500);
            }
        }else{
            System.out.println("10000");
        }
    }
}