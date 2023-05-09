import java.util.*

fun main() {
    val text:String = "kotlin"
    println("text: $text")

    println("Text:" + text.plus("_with_rawand"))
    println("Text:" + text.hashCode())
    println("Text:" + (text == "kotlin"))
    println("Text:" + text.length)
    println("Text:" + text.count())
    println("Text:" + text.drop(2))
    println("Text:" + text.take(2))
    println("Text:" + text.removeRange(2, 4))
    println("Text:" + text.uppercase(Locale.getDefault()))
    println("Text:" + text.lowercase(Locale.getDefault()))
    println("Text:" + text.first())
    println("Text:" + text.last())
    println("Text:" + text.replace('k', 'K'))
    println("Text:" + text.replace("kotlin", "dart"))
}