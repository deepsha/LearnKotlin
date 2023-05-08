fun main(args: Array<String>) {
    println("Welcome to lazy initialization example!")
    val customer1 = Customer("Alex","Peter",20)//this is created when init is called
    val customer2 = Customer("Joe","Pan",23) //this is created when init is called
    val customer3:Customer by lazy {
        Customer("firstname","lastname",0)
    }//this is created when u call below method
    println("Lazy initlization: ${customer3.firstname} ${customer3.lastName} and ${customer3.age} ")
}
class Customer(var firstname:String,var lastName:String,var age:Int){

    init{
        println("User $firstname and $lastName with $age was created")
    }
}

