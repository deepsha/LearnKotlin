fun main(args: Array<String>) {
    println("This is join example")
    //list
    val nameList1= listOf<String>("John","Joseph","Julia","Tiger","Mary")
    println(nameList1)
    println(nameList1.joinToString ())
    var sentence=StringBuffer("the employee list contain ")
    println(nameList1.joinTo(sentence))
    println(nameList1.joinToString (separator = "|",prefix="dept1:", postfix = " clerk"))

    val numbers =(1 ..50).toList()
    println(numbers.joinToString(limit=20, truncated = "<.. >"))

}
