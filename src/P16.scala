object P16 extends App {

  def drop[A](every: Int, xs: List[A]): List[A] = {
    xs
      .zipWithIndex
      .filter {
        x => (x._2 + 1) % every != 0
      }
      .map { _._1 }
  }

  val test = drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val res = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

  println(test)
  assert(test == res)

}