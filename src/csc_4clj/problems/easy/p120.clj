(ns csc-4clj.problems.p120)

;; 120. Sum of square of digits
;;
;; URL: http://www.4clojure.com/problem/120
;;
;; Description:
;; Write a function which takes a collection of integers as an argument.  Return the count of how many elements are smaller than the sum of their squared component digits.  For example: 10 is larger than 1 squared plus 0 squared; whereas 15 is smaller than 1 squared plus 5 squared.
;;
;; Tags: math

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= 8 (__ (range 10)))

(= 19 (__ (range 30)))

(= 50 (__ (range 100)))

(= 50 (__ (range 1000)))
