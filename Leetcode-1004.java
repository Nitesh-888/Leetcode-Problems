class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int zeroCount=0;
        int count=0;
        int ans=0;
        for(int i=right; i<nums.length; i++){
            if(nums[i] == 0) zeroCount++;
            
            while(zeroCount>k){
                if(nums[left]==0) zeroCount--;
                left++;
                count--;
            }
            count++;
            ans = Math.max(ans, count);
        }
        return ans;
    }
}