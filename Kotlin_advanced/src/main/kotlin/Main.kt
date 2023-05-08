fun main(args: Array<String>) {
    println("Welcome to interface example using OOPS!")
    var vechichle1=Truck("Bob truck","Red",611,4)
    var vechichle2=Boat("Ocean jet","Blue",612,0)

    println(vechichle1.startEngine())
    println(vechichle2.startEngine())




}

interface Engine{
     fun startEngine(){}
}
class Truck (val name:String,val color:String,engine:Int,val wheel:Int):Engine
{
    //overdiden in child classs who implement abstract class
    override  fun startEngine() = println("Truck $name having $color has started on road!")

}
class Boat (val name:String,val color:String,engine:Int,val wheel:Int):Engine
{
    //overdiden in child classs who implement abstract class
    override  fun startEngine() = println("Boat $name having $color has started on road!")

}



