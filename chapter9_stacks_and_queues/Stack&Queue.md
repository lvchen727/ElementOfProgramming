#Stack and Queue

##circular queue
* Circular Queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle.
* Circular queue can be implement using an array and two additional fields, the beginning and end indices.
* Circular queue avoids the wastage of space in a regular queue implementation using arrays.

# JAVA bootcamp
## create a stack
```java
Stack newStack = new Stack();
//add any type of elements
newStack.push("hello");
newStack.push(1);
```

## create a queue
```java
Queue<String> newQueue = new Linkedlist<String>();
newQueue.add("hello");
```

##resize an array
```JAVA
 original = Arrays.copyOf(int[] original, int newLength)
 ```
##rotate an array
```JAVA
Collections.rotate(a, 3) // (1,2,3,4,5) -> (3,4,5,1,2)
```
