package BridgeLabz;

public class OrderedLinkedList<T> extends MyLinkedList<T>{

    @Override
    public void add(INode<T> nodeToAddInOrder) {
        INode<T> previousNode = this.getHead();
        INode<T> currentNode = this.getHead();
        if(currentNode == null){
            this.setHead(nodeToAddInOrder);
            this.setTail(nodeToAddInOrder);
            return;
        }
        if(previousNode.compareTo(nodeToAddInOrder)>0){
            this.setHead(nodeToAddInOrder);
            nodeToAddInOrder.setNext(previousNode);
            this.setTail(previousNode);
            return;
        }
        while(nodeToAddInOrder.compareTo(currentNode)>0){
            if(currentNode.equals(this.getTail())){
                currentNode.setNext(nodeToAddInOrder);
                this.setTail(nodeToAddInOrder);
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        previousNode.setNext(nodeToAddInOrder);
        nodeToAddInOrder.setNext(currentNode);
    }
}