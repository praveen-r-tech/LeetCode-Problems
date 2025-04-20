class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left,root.right);
    }

    private boolean mirror(TreeNode n1, TreeNode n2){
        if(n1== null && n2== null){
            return true;
        }

        if(n1== null || n2== null){
            return false;
        }

        return n1.val== n2.val && mirror(n1.left, n2.right) && mirror(n1.right, n2.left);
    }
}
