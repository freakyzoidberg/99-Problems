package fun.pierre.lists

import java.util.NoSuchElementException
import scala.annotation.tailrec

object P01 {

  /*
  Using the built in last function of a list
  */
  def last[T](list: List[T]): T = list.last

  /*
  Using tail recursion we ignore the first element until we have a list with only one element
  */
  @tailrec
  def lastRecursion[T](list: List[T]): T = list match {
    case x :: Nil => x
    case _ :: xs => lastRecursion(xs)
    case _ => throw new NoSuchElementException("list is empty")
  }

}
