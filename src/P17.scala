object P17 extends App {

  def split[A](n: Int, xs: List[A]): (List[A], List[A]) = (xs.take(n), xs.drop(n))

  val test = split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val res = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

  println(test)
  assert(test == res)

}