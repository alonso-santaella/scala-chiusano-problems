object Composition {
  def compose[A,B,C](f: A => B, g: B => C): A => C = {
    (a: A) => (g(f(a))) 
  }
  def main(args: Array[String]): Unit = {
    val f = compose((x: Int) => x+2, (x: Int) => x*x) 
    println(f(2),f(3),f(4))
  }
}
