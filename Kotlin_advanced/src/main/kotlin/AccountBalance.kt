fun main(args: Array<String>) {
    println("Welcome to Account example using OOPS!")
    val account1=Account(13333,"Peter pan")
    account1.depositMoney(1000)
    account1.withdrawMoney(300)
    var balance1=account1.calculateBalance()
    println("final balance:$balance1")
    account1.depositMoney(100)
    account1.withdrawMoney(300)
    var balance2=account1.calculateBalance()
    println("final balance:$balance2")
    account1.depositMoney(-900)
    account1.withdrawMoney(-300)
    var balance3=account1.calculateBalance()
    println("final balance:$balance3")

}
class Account(val accountNum:Int,val accountName:String)
{
    var balance=0
    var transaction= mutableListOf<Int>()
    fun depositMoney(depositAmount: Int){
        if(depositAmount >0) {
            transaction.add(depositAmount)
            balance += depositAmount
            println("amount $depositAmount is deposited and balance is $balance")
        }
        else
        {
            println("amount $depositAmount is is negative")
        }
    }

    fun withdrawMoney(withdrawAmount:Int)
    {
        if(-withdrawAmount <0)
        {
            transaction.add(-withdrawAmount)
            this.balance+=withdrawAmount
            println("amount $withdrawAmount is deposited and balance is $balance")
        }
        else
        {
            println("amount $withdrawAmount is  negative")
        }
    }
    fun calculateBalance():Int{
        this.balance=0
        for(t in transaction){
            this.balance+=t

        }
        return balance
    }
}


