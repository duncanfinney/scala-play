object P07 extends App {
  def flattenList(xs : List[Any]): List[Any] = xs flatMap {
    case x : List[_] => flattenList(x)
    case v => List(v)
  }
  
  val test = flattenList(List(1,2,List(3)))
  assert(test == List(1,2,3))
  
}