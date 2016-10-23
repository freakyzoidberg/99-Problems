package fun.pierre.lists

import java.util.NoSuchElementException

import scala.annotation.tailrec

object P02 {

  @tailrec
  def lastAndPenultimateRecursion[T](list: List[T]): List[T] = list match {
    case x :: y :: Nil => x :: y :: Nil
    case _ :: x :: y => lastAndPenultimateRecursion(x :: y)
    case _ => throw new NoSuchElementException("list is empty")
  }
}
