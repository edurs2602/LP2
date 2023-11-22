public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(10);
        tree.insert(8);
        tree.insert(5);
        tree.insert(9);
        tree.insert(7);
        tree.insert(18);
        tree.insert(13);
        tree.insert(20);

        System.out.println("Em ordem: ");
        tree.printInOrder(tree.root);

        System.out.println("\nPre-ordem: ");
        tree.printInPreOrder(tree.root);

        System.out.println("\nPos-ordem: ");
        tree.printInPostOrder(tree.root);
    }
}