(ns csc-4clj.problems.p92)

;; 92. Read Roman numerals
;;
;; URL: http://www.4clojure.com/problem/92
;;
;; Description:
;; Roman numerals are easy to recognize, but not everyone knows all the rules necessary to work with them. Write a function to parse a Roman-numeral string and return the number it represents.
;;<br /><br />
;;You can assume that the input will be well-formed, in upper-case, and follow the <a href="http://en.wikipedia.org/wiki/Roman_numerals#Subtractive_principle">subtractive principle</a>. You don't need to handle any numbers greater than MMMCMXCIX (3999), the largest number representable with ordinary letters.
;;
;; Tags: strings, math

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= 14 (__ "XIV"))

(= 827 (__ "DCCCXXVII"))

(= 3999 (__ "MMMCMXCIX"))

(= 48 (__ "XLVIII"))

