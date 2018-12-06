// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

object Multiple {
  def main(args: Array[String]): Unit = {
    val n: Int = 10;
    for {i <- 1 to n if i % 3 == 0 || i % 5 == 0} yield {
      println(i)
    }
  }
}


