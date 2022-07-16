fun main() {
    val grade = (0..10).random()
    println(grade.getStudentStatus())
    
}
 
 fun Int.getStudentStatus():String{
     println("Nota $this")
     return when(this){
     in 0..4->"Reprovado"    
     in 5..7->"Mediano"
     in 8..9->"Bom"
      10->"Excelente"
         else -> "Indefinido"
     }
     
 }