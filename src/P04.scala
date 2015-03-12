object P04 extends App {
  
  def countList[A](xs: List[A]) : Int = xs match {
    case _ :: tail => 1 + countList(tail)
    case Nil       => 0 
  }
  
  assert(countList(List(1,2,3)) == 3)
  assert(countList(List(1,2,3,4)) == 4)
}