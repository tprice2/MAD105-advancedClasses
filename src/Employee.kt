import java.text.DecimalFormat
//This is the employee class with constructors accepting these values from main
class Employee constructor(var name: String,
                           var position: String,
                           var salary: Boolean,
                           var payRate: Double,
                           var shift: Int,
                           var startDate: String) {
    //Initialize total pay as a double
    var totalPay = 0.00

    //The method calculate accepts the hours worked as a parameter
    //If the worker isn't salary and worked overtime, the overtime pay is calculated
    //A multiplier based on the shift is also applied
    fun calculate(hours: Double){
        if((hours >= 40) && (salary == false))
            totalPay = 40 * payRate + (hours-40)*1.5 * payRate
        else
            totalPay = payRate * hours
        if(shift == 2)
            totalPay = totalPay * 1.05
        else if (shift == 3)
            totalPay = totalPay * 1.1
    }

    //The display method prints everything and formats the currency numbers correctly
    fun display(){
        val format = DecimalFormat("$###,###,###.00")
        println(name + "\nPosition: "+ position +
                "\nStart Date: " + startDate +
                "\nShift: " + shift +
                "\nSalary: " + salary +
                "\nPay Rate: " + format.format(payRate) + "/hour" +
                "\nTotal Pay: " + format.format(totalPay))
    }
}