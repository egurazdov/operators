const val PI = 3.14
fun main() {
    val sideA = 8
    val sideB = 11
    val perimeter = 4 * sideA
    val square = sideA * sideA
    val perimeterRec = 2 * (sideA + sideB)
    val squareRec = sideA * sideB
    val diameter = 98
    val lenght = PI * diameter
    val l = 345
    val lenghtInM = l / 100
    val a = 456
    val b = 19
    val c = a / b

    println(
        "Psq = " + perimeter + " | Ssq = " + square + " | Prec = " + perimeterRec + " | Srec = " + squareRec + " | Lcir=" + lenght + " | L=" + lenghtInM + " | A=" + c
    )
}