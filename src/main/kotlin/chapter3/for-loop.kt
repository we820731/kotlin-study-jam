package chapter3

fun main() {
    //1 to 100
    for( x in 1 ..100){}
    //1 to 99
    for(x in 1 until 100){}
    //100 to 1
    for(x in 100 downTo 1){}

    val tempIntArray = intArrayOf(10, 20, 30)

    for (num in tempIntArray) {
        println(num)
    }

    for ((index, item) in tempIntArray.withIndex()) {
        println("index:${index}, item:${item}")
    }
}