fun main(args: Array<String>) {
    val one:Int = 2006
    val two:Int = 17

    /*
    if ()
       println()
    else if ()
       println()
    else
       println()
    */

    if (one > two) {
        val bool = one > two
        println(bool) // false
    } else if (one < two) {
        val bool = one < two
        println(bool) // true
    } else {
        println(null)
    }

}