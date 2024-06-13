import kotlin.math.PI
import kotlin.math.sqrt

open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    fun calculateMaxCarpetLength(): Double {
        return sqrt(2.0) * radius
    }
    override fun floorArea(): Double {
        return PI * radius * radius
    }
}