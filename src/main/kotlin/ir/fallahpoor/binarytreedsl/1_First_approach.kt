package ir.fallahpoor.binarytreedsl

fun main() {

    val root = BinaryTreeNode("A")
    val b = BinaryTreeNode("B")
    val c = BinaryTreeNode("C")
    val d = BinaryTreeNode("D")
    val e = BinaryTreeNode("E")
    val f = BinaryTreeNode("F")

    root.left = b
    root.right = c

    b.left = d
    b.right = e

    c.right = f

}