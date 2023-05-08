fun main(args: Array<String>) {
    println("Welcome to abstract class example using OOPS!")
    var car1=Car("BMW","blue",6,4)

    car1.move()//overridden method from child class Car
    car1.stop()//overridden method from child class Car



}
//open keyword tell thats its open for inheritence
abstract class Vechicle(){//user abstract keyword to make class  and method abstract
abstract fun move()
    abstract fun stop()

}

class Train (val name:String,val color:String,engine:Int,val wheel:Int):Vechicle()
{
    //overdiden in child classs who implement abstract class
    override  fun move() = println("$name having $color has started on road!")
    override  fun stop() = println("$name having $color has started on road!")
}



