
    fun main() {
        println("ajouter un numbre")
        val rows= readLine()!!.toInt();
        var i: Int=0
        var j: Int
        var space: Int
        while (i<rows)
        {
            space=i
            while (space<rows)
            {
                print(" ")
                space++
            }
            j=0
            while (j<i+1)
            {
                print("* ")
                j++
            }
            println("")
            i++
        }

    }
