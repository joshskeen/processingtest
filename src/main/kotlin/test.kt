import processing.core.PApplet
import java.lang.Math.*

class MyTest : PApplet() {

    override fun settings() {
        super.settings()
        size(500, 500)
    }

    override fun draw() {
        super.draw()
        draw_circle()
    }

    fun draw_circle() {
        var x: Double
        var y: Double

        val length = 50.0
        var angle = 0.0
        val angle_stepsize = 0.1

        // go through all angles from 0 to 2 * PI radians
        while (angle < 2 * Math.PI) {
            // calculate x, y from a vector with known length and angle
            x = length * cos(angle)
            y = length * sin(angle)

//            putpixel(screen,
//                    x + SCREEN_W / 2, y + SCREEN_H / 2,
//                    makecol(255, 255, 255))

            point(x.toFloat() + sketchWidth() / 2, y.toFloat() + sketchHeight() / 2)

            angle += angle_stepsize
        }
    }

}

fun main(args: Array<String>) {
    PApplet.main(arrayOf("MyTest"))
}

