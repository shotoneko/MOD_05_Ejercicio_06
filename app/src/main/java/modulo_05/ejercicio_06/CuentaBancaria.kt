package modulo_05.ejercicio_06
import java.text.NumberFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

class CuentaBancaria(val numeroCuenta: String,
                     val titularCuenta:String,
                     saldoInicial: Double = 0.0) {

    private var saldo: Double = saldoInicial
    private val historial: MutableList<String> = mutableListOf()
    init {
        val fechaHoraActual = LocalDateTime.now()
        val formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
        val fechaHoraFormateada = fechaHoraActual.format(formato)
        historial.add("Cuenta número: $numeroCuenta creada con éxito el dia $fechaHoraFormateada")
        historial.add("Saldo inicial: ${formatMoney(saldoInicial)} pesos")
    }
    fun formatMoney(cantidad: Double): String {
        val formatoCLP = NumberFormat.getCurrencyInstance(Locale("es", "CL"))
        return formatoCLP.format(cantidad) + " pesos."
    }

    fun deposito(cantidad: Double) {
        if (cantidad > 0.0) {
            saldo += cantidad
            historial.add("${titularCuenta} depositó: (+) ${formatMoney(cantidad)}")
        } else {
            historial.add("Error: Depósito inválido")
        }
    }

    fun retiro(cantidad: Double) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad
            historial.add("${titularCuenta} retiró: (-) ${formatMoney(cantidad)}")
        } else {
            historial.add("Error: Retiro inválido")
        }
    }

    fun mostrarSaldo() {
       println("Saldo actual es : ${formatMoney(saldo)}")
    }

    fun mostrarHistorial() {
        println("--------------------------------------------------------------")
        println("Historial de la cuenta: $numeroCuenta, del Sr. $titularCuenta")
        println("--------------------------------------------------------------")
        historial.forEach { println(it) }
        mostrarSaldo()
    }
}