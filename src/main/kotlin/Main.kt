
fun main(args: Array<String>) {

    val answer = 42
    val answer2: Int
    //val answer3
    println("Hello World!")
    println(max(3, 4))

    Color.RED.rgb()

}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun messageSender(a: Int, b: Int): String {
    val message: String = if(a > b) {
        "Yes"
    } else {
        "No"
    }
    return message
}

fun messageSender2(): ArrayList<String> {
    val message = arrayListOf("Java")
    message.add("Kotlin")
    return message
}

class Person(val name: String, val age: Int) {

}

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0);
    fun rgb() = (r * 256 + g) * 256 + b
}



