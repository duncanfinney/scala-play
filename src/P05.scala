object P05 {
  
  def reverseList[A](xs: List[A]) : List[A] = xs.reverse
  
  val list1 = List(1,2,3)
  
  assert(reverseList(list1) == List(3,2,1))
}