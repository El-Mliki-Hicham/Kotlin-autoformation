package Constructors

class Person(name:String, age: Int , city : String) {
    var name : String = name
    var age : Int = age
    var city :String=city


    fun AddPerson(){
     println("my name is $name am $age years old and i live in $city ")

}
    init {
        println("aquarium initializing")
    }

}