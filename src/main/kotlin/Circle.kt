import kotlin.math.PI

class Circle(val radius: Double) {
    fun calculateArea(): Double {
        return PI * radius * radius
    }

    fun calculateCircumference(): Double {
        return 2 * PI * radius
    }
}