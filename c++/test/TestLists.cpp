#include <catch.hpp>
#include <Lists.h>

TEST_CASE( "Test1 is doing what I want", "[test1]" ) {
    std::list<int> dummy = {1,2,3,4,5};
    REQUIRE(Lists::returnLast(dummy) == 5);
}