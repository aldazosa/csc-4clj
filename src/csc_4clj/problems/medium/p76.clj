(ns csc-4clj.problems.p76)

;; 76. Intro to Trampoline
;;
;; URL: http://www.4clojure.com/problem/76
;;
;; Description:
;; The trampoline function takes a function f and a variable number of parameters.  Trampoline calls f with any parameters that were supplied.  If f returns a function, trampoline calls that function with no arguments.  This is repeated, until the return value is not a function, and then trampoline returns that non-function value.  This is useful for implementing mutually recursive algorithms in a way that won't consume the stack.
;;
;; Tags: recursion

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= __
   (letfn
     [(foo [x y] #(bar (conj x y) y))
      (bar [x y] (if (> (last x) 10)
                   x
                   #(foo x (+ 2 y))))]
     (trampoline foo [] 1)))
