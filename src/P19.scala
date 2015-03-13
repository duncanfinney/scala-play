object P19 extends App {

  def rotate[A](n: Int, xs: List[A]): List[A] = {
    val partitionAt =
      if (xs.isEmpty) 0
      else n % xs.length

    if (partitionAt < 0) rotate(partitionAt + xs.length, xs)
    else (xs drop partitionAt) ::: (xs take partitionAt)
  }

  val test = rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val res = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

  println(test)
  assert(test == res)
}