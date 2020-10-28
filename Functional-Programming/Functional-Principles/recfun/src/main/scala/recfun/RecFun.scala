package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }

    def example = "(a()m)bold".toList
    if (balance(example)) println("Balanced String")
    else println("Unbalanced")

    println(countChange(4, List(1,2)))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def checker(chars: List[Char], count: Int): Boolean =
      if (chars.isEmpty) count == 0
      else if (chars.head == '(') checker(chars.tail, count + 1)
      else if (chars.head == ')') count > 0 && checker(chars.tail, count - 1)
      else checker(chars.tail, count)

    checker(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    def loop(acc: Int, money: Int, coins: List[Int]): Int = {
      if (money == 0)  1
      else if (money < 0)  0
      else if (acc <= 0 && money > 0)  0
      else loop(acc - 1, money, coins) + loop(acc, money - coins(acc - 1), coins)
    }

    loop(coins.length, money, coins)
  }

}
