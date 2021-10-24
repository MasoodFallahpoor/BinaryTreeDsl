package ir.fallahpoor.binarytreedsl

class BinaryTreeNode<T>(
    var value: T,
    var left: BinaryTreeNode<T>? = null,
    var right: BinaryTreeNode<T>? = null
)