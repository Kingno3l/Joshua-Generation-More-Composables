package android.example.composejoshua

val yoi = 1960
val height = 6.9

val jg = "Joshua generations"

//fun name () : return type {
//
//
//    body
//
//return statement
//}

//parenthesis after variable name or call the invoke method

val greet = { println("Hello Joshua Generation") }

//greet()
//        greet.invoke()


//     val lambda: (DataType1, DataType2) -> ReturnTyoe = { variable1: DataType1, variable2:DataType2 -> methodBody }

val add : (Int, Int) -> Int = {a: Int, b: Int -> a + b}

val added = {a: Int, b: Int -> a + b}

val adding: (Int, Int) -> Int = {a, b -> a + b }