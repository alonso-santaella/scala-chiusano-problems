object Currying {
  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    (a: A) => ((b: B) => f(a,b))
  }
  def uncurry[A,B,C](f: A => (B => C)): (A, B) => C = {
    (a: A, b: B) => f(a)(b) 
  }
  def main(args: Array[String]): Unit = {
    def c(a: String, b: String): String = a.concat(b)

    val f = curry(c)
    val hello = f("Hello, ")
    println(hello("world!"))
    println(hello("curry!"))

    val g = uncurry(f)
    println(g("Hello, ", "uncurry!"))
  }
}
