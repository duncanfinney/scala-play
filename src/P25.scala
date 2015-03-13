

import scala.util.Random

object P25 extends App {
  def randomPermute(ls: List[Symbol]): List[Symbol] = {
    import scala.util.Random
    return Random.shuffle(ls)
  }

  randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
}