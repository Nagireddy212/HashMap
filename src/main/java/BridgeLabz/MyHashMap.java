package BridgeLabz;

import java.util.ArrayList;

public class MyHashMap<K extends Comparable<K>, V> {

    private final int numBuckets;
    ArrayList<MyMapNodeList<K,V>> myArraylistOfLinkedList;

    public MyHashMap() {
        this.numBuckets = 10;
        this.myArraylistOfLinkedList = new ArrayList<>(numBuckets);
        for (int counter = 0 ; counter < numBuckets ; counter++) {
            this.myArraylistOfLinkedList.add(null);
        }
    }

    public int getBucketIndex(K key){
        return (Math.abs(key.hashCode()))%numBuckets;
    }

    public MyMapNode<K,V> get(K key) {
        try{
            return (MyMapNode<K, V>) this.myArraylistOfLinkedList.get(getBucketIndex(key)).get(key);
        }catch (NullPointerException e){
            return null;
        }

    }

    public void add(K key , V value) {
        int index = getBucketIndex(key);
        if(this.myArraylistOfLinkedList.get(index) == null){
            this.myArraylistOfLinkedList.set(index,new MyMapNodeList<>());
        }
        this.myArraylistOfLinkedList.get(getBucketIndex(key)).add(key,value);
    }

    public boolean remove(K key) {
        int index = getBucketIndex(key);
        try{
            this.myArraylistOfLinkedList.get(getBucketIndex(key)).myLinkedList.deleteNodeByKey(key);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public boolean isPresent(K searchKey) {
        int index = getBucketIndex(searchKey);
        return this.myArraylistOfLinkedList.get(index).isPresent(searchKey);
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        for (MyMapNodeList currentMyMapNodeList: this.myArraylistOfLinkedList) {
            if(currentMyMapNodeList == null){
                returnString.append("Empty List").append("\n");
            }else{
                returnString.append(currentMyMapNodeList.toString()).append("\n");
            }
        }
        return returnString.toString();
    }
}