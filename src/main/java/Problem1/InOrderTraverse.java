package Problem1;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        int i;
        for (i = root; i <= root.val; i++) {
            if (root[i] == value)
                return i;
        }
        return i;


        List<Integer> result = new ArrayList<>();
        return result;
    }
}
