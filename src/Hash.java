public class Hash {
    private BinaryTree[] elements;
    private int size;
    private int length = 26;

    public Hash() {
        elements = new BinaryTree[length];
        for (int i = 0; i < elements.length; i++) {
            this.elements[i] = new BinaryTree();
        }
        this.size = 0;
    }

    private int hashKey(String word) {
        char letter = word.charAt(0);
        int position = letter - 'a';
        boolean outOfRange = position < 0 || position > (length - 1);
        return outOfRange ? -1 : position;
    }

    public void insert(String word) {
        int index = hashKey(word);
        if (index == -1) return;
        elements[index].insert(new KeyWord(word));
        size += 1;
    }

    public KeyWord find(String word) {
        int index = hashKey(word);
        if (index == -1) return null;
        return elements[index].find(word);
    }

    public void print() {
        for (BinaryTree tree: elements) {
            tree.print();
        }
    }
}
