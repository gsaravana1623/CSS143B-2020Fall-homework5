package ExtraCredit;

import Problem1.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class KDistance {
    public static List<Integer> distanceK(TreeNode<Integer> root, TreeNode<Integer> target, int k) {
        List<Integer> res = new LinkedList<>();
        if (k == 0) {
            res.add(target.val);
        } else {
            dfs(res, root, k ,0);
        }
        return res;
    }

    private static int dfs(List<Integer> res, TreeNode node, int k, int depth) {
        if (node == null) return 0;

        if (depth == k) {
            res.add((Integer) node.val);
            return 0;
        }

        int left, right;
        if (depth > 0) {
            left = dfs(res, node.left, k, depth + 1);
            right = dfs(res, node.right, k, depth + 1);
        } else {
            left = dfs(res, node.left, k, depth);
            right = dfs(res, node.right, k, depth);
        }


        if (left == k || right == k) {
            res.add((Integer) node.val);
            return 0;
        }

        if (left > 0) {
            dfs(res, node.right, k, left + 1);
            return left + 1;
        }

        if (right > 0) {
            dfs(res, node.left, k, right + 1);
            return right + 1;
        }

        return 0;
    }
}

