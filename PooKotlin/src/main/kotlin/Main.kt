fun main(args: Array<String>) {

    val miFelino = Felino("salvaje",2,4,"gris",5.6,"kuak")

    val urlImagenFelino = miFelino.imagen

    println("La imagen del felino se encuentra en ${miFelino.imagen}")

    val miGato = Gato("domestico",2,4,"gris",5.6,"cualka")
    println(miGato.toString())
    miGato.mataRatones()

}