package BridgeLabz;

public class MyBinarySearchTree<K extends Comparable<K>> {
    public MyBinaryNode<K> rootNode;

    public MyBinarySearchTree() {
        this.rootNode = null;
    }

    public void add(MyBinaryNode<K> nodeToAdd){
        this.addNodeToTree(this.rootNode,nodeToAdd);
    }

    public void addNodeToTree(MyBinaryNode<K> currentRootNode, MyBinaryNode<K> nodeToAdd) {
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
                this.addNodeToTree(currentRootNode,nodeToAdd);
            }
        }else{
            if(currentRootNode.getRightNode() == null){
                currentRootNode.setRightNode(nodeToAdd);
                return;
            }else{
                currentRootNode = currentRootNode.getLeftNode();
                this.addNodeToTree(currentRootNode,nodeToAdd);
            }

        }
    }

    public boolean search(K key) {
        return true;
    }

    public int getSize() {
        return 0;
    }
}