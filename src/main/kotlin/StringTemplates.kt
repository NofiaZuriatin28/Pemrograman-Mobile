fun main(args: Array<String>) {
    val a = 7
    val b = 8
    val c = a + b
    val s = "when we add $a and $b, we get $c"
    println(s)
    println("When we add $a and $b, we get ${a + b}")
    val price = """
        ${'$'}99.9
        """
    println(price)
}