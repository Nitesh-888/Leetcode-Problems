import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    int count = 0;
    public void helper(TreeNode root, int targetSum, ArrayList<Integer> list, long sum){
        if(root==null) return;
        list.add(root.val);
        long newSum = sum+root.val;
        for(int i=0; i<list.size(); i++){
            if(newSum==targetSum) count++;
            newSum-=list.get(i);
        }
        helper(root.left, targetSum, list, sum+root.val);
        helper(root.right, targetSum, list, sum+root.val);
        list.remove(list.size()-1);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        helper(root, targetSum, new ArrayList<>(), 0);
        return count;
    }
}