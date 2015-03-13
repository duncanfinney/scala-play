object P15 extends App {
  def duplicateN[A](times: Int, xs: List[A]): List[A] = xs flatMap (x => List.fill(times)(x))

  val test = duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  val res = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

  println(test)
  assert(test == res)
}