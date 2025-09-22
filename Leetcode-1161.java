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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int maxSum=Integer.MIN_VALUE;
        int maxLvl=1;
        int level=0;
        while (!q.isEmpty()) {
            int size = q.size();
            int sum=0;
            level++;
            for(int i=0; i<size; i++){
                TreeNode curr=q.remove();
                sum+=curr.val;

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(maxSum<sum) {
                maxLvl = level;
                maxSum=sum;
            }
        }
        return maxLvl;
    }
}