package pruebas

fun main(){
    val courses = listOf("kotlin","java","phyton","kotlin")
    println(courses)
    println(courses.size)
    println(courses[0])
    println(courses.first())
    println(courses.last())
    println("Java" in courses)
    println(courses.indexOf("phyton")) 


}