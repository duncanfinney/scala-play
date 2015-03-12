object P02 extends App {

  def penultimate[A](ls: List[A]): A = ls match {
    case x :: y :: Nil => x
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  
  println(penultimate(List(1, 1, 2, 3, 5, 8)))
}