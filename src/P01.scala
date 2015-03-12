object P01 extends App {
  
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
  
  println(lastRecursive(List(1, 2, 3, 4)))
}
