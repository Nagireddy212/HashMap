package Bridgelabz;

import BridgeLabz.MyMapNode;
import BridgeLabz.MyMapNodeList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyHashMapTest{
    @Test
    public void givenASentence_AddEachWordAndNumberOfOccurrenceToKeyValuePairList_AndReturnTrueIfCorrectForAll(){
        MyMapNodeList<String, Integer> keyValueLinkedList = new MyMapNodeList<>();
        String sentenceToEvaluate = "to be or not not to be";
        String[] wordList = sentenceToEvaluate.split(" ");
        for (String word : wordList) {
            if (keyValueLinkedList.get(word) == null){
                keyValueLinkedList.add(word , 1);
            }else{
                MyMapNode<String,Integer> currentWordNode= (MyMapNode<String, Integer>) keyValueLinkedList.get(word);
                Integer currentWordOccurrenceValue = currentWordNode.getValue();
                currentWordOccurrenceValue += 1;
                keyValueLinkedList.add(word,currentWordOccurrenceValue);
            }
        }
        MyMapNode<String ,Integer> toOccurrence = (MyMapNode<String ,Integer>) keyValueLinkedList.get("to");
        MyMapNode<String ,Integer> beOccurrence = (MyMapNode<String ,Integer>) keyValueLinkedList.get("be");
        MyMapNode<String ,Integer> orOccurrence = (MyMapNode<String ,Integer>) keyValueLinkedList.get("or");
        MyMapNode<String ,Integer> notOccurrence = (MyMapNode<String ,Integer>) keyValueLinkedList.get("not");
        boolean testVariable = toOccurrence.getValue() == 2 &&
                beOccurrence.getValue() == 2 &&
                orOccurrence.getValue() == 1 &&
                notOccurrence.getValue() == 2;
        Assertions.assertTrue(testVariable);
    }
}