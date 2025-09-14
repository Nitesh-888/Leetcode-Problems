import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int num : nums1){
            hs1.add(num);
        }
        for(int num : nums2){
            hs2.add(num);
        }
        ArrayList<Integer> ans1=new ArrayList<>();
        for(int num : hs1){
            if(!hs2.contains(num)){
                ans1.add(num);
            }
        }
        ArrayList<Integer> ans2=new ArrayList<>();
        for(int num : hs2){
            if(!hs1.contains(num)){
                ans2.add(num);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}