#ifndef INC_99PROBLEMS_P01_H
#define INC_99PROBLEMS_P01_H

#include <list>
#include <stdexcept>

namespace Lists {
    template<typename T>
    T returnLast(std::list<T> _list) {
        if (_list.empty()) {
            throw new std::invalid_argument("List is empty");
        }
        return _list.back();
    }
}


#endif //INC_99PROBLEMS_P01_H