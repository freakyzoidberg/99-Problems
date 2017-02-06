package fun.pierre.lists

import java.util.NoSuchElementException

import scala.annotation.tailrec

object P05 {
  def reverseElement[T](list: List[T] ): List[T] = list.reverse
}
