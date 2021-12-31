import scala.io.Source

object SonarSweep1 {
    def main(args: Array[String]) = {
        var prevDepth = Int.MaxValue
        var increases = 0

        for (line <- Source.fromFile("input.txt").getLines()) {
            val curDepth = line.toInt
            if (curDepth > prevDepth)
                increases += 1
            prevDepth = curDepth
        }

        println(increases)
    }
}

 