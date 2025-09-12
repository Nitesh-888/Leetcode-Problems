package Problems;

public class L31 {
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int pvt=-1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pvt=i;
                break;
            }
        }
        if(pvt==-1){
            int st=0, end=n-1;
            while(st<=end){
                int temp=nums[st];
                nums[st]=nums[end];
                nums[end]=temp;
                st++;
                end--;
            }
            return ;
        }
        for(int i=n-1; i>=pvt; i--){
            if(nums[i]>nums[pvt]){
                int temp=nums[pvt];
                nums[pvt]=nums[i];
                nums[i]=temp;
                break;
            }
        }
    
        int i=pvt+1, j=n-1;
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void printArray(int [] n){
        for(int i=0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] n1={1,3,4};
        int [] n2={3,2,1};
        nextPermutation(n1);
        nextPermutation(n2);
        printArray(n1);
        printArray(n2);
        
    }
}
