fun main(args: Array<String>) {
    print("Enter your age: ")
    val age = readln().toInt()

    if (age > 17)
        println("You can join, your age is $age")
    else
        println("You can not join, because your age is $age")
}