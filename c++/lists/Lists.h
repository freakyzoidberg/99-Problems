#ifndef INC_99PROBLEMS_P01_H
#define INC_99PROBLEMS_P01_H

#include <list>
#include <stdexcept>

namespace Lists {
    template<typename T>
    T returnLast(const std::list<T> _list) {
        if (_list.empty()) {
            throw new std::invalid_argument("List is empty");
        }
        return _list.back();
    }

    template<typename T>
    std::list<T> returnLastAndPenultimate(const std::list<T> _list) {
        if (_list.size() < 2) {
            throw new std::invalid_argument("List has less than 2 elements");
        }

        auto last_it = std::prev(_list.end());
        return {*std::prev(last_it), *last_it};
    }
}


#endif //INC_99PROBLEMS_P01_H