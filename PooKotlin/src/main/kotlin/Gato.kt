class Gato: Felino { // herencia

    constructor(tipoFelino: String,
                 cantidadOjos: Int,
                 cantidadPatas: Int,
                 colorPelo: String,
                 peso: Double,
                 imagen: String,):super(tipoFelino,cantidadOjos,cantidadPatas,colorPelo,peso,imagen)

    var ronroneo : Boolean = true

    fun mataRatones(): Unit{
        println("Extermine a los ratones de la casa")
    }

    override fun toString(): String {
        return super.toString() + "Gato(ronroneo=$ronroneo)"
    }


}