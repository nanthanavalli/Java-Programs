
import java.util.Scanner;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class BST {

    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (root.data > data) {
            root.left = insertRec(root.left, data);
        } else if (root.data < data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    public void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }

    }

    public void preOrder() {
        preOrderRec(root);
    }

    public void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }

    }

    public void postOrder() {
        postOrderRec(root);
    }

    public void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }

    }

    public void search(int data) {
        boolean isfound = searchRec(root, data);
        if (isfound) {
            System.out.println("The element is present in the binary tree");
        } else {
            System.out.println("The element does not present in the binary tree");
        }
    }

    public boolean searchRec(Node root, int val) {
        if (root == null) {
            return false;
        }

        if (root.data == val) {
            return true;
        }
        if (val > root.data) {
            return searchRec(root.right, val);
        } else {
            return searchRec(root.left, val);
        }

    }
}

class BinarySearchTree {

    public static void main(String[] args) {
        BST tree = new BST();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter choice:\n 1.Insert\n 2.Inorder\n 3.Preorder\n 4.Postorder\n 5.Search\n 6.exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter node to be inserted");
                    tree.insert(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Inorder Traversal");
                    tree.inOrder();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Preorder Traversal");
                    tree.preOrder();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Postorder Traversal");
                    tree.postOrder();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Enter the element to be searched");
                    tree.search(sc.nextInt());
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }
    }
}
