public class LinkedList {
    private Node<Integer> start;
    private  Node<Integer> end;
    private int size;

    public LinkedList(){
        start = null;
        end = null;
        size = 0;
    }

    public void insert(int element) {
        Node<Integer> newNode = new Node<Integer>(element);

        if (isEmpty()) {
            start = newNode;
        }else{
            end.right = newNode;
            newNode.left = end;
        }
        end = newNode;
        size += 1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        Node<Integer> cursor = start;
        for (int i = 0; i < this.size; i++) {
            if (i != 0) {
                output.append(" ");
            }
            output.append(cursor.element);
            cursor = cursor.right;
        }
        return output.toString();
    }
}
