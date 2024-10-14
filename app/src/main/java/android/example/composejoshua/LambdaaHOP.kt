package android.example.composejoshua

fun main() {
//    val add = {a: Int, b: Int -> a+b}
//    hof(add)

    hof {a: Int, b: Int -> a+b}
    hof2("Generation")  {a: Int, b: Int -> a+b}

}



fun hof(addition: (Int, Int) -> Int) {
    val result = addition(4,6)
    println(result)
}

fun hof2(name:String, addition: (Int, Int) -> Int){
    val result = addition(4,6)
    println("Joshua $name : " + result)
}






