fun main(args: Array<String>) {
    print("Enter your name: ")
    val readName = readLine()
    print("Enter your age: ")
    val readAge = readLine()?.toInt()
    println("------------------------")
    println("Your name is $readName")
    println("Your name is $readAge")
}