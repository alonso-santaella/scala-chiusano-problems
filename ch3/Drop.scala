object Drop {

  import List._

  def tail[A](l: List[A]): List[A] = {

    l match {
      case Nil => Nil
      case Cons(x,xs) => xs
    }
  }

  def drop[A](l: List[A], n: Int): List[A] = {

    def step[A](l: List[A], i: Int): List[A] = {

      if (l==Nil || i==0) l
      else step(tail(l), i-1)
    }
    step(l, n)
  }
  def main(args: Array[String]): Unit = {

    val x = List(1,2,3,4,5,6,7,8,9,10,11,12)
    val y = List("a","b","c","c","d","e","f")

    println(drop(x,7))
    println(drop(x,11))
    println(drop(x,12))
    println(drop(x,13))
    println(drop(y,3))

  }
}
