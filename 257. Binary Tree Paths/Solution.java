class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> ans= new ArrayList<>();
       if(root!= null){
        BST(root, "", ans);
       } 
       return ans;
    }

    private void BST(TreeNode root, String path, List<String> ans){
        if(root.left== null && root.right== null){
            ans.add(path+ root.val);
        }
        if(root.left!= null){
            BST(root.left, path+ root.val+ "->", ans);
        }
        if(root.right!= null){
            BST(root.right, path+ root.val+ "->", ans);
        }
    }
}
