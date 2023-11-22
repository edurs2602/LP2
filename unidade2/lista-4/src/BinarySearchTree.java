import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree extends BinaryTree {

    @Override
    public boolean search(Node root, int x) {
        if (root == null) {
            return false;
        }

        if (root.key == x){
            return true;
        } else if (x < root.key) {
            return search(root.left, x);
        } else {
            return search(root.right, x);
        }

    }

    @Override
    public void insert(int... x) {
        for (int i : x){
            root = insert(root, i);
        }
    }

    @Override
    public Node insert(Node root, int x) {
        if (root == null) {
            root = new Node(x);
            return root;
        }

        if (x < root.key) {
            root.left = insert(root.left, x);
        } else if (x > root.key) {
            root.right = insert(root.right, x);
        }

        return root;
    }

    @Override
    public void remove(int x) {
        root = remove(root, x);
    }

    @Override
    public Node remove(Node root, int x) {
        if (root == null) {
            return null;
        }

        if (x < root.key){
            root.left = remove(root.left, x);
        } else if (x > root.key){
            root.right = remove(root.right, x);
        } else {

            if (root.left == null){
                return root.right;
            } else {
                return root.left;
            }
        }

        return root;
    }

    public void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.println(root.key);
            printInOrder(root.right);
        }
    }

    public void printInPreOrder(Node root){
        if (root != null) {
            System.out.println(root.key);
            printInPreOrder(root.left);
            printInPreOrder(root.right);
        }
    }

    public void printInPostOrder(Node root){
        if (root != null) {
            printInPreOrder(root.left);
            printInPreOrder(root.right);
            System.out.println(root.key);
        }
    }
}
