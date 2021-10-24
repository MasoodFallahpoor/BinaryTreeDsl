package ir.fallahpoor.binarytreedsl

fun main() {
    val root = node("A").apply {
        left = node("B").apply {
            left = node("D")
            right = node("E")
        }
        right = node("C").apply {
            right = node("F")
        }
    }
}

private fun <T> node(value: T) = BinaryTreeNode(value)