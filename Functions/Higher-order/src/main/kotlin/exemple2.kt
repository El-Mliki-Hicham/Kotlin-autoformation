fun main (){
    numbers(lambdaFunction)
}

fun numbers(operation:(n1:Int,n2:Int)->Int){
    println(operation(2 , 6))
}

val lambdaFunction : (Int,Int)->Int =  {a:Int , b:Int -> a*b }

