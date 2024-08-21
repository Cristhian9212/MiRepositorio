class OPERACIONES(var n1:Double, var n2:Double) {

    private val resultados = mutableListOf<Double>()

    fun suma(n1:Double, n2:Double){
        var res = n1 + n2
        resultados.add(res)
        println("El resultado de la suma es la siguiente: $res")
    }

    fun resta(n1: Double, n2: Double){
        var res = n1 - n2
        resultados.add(res)
        println("El resultado de la resta es la siguiente: $res")
    }
    fun multi(n1: Double, n2: Double){
        var res = this.n1 * n2
        resultados.add(res)
        println("El resultado de la multiplicacion es la siguiente: $res")
    }
    fun div(n1: Double, n2: Double){
        var res = n1 / this.n2
        resultados.add(res)
        println("El resultado de la division es la siguiente: $res")
    }
    fun raiz(n1:Double, n2: Double){
        var res = Math.sqrt(this.n1)
        resultados.add(res)
        println("El resultado de la raiz es la siguiente: $res")
    }
    fun elev(n1:Double, n2: Double){
        var res = Math.pow(this.n1, this.n2)
        resultados.add(res)
        println("El resultado de la exponencial es la siguiente: $res")
    }
    fun obtenerResultados(): List<Double> {
        return resultados
    }

    override fun toString(): String {
        return "OPERACIONES(n1=$n1, n2=$n2)"
    }

}
