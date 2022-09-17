/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> solution = new ArrayList<>();
        Stack<TreeNode> tracker = new Stack<>();
        
        if (root == null){
            return solution;
        }
        
        tracker.push(root);
        
        while(!tracker.isEmpty()){
            TreeNode x = tracker.pop();
            solution.add(x.val);
            
            if (x.right != null){
                tracker.push(x.right);
            }
            if (x.left != null){
                tracker.push(x.left);
            }
        }
        
        return solution;
    }
}