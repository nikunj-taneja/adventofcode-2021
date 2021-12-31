import scala.io.Source

object SonarSweep2 {
    def main(args: Array[String]) = {
        val lines = (Source.fromFile("input.txt").getLines()).toArray
        var window = 0

        for (i <- 0 to 2) {
            window += lines(i).toInt
        }

        var increases = 0
        var prevDepth = lines(0).toInt
        
        for (i <- 3 to (lines.length - 1)) {
            val curDepth = lines(i).toInt
            if (window - prevDepth + curDepth > window)
                increases += 1
            prevDepth = lines(i-2).toInt
        }

        println(increases)
    }
}