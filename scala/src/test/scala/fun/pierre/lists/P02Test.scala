package fun.pierre.lists

import org.scalatest.{FunSpec, Matchers}

class P02Test extends FunSpec with Matchers {

  describe("P02 List recursive method") {
    it("should the last two element") {
      val last = P02.lastAndPenultimateRecursion(List("a", "b", "c", "d"))
      last should be(List("c", "d"))
    }

    it("should the only last two element") {
      val last = P02.lastAndPenultimateRecursion(List("c", "d"))
      last should be(List("c", "d"))
    }
  }
}
