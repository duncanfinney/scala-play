object P12 extends App {

  def decode[A](ls: List[(Int, A)]): List[A] =
    ls flatMap { e => (1 to e._1) map { _ => e._2 } }

  val test = decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  println(test)
  assert(test == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
}