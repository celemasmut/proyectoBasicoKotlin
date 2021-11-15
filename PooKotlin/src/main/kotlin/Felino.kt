 open class Felino (tipoFelino: String,
                    cantidadOjos: Int,
                    cantidadPatas: Int,
                    colorPelo: String,
                    peso: Double,
                    imagen: String){

     //Propiedades de la clase
     var tipoFelino: String = ""
     var cantidadOjos: Int = 0
     var cantidadPatas: Int = 0
     var colorPelo: String = ""
     var peso: Double = 0.0
     var imagen: String = ""

     init {
         this.tipoFelino= tipoFelino
         this.cantidadOjos= cantidadOjos
         this.cantidadPatas= cantidadPatas
         this.colorPelo = colorPelo
         this.peso=peso
         this.imagen = imagen
     }


     //Metodos de la clase

     fun comer() {
         println("El felino esta comiendo")
     }

     fun correr() {
         println("El felino esta corriendo")
     }

     fun cazar() {
         println("El felino esta cazando")
     }

     override fun toString(): String {
         return "Felino(tipoFelino='$tipoFelino', cantidadOjos=$cantidadOjos, cantidadPatas=$cantidadPatas, colorPelo='$colorPelo', peso=$peso, imagen='$imagen')"
     }


 }

