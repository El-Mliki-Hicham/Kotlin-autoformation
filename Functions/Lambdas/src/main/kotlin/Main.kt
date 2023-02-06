fun main(args: Array<String>) {
    var dirtyLevel = 6
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))
}