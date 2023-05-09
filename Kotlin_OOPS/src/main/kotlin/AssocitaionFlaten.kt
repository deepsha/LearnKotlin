fun main(args: Array<String>) {
    println("This is association example")
    //list
    val nameList1= listOf<String>("John","Joseph","Julia","Tiger","Mary")
    nameList1.forEach({ line -> println(line) })
    println("------ list after association---------");
    println(nameList1.associateWith {it.length  })//{John=4, Joseph=6, Julia=5, Tiger=5, Mary=4}
    println(nameList1.associateBy {it.first().uppercase()  })//{J=Julia, T=Tiger, M=Mary}

    //flatten->convert 2d array to 1d array
    val numberArray= arrayOf(arrayOf(2,3,4), arrayOf(4,5,6), arrayOf(7,8,9))
    println(numberArray[2][1])//multi dimensional array

    val numberSets= setOf(setOf(2,3,4), setOf(4,5,6), setOf(7,8,9))
    for(num in numberSets)
    {
        for(n in num)
        {
            print(n)
        }
        print("\n")
    }/*
    234
    456
    789
    by using flatten we convert 2d array to 1 d array
    */

    val numberFlat=numberSets.flatten()
    println(numberFlat)//[2, 3, 4, 4, 5, 6, 7, 8, 9]
}
