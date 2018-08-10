object Fibonacci {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, a: Int, b: Int): Int = {
      if (n == 1) a
      else if (n == 2) b
      else go(n-1, b, a+b)
    }
    go(n,0,1)
  }

  def main(args: Array[String]): Unit = {
    val n = args(0).toInt
    println(fib(n))
  }
}
