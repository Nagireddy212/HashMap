package BridgeLabz;

public class StackAsLinkedList<K> extends MyLinkedList<K> {

    public void push(INode<K> nodeToPushOnTop){
        this.add(nodeToPushOnTop);
    }

    public K peak() {
        if(this.getHead() == null){
            return null;
        }
        return this.getHead().getKey();
    }

    public INode<K> pop() {
        if(this.getHead() == null){
            return null;
        }
        INode<K> nodeToPop = this.getHead();
        INode<K> newHeadNode = this.getHead().getNext();
        this.setHead(newHeadNode);
        return nodeToPop;
    }

}