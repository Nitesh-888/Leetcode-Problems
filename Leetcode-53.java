package Problems;

public class L53 {
    // kadane's algorithm
    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0; i<nums.length; i++){
            curSum+=nums[i];
            maxSum=(curSum>maxSum)?curSum:maxSum;
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }

    //prifix array sum method
    //prifix array is the array that store the sum of element till its index
    public static int maxSubArray2(int[] nums){
        int[] prifixArray = new int[nums.length];
        prifixArray[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            prifixArray[i] = prifixArray[i-1]+nums[i];
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                int sum=i==0?prifixArray[j] : prifixArray[j]-prifixArray[i-1];
                maxSum=(sum>maxSum)?sum:maxSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] n={5,-3,2,1,-4};
        System.out.println(maxSubArray(n));
        System.out.println(maxSubArray2(n));
    }
}
