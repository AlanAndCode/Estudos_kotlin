class DogBad constructor(
    //construtor  para utilizar donos diferentes otimizando codigo
   private val ownerName: String ){
    
    var name: String? = null
    
    fun sayHi(){
        println("Hi $ownerName, my name is $name")
    }
    
    
}

fun main(){
    val DogBad = DogBad("Alan")
    DogBad.name = "Linux"
    DogBad.sayHi()
    
    val DogBads = DogBad("Sarah")
    DogBads.name = "Android"
    DogBads.sayHi()
      
}