enable_testing()
file(GLOB TESTSRC "*.cpp")

include(ExternalProject)

set(GB_FETCH_EXTERNAL_CATCH
        URL https://github.com/philsquared/Catch/archive/v1.2.1-develop.12.tar.gz
        URL_HASH MD5=a8dfb7be899a6e7fb30bd55d53426122)

ExternalProject_Add(Catch-External
    PREFIX ${CMAKE_BINARY_DIR}/external/Catch
    ${GB_FETCH_EXTERNAL_CATCH}
    CONFIGURE_COMMAND ""
    BUILD_COMMAND ""
    INSTALL_COMMAND ${CMAKE_COMMAND} -E copy ${CMAKE_BINARY_DIR}/external/Catch/src/Catch-External/single_include/catch.hpp
                                             ${CMAKE_BINARY_DIR}/external/Catch/include/catch.hpp
)

add_library(Catch INTERFACE)
add_dependencies(Catch Catch-External)
target_include_directories(Catch INTERFACE ${CMAKE_BINARY_DIR}/external/Catch/include)

add_executable(Test99 ${TESTSRC})

target_link_libraries(Test99 Lists Catch)
target_compile_features(Test99 PRIVATE cxx_range_for)

add_test(NAME TestBase COMMAND Test99)
