fun main() {
    println("ajouter un numbre")
    val rows = 4
    var i = rows - 1
    var j: Int
    var space: Int
    while (i >= 0) {
        space = rows - 1
        while (space > i) {
            print(" ")
            space--
        }
        j = 0
        while (j < i + 1) {
            print("* ")
            j++
        }
        println("")
        i--
    }
}