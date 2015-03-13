object P14 extends App {
  def duplicate[A](xs: List[A]): List[A] = xs flatMap (x => List(x, x))

  val test = duplicate(List('a, 'b, 'c, 'c, 'd))
  val res = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

  println(test)
  assert(test == res)
}