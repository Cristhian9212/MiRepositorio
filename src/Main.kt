fun main() {
    val OP = OPERACIONES(5.0, 7.2)
    OP.suma(5.0, 4.0)
    OP.resta(9.0, 3.0)
    OP.multi(3.0, 2.0)
    OP.div(12.1, 5.5)
    OP.raiz(4.0)
    OP.elev(4.0, 7.0)

    val resultados = OP.obtenerResultados()
    println("\nLista de resultados: $resultados")
}

