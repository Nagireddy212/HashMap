package BridgeLabz;

public class MyBinaryNode<K extends Comparable<K>> implements INode<K> {
    K key;
    MyBinaryNode<K> leftNode;
    MyBinaryNode<K> rightNode;

    public MyBinaryNode() {
        this.key = null;
        this.leftNode = null;
        this.rightNode = null;
    }

    public MyBinaryNode(K key, MyBinaryNode<K> leftNode, MyBinaryNode<K> rightNode) {
        this.key = key;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        return null;
    }

    @Override
    public void setNext(INode<K> next) {

    }


    public MyBinaryNode<K> getLeftNode() {
        if (this.leftNode == null){
            return null;
        }
        return leftNode;
    }

    public void setLeftNode(MyBinaryNode<K> leftNode) {
        this.leftNode = leftNode;
    }

    public MyBinaryNode<K> getRightNode() {
        if (this.rightNode == null){
            return null;
        }
        return rightNode;
    }

    public void setRightNode(MyBinaryNode<K> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public int compareTo(INode<K> nodeToCompare) {
        return this.key.compareTo(nodeToCompare.getKey());
    }
}