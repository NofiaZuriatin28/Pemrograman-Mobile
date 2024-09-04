fun main(args: Array<String>) {
    val myName: String = "Nofia Zuriatin"
    for (chr in myName){
        print(chr)
    }
    print('\n')


    //string yang digabung dengan tipe data lain dengan mengguanakan operator +
    println("")
    println("===========================")
    val s = "abc" + 1
    println(s + "def")


    //menyimpan data raw string
    println("")
    println("===========================")
    var text = """
        for (c in "foo)
        print(c)
        """
    println(text)


    // menghapus spasi yang tdk di perlukan pada raw string
    println("")
    println("===========================")
    var texxt = """
        |Tell me and i forget.
        |Teach me and I remember
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()
    println(texxt)
}