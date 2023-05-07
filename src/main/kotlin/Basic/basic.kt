fun main(args: Array<String>) {
    // print
    print("print")
    print("print")
    println("println")
    println("println")

    // variable
    var z = "Auto Check"
    var x:Int=5
    val y:Int=10
    var d:Double=10.3
    var c:Char='C'
    var s:String="String"
    println("x=$x")
    x=7
    println("x=$x")
    println("y="+y)
    println("d=$d")
    println("c=$c")
    println("z=$z")
    println("s=$s")

    // Text
    val text:String = "Hello World"
    println("text is '$text', and it started with " + text[0])

    // Boolean
    var bool:Boolean = false
    println("your life is $bool")
    bool = 5 > 2
    println(bool)
    bool = 5 < 2
    println(bool)
}