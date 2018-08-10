object Tail {
  
  import List._

  def tail[A](l: List[A]): List[A] = {
    
    l match {
      case Nil => Nil
      case Cons(x,xs) => xs
    }
  }

  def main(args: Array[String]): Unit = {
    
   val x = List(1,2,3,4,5,6)
   val y = List("this","is","a","list")

   println(tail(x))
   println(tail(y))

  }
}

