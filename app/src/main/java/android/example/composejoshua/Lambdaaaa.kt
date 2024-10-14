package android.example.composejoshua

fun main(){

    //    Anonymous Function
    val add = fun(a: Int, b: Int): Int { return a + b}
    println(add(10, 20))


    //whenever you have only one statement, wew can omit the return keyword and the braces...
    val add2 = fun(a:Int, b:Int) : Int = a + b
    println(add2.invoke(2,3))

    //with parameters and  return type
    val multiply = fun(a:Int, b:Int):Int = a * b
    println(multiply(3,4))

    //with paramters and no return type
    val multiply2 = fun(a:Int, b:Int): Unit { println(a * b) }
    multiply2(3,6)

    //no parameter but with return type
    val msg = fun() : String { return "Congratulations everyone"}
    println(msg)

    //no parameter and no return value
    val msg2 = fun() : Unit { println("Congratulations once more") }
    msg2.invoke()



//    val add1 : (Int, Int) -> Int  = {a: Int, b: Int -> a + b}
//    println(add1(5, 10))
//
//
//    val add2: (Int, Int) -> Unit = {a, b -> println(a + b) }
//    add2(3,9)
//
//    val add3: () -> String = { "Hello Joshua"}
//    println(add3())
//
//    val add4: () -> Unit = { println("Classes are interesting")}
//    add4.invoke()



}




//variable name, function type, lamda itself