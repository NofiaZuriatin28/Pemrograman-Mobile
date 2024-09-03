fun main(args: Array<String>) {

    //Bilangan bulat
    val minByte: Byte = -128
    val maxByte: Byte = 127 // 8bit
    val minShort: Short = -32768
    val maxShort: Short = 32767 // 16bit
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647 // 32bit
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807 // 64bit
    println("Bilangan Bulat")
    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minLong)
    println("maxLong:" + maxLong)

    //Bilangan pecahan
    val maxFloat: Float = 9.123456789f
    val maxDouble: Double = 9.123456789
    println("============================== ")
    println("Bilangan Pecahan")
    println("maxFloat:" + maxFloat)
    println("maxDouble:" + maxDouble)

    //Constants literal
    println("============================== ")
    println("Constants literal")
    val floatLiteral : Float = 178.95F //Literal Float
    println("Contoh Literal Float : " + floatLiteral)
    val oneBillion: Long = 1000000000L //Literal Long
    println("Contoh Literal Long : " + oneBillion)
    val valHeksa = 0x0F //Literal heksadesimal diawali dengan 0x
    println("Contoh Literal Heksadesimal : " + valHeksa)
    val valBinary = 0b00001011 //Literal binary diawali dengan 0b
    println("Contoh Literal Binary : " + valBinary)
    val notasiKonvensional = 123.5e10
    println("Contoh Literal Konvensional Floating Point Number : " + notasiKonvensional)

    //Representasi
    println("============================== ")
    println("Representasi")
    val a: Int = 10000
    println("a apakah identik dengan a atau a === a : " + (a === a))
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA apakah identik dengan anotherBoxedA atau boxedA === anotherBoxedA : " + (boxedA ===
            anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA : "
            + (boxedA == anotherBoxedA))

    //Konversi eksplisit
    println("============================== ")
    println("Konversi eksplisit")
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit
    println("Konversi variabel valInt secara implisit : " + valSum)
    val valLong: Long = valInt.toLong() // konversi eksplisit
    println("Konversi variabel valInt secara eksplisit : " + valLong)

    //Character
    println("============================== ")
    println("Char/Character")
    var charA : Char = 'A'
    //println(charA == 65)
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = "+strA)

    //Penerapan Konversi Eksplisit pada char
    println("============================== ")
    println("Penerapan Konversi Eksplisit pada char")
    //ASCII value
    var c: Char // character
    var i: Int // ordinal (ASCII) value of the character
    // conversion from text to ASCII value
    c = 'a'
    i = c.toInt()
    println("The character $c was converted to its ASCII value of $i")
    // conversion from an ASCII value to text
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")

}