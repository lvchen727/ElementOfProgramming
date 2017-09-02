# ElementOfProgramming
My Java code and notes for element of programming interviews

# Chapter 5 Primitive Type
1. [Q501 compute parity of a word](./chapter5_primitive_type/Q0501.java)
2. [Q507 compute x^y](./chapter5_primitive_type/Q0507.java)
3. [Q508 reverse digits](./chapter5_primitive_type/Q0508.java)

# Chapter 6 Array
1. [Q0601 The dutch national flag problem](./chapter6_array/Q0601.java)
2. [Q0602 Increment an arbitrary precision integer](./chapter6_array/Q602.java)
3. [Q0607 Buy and Sell a stock once](./chapter6_array/Q607.java)
4. [Q0612 Sample Offline data](./chapter6_array/Q612.java)
5. [Q0617 Suduko Checker](./chapter6_array/Q617.java)
6. [Q0618 Spiral orderin of 2D array](./chapter6_array/Q618.java)

# Chapter 7 String
1. [Q0701 Interconvert integer and string](./chapter7_string/Q0701.java)
2. [Q0702 Base Conversion](./chapter7_string/Q702.java)
3. [Q0704 Replace and remove](./chapter7_string/Q704.java)
4. [Q0705 Test palindromicity](./chapter7_string/Q705.java)
5. [Q0706 Reverse all words in sentence](./chapter7_string/Q706.java)

# Chapter 8 Linked List
1. [Q0801 Merge two sorted lists](./chapter8_linked_list/Q0801.java)
2. [Q0802 Reverse a singly list](./chapter8_linked_list/Q0802.java)
3. [Q0804 Test for cyclicity](./chapter8_linked_list/Q0804.java)
4. [Q0805 Test for overlapping lists - cycle free](./chapter8_linked_list/Q0805.java)
5. [Q0808 Remove kth largest element from a list](./chapter8_linked_list/Q0808.java)

# [Chapter 9 Stacks and Queues](./chapter9_stacks_and_queues/README.md)
1. [Q0901 Implement stack with max API](./chapter9_stacks_and_queues/Stack.java)
2. [Q0902 Evaluate RPN expressions](./chapter9_stacks_and_queues/Q902.java)
3. [Q0909 Compute binary tree nodes in order of increasing depth](./chapter9_stacks_and_queues/Q909.java)
4. [Q0910 Implement circular queue](./chapter9_stacks_and_queues/Q910.java)

# [Chapter 10 Binary tree](./chapter10_binary_trees/README.md)
1. [Q1001 Test if BT is balanced](./chapter10_binary_trees/Q1001.java)
2. [Q1002 Test if BT is symmetric](./chapter10_binary_trees/Q1002.java)
3. [Q1004 Compute LCA if two nodes have parents](./chapter10_binary_trees/Q1004.java)

# [Chapter 11 Heap](./chapter11_heap/README.md)
1. [Q1101 Merge sorted files](./chapter11_heap/Q1101.java)
2. [Q1103 Sort an almost sorted array](./chapter11_heap/Q1103.java)
3. [Q1104 compute k closest stars](./chapter11_heap/Q1104.java)

# [Chapter 12 Searching](./chapter12_searching/README.md)
1. [Q1201 Search a sorted array for the first occurrence of k ](./chapter12_searching/Q1201.java)
2. [Q1204 Search a cyclic sorted array](./chapter12_searching/Q1204.java)
3. [Q1205 Compute Integer squareroot](./chapter12_searching/Q1205.java)
4. [Q1209 Find kth largest element](./chapter12_searching/Q1209.java)

# [Chapter 13 Hash table](./chapter13_hash_tables/README.md)
1. [Q1301 Partition into anagrams ](./chapter13_hash_tables/Q1301.java)
2. [Q1302 Test for palindromic permutations ](./chapter13_hash_tables/Q1302.java)
3. [Q1303 Is anonymous letter constructible ](./chapter13_hash_tables/Q1303.java)
4. [Q1304 Implement ISBN Cache ](./chapter13_hash_tables/Q1304.java)
5. [Q1306 Compute the kth most frequent queries ](./chapter13_hash_tables/Q1306.java)

# [Chapter 14 Sorting](./chapter14_sorting/README.md)
1. [Q1401 Compute intersection of two sorted arrays ](./chapter14_sorting/Q1401.java)
2. [Q1402 Implement mergesort inplace ](./chapter14_sorting/Q1402.java)
3. [Q1403 Count frequencies of characters in sentence ](./chapter14_sorting/Q1403.java)
4. [Q1405 render a calendar ](./chapter14_sorting/Q1405.java)

# [Chapter 15 Binary Search Tree](./chapter15_binary_search_tree/README.md)
1. [Q1501 Test if BT satisfy BST property ](./chapter15_binary_search_tree/Q1501.java)
2. [Q1502 Find the first occurrence of a key in BST ](./chapter15_binary_search_tree/Q1502.java)
3. [Q1503 Find the first key larger than a given value in BST ](./chapter15_binary_search_tree/Q1503.java)
4. [Q1505 Compute LCA in BST ](./chapter15_binary_search_tree/Q1505.java)

# [Chapter 16 Recursion](./chapter16_recursion/README.md)
1. [Q1601 The tower of Hanoi ](./chapter16_recursion/Q1601.java)
2. [Q1602 NQueens ](./chapter16_recursion/Q1602.java)

# [Chapter 17 Dynamic programming](./chapter17_dynamic_programming/README.md)
1. [Q1701 Count the number of score combinations ](./chapter17_dynamic_programming/Q1701.java)
2. [Q1702 Compute Levenshtein distance ](./chapter17_dynamic_programming/Q1702.java)

# [Chapter 18 Greedy Algorithm and Invariant](./chapter18_greedy_algo_and_invariant/README.md)
1. [Q1805 The 3-sum ](./chapter18_greedy_algo_and_invariant/Q1805.java)
2. [Q1807 The gasup problem ](./chapter18_greedy_algo_and_invariant/Q1807.java)

# MY JAVA NOTES

## How to randomly generate numbers using JAVA
```JAVA
// java 1.7 or later
import java.util.concurrent.ThreadLocalRandom;
int randomNum = ThreadLocalRandom.current().nextInt(min, max+1);
//before java 1.7
import java.util.Random;
public static randInt(int min, int max){
  Random rand;
  int randomNum = rand.nextInt((max-min) + 1) + min;
  return randomNum;
}
