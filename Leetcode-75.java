class L75 {
    public static void sortColors1(int[] nums) {
        int zero=0, one=0, two=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) zero++;
            else if(nums[i]==1) one++;
            else two++;
        }
        int idx=0;
        for(int i=0; i<zero; i++){
            nums[idx]=0;
            idx++;
        }
        for(int i=0; i<one; i++){
            nums[idx]=1;
            idx++;
        }
        for(int i=0; i<two; i++){
            nums[idx]=2;
            idx++;
        }
    }

    public static void sortColors2(int nums[]){
        int n=nums.length;
        int low=0, mid=0, high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
    public static void printArray(int [] n){
        for(int i=0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] n={1,0,2,1,0,0,1,2,0,1,1,2,0};
        sortColors2(n);
        printArray(n);
    }
    
}
