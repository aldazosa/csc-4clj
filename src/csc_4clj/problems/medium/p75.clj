(ns csc-4clj.problems.p75)

;; 75. Euler's Totient Function
;;
;; URL: http://www.4clojure.com/problem/75
;;
;; Description:
;; Two numbers are coprime if their greatest common divisor equals 1.  Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x.  The special case f(1) equals 1.  Write a function which calculates Euler's totient function.
;;
;; Tags: 

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ 1) 1)

(= (__ 10) (count '(1 3 7 9)) 4)

(= (__ 40) 16)

(= (__ 99) 60)
