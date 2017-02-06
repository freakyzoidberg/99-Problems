package fun.pierre.lists

import org.scalatest.{FunSpec, Matchers}

class P05Test extends FunSpec with Matchers {

  describe("P05 reverse element") {
    it("P05 reverse char element") {
      val k = P05.reverseElement(List("a", "b", "c", "d"))
      k should be(List("d", "c", "b", "a"))
    }

    it("P05 reverse int element") {
      val k = P05.reverseElement(List(1, 2, 3, 4, 5))
      k should be(List(5, 4, 3, 2, 1))
    }
  }
}
