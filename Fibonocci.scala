//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//
//  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms


object Fibonocci {
  def main(args: Array[String]): Unit = {
    val n: Int = 10;
    var last: Int = 0;
    var lastbefore: Int = 0;
    var newVal: Int = 0;
    for (a <- 2 to n) {
      if (a == 2) {
        last = 2;
        lastbefore = 1;
        println(lastbefore)
        println(last)
      }
      else {
        newVal = last + lastbefore
        println(newVal)
        lastbefore = last;
        last = newVal;

      }
    }
  }
}