#include <catch.hpp>
#include <Lists.h>
#include "../external/Catch/include/catch.hpp"

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

TEST_CASE( "Should return number element of an int list", "[numberElement]" ) {
std::list<int> dummy = {1, 2, 3, 4, 5};
int res = 5;
REQUIRE(Lists::numberElement<int>(dummy) == res);
}

TEST_CASE( "Should return number element of a char list", "[numberElement]" ) {
std::list<char> dummy = {'a', 'b', 'c', 'd'};
char res = 4;
REQUIRE(Lists::numberElement<char>(dummy) == res);
}

TEST_CASE( "Should return reversed int list", "[reverseElement]" ) {
std::list<int> dummy = *Lists::reverseElement<int>({1, 2, 3, 4, 5});
std::list<int> res = {5, 4, 3, 2, 1};
REQUIRE(res.size() == dummy.size());
REQUIRE(std::equal(std::begin(res), std::end(res), std::begin(dummy)));
}

TEST_CASE( "Should return reversed char list", "[reverseElement]" ) {
std::list<char> dummy = *Lists::reverseElement<char>({'a', 'b', 'c', 'd'});
std::list<char> res = {'d', 'c', 'b', 'a'};
REQUIRE(res.size() == dummy.size());
REQUIRE(std::equal(std::begin(res), std::end(res), std::begin(dummy)));
}

TEST_CASE( "Should test not palindrome int list", "[palindrome]" ) {
  bool pal = Lists::isPalindrome<int>({1, 2, 3, 4, 5});
  REQUIRE(!pal);
}

TEST_CASE( "Should test palindrome int list", "[palindrome]" ) {
  bool pal = Lists::isPalindrome<int>({1, 2, 3, 2, 1});
  REQUIRE(pal);
}


TEST_CASE( "Should test not palindrome char list", "[palindrome]" ) {
  bool pal = Lists::isPalindrome<char>({'a', 'b', 'c', 'd'});
  REQUIRE(!pal);
}

TEST_CASE( "Should test palindrome char list", "[palindrome]" ) {
  bool pal = Lists::isPalindrome<char>({'a', 'b', 'b', 'a'});
  REQUIRE(pal);
}