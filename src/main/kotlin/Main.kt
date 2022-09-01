/*
    Project Name: HeyHello
    Name: Albert
    8/31/2022
*/

fun hello() {
    println("HOWDY");
}

fun AddTheseTwo(x:Int,y:Int):Int {
    return x+y
}

fun main(args: Array<String>) {

    // to print something to the console
    println("Hello World")

    // variables
    // var (regular variable that can be changed data value)
    // val (one time variable cannot be changed)
    var name:String = "Albert"
    name = "Doe"
    // var/val variableName: data type = value
    // String,Int,Double, Float,Char,Boolean

    // arrays
    val favColors = arrayOf("White","Black")
    // arrayName[index]

    // loop through the array
    for(cool in favColors) {
        println(cool)
    }

    //loop
    for(r in 1..5) {
        println(r)
    }

    // while (true) {}
    // do {}while(true)

    //when (assigning value to variable with an if statement dust)

    var d:Int = 50
    var n:String = when(d) {
        5-> "Albert"
        10-> "Joe"
        50-> "Mel"
        else-> "Bad"
    }

    // condition
    var myNameIs:String = "Albert"
    if(myNameIs.equals("Albert")) {
        println("How How")
    }

    println(AddTheseTwo(5,2))
    hello()
}

