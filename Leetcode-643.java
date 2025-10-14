class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int st=0, end=k-1;
        double sum=0;
        for(int i=st; i<=end; i++){
            sum+=nums[i];
        }
        double maxAvg=sum/k;
        st++;
        end++;
        while(end<nums.length){
            sum=sum-nums[st-1]+nums[end];
            maxAvg = Math.max(maxAvg, sum/k);

            st++;
            end++;
        }
        return maxAvg;
    }
}