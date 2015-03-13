

import scala.Range
import scala.util.Random

object P24 extends App {
  
  def lotto(num: Int, rangeMax: Int): List[Int] = {
   import scala.util.Random
   Random.shuffle(Range(1,rangeMax + 1).toList) take num
  }

  val res = lotto(6, 49)
  println(res)
}