object P06 {
  def isPalendrome[A](xs : List[A]) : Boolean = xs.reverse == xs 
  
  assert(isPalendrome(List(1,2,3)) == false)
  assert(isPalendrome(List(1,2,1)) == true)
}