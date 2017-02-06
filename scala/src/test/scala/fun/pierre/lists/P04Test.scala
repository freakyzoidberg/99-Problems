package fun.pierre.lists

import org.scalatest.{FunSpec, Matchers}

class P04Test extends FunSpec with Matchers {

  describe("P04 Number element") {
    it("P04 number char element") {
      val k = P04.numberElement(List("a", "b", "c", "d"))
      k should be(4)
    }

    it("P04 number int element") {
      val k = P04.numberElement(List(1, 2, 3, 4, 5))
      k should be(5)
    }
  }
}
