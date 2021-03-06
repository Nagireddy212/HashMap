package BridgeLabz;

public class MyMapNode<K extends Comparable<K>,V> implements INode<K> {
    K key;
    V value;
    MyMapNode<K,V> next;

    public MyMapNode() {
    }

    public MyMapNode(K key, V value, MyMapNode<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public MyMapNode<K,V> getNext() {
        return this.next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = (MyMapNode<K,V>) next;
    }

    @Override
    public String toString() {
        return "[" + this.key.toString() + "-" + this.value.toString() + "]";
    }

    @Override
    public int compareTo(INode<K> nodeToCompare) {
        return this.key.compareTo(nodeToCompare.getKey());
    }
}