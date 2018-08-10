object CheckSorted {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n < as.length-1) { 
        if (ordered(as(n),as(n+1))) loop(n+1)
        else false
      }
      else true
    }
    loop(0)
  }
  def main(args: Array[String]): Unit = {
    def printSorted(p: Boolean): Unit = {   
      if (p) println("The array is ordered")
      else println("The array is not ordered")
    }
    val a = isSorted(Array(1,2,5,3,12,78,90,203,459), (i: Int,j: Int) => i<=j)
    val b = isSorted(Array("Hola","Mundo","Palabra","Matenme"), (i: String, j: String) => i.length <= j.length)
    printSorted(a)
    printSorted(b)
  }
}
