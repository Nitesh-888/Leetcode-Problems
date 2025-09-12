package Problems;
import java.util.Arrays;

public class L169 {
    //brute force
    public static int majority1(int[] nums){
        int ans=0;
        int size=nums.length;
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=0;j<size;j++){
                if(nums[i]==nums[j]){
                    count+=1;
                }
            }
            if(count>size/2){
                ans=nums[i];
                return ans;
            }
        }
        return ans;
    }
    //find majority after sorting 
    public static int majority2(int[] nums){
        int size=nums.length;
        int ans=nums[0];
        int count=1;
        Arrays.sort(nums);
        for(int i=1;i<size;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
                ans=nums[i];
            }
    
            if(count>size/2){
                return ans;
            }
    
        }
        return ans;
    }
    //moore's algorithm
    public static int majority3(int[] nums){
        int votes=0;
        int candidate=0;
        for(int i=0; i<nums.length; i++){
            if(votes==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                votes++;
            }else{
                votes--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] n={4,6,2,1,1,2,2,2,2};
        System.out.println(majority1(n));
        System.out.println(majority2(n));
        System.out.println(majority3(n));
    }


    
}
