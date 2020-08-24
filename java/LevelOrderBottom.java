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
import java.util.Stack;

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
        if(root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        dept(stack,root);
        while(!stack.isEmpty()) {
            list.add(stack.pop());
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(root.val);
        list.add(arrayList);
        return list;

    }

    public void dept(Stack stack,TreeNode root) {
        if (root == null) return;

        if (root.left != null || root.right != null) {
            List<Integer> list2 = new ArrayList();
            if (root.left != null) {
                list2.add(root.left.val);
            }
            if (root.right != null) {
                list2.add((root.right.val));
            }
            stack.add(list2);
            dept(stack, root.left);
            dept(stack, root.right);

        }

    }
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.mkTree("[3,9,20,null,null,15,7]");
        System.out.println(new LevelOrderBottom().levelOrderBottom(treeNode));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
