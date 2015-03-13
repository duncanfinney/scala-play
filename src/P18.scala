object P18 extends App {

  def slice[A](start: Int, end: Int, xs: List[A]): List[A] = xs.drop(start).take(end - start)

  val test = slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val res = List('d, 'e, 'f, 'g)

  println(test)
  assert(test == res)

}