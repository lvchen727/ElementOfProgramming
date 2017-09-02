# Binary Tree

## specific trees
- 1. full BT: each node except leaves has 2 children, leaves - nonleaves = 1
- 2. perfect BT: all leaves at same depth(distance to root), must be full BT, $2^{h+1} - 1$ nodes, $2^h$ leaves
- 3. complete BT: every level except possible last is filled, $ h = log\lfloor n \rfloor$ (n nodes)
- 4. left(right) screwed: only having left(right) children

## key operations
### traverse
- 1. inorder -> LMR
- 2. preorder -> MLR
- 3. postorder -> LRM (left, right, middle(root))


## key points
- LCA : lowest common ancestor
