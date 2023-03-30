fun main(args: Array<String>) {
    println("Hello World!")
    println(max(3, 4))

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}