fun main(args: Array<String>) {
    println("This is collection example with zip,unzip")
    //list
    val nameList1= listOf<String>("John","Joseph","Julia","Tiger")
    nameList1.forEach({ line -> println(line) })
    println("-------mutable list---------");
    val nameList2= mutableListOf<String>("John","Joseph","Julia","Tiger")
    nameList2.add("Jesus")
    nameList2.forEach({ line -> println(line) })
    nameList2.removeAt(1)
    nameList2.remove("John")
    println("----------------");
    nameList2.forEach({ line -> println(line) })
    //set
    println("------Set example----------");
    val nameSet1= setOf<String>("John","Joseph","Julia","John")
    nameSet1.forEach({ line -> println(line) })
    println("------mutable Set example----------");
    val nameSet2= mutableSetOf("John","Joseph","Julia","John","Julia")
    nameSet2.add("Robbinson")
    nameSet2.add("Peterpan")
    nameSet2.forEach({ line -> println(line) })
    //map
    println("------ map example----------");
    val userMap1= mapOf<Int,String>(1 to  "Maria",2 to "Alex",3 to "John",4 to "Peter")
    userMap1.forEach({ line -> println(line) })
    println("------mutable  map example----------");
    val userMap2= mutableMapOf<Int,String>(1 to  "Maria",2 to "Alex",3 to "John",4 to "Peter")
    userMap2.put(5,"Thomas")
    userMap2[6]="Marry"
    userMap2.forEach({ line -> println(line) })
    //transform from set to map
    val numbers= setOf(1,2,3,4,5)
    println(numbers.map{
        if (it==3)
            it*100 else it*10})

    val employeeMap=mapOf("13" to "Joseph","233" to "Peter","3222" to "Thomas")
    println(employeeMap.mapKeys { it.key.length })
    println(employeeMap.mapValues { it.value.uppercase() })

    //zipping
    val colors = listOf("red","Blue","Yellow","green")//{2=Joseph, 3=Peter, 4=Thomas}
    val animals= listOf("ant","whale","giraffe")//{13=JOSEPH, 233=PETER, 3222=THOMAS}
    println(colors zip animals)//[(red, ant), (Blue, whale), (Yellow, giraffe)]
    println(colors.zip (animals){color,animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is ${color} "}) //[The Ant is red , The Whale is Blue , The Giraffe is Yellow ]

    //unzipping
    val numberMap=listOf(1 to "Kite",2 to "Cycle",3 to "Toy")
    println(numberMap)//[(1, Kite), (2, Cycle), (3, Toy)]
    println(numberMap.unzip())//([1, 2, 3], [Kite, Cycle, Toy])
}
