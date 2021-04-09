package BridgeLabz;

public class MyMapNodeList<K, V> {

    MyLinkedList<K> myLinkedList;

    public MyMapNodeList() {
        this.myLinkedList = new MyLinkedList<>();
    }

    public void add(K key , V value) {
        MyMapNode<K,V> currentNodeToAddOrUpdate = new MyMapNode<>();
        if (this.myLinkedList.search(key) == null){
            currentNodeToAddOrUpdate.setKey(key);
            currentNodeToAddOrUpdate.setValue(value);
            this.myLinkedList.add(currentNodeToAddOrUpdate);
        }else{
            currentNodeToAddOrUpdate = (MyMapNode<K, V>) this.myLinkedList.search(key);
            currentNodeToAddOrUpdate.setValue(value);
        }
    }

    public INode<K> get(K key) {
        if(this.myLinkedList.getHead() == null){
            return null;
        }
        return this.myLinkedList.search(key);
    }

    @Override
    public String toString() {
        if(this.myLinkedList.getHead() == null){
            return "List is Empty right Now.";
        }
        MyMapNode<K,V> currentNode = (MyMapNode<K,V>) this.myLinkedList.getHead();
        StringBuilder returnString = new StringBuilder();
        returnString.append("Head->  ");
        while(currentNode.getNext() != null){
            returnString.append(currentNode).append("->");
            currentNode = currentNode.getNext();
        }
        returnString.append(currentNode);
        returnString.append("  <-Tail");
        return returnString.toString();
    }
}