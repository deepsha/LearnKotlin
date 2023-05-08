var constant_title="welcome!" //constant varaible and need to be initialized
fun main(args: Array<String>) {
    println(constant_title)
    greet("Joseph",4)
    greet(2,"Mary")
    greet ( "how are u?",2,"Jesus")
    val numArray:IntArray= intArrayOf(1,5,10,15,20)
    var sum=getSum(a=100,*numArray,b=100) //* is SPREAD operator
    var maxNum=getMaxNumber(3,7)
    var highestNum=getHighestNum(100,  9,102,88,108)
    var doubleNum  =getDoubleNum(5)
    println("Hello World! highestNum:$highestNum, sum :$sum ,max:$maxNum  ,double:$doubleNum")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val time=14
    println("$time")

    val greetings: String =if (time in 0..11){ "Good morning!"    }
    else if(time == 12)	{"Time for lunch!"}
    else{ "Good Day!"}
    println(greetings)

    val greeting:String =when (time){
        in 0..11 -> "Good morning!"
        12 -> "Time for lumch!"
        13,14 ->"Time for nap!"
        else -> "Good day!"
    }
    println(greeting)
}
fun greet(name:String,reps:Int)
{
    println(constant_title)
    var repTem=reps
    while(repTem >0) {
        println("hello greeting to $name! welcome")
        repTem --
    }
}
fun greet(repos:Int,name:String)
{
    for(i in 0 until repos ) println("Hello ! $name")
}
fun greet(message:String,repos:Int,name:String)
{
    for(i in 0 until repos ) println("Hello ! $name, $message")
}
fun getMaxNumber(num1:Int,num2:Int):Int
{
    val max :Int =if (num1 >num2) num1 else num2
    println(max)
    return max
}
fun getDoubleNum(num:Int)=num*2;
fun getDoubleNum(num:Double)=num*2;
fun getSum(a:Int,vararg numbers:Int,b:Int):Int{
    var sum=a+b
    for(num:Int in numbers) sum+=num
    return sum
}
fun getHighestNum(first:Int, vararg remaining:Int):Int
{
    println(constant_title)
    var max=first
    for(i in remaining)
    {
        if(i >max)
            max=i
    }
    return max
}