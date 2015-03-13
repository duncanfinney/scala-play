object P22 extends App {
  def range(min: Int, max: Int): List[Int] = Range(min, max + 1).toList

  val res = range(4, 9)
  val test = List(4, 5, 6, 7, 8, 9)

  print(res)
  assert(res == test)
}