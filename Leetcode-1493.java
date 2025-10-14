class Solution {
    public int longestSubarray(int[] nums) {
        int left=0, count=0, ans=0;
        int zeroCount=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) {
                zeroCount++;
            }

            while (zeroCount>1) {
                if(nums[left]==0) {
                    zeroCount--;
                    left++;
                    break;
                }
                left++;
                count--;
            }
            if(nums[i]!=0) count++;
            ans=Math.max(ans, count);
        }
        if(ans==nums.length) return ans-1;
        return ans;
    }
}