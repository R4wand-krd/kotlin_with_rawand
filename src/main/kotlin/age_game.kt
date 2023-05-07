import java.util.Calendar

fun main(args: Array<String>) {
    print("Enter you birth year: ")
    val birthYear = readlnOrNull()?.toInt()

    val age = Calendar.getInstance().get(Calendar.YEAR) - birthYear!!

    println("Your age is $age")
}