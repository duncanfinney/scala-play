object P13 extends App {
  def encodeDirect[A](xs : List[A]) : List[(Int, A)] = {
    if (xs.isEmpty) Nil //end of list
    else {
      val (spanning, tail) = xs span { _ == xs.head }
      (spanning.length, spanning.head) :: encodeDirect(tail)
    }
  }
  
  val test = encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  val res = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  
  println(test)
  assert(test == res)
  
}