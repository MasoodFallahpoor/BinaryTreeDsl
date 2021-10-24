package ir.fallahpoor.binarytreedsl

fun main() {
    val root = BinaryTreeNode("A").apply {
        left = BinaryTreeNode("B").apply {
            left = BinaryTreeNode("D")
            right = BinaryTreeNode("E")
        }
        right = BinaryTreeNode("C").apply {
            right = BinaryTreeNode("F")
        }
    }
}