import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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
    public int helper(TreeNode root, int dir, HashMap<TreeNode, HashMap<Integer, Integer>> dp){
        if(root==null) return -1;
        if(root.left==null && root.right==null) return 0;
        if(dp.containsKey(root) && dp.get(root).containsKey(dir)) return dp.get(root).get(dir);

        int val=-1;
        if(dir==0){
            val = helper(root.left, 1, dp)+1;

        }else{
            val = helper(root.right, 0, dp)+1;
        }
        HashMap<Integer, Integer> hm=new HashMap<>();
        hm.put(dir, val);
        dp.put(root, hm);
        return val;

    }

    public int longestZigZag(TreeNode root) {
        HashMap<TreeNode, HashMap<Integer, Integer>> dp = new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            int left = helper(curr, 0, dp);
            int right = helper(curr, 1, dp);
            int max=Math.max(left, right);
            ans=Math.max(ans, max);

            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        return ans;
    }


    // -------slightly optimized
    public int helper(TreeNode root, int dir, int len){
        if(root==null) return len-1;
        int left=0, right=0;
        if(dir==0){
            left = helper(root.left, 1, len+1);
            right = helper(root.right, 0, 1);
        }else{
            right = helper(root.right, 0, len+1);
            left = helper(root.left, 1, 1);
        }
        return Math.max(left, right);
    }
    public int longestZigZag2(TreeNode root) {
        int left = helper(root, 0, 0);
        int right = helper(root, 1, 0);
        return Math.max(left, right);
    }
}