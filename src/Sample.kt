fun main(args:Array<String>) {
    val length = 5
    // this is not allowed as val is final length=10
    var breadth=10
    // This is allowed as var is mutanle breadth=12
    println("Area ${length*breadth}")
}