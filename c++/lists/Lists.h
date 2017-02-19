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
  
  template<typename T>
  T kThElement(const std::list<T> _list, int _k) {
    if (_list.size() < _k) {
      throw new std::invalid_argument("List has less than 2 elements");
    }

    return *std::next(_list.begin(), _k - 1);;
  }

  template <typename T>
  unsigned long numberElement(const std::list<T> _list) {
    return _list.size();
  }

  template <typename T>
  std::unique_ptr<std::list<T>> reverseElement(const std::list<T> _list) {
    std::unique_ptr<std::list<T>> res(new std::list<T>(_list.size()));
    std::reverse_copy(std::begin(_list), std::end(_list), std::begin(*res.get()));
    return res;
  }

  template <class Iterator, class U = typename std::iterator_traits<Iterator>::value_type>
  bool _isPalindrome(Iterator left, Iterator right) {
    if (std::distance(left, right) <= 1) {
      return true;
    }
    return *left == *right && _isPalindrome(std::next(left), std::prev(right));
  }

  template <typename T>
  bool isPalindrome(const std::list<T> _list) {
    if (_list.size() <= 1) {
      return true;
    }
    return _isPalindrome(_list.begin(), std::prev(_list.end()));
  }
}


#endif //INC_99PROBLEMS_P01_H
