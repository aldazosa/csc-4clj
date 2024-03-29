(ns csc-4clj.problems.p64)

;; 64. Intro to Reduce
;;
;; URL: http://www.4clojure.com/problem/64
;;
;; Description:
;; <a href='http://clojuredocs.org/clojure_core/clojure.core/reduce'>Reduce</a> takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds.
;;
;; Tags: seqs

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= 15 (reduce __ [1 2 3 4 5]))

(=  0 (reduce __ []))

(=  6 (reduce __ 1 [2 3]))
