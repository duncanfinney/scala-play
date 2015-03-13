object P23 extends App {
  import scala.util.Random
  def randomSelect[A](n :Int, xs: List[A]) = Random.shuffle(xs).take(n)
  
  val res = randomSelect(1, List(1,2,3))
  print(res)
  
  assert(res.length == 1)
  
}