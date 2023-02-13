fun main() {
    println(" ajouter un nom : ")
    var value:String = readLine()!!
    AddPerson(value)


    var id:Int = 0

}


    fun AddPerson(params:String){
        var table = mutableListOf("hicham")

        table += params

        table.remove("hicham")
        print("List")
        for(value in table) {
            println(value)
        }

        }