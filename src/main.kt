/*
Pseudocode:
Variables: employee1, employee2, and employee3. Variables to hold the hours
are also used in the Employee class, as well as the total pay.
Process:
First, in the Employee class, the parameters to be accepted are set.
Next, the totalPay variable is initiated as a double.
The calculate method is then used to do find the amount that each employee makes in a week.
If statements are used to determine if the employee is not salaried and worked overtime.
Other if statements are also used to determine if the employee needs a shift multiplier.
Finally, the display method is called, which prints all of the parameters and totals.
 */



fun main() {
    //These variables are instantiate the employee class
    val employee1 = Employee("Rodger Pebble",
        positionFind(PositionTitle.Technical), true, 35.00,
        1,"10-02-2012")
    val employee2 = Employee("Seahorse McGee",
        positionFind(PositionTitle.Technical), false, 6.00,
        2, "05-04-2001")
    val employee3 = Employee("Kent Kentington",
        positionFind(PositionTitle.Technical), false, 12.00,
        3, "02-27-2009")

    employee1.calculate(45.00)
    employee1.display()
    println("\n")
    employee2.calculate(50.00)
    employee2.display()
    println("\n")
    employee3.calculate(35.00)
    employee3.display()

}

//This function is called to determine the string value for the position title
fun positionFind(dir:PositionTitle):String{
    when (dir){
        PositionTitle.Administration -> return "Administration"
        PositionTitle.Production -> return "Production"
        PositionTitle.Sales -> return "Sales"
        PositionTitle.Maintenance -> return "Maintenance"
        PositionTitle.Technical -> return "Technical"
        PositionTitle.Secretarial -> return "Secretarial"
        else -> return "Position does not exist"
    }
}