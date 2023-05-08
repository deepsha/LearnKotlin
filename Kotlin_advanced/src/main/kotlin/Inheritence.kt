fun main(args: Array<String>) {
    println("Welcome to inheritence example using OOPS!")
    var car1=Car("BMW","blue",6,4)
    var plane=Aeroplane("Boeing 777","white",7,2)
    car1.move()//overridden method
    car1.stop()//overridden method
    car1.start()//car method
    plane.move()//overridden method
    plane.stop()//overridden method
    plane.fly()//aeroplane method

}
//open keyword tell thats its open for inheritence
open class Vehicle(val name:String, val color:String,val engine:Int){
    open fun move(){ //user open keyword to make method public for overriden otherwise its private
        println("$name having $color is moving")
    }
    fun stop(){
        println("$name  having $color has stopped")
    }

}

class Car (name:String,color:String,engine:Int,val wheel:Int):Vehicle(name,color,engine)
{
    fun start(){
        println("$name having $color has started on road!")
    }
}
class Aeroplane (name:String,color:String,engine:Int,val wings:Int):Vehicle(name,color,engine)
{
    override fun move(){
        print("Overiiden..")
        fly()
        super.move()
    }
    fun fly(){
        println("$name having $color has started to fly!")
    }
}


