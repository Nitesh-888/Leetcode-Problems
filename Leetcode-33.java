class L33 {
    public static int Search(int[] nums, int target){
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target) return mid;
            if(nums[st] <= nums[mid]){ 
                //left half sorted
                if(nums[st] <= target && target<nums[mid]){
                    end=mid-1;
                } else{
                    st=mid+1;
                }

            } else { 
                //right half sorted
                if(nums[mid]<target && target<=nums[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] n={5,4};
        System.out.println(Search(n, 4));
    }
}
