
//Declarando valores de las respuestas
const val AFFIRMATIVE_ANSWER = "✅"
const val NEGATIVE_ANSWER = "❌"
const val DOUBTFUL_ANSWER = "?"

//uniendo las respuestas con sus valores
val answers = mapOf(
    "Yes" to AFFIRMATIVE_ANSWER,
    "It's true" to AFFIRMATIVE_ANSWER,
    "Totally" to AFFIRMATIVE_ANSWER,
    "Undoubtedly" to AFFIRMATIVE_ANSWER,
    "Ask in an other moment" to DOUBTFUL_ANSWER,
    "I can't say you in this moment" to DOUBTFUL_ANSWER,
    "Maybe yes, or maybe not" to DOUBTFUL_ANSWER,
    "It's not going to happen" to NEGATIVE_ANSWER,
    "Do not count on it" to NEGATIVE_ANSWER,
    "Definitely not" to NEGATIVE_ANSWER,
    "I don't believe it" to NEGATIVE_ANSWER
)

fun main(args: Array<String>) {

    println("Hola soy tu bola 8 magica en kotlin, cual de estas opciones deseas realizar?")
    println("1. Realizar una pregunta")
    println("2. Revisar todas las respuesta")
    println("3. Salir")

    val valorIngresado = readLine() // devuelve un string nulleable

    when(valorIngresado){
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarUnError()
    }

}

fun mostrarUnError() {
    println("vaya! parece que has elegido una opcion no valida. Intenta de nuevo")
}

fun salir() {
    println("hasta luego")
}

fun mostrarRespuestas() {
    println("Selecciona la opcion")
    println("1 Revisar todas las repsuestas")
    println("2. Revisar solo respuesta afirmativas")
    println("3. Revisar las respuesta dudosas")
    println("4. revisar las respuesta negativas")

    val opcionIngresada = readLine()
    when(opcionIngresada){
        "1" -> mostrarRespuestaPorTipo()
        "2" -> mostrarRespuestaPorTipo(tipoDeRespuesta = AFFIRMATIVE_ANSWER)
        "3" -> mostrarRespuestaPorTipo(tipoDeRespuesta = NEGATIVE_ANSWER)
        "4" -> mostrarRespuestaPorTipo(tipoDeRespuesta = DOUBTFUL_ANSWER)
        else -> println("Respues no validad. Adios")
    }

}

fun mostrarRespuestaPorTipo(tipoDeRespuesta : String = "TODOS") {
    when(tipoDeRespuesta){
        "TODOS" -> answers.keys.forEach{ ans -> println(ans)}
        AFFIRMATIVE_ANSWER -> answers.filterValues { values -> values == AFFIRMATIVE_ANSWER }
            .also { ansAffirmative -> println(ansAffirmative.keys) }
        NEGATIVE_ANSWER -> answers.filterValues { values -> values == NEGATIVE_ANSWER }
            .also { ansNeg -> println(ansNeg.keys) }
        DOUBTFUL_ANSWER -> answers.filterValues { values -> values == DOUBTFUL_ANSWER }
            .also { ansDoubt -> println(ansDoubt.keys) }

    }
}

fun realizarPregunta(){
    println("Que pregunta deseas realizar?")
    readLine()
    println(" asi que esa era tu pregunta... La respuesta es : ")
    val respuestaGenerada = answers.keys.random()
    println(respuestaGenerada)
}