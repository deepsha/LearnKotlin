fun main(args: Array<String>) {
    println("Welcome to ENUM example!")
    println(DIRECTION.EAST)
    println(DIRECTION.NORTH)
    for(direction in DIRECTION.values())
    {
        println("${direction.name} for ${direction.direction} and ${direction.distance}")
    }
}
enum class DIRECTION(var direction:String,var distance:Int){
    NORTH("north",70),
    SOUTH("south",50),
    EAST("east",40),
    WEST("west",100),
}


