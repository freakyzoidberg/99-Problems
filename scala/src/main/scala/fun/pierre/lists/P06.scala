package fun.pierre.lists

import scala.annotation.tailrec


object P06 {

  @tailrec
  def isPalindrome[T](l: List[T]) : Boolean = {
    l match {
      case Nil => true
      case List(a) => true
      case list => list.head == list.last && isPalindrome(list.tail.init)
    }
  }
}
