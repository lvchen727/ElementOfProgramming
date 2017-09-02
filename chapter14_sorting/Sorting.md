#Sorting

## Key points
1. O(nlogn)
| heapsort      | mergesort     | quicksort        |
| ------------- |:-------------:| ----------------:|
| inplace       | stable        | usually the best |
| not stable    | not inplace   | O(n2) worst case |

2. specific circumstances:
* short arrays -> insertion sort
* each element is <= k places from its final pos -> min-heap O(nlogk)
* a few distinct keys -> counting sort
* many duplicates -> add keys to BST with linkedlist for elements having same key (in-order LMR traversal of BST)
* usually using compare function -> but radix sort use numerical attributes directly

## JAVA
1. Arrays.sort(array): O(nlogn)t
2. Collections.sort(list): O(nlogn)t, O(n)sp
