import java.util.Arrays;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (x,y) -> x[1]-y[1]);
        int count=0;
        int[] prev=intervals[0];
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]<prev[1]){
                count++;
                continue;
            }
            prev=intervals[i];
        }
        return count;
    }
}