public class Node<T extends Comparable<T>> {
    public T element;
    public Node<T> left;
    public Node<T> right;

    public Node(T element) {
        this.element = element;
    }

    public Node(T element, Node<T> left, Node<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
}
