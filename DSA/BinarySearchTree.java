// TreeNode class representing each node in the BST
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}


public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = newNode;
            return;
        }

        TreeNode current = root;
        while (true) {
            if (val < current.val) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                } else {
                    current = current.right;
                }
            }
        }
    }

    public void printInorder() {
        inorderRecursive(root);
        System.out.println(); 
    }

    private void inorderRecursive(TreeNode root) {
        if (root != null) {
            inorderRecursive(root.left); // Traverse left subtree
            System.out.print(root.val + " "); // Print current node's value
            inorderRecursive(root.right); // Traverse right subtree
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(23);
        bst.insert(86);
        bst.insert(2);
        bst.insert(80);
        bst.insert(106);
        bst.insert(60);
        bst.insert(4);

        System.out.println("Inorder traversal of the BST:");
        bst.printInorder();
    }
}
