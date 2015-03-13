object P21 extends App {

  def insertAt[A](toInsert: A, idx: Int, xs: List[A]) = xs.take(idx) ::: toInsert :: xs.drop(idx)

  val res = insertAt('new, 1, List('a, 'b, 'c, 'd));
  val test = List('a, 'new, 'b, 'c, 'd)

  println(res)
  assert(res == test)
}