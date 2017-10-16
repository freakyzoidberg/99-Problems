package fun.pierre.lists

import org.scalatest.{FunSpec, Matchers}

class P07Test extends FunSpec with Matchers {

  describe("P07 flatten Char List") {
    it("P06 palindrom char element") {
      P07.flatten(List("a", "b", "b", "a")) should be(List("a", "b", "b", "a"))
      P07.flatten(List(List("a", "b"), List("b", "a"))) should be(List("a", "b", "b", "a"))
    }

    it("P07 flatten Int List") {
      P07.flatten(List(1, 2, 3, 2, 1)) should be(List(1, 2, 3, 2, 1))
      P07.flatten(List(List(1, 2), List(3, 2, 1))) should be(List(1, 2, 3, 2, 1))
    }
  }
}
