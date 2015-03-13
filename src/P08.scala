object P08 extends App {
  def removeConsecutiveDuplicates(xs : List[Any]) : List[Any] = xs match {
    case x::y::tail if x == y => List(x) ++ removeConsecutiveDuplicates(tail)
    case x::tail              => List(x) ++ removeConsecutiveDuplicates(tail)
    case Nil                  => Nil 
  }
  
  val test = removeConsecutiveDuplicates(List(1,2,2,3,3))
  assert(test == List(1,2,3))
}