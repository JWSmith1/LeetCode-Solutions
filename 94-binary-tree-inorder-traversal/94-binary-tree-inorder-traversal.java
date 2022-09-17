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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> answer = new ArrayList<>();
        Stack<TreeNode> tracker = new Stack<>();
        
        TreeNode start = root;
        while(start != null){
            tracker.push(start);
            start = start.left;
        }
        
        while(!tracker.isEmpty()){
            TreeNode x = tracker.pop();
            answer.add(x.val);
            
            x = x.right;
            
            while(x != null){
                tracker.push(x);
                x = x.left;
            }
        }
        
        return answer;
    }
}