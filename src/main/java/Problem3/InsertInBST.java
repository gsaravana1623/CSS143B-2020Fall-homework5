package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static TreeNode insert(TreeNode<Integer> root, int valToInsert) {
        if(root == null) return new TreeNode(valToInsert);
        TreeNode cur = root;
        while(true) {
            if (!(valToInsert >= cur.val)) {
                if(cur.left != null) cur = cur.left;
                else {
                    cur.left = new TreeNode(valToInsert);
                    break;
                }
            } else {
                if (cur.right != null) cur = cur.right;
                else {
                    cur.right = new TreeNode(valToInsert);
                    break;
                }
            }
        }
        return root;
    }

}

