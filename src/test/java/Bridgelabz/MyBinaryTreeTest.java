package Bridgelabz;

import BridgeLabz.MyBinaryNode;
import BridgeLabz.MyBinarySearchTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3Nodes_AddThemInBinarySearchTreeInOrder_ReturnTrueIfAreAddedInOrder(){
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        MyBinaryNode<Integer> firstNode = new MyBinaryNode<>();
        MyBinaryNode<Integer> secondNode = new MyBinaryNode<>();
        MyBinaryNode<Integer> thirdNode = new MyBinaryNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        myBinarySearchTree.add(firstNode);
        myBinarySearchTree.add(secondNode);
        myBinarySearchTree.add(thirdNode);

        boolean testVariable = myBinarySearchTree.rootNode.getKey().equals(56)
                && myBinarySearchTree.rootNode.getLeftNode().getKey().equals(30)
                && myBinarySearchTree.rootNode.getRightNode().getKey().equals(70);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given13Nodes_AddThemInBinarySearchTree_ReturnTrueIfTheyAreAddedInOrder(){
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        MyBinaryNode<Integer> Node1 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node2 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node3 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node4 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node5 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node6 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node7 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node8 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node9 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node10 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node11 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node12= new MyBinaryNode<>();
        MyBinaryNode<Integer> Node13 = new MyBinaryNode<>();
        Node1.setKey(56);
        Node2.setKey(30);
        Node3.setKey(22);
        Node4.setKey(40);
        Node5.setKey(70);
        Node6.setKey(60);
        Node7.setKey(95);
        Node8.setKey(65);
        Node9.setKey(11);
        Node10.setKey(16);
        Node11.setKey(3);
        Node12.setKey(63);
        Node13.setKey(67);
        myBinarySearchTree.add(Node1);
        myBinarySearchTree.add(Node2);
        myBinarySearchTree.add(Node3);
        myBinarySearchTree.add(Node4);
        myBinarySearchTree.add(Node5);
        myBinarySearchTree.add(Node6);
        myBinarySearchTree.add(Node7);
        myBinarySearchTree.add(Node8);
        myBinarySearchTree.add(Node9);
        myBinarySearchTree.add(Node10);
        myBinarySearchTree.add(Node11);
        myBinarySearchTree.add(Node12);
        myBinarySearchTree.add(Node13);

        boolean testVariable =  myBinarySearchTree.rootNode.getKey().equals(56) &&
                myBinarySearchTree.rootNode.getLeftNode().getKey().equals(30) &&
                myBinarySearchTree.rootNode.getLeftNode().getLeftNode().getKey().equals(22) &&
                myBinarySearchTree.rootNode.getLeftNode().getLeftNode().getLeftNode().getKey().equals(11) &&
                myBinarySearchTree.rootNode.getLeftNode().getLeftNode().getLeftNode().getLeftNode().getKey().equals(3) &&
                myBinarySearchTree.rootNode.getLeftNode().getRightNode().getKey().equals(40) &&
                myBinarySearchTree.rootNode.getLeftNode().getLeftNode().getLeftNode().getRightNode().getKey().equals(16) &&
                myBinarySearchTree.rootNode.getRightNode().getKey().equals(70) &&
                myBinarySearchTree.rootNode.getRightNode().getRightNode().getKey().equals(95) &&
                myBinarySearchTree.rootNode.getRightNode().getLeftNode().getKey().equals(60) &&
                myBinarySearchTree.rootNode.getRightNode().getLeftNode().getRightNode().getKey().equals(65) &&
                myBinarySearchTree.rootNode.getRightNode().getLeftNode().getRightNode().getLeftNode().getKey().equals(63) &&
                myBinarySearchTree.rootNode.getRightNode().getLeftNode().getRightNode().getRightNode().getKey().equals(67) &&
                myBinarySearchTree.getSize() == 13;
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void givenABinarySearchTree_SearchASpecificNode_ReturnTrueIfItExistsFalseifItDoesNot(){
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        MyBinaryNode<Integer> Node1 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node2 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node3 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node4 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node5 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node6 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node7 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node8 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node9 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node10 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node11 = new MyBinaryNode<>();
        MyBinaryNode<Integer> Node12= new MyBinaryNode<>();
        MyBinaryNode<Integer> Node13 = new MyBinaryNode<>();
        Node1.setKey(56);
        Node2.setKey(30);
        Node3.setKey(22);
        Node4.setKey(40);
        Node5.setKey(70);
        Node6.setKey(60);
        Node7.setKey(95);
        Node8.setKey(65);
        Node9.setKey(11);
        Node10.setKey(16);
        Node11.setKey(3);
        Node12.setKey(63);
        Node13.setKey(67);
        myBinarySearchTree.add(Node1);
        myBinarySearchTree.add(Node2);
        myBinarySearchTree.add(Node3);
        myBinarySearchTree.add(Node4);
        myBinarySearchTree.add(Node5);
        myBinarySearchTree.add(Node6);
        myBinarySearchTree.add(Node7);
        myBinarySearchTree.add(Node8);
        myBinarySearchTree.add(Node9);
        myBinarySearchTree.add(Node10);
        myBinarySearchTree.add(Node11);
        myBinarySearchTree.add(Node12);
        myBinarySearchTree.add(Node13);

        boolean testVariable =  myBinarySearchTree.searchByKey(63) &&
                (!myBinarySearchTree.searchByKey(55));
        Assertions.assertTrue(testVariable);
    }
}