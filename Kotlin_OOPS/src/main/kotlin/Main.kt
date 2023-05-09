fun main(args: Array<String>) {
    println("This is comparing and comparator example")
    //list
    val nameList1= listOf<String>("John","Joseph","Julia","Tiger","Mary","David")
    println(nameList1)
    val numbers= mutableListOf<Int>(33,11,3,19,80,67)
    numbers.sorted().forEach{println(it)}

    val laptops = mutableListOf(Laptop("HP",1999,5,1800),Laptop("Dell",2010,2,1900),
        Laptop("Acer",2010,4,1000), Laptop("Apple",2015,4,2000))

    laptops.sorted().forEach{println(it)}
    laptops.sortWith(ComparatorRam()).forEach{t->println(t)}
}
//by using keyword data in class, we define equals,hashing all method
data class Laptop(val brand:String,val year:Int,val ram:Int,val price:Int):Comparable<Laptop>
{
    override fun compareTo(other: Laptop): Int {
        return if(this.price>other.price){
            println("in if statement: ${this.brand} with ${other.brand} ")
            1
        }
        else if(this.price< other.price)
        { println("in if statement: ${this.brand} with ${other.brand} ")
            -1
        }else
        {
            0
        }
    }

}

class ComparatorRam :Comparator<Laptop> {
    fun compareTo(laptop1: Laptop,laptop2: Laptop): Int {
        return if(laptop1.ram>laptop2.ram)
        {
            return 1

        }else if(laptop1.ram<laptop2.ram)
        {
            return -1
        }else
        {
            return  0
        }
    }
}