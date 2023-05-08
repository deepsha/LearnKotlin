fun main(args: Array<String>) {
    println("Welcome to simgleton class example!")
    val instance1 =SingletonDatabase.getInstance()
    val instance2 =SingletonDatabase.getInstance()
    println(instance1)
    println(instance2) //print single instance value only

}
class SingletonDatabase private constructor(){

    companion object {
        private var instance: SingletonDatabase? = null
        fun getInstance(): SingletonDatabase?{
            if (instance == null) {
                instance = SingletonDatabase()
            }
            return instance
        }
    }
}


