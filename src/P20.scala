object P20 extends App {
  def removeAt[A](n: Int, xs: List[A]): (List[A], A) = {
    (xs.take(n) ++ xs.drop(n + 1), xs(n))
  }

  val test = removeAt(1, List('a, 'b, 'c, 'd))
  val res = (List('a, 'c, 'd), 'b)

  println(test)
  assert(res == test)
}