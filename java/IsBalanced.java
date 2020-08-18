//给定一个二叉树，判断它是否是高度平衡的二叉树。 
//
// 本题中，一棵高度平衡二叉树定义为： 
//
// 
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。 
// 
//
// 示例 1: 
//
// 给定二叉树 [3,9,20,null,null,15,7] 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回 true 。 
// 
//示例 2: 
//
// 给定二叉树 [1,2,2,3,3,null,null,4,4] 
//
//        1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
// 
//
// 返回 false 。 
//
// 
// Related Topics 树 深度优先搜索




//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return   depth(root)>=0;
    }

    public int depth(TreeNode root) {
        if(root == null) return 0;
        int left = depth(root.left);
        if(left == -1) return  -1;
        int right = depth(root.right);
        if(right == -1) return  -1;
        return Math.abs(depth(root.right)- depth(root.left)) > 1 ? -1:(Math.max(left,right) +1);

    }

}
//leetcode submit region end(Prohibit modification and deletion)
