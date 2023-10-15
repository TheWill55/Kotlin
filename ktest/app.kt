fun calcularMedia(vararg numeros: Double): Double {
    if (numeros.isEmpty()) {
        throw IllegalArgumentException("A lista de números não pode estar vazia.")
    }
    var soma = 0.0
    for (numero in numeros) {
        soma += numero
    }
    return soma / numeros.size
}

fun main() {
    try {
        val media = calcularMedia(5.0, 7.0, 10.0, 3.0)
        println("A média dos números é: $media")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

