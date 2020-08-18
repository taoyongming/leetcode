//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历） 
//
// 例如： 
//给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其自底向上的层次遍历为： 
//
// [
//  [15,7],
//  [9,20],
//  [3]
//]
// 
// Related Topics 树 广度优先搜索




//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List list = new ArrayList();
        this.add(root,list);
        return list;
    }
    public void add(TreeNode root, List list) {
        if(root != null) {
            List list2 = new ArrayList();
            list2.add(root.left);
            list2.add(root.right);
            list.add(list2);
            this.add(root.left,list);
            this.add(root.right,list);
        }else {
            list.add(root);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
