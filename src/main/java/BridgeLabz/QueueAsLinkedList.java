package BridgeLabz;

public class QueueAsLinkedList<K> extends MyLinkedList<K> {
    public void enqueue(INode<K> nodeToEnqueue){
        this.append(nodeToEnqueue);
    }

    public INode<K> dequeue() {
        if (this.getHead() == null) {
            return null;
        }
        INode<K> oldHeadNode = this.getHead();
        this.setHead(oldHeadNode.getNext());
        return oldHeadNode;
    }
}