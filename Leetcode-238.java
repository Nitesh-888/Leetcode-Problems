package Problems;

public class L238 {
    //brute force appproach but give TLE
    public static int[] productExceptSelf1(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int prod=1;
            for(int j=0; j<nums.length; j++){
                if(i!=j){
                    prod*=nums[j];
                }
            }
            ans[i]=prod;
        }
        return ans; 
    }
    //optimise approach but space complexity is O(n) 
    public static int[] productExceptSelf2(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int[] preffix = new int[n];
        int[] suffix = new int[n];
        preffix[0]=1;
        suffix[n-1]=1;
         
        //for preffix product
        for(int i=1; i<n; i++){
            preffix[i]=preffix[i-1] * nums[i-1];
        }
        //for suffix product
        for(int i=n-2; i>=0; i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        for(int i=0; i<n; i++){
            ans[i]=preffix[i]*suffix[i];
        }
        return ans;  
    }

    //best approach
    public static int[] productExceptSelf3(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        //for preffix
        ans[0]=1;
        for(int i=1; i<n; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        //for suffix
        int suffix=1;
        for(int i=n-2; i>=0; i--){
            suffix*=nums[i+1];
            ans[i]*=suffix;
        }
        return ans;
    }
    public static void printArray(int [] n){
        for (int i=0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] n={1,2,3,4};
        printArray(productExceptSelf1(n));
        printArray(productExceptSelf2(n));
        printArray(productExceptSelf3(n));
    }
}
