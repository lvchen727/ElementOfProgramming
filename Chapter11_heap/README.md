# Heap

## Key points
1. heap property(max-heap): the key at each node is as great as its children
2. can be implemented as array
3. operations
* insertion $O(logn)$
* deletion  $O(logn)$
* search    $O(n)$
* findMax   $O(1)$

## JAVA bootcamp
### use PriorityQueue
* operations: add, poll, peek
```JAVA
//initialize min-heap
PriorityQueue<Integer> minHeap= new PriorityQueue<Integer>();
//initialize max-heap
PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
```
