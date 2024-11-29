public class KeyWord implements Comparable<KeyWord> { //responsavel pela palavra chava
    private String key;
    private LinkedList items;

    public KeyWord(String key) {
        this.key = key;
        this.items = new LinkedList();
    }


    @Override
    public int compareTo(KeyWord o) {
        return key.compareTo(o.key);
    } // qual distante a palavra esta da outra

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void insertOccurrences(int occurrence) {
        items.insert(occurrence);
    }

    public String toString() {
        return key + " " + items;
    }
}
