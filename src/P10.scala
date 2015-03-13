object P10 extends App {
  import P09.packConsecutiveDuplicates
  
  def runLength(xs : List[Symbol]) : List[(Int, Symbol)] = {
    packConsecutiveDuplicates(xs) map { l => (l.length, l.head) }
  }
  
  val test = runLength(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  assert(test ==  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
}