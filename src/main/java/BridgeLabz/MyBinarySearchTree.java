package BridgeLabz;

public class MyBinarySearchTree<K extends Comparable<K>> {
    public MyBinaryNode<K> rootNode;

    public MyBinarySearchTree() {
        this.rootNode = null;
    }

    public void add(MyBinaryNode<K> nodeToAdd){
        this.add(this.rootNode,nodeToAdd);
    }

    private void add(MyBinaryNode<K> currentRootNode, MyBinaryNode<K> nodeToAdd) {
        if(this.rootNode==null){
            this.rootNode = nodeToAdd;
            return;
        }
        if (currentRootNode.compareTo(nodeToAdd) > 0 ){
            if(currentRootNode.getLeftNode() == null) {
                currentRootNode.setLeftNode(nodeToAdd);
                return;
            }else{
                currentRootNode = currentRootNode.getLeftNode();
                this.add(currentRootNode,nodeToAdd);
            }
        }else{
            if(currentRootNode.getRightNode() == null){
                currentRootNode.setRightNode(nodeToAdd);
                return;
            }else{
                currentRootNode = currentRootNode.getRightNode();
                this.add(currentRootNode,nodeToAdd);
            }
        }
    }

    public boolean searchByKey(K key) {
        return searchByKey(this.rootNode , key);
    }

    public boolean searchByKey(MyBinaryNode<K> currentNode , K key){
        if(currentNode == null){
            return false;
        }
        if (currentNode.getKey().equals(key)){
            return true;
        }
        if (currentNode.getKey().compareTo(key) > 0){
            return searchByKey(currentNode.getLeftNode(), key);
        }
        return searchByKey(currentNode.getRightNode(), key);
    }

    public int getSize(){
        return getSize(this.rootNode);
    }

    public int getSize(MyBinaryNode<K> currentNode) {
        if(currentNode == null){
            return 0;
        }
        else{
            return getSize(currentNode.getLeftNode()) + 1 + getSize(currentNode.getRightNode());
        }
    }
}