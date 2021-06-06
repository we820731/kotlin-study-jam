package chapter3

fun main() {
    fun example(egFun: () -> Unit){
        egFun()
        egFun.invoke()
    }

    fun toUse() {
        println("Yes, it works")
    }

    example { toUse() }

    fun example1(a: String): String {
        return a
    }
    println( example1("test"))

    val example2: (Int) -> String = { it.toString() }

    println(example2(12345))
}