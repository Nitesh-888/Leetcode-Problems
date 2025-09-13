class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] suffSum=new int[n];
        suffSum[n-1]=0;
        for(int i=n-2; i>=0; i--){
            suffSum[i]=suffSum[i+1]+nums[i+1];
        }
        int preSum=0;
        if(suffSum[0]==0) return 0;
        for(int i=1; i<n; i++){
            preSum=preSum+nums[i-1];
            if(suffSum[i]==preSum) return i;
        }
        
        return -1;
    }
}