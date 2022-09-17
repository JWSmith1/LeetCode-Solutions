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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> solution = new ArrayList<>();
        Stack<TreeNode> tracker = new Stack<>();
        
        if (root == null){
            return solution;
        }
        
        tracker.push(root);
        
        while (!tracker.isEmpty()){
            TreeNode temp = tracker.peek();
            if (temp.left == null && temp.right == null){
                TreeNode first = tracker.pop();
                solution.add(first.val);
            }
            else{
                if (temp.right != null){
                    tracker.push(temp.right);
                    temp.right = null;
                }
                if (temp.left != null){
                    tracker.push(temp.left);
                    temp.left = null;
                }
            }
        }
        
        return solution;
    }
}