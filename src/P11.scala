object P11 extends App {
  import P10.runLength

  def encodeModified(xs: List[Symbol]): List[Any] = {
    runLength(xs) map { x =>
      if (x._1 == 1) x._2
      else x
    }
  }

  val test = encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  assert(test == List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e)))
  println(test)
}