package fun.pierre.lists

import scala.annotation.tailrec


object P07 {

  def flatten[T](l: List[Any]) : List[Any] = {
    l.flatMap( el => el match {
      case xs: List[Any] => flatten(xs)
      case _ => List(el)
    })
  }
}
