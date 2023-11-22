public abstract class BinaryTree {
    protected class Node{
        public int key;
        public Node left;
        public Node right;
        Node(int x){
            this.key = x;
            left = null;
            right = null;
        }
    }
    protected Node root;
    public abstract boolean search(Node root, int x);
    public abstract void insert(int... x);
    public abstract Node insert(Node root, int x);
    public abstract void remove(int x);
    public abstract Node remove(Node root, int x);
    public BinaryTree(){
        this.root = null;
    }
}

