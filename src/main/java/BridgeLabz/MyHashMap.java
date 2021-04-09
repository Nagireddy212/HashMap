package BridgeLabz;

import java.util.ArrayList;

public class MyHashMap<K, V> {

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
        if(this.myArraylistOfLinkedList.get(getBucketIndex(key)) == null){
            return null;
        }
        return (MyMapNode<K, V>) this.myArraylistOfLinkedList.get(getBucketIndex(key)).get(key);
    }

    public void add(K key , V value) {
        int index = getBucketIndex(key);
        if(this.myArraylistOfLinkedList.get(index) == null){
            this.myArraylistOfLinkedList.set(index,new MyMapNodeList<>());
        }
        this.myArraylistOfLinkedList.get(getBucketIndex(key)).add(key,value);
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