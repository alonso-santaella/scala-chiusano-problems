object SetHead {
  
  import List._

  def setHead[A](l: List[A], h: A): List[A] = {
    
    l match {
      case Nil => Nil
      case Cons(x,xs) => Cons(h, xs)
    }
  }

  def main(args: Array[String]): Unit = {
    
   val x = List(1,2,3,4,5,6)
   val y = List("this","is","a","list")

   println(setHead(x,0))
   println(setHead(y,"that"))

  }
}

