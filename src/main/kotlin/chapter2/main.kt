package chapter2
// 常數
const val MAX_DEGREE = 99
fun main(args: Array<String>) {
//    宣告變數
    var a: Int = 3
    var msg: String = "Hello"
    var b: Boolean = false
    var c: Char = 'f'
    var e: List<Int> = arrayListOf(1, 2, 5)
    val map1: Map<String, Int> =  mapOf("Ana" to 10, "Bob" to 20, "Coc" to 30)
    val set1: Set<String> = setOf("a", "b", "c")

//    sout 快捷键生成 println()
    println(a)
    println(msg)
    println(b)
    println(c)
    println(e)
    println(map1)
    println(map1["Ana"])
    println(set1)

//    唯讀變數
    val aa: Int = 5
    var msgg: String = "Hello"

// coding 類型推斷功能
    var num = 5
    num += 2

    var message = "hello"
//    message = 3

    println(num)
    println(message)

//    型別轉換
    var aaa: Int = 5
    var bbb: Float = aaa.toFloat()

    println(aaa)
    println(bbb)

//    常數
    println(MAX_DEGREE)
}