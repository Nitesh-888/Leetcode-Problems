package Problems;

public class L540 {
    public static int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int st=1;
        int end=n-2;
        if(n==1) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        if(nums[0]!=nums[1]) return nums[0];
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if(mid%2==1){
                if(nums[mid]==nums[mid-1]){
                    st=mid+1;
                }else {
                    end=mid-1;
                }
            }else{
                if(nums[mid]==nums[mid-1]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n1[]={3,3,7,7,10,11,11};
        int n2[]={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(n1));
        System.out.println(singleNonDuplicate(n2));
    }
}
