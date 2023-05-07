fun main(args: Array<String>) {
    /*
    Int, Double, Char, String, Boolean

    print()
    println()

    toInt()
    toDouble()
    toChar()
    toString()
    toBoolean()
    */

    // toInt
    val text:String = "6969"
    val nrText:Int = text.toInt()
    println(nrText)
    val nrTextPlus = nrText + 31
    println(nrTextPlus)


    /* stop program */
    val x:Int ? = null
    println(x)
    val y:Int ? = null
    println(y!!) // program end
}