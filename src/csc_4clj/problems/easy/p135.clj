(ns csc-4clj.problems.p135)

;; 135. Infix Calculator
;;
;; URL: http://www.4clojure.com/problem/135
;;
;; Description:
;; Your friend Joe is always whining about Lisps using the prefix notation for math. Show him how you could easily write a function that does math using the infix notation. Is your favorite language that flexible, Joe?
;;
;;Write a function that accepts a variable length mathematical expression consisting of numbers and the operations +, -, *, and /. Assume a simple calculator that does not do precedence and instead just calculates left to right.
;;
;; Tags: higher-order-functions, math

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= 7  (__ 2 + 5))

(= 42 (__ 38 + 48 - 2 / 2))

(= 8  (__ 10 / 2 - 1 * 2))

(= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))
