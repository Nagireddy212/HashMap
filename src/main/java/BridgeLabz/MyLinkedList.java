package BridgeLabz;

public class MyLinkedList<K> {
    private INode<K> head;
    private INode<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public INode<K> getHead() {
        return head;
    }

    public void setHead(INode<K> head) {
        this.head = head;
    }

    public INode<K> getTail() {
        return tail;
    }

    public void setTail(INode<K> tail) {
        this.tail = tail;
    }

    public void append(INode<K> nodeToAppend) {
        if (this.head == null){
            this.head = nodeToAppend;
        }
        if (this.tail != null) {
            this.tail.setNext(nodeToAppend);
        }
        this.tail = nodeToAppend;
    }

    public void insert(INode<K> nodeToInsertInBetweenList , K previousNodeData) {
        INode<K> currentNode = this.head;
        while(!currentNode.getKey().equals(previousNodeData)){
            currentNode = currentNode.getNext();
        }
        INode<K> nodeAfterInsertedNode = currentNode.getNext();
        currentNode.setNext(nodeToInsertInBetweenList);
        nodeToInsertInBetweenList.setNext(nodeAfterInsertedNode);
    }

    public void printList(){
        if(this.head == null){
            System.out.println("List is Empty right Now.");
            return;
        }
        INode<K> currentNode = this.head;
        System.out.print("Head->  ");
        while(currentNode.getNext() != null){
            System.out.print(currentNode.getKey()+"->");
            currentNode = currentNode.getNext();
        }
        System.out.print(currentNode.getKey());
        System.out.println("  <-Tail");
    }

    public void popHead() {
        this.head = this.head.getNext();
    }

    public void popTail() {
        INode<K> newTailNode = this.head;
        while(!newTailNode.getNext().equals(this.tail)){
            newTailNode = newTailNode.getNext();
        }
        newTailNode.setNext(null);
        this.tail = newTailNode;
    }

    public Integer searchNodeByKey(K searchKey) {
        INode<K> nodeToSearch = this.head;
        int positionInLinkedList = 0;
        while(!nodeToSearch.getKey().equals(searchKey)){
            if(nodeToSearch.getNext() != null) {
                nodeToSearch = nodeToSearch.getNext();
            }else{
                return null;
            }
            positionInLinkedList++;
        }
        return positionInLinkedList;
    }

    public INode<K> search(K searchKey) {
        INode<K> nodeToSearch = this.head;
        if(nodeToSearch == null){
            return null;
        }
        while(!nodeToSearch.getKey().equals(searchKey)){
            if(nodeToSearch.getNext() != null) {
                nodeToSearch = nodeToSearch.getNext();
            }else{
                return null;
            }
        }
        return nodeToSearch;
    }

    public void deleteNodeByKey(K keyToDelete) {
        INode<K> previousNode = null;
        INode<K> currentNode = this.head;
        if(currentNode.getKey().equals(keyToDelete)){
            currentNode = currentNode.getNext();
            this.head=currentNode;
            return;
        }
        while(currentNode.getKey()!= keyToDelete){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (this.getTail()==currentNode){
            previousNode.setNext(null);
            this.setTail(previousNode);
            return;
        }
        previousNode.setNext(currentNode.getNext());
    }

    public int getSize() {
        int currentListSize = 0;
        INode<K> tempNode = null;
        if(this.head == null){
            return currentListSize;
        }else{
            currentListSize++;
            tempNode = this.head;
        }
        while(tempNode.getNext()!=null){
            tempNode = tempNode.getNext();
            currentListSize++;
        }
        return currentListSize;
    }

    public void add(INode<K> nodeToAddAtStart) {
        if (this.head == null){
            this.tail = nodeToAddAtStart;
        }
        if (this.head != null) {
            INode<K> oldFirstNode = this.head;
            nodeToAddAtStart.setNext(oldFirstNode);
        }
        this.head = nodeToAddAtStart;
    }

    public boolean isEmpty() {
        return this.getHead() == null;
    }

    public boolean isPresent(K searchKey) {
        INode<K> currentNode = this.head;
        if(currentNode.getKey().equals(searchKey)){
            return true;
        }
        while(currentNode.getKey() != searchKey
                && currentNode != this.tail){
            currentNode = currentNode.getNext();
        }
        if (currentNode.getKey() == searchKey)
            return true;
        return false;
    }

    @Override
    public String toString() {
        if(this.head == null){
            return "List is Empty right Now.";
        }
        INode<K> currentNode = this.head;
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