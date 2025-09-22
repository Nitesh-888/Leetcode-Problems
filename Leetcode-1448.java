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
    int count=0;
    public void helper(TreeNode root, int maxVal){
        if(root==null) return;
        if(root.val>=maxVal){
            maxVal=root.val;
            count++;
        }
        helper(root.left, maxVal);
        helper(root.right, maxVal);
    }
    public int goodNodes(TreeNode root) {
        helper(root, root.val);
        return count;
    }
}