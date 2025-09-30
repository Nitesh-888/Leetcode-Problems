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
    public TreeNode findLeftestNode (TreeNode root){
        if(root.left == null ) return root;
        return findLeftestNode(root.left);
    }
    public TreeNode helper(TreeNode root, int key){
        if(root==null) return null;

        if(root.val > key){
            root.left = helper(root.left, key); 
        }else if(root.val < key) {
            root.right = helper(root.right, key);
        }else {
            //leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            //one child
            if(root.left == null || root.right == null){
                return root.left==null? root.right : root.left;
            }

            //two child
            TreeNode ln = findLeftestNode(root.right);
            root.val = ln.val;
            root.right = helper(root.right, ln.val);
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return helper(root, key);
    }
}