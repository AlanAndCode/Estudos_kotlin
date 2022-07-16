class motor {
    // private só pode ser utilizado de dentro do motor
   private var ligado: Boolean = false
    
    fun ligar(){
        
        ligado = true
    }
    fun desligar(){
        
        ligado = false
    }
    fun status(): String{
        return if (ligado) "ligado" else "desligado"
    }
}

class carro {
    
    var cor: String? = null
    fun partida(){
        println("Carro deu partida:vruun vrrunnnn")
    }
    fun anda(){
        println("Carro anda: Vishh deu problema")
    fun freia(){
        println("Freiando o Carro")
    }
    fun buzina() {
        println("##@$!!!$!")
    }
    
    }
}
fun main(){
    val motor = motor()
    motor.ligar()
    println("motor esta ${motor.status()}")
    motor.desligar()
    println("motor esta ${motor.status()}")
}