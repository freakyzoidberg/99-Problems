package fun.pierre.lists

import org.scalatest.{FunSpec, Matchers}

class P06Test extends FunSpec with Matchers {

  describe("P06 is a palindrome") {
    it("P06 palindrom char element") {
      P06.isPalindrome(List("a", "b", "b", "a")) should be(true)
      P06.isPalindrome(List("a", "b", "b", "d")) should be(false)
    }

    it("P06 palindrom int element") {
      P06.isPalindrome(List(1, 2, 3, 2, 1)) should be(true)
      P06.isPalindrome(List(1, 2, 3, 4, 5)) should be(false)
    }
  }
}
