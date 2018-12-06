//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

object PalindromeNumberLarget {
  def main(args: Array[String]): Unit = {
    println("largest palindrome number is as follows")
    val digits: Int = 3;
    val num: Int = 969;
    var newNum: Int = 1;
    newNum = reverse(num, digits)
    if (newNum == num) println("its an palindrome: " + num) else print("its not a palindrome: " + num)
  }

  def reverse(num: Int, digits: Int): Int = {
    var nums: Int = num;
    val i: Int = 1;
    var ones: Int = nums % 10;
    nums = nums / 10
    var twos: Int = nums % 10;
    nums = nums / 10
    var threes: Int = nums % 10;

    while (digits) {

    }

    return (ones * 100 + twos * 10 + threes)
  }
}