package pruebas

fun main (){
    upperCaseString("denis")
    suma(2,2)
    println(positive)
    println(negative)
    println(square(5))
    println(isEven(2))
    println(fullName("Denis", "Ignat"))
    println(separador())

    println(b("Denis"))
    println(c("Denis",20))
    println(d())
    println(e(6))
    //exersice3

    print("First number: ")
    val num1 = readln().toDouble()

    print("Second number: ")
    val num2 = readln().toDouble()

    print("Operator (+ - * /): ")
    val op = readln()

    val selectedOperation: ((Double, Double) -> Double)? = when (op) {
        "+" -> add
        "-" -> subtract
        "*" -> multiply
        "/" -> divide
        else -> null
    }

    if (selectedOperation != null) {
        println("$num1 $op $num2 = ${calculate(num1, num2, selectedOperation)}")
    } else {
        println("Invalid operator")
    }
    //Exersice4
    fun main() {
        print("Enter a sentence: ")
        val sentence = readln()

        val vowelCount = sentence.count { it.lowercaseChar() in "aeiou" }
        println("Vowels: $vowelCount")

        val spaceCount = sentence.count { it == ' ' }
        println("Spaces: $spaceCount")

        val onlyLetters = sentence.filter { it.isLetter() }
        println("Only letters: $onlyLetters")

        val hasDigits = sentence.any { it.isDigit() }
        println("Contains digits: $hasDigits")

        val allUpper = onlyLetters.isNotEmpty() && onlyLetters.all { it.isUpperCase() }
        println("All letters uppercase: $allUpper")
    }


}
fun calculateTwo(a:Int,b:Int, operation:(Int, Int)->Int):Int{
    return operation(a,b)
}
//Exersice4

//Exersice3
fun calculate(a: Double, b: Double, operation: (Double, Double) -> Double): Double {
    return operation(a, b)
}

val add: (Double, Double) -> Double = { a, b -> a + b }
val subtract: (Double, Double) -> Double = { a, b -> a - b }
val multiply: (Double, Double) -> Double = { a, b -> a * b }
val divide: (Double, Double) -> Double = { a, b -> a / b }


//Exersice 2
val e: (Int) -> Boolean = {n -> n in 1..10}
val d: () -> String = {"Loading"}
val c: (String,Int) -> String ={name, age -> "$name $age"}
val b: (String) -> Int ={text -> text.length}


val separador ={"--------------"}
val fullName = {name:String, surname:String -> "$name $surname"}
val isEven = {x:Int -> x%2 == 0}
val square = {x:Int -> x*x}

val numbers = listOf(1,-2,3,5,-6)
val isNegative = {x:Int -> x < 0}
val negative = numbers.filter(isNegative)
val positive = numbers.filter({x -> x >= 0})
val suma = {a:Int, b:Int -> println(a + b)}

fun upperCaseString(texto:String){
        println(texto.uppercase())
}
