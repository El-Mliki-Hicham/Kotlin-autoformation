


interface Gestion {
    fun menu()
    fun Ajouter()
    fun Supprimer()
    fun Afficher()
}
 class Produits(): Gestion{
     override fun menu() {
         println("gestion des produits")
         println("1.Ajouter")
         println("2.Afficher")
         println("3.Supprimer")
         println("4.Sortie")
         println("-----------")
         print("Choisie un nombre : ")
     }
     val Table = mutableListOf<String>()



    override fun Afficher() {
        println(Table)
    }

    override fun Ajouter() {
        println("Ajouter un produit")
        var value: String = readLine()!!.toString()
        Table.add(value)
    }

    override fun Supprimer() {
        println("Supprimer un produit")
        var value: String = readLine()!!.toString()
        Table.remove(value)
    }


}