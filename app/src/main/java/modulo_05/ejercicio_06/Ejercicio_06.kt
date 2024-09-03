package modulo_05.ejercicio_06

fun main() {
    val miHermosillaCuenta = CuentaBancaria("34332423890", "Luis Hermopillo",0.0)
    miHermosillaCuenta.deposito(500000.0)
    miHermosillaCuenta.retiro(300000.0)
    miHermosillaCuenta.deposito(100000.0)
    miHermosillaCuenta.deposito(2000000.0)
    miHermosillaCuenta.mostrarHistorial()

    val cuenta2 = CuentaBancaria("9876543210", "Pablo Hermosilla", 500.0)
    cuenta2.retiro(10000.0)
    cuenta2.deposito(200000.0)
    cuenta2.retiro(30000.0)
    cuenta2.deposito(300.0)
    cuenta2.mostrarHistorial()

    val cuenta3 = CuentaBancaria("5554443332", "Juan Hermosilla",2000.0)
    cuenta3.deposito(1002220.0)
    cuenta3.retiro(5055330.0)
    cuenta3.deposito(20220.0)
    cuenta3.retiro(10330.0)


    val cuenta4 = CuentaBancaria("1112223334", "Mama Hermosilla", 100.0)
    cuenta4.retiro(50.0)
    cuenta4.deposito(10220.0)
    cuenta4.retiro(2013.0)
    cuenta4.deposito(2043230.0)

}