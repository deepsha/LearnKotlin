fun main(args: Array<String>) {
    println("This is grouping,  slice,chunk,aggregate example")
    //list
    val nameList1= listOf<String>("John","Joseph","Julia","Tiger","Mary","David")
    println(nameList1)
    println(nameList1.groupBy(keySelector = {it.first()},
        valueTransform ={it.uppercase()}))//[Joseph, Julia, Tiger]
    println(nameList1.slice(indices = 1..3))
    println(nameList1.slice(indices = 0..3 step 3))

    println(nameList1.take(3))//take 1st three elements [John, Joseph, Julia]
    println(nameList1.takeLast(3))//take last 3 elements [Tiger, Mary, David]
    println(nameList1.drop(2))//remove first 2 element
    println(nameList1.dropLast(2))//remove last 2 element

    println("\n")
    println(nameList1.takeWhile { it.startsWith("J") })//[John, Joseph, Julia]
    println(nameList1.takeLastWhile {  it!="Tiger" })//[Mary, David]
    println(nameList1.dropWhile { it.length==4 })//[Joseph, Julia, Tiger, Mary, David]
    println(nameList1.dropLastWhile {  it.contains("Mary") })//[Tiger, Mary, David]

    //chunks
    var numbers:List<Int> =(1..20).toList()
    println(numbers)
    println(numbers.chunked(3))
    println(numbers.chunked(3){it.sum()})
    println(numbers.chunked(3){it.min()})

    //sum,count
    println("the sum is ${numbers.sum()}")
    println("the count is ${numbers.count()}")
    println("the average is ${numbers.average()}")
    println("the max is ${numbers.max()}")
    println("the min is ${numbers.min()}")
    println("the min is ${numbers.minOrNull()}")
    println("the twice sum of number is ${numbers.sumOf({it ->it*2})}")
}
