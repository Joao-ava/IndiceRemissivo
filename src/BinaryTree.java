public class BinaryTree {
    private Node<KeyWord> root;
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public void insert(KeyWord keyWord) {
        insert(keyWord, root);
    }

    public void insert(KeyWord keyWord, Node<KeyWord> node) {
        Node<KeyWord> newNode = new Node<>(keyWord);
        if (node == null) {
            root = newNode;
            size += 1;
            return;
        }

        if (keyWord.compareTo(node.element) < 0) {
            if (node.left == null) {
                node.left = newNode;
                size += 1;
                return;
            }
            insert(keyWord, node.left);
        }
        if (keyWord.compareTo(node.element) > 0) {
            if (node.right == null) {
                node.right = newNode;
                size += 1;
                return;
            }
            insert(keyWord, node.right);
        }
    }

    public KeyWord find(String word) {
        return this.find(word, this.root);
    }

    public KeyWord find(String word, Node<KeyWord> node) {
        if (node == null) {
            return null;
        }

        if (word.compareTo(node.element.getKey()) < 0) {
            return this.find(word, node.left);
        }
        if (word.compareTo(node.element.getKey()) > 0) {
            return this.find(word, node.right);
        }
        return node.element;
    }

    public void print() {
        inOrder(root);
    }

    private void inOrder(Node<KeyWord> node) {
        if (node == null) return;

        this.inOrder(node.left);
        System.out.println(node.element);
        this.inOrder(node.right);
    }
}
