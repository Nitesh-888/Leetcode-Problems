class L136 {
    public static int singleNumber1(int[] nums) {
        int ans=-1;
        for(int i=0; i<nums.length; i++){
            boolean isFound=false;

            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j] && i!=j){
                    isFound=true;
                    break;
                }
            }
            if(!isFound){
                ans=i;
                break;
            }
        }
        return nums[ans];
    }
    public static int singleNumber2(int[] nums){
        int ans=0;
        for(int i: nums){
            ans^=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n[]={4,1,2,1,2,4,9};
        System.out.println(singleNumber1(n));
        System.out.println(singleNumber1(n));
        
    }
}
