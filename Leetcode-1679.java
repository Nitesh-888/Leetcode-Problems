import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        int ops = 0;
        for(int i=0; i<n; i++){
            int num = nums[i];
            int tar = k-num;
            if(hm.containsKey(num) && hm.get(num)>0){
                hm.put(num, hm.get(num)-1);
                if(hm.containsKey(tar) && hm.get(tar)>0){
                    hm.put(tar, hm.get(tar)-1);
                    ops++;
                }else{
                    hm.put(num, hm.get(num)+1);
                }
            }
        }
        return ops;
    }
    public int maxOperations1(int[] nums, int k){
        Arrays.sort(nums);
        int st=0;
        int end=nums.length-1;
        int ops=0;
        while(st<end){
            int sum = nums[st] + nums[end];
            if(sum == k){
                ops++;
                st++;
                end--;
            }else if(sum > k){
                end--;
            }else{
                st++;
            }
        }
        return ops;
    }
}