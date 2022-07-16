/** 
 o que é uma classe?
 uma class visa reutilzar um codigo, utilizando um modelo de como seguir determinado metodo.
 
 classe abstrata?
 representam algo, mas nao implementam algo.
 
 herança?
 
 funçao?
 tem entrada e saida
 
 
 
 */
class motorCombustivel : motor() {
    // private só pode ser utilizado de dentro do motor
   private var nivelCombustivel: Int = 2
    
    
   override fun gastando(){
        println("gastando combustivel, nivel agora é: $nivelCombustivel")
        nivelCombustivel--
    }
    // herança faz que se torne obrigatorio pelo motores utilizar a funçao de autonomia
    
    override fun temAutonomia(): Boolean{
        return nivelCombustivel > 0
    }
    
}

 class motorEletrico : motor() {
    // private só pode ser utilizado de dentro do motor
   
   private var nivelBateria: Int = 2
    
    override fun gastando(){
        println("gastando energia, nivel agora é: $nivelBateria")
        nivelBateria--
    }
    
    // herança faz que se torne obrigatorio pelo motores utilizar a funçao de autonomia
    
    override fun temAutonomia(): Boolean{
        return nivelBateria > 0
    }
    
}
// herança usaremos as caracterissticas semelhantes entre os motores em uma classe só
abstract class motor{
    
    private var ligado: Boolean = false
    
    fun ligar(){
        
        ligado = true
    }
    fun desligar(){
        
        ligado = false
    }
    fun estaligado(): Boolean{
        return (ligado)
    }
    // funçao para o tem autonomia conseguir pegar valores das 2 autonomias do motor
    abstract fun temAutonomia(): Boolean
    
    abstract fun gastando()
}

class Carro(private val motor: motor ) {
 
    fun ligar( ) {
        println("Ligando o carro..")
        motor.ligar()
    }
    fun desligar(){
        println("desligando o carro...")
        motor.desligar()
    }
    fun anda() {
        when {
            !motor.estaligado() -> println("Ligar o carro")
            !motor.temAutonomia() -> {
                println("coloca a bateria pra carregar ne")
            desligar()
            }
            else -> {
                motor.gastando()
                when(motor) {
                    is motorEletrico -> println("carro andando")
                    is motorCombustivel -> println("carro andando: vrum vrum")
                }
               
            }
        }  
        }
    fun buzina() {
        println("##@$!!!$!")
    }
}
fun main(){
    val motorEletrico = motorEletrico()
    val carro = Carro(motorEletrico)
    carro.ligar()
    carro.anda()
    carro.anda()
    carro.anda()
    
}