package algorithms.tree.binaryTree;

public class Node {
    int value;
    Node left;
    Node right;

    public static Node newNode(int value) {
        Node node = new Node();
        node.value = value;
        node.left = null;
        node.right = null;
        return node;
    }

    public static int maxValue(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int value = node.value;
        int maxLeft = maxValue(node.left);
        int maxRight = maxValue(node.right);
        return Math.max(value, Math.max(maxLeft, maxRight));
    }

    public static int minValue(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int value = node.value;
        int maxLeft = minValue(node.left);
        int maxRight = minValue(node.right);
        return Math.min(value, Math.min(maxLeft, maxRight));
    }

    public static int isBinarySearchTree(Node node) {
        if (node == null) {
            return 1;
        }
        if (node.left != null &&
                maxValue(node.left) > node.value) {
            return 0;
        }
        if (node.right != null &&
                minValue(node.right) < node.value) {
            return 0;
        }
        if (isBinarySearchTree(node.left) != 1 ||
                isBinarySearchTree(node.right) != 1) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Node root = newNode(17);
        root.left = newNode(4);
        root.right = newNode(20);

        root.left.left = newNode(2);
        root.left.right = newNode(5);

        root.right.left = newNode(18);
        root.right.right = newNode(23);

        if (isBinarySearchTree(root) == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
