/**
 * https://www.hackerrank.com/challenges/gridland-metro
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
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        ArrayList<TreeSet<Track>> list = new ArrayList<>();
        
        for(int i=0; i<m; i++){
            list.add(new TreeSet<Track>());
        }
        
        for(int i=0; i<k; i++){
            int j = input.nextInt();
            int p = input.nextInt();
            int q = input.nextInt();
            list.get(j-1).add(new Track(p-1,q));
        }
        
        int answer = 0;
        for(int i=0; i<n; i++){
            if(list.get(i).size() == 0){
                answer += m;
                continue;
            }
            int thisRowFilledCount = 0;
            Iterator<Track> iter = list.get(i).iterator();
            Track curTrack = iter.next();
            Track nextTrack;
            while(iter.hasNext()){
                nextTrack = iter.next();
                if(curTrack.overlap(nextTrack)){
                    curTrack = Track.merge(curTrack, nextTrack);
                }else{
                    thisRowFilledCount += curTrack.end - curTrack.start;
                    curTrack = nextTrack;
                }
            }
            thisRowFilledCount += curTrack.end - curTrack.start;
            //System.out.println(thisRowFilledCount);
            answer += (m - thisRowFilledCount);
        }
        //System.out.println(list);
        System.out.println(answer);
    }
    
    public static class Track implements Comparable<Track>{
        int start;
        int end;
        
        Track(int i, int j){
            this.start = i;
            this.end = j;
        }
        
        @Override
        public int compareTo(Track t){
            if(this.start < t.start){
                return -1;
            }else if(this.start > t.start){
                return 1;
            }else{
                if(this.end < t.end){
                    return -1;
                }else{
                    return 1;
                }
            }
        }
        
        public boolean overlap(Track t){
            if(this.start <= t.start && t.start < this.end){
                return true;
            }
            return false;
        }
        
        public static Track merge(Track t1, Track t2){
            return new Track(t1.start, t2.end);
        }
        
        public String toString(){
            return "("+start+", "+end+")";
        }
    }
}