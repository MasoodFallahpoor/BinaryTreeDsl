package ir.fallahpoor.binarytreedsl

class BinaryTreeBuilder<T>(root: BinaryTreeNode<T>) {

    private var currentParent = root

    fun left(value: T, content: () -> Unit = {}) {
        val parent = currentParent
        val newNode = BinaryTreeNode(value)
        parent.left = newNode
        currentParent = newNode
        content()
        currentParent = parent
    }

    fun right(value: T, content: () -> Unit = {}) {
        val parent = currentParent
        val newNode = BinaryTreeNode(value)
        parent.right = newNode
        currentParent = newNode
        content()
        currentParent = parent
    }

}

fun <T> binaryTree(rootValue: T, content: BinaryTreeBuilder<T>.() -> Unit): BinaryTreeNode<T> {
    val root = BinaryTreeNode(rootValue)
    val binaryTreeBuilder = BinaryTreeBuilder(root)
    binaryTreeBuilder.content()
    return root
}