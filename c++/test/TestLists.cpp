#include <catch.hpp>
#include <Lists.h>

TEST_CASE( "Should return last int of an int list", "[lastOfIntList]" ) {
  std::list<int> dummy = {1, 2, 3, 4, 5};
  REQUIRE(Lists::returnLast<int>(dummy) == 5);
}

TEST_CASE( "Should return last char of a char list", "[lastOfCharList]" ) {
  std::list<char> dummy = {'a', 'b', 'c', 'd'};
  REQUIRE(Lists::returnLast<char>(dummy) == 'd');
}

TEST_CASE( "Should return last and penultimate int of an int list", "[lastAndPenultimateOfIntList]" ) {
  std::list<int> dummy = {1, 2, 3, 4, 5};
  std::list<int> res = {4, 5};
  REQUIRE(Lists::returnLastAndPenultimate<int>(dummy) == res);
}

TEST_CASE( "Should return last and penultimate char of a char list", "[lastAndPenultimateOfCharList]" ) {
  std::list<char> dummy = {'a', 'b', 'c', 'd'};
  std::list<char> res = {'c', 'd'};
  REQUIRE(Lists::returnLastAndPenultimate<char>(dummy) == res);
}

TEST_CASE( "Should return kth int of an int list", "[kThElement]" ) {
  std::list<int> dummy = {1, 2, 3, 4, 5};
  int res = 3;
  REQUIRE(Lists::kThElement<int>(dummy, 3) == res);
}

TEST_CASE( "Should return kth char of a char list", "[kThElement]" ) {
  std::list<char> dummy = {'a', 'b', 'c', 'd'};
  char res = 'c';
  REQUIRE(Lists::kThElement<char>(dummy, 3) == res);
}
