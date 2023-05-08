fun main(args: Array<String>) {
    println("Welcome to data class example using OOPS!")
    var emp1=Employee("Pop","Lead Dev",611,"LA")
    var emp2=Employee("Bob","Project manager",612,"London")
    var emp3=Employee("Bob","Project manager",612,"London")
    println(emp2==emp3)
    println(emp1)
    println(emp2)
    println(emp3)



}


class Employee (val name:String,val role:String,val empNo:Int,val city:String)
{
    override fun equals(other: Any?): Boolean {
        if(this=== other)
        {
            return true
        }
        if (other is Employee)
        {
            return this.name==other.name
                    && this.role==other.role
                    && this.empNo==other.empNo
                    && this.city==other.city
        }
        return false
    }

    override fun toString(): String {
        return "Employee('$name','$role','$empNo','$city')"
    }
}



