class motor {
    // private só pode ser utilizado de dentro do motor
   private var ligado: Boolean = false
   private var nivelCombustivel: Int = 2
    fun ligar(){
        
        ligado = true
    }
    fun desligar(){
        
        ligado = false
    }
    fun estaligado(): Boolean{
        return (ligado)
    }
    
    fun temCombustivel(): Boolean{
        return nivelCombustivel > 0
    }
    
    fun gastandoCombustivel(){
        println("gastando combustivel, nivel agora é: $nivelCombustivel")
        nivelCombustivel--
    }
}

class Carro(private val motor: motor ) {
 
    
    var cor: String? = null
    fun ligar( ) {
        println("Ligando o carro..")
        motor.ligar()
    }
    fun desligar(){
        println("desligando o carro...")
        motor.desligar()
    }
    fun anda() {
        if (motor.estaligado() && motor.temCombustivel()){
            println("carro andando: vruun vruunn!")
            }
            else if(!motor.temCombustivel()) {
            println("Impossivel ligar o carro, falta de combustivel")
        } else {
                println("liga o carro primeiro né")
            }
            
            motor.gastandoCombustivel()
    }
    
    fun buzina() {
        println("##@$!!!$!")
    }
}
fun main(){
    val motor = motor()
    val carro = Carro(motor)
    carro.ligar()
    carro.anda()
    carro.anda()
    carro.anda()
}