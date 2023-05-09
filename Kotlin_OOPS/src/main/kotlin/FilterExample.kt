fun main(args: Array<String>) {
    println("This is filter example")
    //list
    val nameList1= listOf<String>("John","Joseph","Julia","Tiger","Mary")
    println(nameList1)
    println(nameList1.filter{it.length >4})//[Joseph, Julia, Tiger]

    val numberMap=mapOf("key1" to 1,"key2" to 2,"key3" to 3,"key4" to 4,"key11" to 11,"key21" to 21)
    val filterMap=numberMap.filter { it.key.endsWith("1") && it.value>1}
    println(filterMap)//{key11=11, key21=21}
    println(nameList1.filterNot { it.length >4 } )//[John, Mary]
    println(nameList1.filterIndexed { index,value->(index!=0) && (value.length <6) } )//[Julia, Tiger, Mary]

    val mixedList= listOf(1,3,5,8,"A","b","c","Hello world",false)
    for (i in mixedList.filterIsInstance<Int>()) {
        println(i)
    }
    for (i in mixedList.filterIsInstance<String>()) {
        println(i)
    }
    for (i in mixedList.filterIsInstance<Boolean>()) {
        println(i)
    }
    val (matchword,rest)=nameList1.partition { it.length >4 }
    println(matchword)
    println(rest)
    //testing predicate any,none,all
    println(nameList1.any{it.startsWith("K")})
    println(nameList1.any{it.startsWith("J")})
    println(nameList1.none{it.startsWith("J")})
    println(nameList1.all{it.startsWith("J")})
}
