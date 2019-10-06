package Tree;

import java.util.Stack;

public class TreeTraverse {
    public static void main(String[] args) {
        preOrderTraverseRecursively(getRootNode());
        System.out.println();

        preOrderIterative(getRootNode());
        System.out.println();
    }

    private static TreeNode getRootNode() {
        TreeNode root = new TreeNode(50);
        TreeNode left1 = new TreeNode(25);
        TreeNode right1 = new TreeNode(75);

        root.left = left1;
        root.right = right1;

        TreeNode left2 = new TreeNode(10);
        TreeNode right2 = new TreeNode(35);

        left1.left = left2;
        left1.right = right2;

        TreeNode left3 = new TreeNode(60);
        TreeNode right3 = new TreeNode(85);
        right1.left = left3;
        right1.right = right3;
        return root;
    }

    private static void preOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode visited = stack.pop();
            System.out.print(visited.value + " ");
            if (visited.right != null) {
                stack.push(visited.right);
            }

            if (visited.left != null) {
                stack.push(visited.left);
            }
        }
    }

    private static void preOrderTraverseRecursively(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderTraverseRecursively(root.left);
        preOrderTraverseRecursively(root.right);
    }
}
