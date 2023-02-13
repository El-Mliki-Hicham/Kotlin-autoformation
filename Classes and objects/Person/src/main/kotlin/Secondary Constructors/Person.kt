package `Secondary Constructors`

class Person{
constructor(name:String,age:Int,city:String){
    println("my name is $name am $age years old and i live in $city ")
}
    constructor():this("amine",12,"tanger"){
print("secondary constracture ")
    }

    //fun AddPerson(){
     //println("my name is $name am $age years old and i live in $city ")

    //}
    init {
        println("aquarium initializing")
    }

}