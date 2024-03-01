class Triangle(
    private val base: Double,
    private val height: Double,
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double
) {
    // Metode untuk menghitung luas segitiga
    fun wide(): Double {
        return 0.5 * base * height
    }

    // Metode untuk menghitung keliling segitiga
    fun around(): Double {
        return sideA + sideB + sideC
    }
}