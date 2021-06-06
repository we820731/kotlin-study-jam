package chapter3

fun main() {

    fun example(){
        println("hello")
    }

    example()

    fun example2(): String {
        return "hi!"
    }
    println(example2())

    fun example3(a:Int, b:Int): String {
        val temp = a+b
        return temp.toString()
    }
    println(example3(5,5))

    fun example4(a:String) = a
    println(example4("Happy Day"))
}