//TODO: Implement my own. Copied because got stuck. 

object P09 extends App {
  def packConsecutiveDuplicates[A](xs : List[A]) : List[List[A]] = {
    if (xs.isEmpty) List(List())
    else {
      val (packed, next) = xs span (_ == xs.head)
      if (next == Nil) List(packed)
      else packed :: packConsecutiveDuplicates(next)
    }
  }
  
  val test = packConsecutiveDuplicates(List(1,2,2,3,4))
  assert(test == List(List(1), List(2,2), List(3), List(4)))
}