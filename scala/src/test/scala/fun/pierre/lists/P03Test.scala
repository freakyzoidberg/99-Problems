package fun.pierre.lists

import org.scalatest.{FunSpec, Matchers}

class P03Test extends FunSpec with Matchers {

  describe("P03 kTh element") {
    it("P03 first element") {
      val k = P03.kThElement(List("a", "b", "c", "d"), 1)
      k should be("a")
    }

    it("P03 third element") {
      val third = P03.kThElement(List("a", "b", "c", "d"), 3)
      third should be("c")
    }

    it("P03 past last element") {
      intercept[NoSuchElementException] {
        P03.kThElement(List("a", "b", "c", "d"), 7)
      }
    }
  }
}
