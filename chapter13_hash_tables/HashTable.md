# hash table

## key points
1. ideal for fast loopups
2. good data structure for dictionary, i.e., set of strings (compare with Tire, BST)
3. not equal to sorted arrays, keys are random
4. difficulty lies in good hash function (could avoid collision)
5. loopups, insertions : O(1); deletions: O(1+n/m)


## JAVA
1. *HashSet*: store keys.
* operations: add/remove(return boolean), iterator, isEmpty, size, retainAlll, removeAll
2. *HashMap*: store key-value pairs
* operations: put, get, remove, Map.Entry(k,v) for iterator, entrySet, keySet, values
* [LinkedHashMap](https://stackoverflow.com/questions/2889777/difference-between-hashmap-linkedhashmap-and-treemap): preserve the insertion order; iterate in the order in which the entries were put into the map
```JAVA
public LRUCache{
  public LinkedHashMap<Integer, Integer> isbnToPrice;
  LRUCache(final int capacity){
    this.isbnToPrice = new LinkedHashMap<>(capacity, 1.0f, true){
      protect boolean removeEldestEntry(Map.Entry(Integer, Integer) e){
        return this.size() > capacity;
      }
    };
  }
}
```
