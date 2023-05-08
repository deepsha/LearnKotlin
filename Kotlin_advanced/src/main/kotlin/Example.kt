fun main(args: Array<String>) {
    println("Welcome to Kotlin advance with OOPS concept!")
    val names= arrayOf("John","Jospeh","Peter")
    var department=arrayOf(1,6,"Biology")
    println(names.size)
    for(name in names)
    {
        println(name)
    }
    println("department is :${department[2]}")
    val user1 = User("Joseph", 40)
    user1.addUser()
    // user1.get()
    val user2 = User("Marry", 30)
    // user2.getName()
    val user3 = User(age = 50)

}
class User(name:String ="No Name",age:Int){
    constructor(name:String):this(name,5)//secondray constructor
    var name=name
        get()=field

        set(value)
        {
            field=value
        }
    init{
        println("User within init")
    }

    val age=age
    init {
        if(name.isBlank())
        {
            this.name = "Anonymous"
        }
        else
        {
            this.name=name.trim()
        }
        println("$name  is $age years old")
    }
    fun addUser()
    {
        println("$name is newly added")
    }

}