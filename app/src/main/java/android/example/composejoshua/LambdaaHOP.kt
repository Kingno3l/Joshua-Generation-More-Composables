package android.example.composejoshua

import android.renderscript.ScriptIntrinsicYuvToRGB

fun main() {
//    val add = {a: Int, b: Int -> a+b}
//    hof(add)

    hof {a: Int, b: Int -> a+b}
    hof2("Generation")  {a: Int, b: Int -> a+b}
    hof3 {
        println("Hello")
    }

    val numbers = listOf(2,4,6,8,10)
    println(numbers.filter { numbers -> numbers > 6 })

    println(numbers.filter { it > 6 })

    reverseString("Hello") { it.reversed()}

    //pass anonymouns function as a parameter of higher order function
    val subtr = fun(a:Int, b:Int):Int{
        return a-b
    }
    hof4(subtr)

    println(hof5()())

    //return a regular funtion from a higher order function
    println(hof6()())

    //passing a regular function to higher order function
    hof7( ::messageFun)





}



fun hof(addition: (Int, Int) -> Int) {
    val result = addition(4,6)
    println(result)
}

fun hof2(name:String, addition: (Int, Int) -> Int){
    val result = addition(4,6)
    println("Joshua $name : " + result)
}

fun hof3(name: (String) -> Unit){
    name("Joshua")
}

fun reverseString(str: String, myLambda: (String) -> (String)) {
    var result = myLambda(str)
    println(result)
}

fun hof4(subtract: (Int, Int) -> Int){
    val result = subtract(77,10)
    println("Sutraction result: $result")
}

fun hof5(): () -> String{
    val msg = fun():String{
        return "Hello Jo"
    }
    return msg
}

fun hof6(): () ->String{
    return ::messageFun
}

//regular function
fun messageFun(): String{
    return "Hello Joshua, this is a regular function"
}

fun hof7(regFun: () -> String) {
    println( regFun())
}




