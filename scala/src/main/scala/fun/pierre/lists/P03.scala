package fun.pierre.lists

import java.util.NoSuchElementException

import scala.annotation.tailrec

object P03 {

  @tailrec
  def kThElement[T](list: List[T], k: Int, counter: Int = 1): T = counter match {
    case `k` => list.head
    case _ if list.nonEmpty => kThElement(list.drop(1), k, counter + 1)
    case _ => throw new NoSuchElementException("k past list length")
  }
}
