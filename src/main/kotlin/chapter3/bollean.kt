package chapter3

fun main() {
    fun example1(lazy: Boolean = true) {
        println(lazy)
    }

    example1(false)
    example1(true)
    example1()
}