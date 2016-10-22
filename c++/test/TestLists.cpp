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