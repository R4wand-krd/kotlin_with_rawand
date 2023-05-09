fun main() {
    print("Enter your degree: ")
    val degree:Int = readln().toInt()

    when {
        degree >= 90 -> println("A")
        degree in 80..89 -> println("B")
        degree in 70..79 -> println("C")
        degree in 60..69 -> println("D")
        degree in 50..59 -> println("E")
        else -> println("F")
    }
}