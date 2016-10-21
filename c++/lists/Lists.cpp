#include <Lists.h>
#include <stdexcept>

int Lists::returnLast(std::list<int> _list) {
    if (_list.empty()) {
        throw new std::invalid_argument("List is empty");
    }
    return _list.back();
}