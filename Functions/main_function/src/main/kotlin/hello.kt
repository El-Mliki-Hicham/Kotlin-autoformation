fun main(args: Array<String>) {
    println("Hello World!")
    temperature()
}
fun temperature(){
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
    println(isHot)
}