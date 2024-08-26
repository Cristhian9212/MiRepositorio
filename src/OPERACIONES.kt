data class OPERACIONES(var n1: Double, var n2: Double) {

    private val resultados = mutableListOf<Double>()

     fun suma(n1: Double, n2: Double) {
        val res = n1 + n2
        resultados.add(res)
        println("El resultado de la suma es: $res")
    }

    fun resta(n1: Double, n2: Double) {
        val res = n1 - n2
        resultados.add(res)
        println("El resultado de la resta es: $res")
    }

    fun multi(n1: Double, n2: Double) {
        val res = this.n1 * n2
        resultados.add(res)
        println("El resultado de la multiplicación es: $res")
    }

    fun div(n1: Double, n2: Double) {
        if (n2 != 0.0) {
            val res = n1 / this.n2
            resultados.add(res)
            println("El resultado de la división es: $res")
        } else {
            println("Error: No se puede dividir entre cero.")
        }
    }

    fun raiz(n1: Double) {
        val res = Math.sqrt(this.n1)
        resultados.add(res)
        println("El resultado de la raíz es: $res")
    }

    fun elev(n1: Double, n2: Double) {
        val res = Math.pow(this.n1, this.n2)
        resultados.add(res)
        println("El resultado de la exponencial es: $res")
    }

    fun obtenerResultados(): List<Double> {
        return resultados
    }
}