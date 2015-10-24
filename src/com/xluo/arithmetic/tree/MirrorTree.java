package com.xluo.arithmetic.tree;

/**
 * [二叉树的镜像]
 * 操作给定的二叉树，将其变换为源二叉树的镜像。 
 * 二叉树的镜像定义：源二叉树 
 *   	    8
 *   	   /  \
 *   	  6   10
 *   	 / \  / \
 *   	5  7 9 11
 *   	镜像二叉树
 *   	    8
 *   	   /  \
 *   	  10   6
 *   	 / \  / \
 *   	11 9 7  5
 * @author luozhangjie
 *
 */
public class MirrorTree {

	public void mirror(TreeNode root) {
		
        if(root == null){
            return;
        }
        if(root.left != null || root.right != null){
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            mirror(root.left);
            mirror(root.right);
        }
    }
	
	class TreeNode {
		int val;
		TreeNode left = null;
		TreeNode right = null;
		
		public TreeNode(int val){
			this.val = val;
		}
	}
	
}
