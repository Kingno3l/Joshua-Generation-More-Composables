package android.example.composejoshua

fun main() {
//    val add = {a: Int, b: Int -> a+b}
//    hof(add)

    hof {a: Int, b: Int -> a+b}

}

fun hof(addition: (Int, Int) -> Int) {
    val result = addition(4,6)
    println(result)
}



