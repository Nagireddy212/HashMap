package Bridgelabz;

import BridgeLabz.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3Nodes_AppendThemToTheLinkedList_AndCheckThatTheyAreAddedInCorrectOrder(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        boolean testVariable = myLinkedList.getHead().getKey().equals(56)
                && myLinkedList.getHead().getNext().getKey().equals(30)
                && myLinkedList.getTail().getKey().equals(70);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given2Nodes_AppendThirdNodeInTheMiddleOfLinkedList_AndCheckThatTheyAreAddedInCorrectOrder(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> nodeToInsertInBetweenList = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(70);
        nodeToInsertInBetweenList.setKey(30);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.insert(nodeToInsertInBetweenList , 56);

        boolean testVariable = myLinkedList.getHead().getKey().equals(56)
                && myLinkedList.getHead().getNext().getKey().equals(30)
                && myLinkedList.getTail().getKey().equals(70);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3Nodes_RemoveHeadNodeOfLinkedList_AndCheckThatListIsInCorrectOrder(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.popHead();

        boolean testVariable = myLinkedList.getHead().getKey().equals(30)
                && myLinkedList.getHead().getNext().getKey().equals(70);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3Nodes_RemoveTailNodeOfLinkedList_AndCheckThatListIsInCorrectOrder() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.popTail();

        boolean testVariable = myLinkedList.getHead().getKey().equals(56)
                && myLinkedList.getHead().getNext().getKey().equals(30);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given5Nodes_searchEveryNodeOfLinkedListByKey_AndCheckThatSearchMethodReturnsCorrectPosition() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        INode<Integer> fourthNode = new MyNode<>();
        INode<Integer> fifthNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        fourthNode.setKey(26);
        fifthNode.setKey(48);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.append(fourthNode);
        myLinkedList.append(fifthNode);

        boolean testVariable = myLinkedList.searchNodeByKey(55) == null
                && myLinkedList.searchNodeByKey(56) == 0
                && myLinkedList.searchNodeByKey(30) == 1
                && myLinkedList.searchNodeByKey(70) == 2
                && myLinkedList.searchNodeByKey(26) == 3
                && myLinkedList.searchNodeByKey(48) == 4;

        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3Nodes_insertOneNodeBeforeSpecificNode_AndCheckItWasInsertedInCorrectPosition(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        INode<Integer> nodeToInsertInBetween = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        nodeToInsertInBetween.setKey(40);

        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        myLinkedList.insert(nodeToInsertInBetween,30);

        boolean testVariable = myLinkedList.getHead().getKey().equals(56)
                && myLinkedList.getHead().getNext().getKey().equals(30)
                && myLinkedList.getHead().getNext().getNext().getKey().equals(40)
                && myLinkedList.getTail().getKey().equals(70);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given4NodesInOneLinkedList_DeleteOneSpecificNodeThenGetListSize_AndCheckIfItWasDeletedFromList(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        INode<Integer> fourthNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(40);
        fourthNode.setKey(70);

        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.append(fourthNode);
        myLinkedList.deleteNodeByKey(40);

        boolean testVariable = myLinkedList.getHead().getKey().equals(56)
                && myLinkedList.getHead().getNext().getKey().equals(30)
                && myLinkedList.getTail().getKey().equals(70)
                && myLinkedList.getSize() == 3;
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3Nodes_AddThemToTheLinkedList_AndCheckThatTheyAreAddedInCorrectOrder(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);

        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);

        boolean testVariable = myLinkedList.getHead().getKey().equals(70)
                && myLinkedList.getHead().getNext().getKey().equals(30)
                && myLinkedList.getTail().getKey().equals(56);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given4NodesForOrderedLinkedList_AddAllNodes_AndCheckIfTheyAreAddedInIncreasingOrder(){
        MyLinkedList<Integer> myOrderedLinkedList = new OrderedLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        INode<Integer> fourthNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(40);
        fourthNode.setKey(70);

        myOrderedLinkedList.add(firstNode);
        myOrderedLinkedList.add(secondNode);
        myOrderedLinkedList.add(fourthNode);
        myOrderedLinkedList.add(thirdNode);

        boolean testVariable = myOrderedLinkedList.getHead().getKey().equals(30)
                && myOrderedLinkedList.getHead().getNext().getKey().equals(40)
                && myOrderedLinkedList.getHead().getNext().getNext().getKey().equals(56)
                && myOrderedLinkedList.getTail().getKey().equals(70);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given4ValuesForLinkedImplementedAsStack_AddAllValuesToStack_AndCheckIfTheyAreAddedCorrectly(){
        StackAsLinkedList<Integer> myLinkedListStack = new StackAsLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        INode<Integer> fourthNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(40);
        fourthNode.setKey(70);

        myLinkedListStack.push(firstNode);
        myLinkedListStack.push(secondNode);
        myLinkedListStack.push(fourthNode);
        myLinkedListStack.push(thirdNode);

        boolean testVariable = myLinkedListStack.getHead().getKey().equals(40)
                && myLinkedListStack.getHead().getNext().getKey().equals(70)
                && myLinkedListStack.getHead().getNext().getNext().getKey().equals(30)
                && myLinkedListStack.getHead().getNext().getNext().getNext().getKey().equals(56);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3ValuesInLinkedListImplementedAsStack_PeakAndPopEachValue_AndCheckAfterEachOperation(){
        StackAsLinkedList<Integer> myLinkedListStack = new StackAsLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(70);
        secondNode.setKey(30);
        thirdNode.setKey(56);

        myLinkedListStack.push(firstNode);
        myLinkedListStack.push(secondNode);
        myLinkedListStack.push(thirdNode);

        boolean peakFirstValueTopOfStack = myLinkedListStack.peak() == 56;
        boolean popFirstValueTopOfStack = myLinkedListStack.pop().getKey() == 56;
        boolean peakSecondValueTopOfStack = myLinkedListStack.peak() == 30;
        boolean popSecondValueTopOfStack = myLinkedListStack.pop().getKey() == 30;
        boolean peakThirdValueTopOfStack = myLinkedListStack.peak() == 70;
        boolean popThirdValueTopOfStack = myLinkedListStack.pop().getKey() == 70;
        boolean popEmptyTopOfStack = myLinkedListStack.getHead() == null;
        boolean testVariable = peakFirstValueTopOfStack && peakSecondValueTopOfStack && peakThirdValueTopOfStack
                && popFirstValueTopOfStack && popSecondValueTopOfStack && popThirdValueTopOfStack
                && popEmptyTopOfStack;
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3Values_FormLinkedListImplementedAsQueue_AndCheckIfEnqueueOperationWorksCorrectly(){
        QueueAsLinkedList<Integer> myLinkedListQueue = new QueueAsLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(70);
        secondNode.setKey(30);
        thirdNode.setKey(56);

        myLinkedListQueue.enqueue(firstNode);
        myLinkedListQueue.enqueue(secondNode);
        myLinkedListQueue.enqueue(thirdNode);

        boolean testVariable = myLinkedListQueue.getHead().getKey() == 70
                && myLinkedListQueue.getHead().getNext().getKey() == 30
                && myLinkedListQueue.getHead().getNext().getNext().getKey() == 56;
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3ValuesInLinkedListImplementedAsQueue_DequeueAllValues_AndCheckAfterEachOperation(){
        QueueAsLinkedList<Integer> myLinkedListQueue = new QueueAsLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(70);
        secondNode.setKey(30);
        thirdNode.setKey(56);
        myLinkedListQueue.enqueue(firstNode);
        myLinkedListQueue.enqueue(secondNode);
        myLinkedListQueue.enqueue(thirdNode);

        boolean firstDequeue = myLinkedListQueue.dequeue().getKey() == 70;
        boolean secondDequeue = myLinkedListQueue.dequeue().getKey() == 30;
        boolean thirdDequeue = myLinkedListQueue.dequeue().getKey() == 56;
        boolean emptyCheckAfterThirdDequeue = myLinkedListQueue.isEmpty();

        boolean testVariable = firstDequeue && secondDequeue && thirdDequeue && emptyCheckAfterThirdDequeue;
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3NodesInLinkedList_CheckIfKeyIsPresent_ReturnTrueIfItWorksForPresentAndAbsentCases(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);

        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        boolean testVariable = (!myLinkedList.isPresent(50))
                && myLinkedList.isPresent(56)
                && myLinkedList.isPresent(30)
                && myLinkedList.isPresent(70);
        Assertions.assertTrue(testVariable);
    }
}