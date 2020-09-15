package self.learning

import java.util

object CodingClubProblem {

  def main(args: Array[String]): Unit = {

    val input: Int = 6
    val size: Int = input
    val arrayData: Array[Int] = new Array[Int](input)

    for (i <- 0 until (size/2)) {
      arrayData(i) += (i+1) * -1
    }

    if (input % 2 != 0) {
      for (i <- (size/2) until size ) {
        arrayData(i) += i - (size/2)
      }
    } else {
      for (i <- (size/2) until size) {
        arrayData(i) += i - ((size / 2) - 1)
      }
    }

    println(util.Arrays.toString(arrayData))

  }

}
