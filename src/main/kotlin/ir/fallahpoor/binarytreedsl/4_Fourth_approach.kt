package ir.fallahpoor.binarytreedsl

fun main() {
    val root = binaryTree("A") {
        left("B") {
            left("D")
            right("E")
        }
        right("C") {
            right("F") {
                left("G")
            }
        }
    }
}