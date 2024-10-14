package android.example.composejoshua

fun main(){

    val add1 : (Int, Int) -> Int  = {a: Int, b: Int -> a + b}
    println(add1(5, 10))


    val add2: (Int, Int) -> Unit = {a, b -> println(a + b) }
    add2(3,9)

    val add3: () -> String = { "Hello Joshua"}
    println(add3())

    val add4: () -> Unit = { println("Classes are interesting")}
    add4.invoke()
}




//variable name, function type, lamda itself