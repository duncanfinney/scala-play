object P03 extends App {

  def nth[A](n : Int, ls: List[A]) : A = (n, ls) match {
    case (0, h :: _   ) => h
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, nil      ) => throw new NoSuchElementException
  }
  
  println(nth(2, List(0,1,2)))
  
}