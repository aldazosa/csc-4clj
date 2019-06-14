(ns csc-4clj.problems.p44)

;; 44. Rotate Sequence
;;
;; URL: http://www.4clojure.com/problem/44
;;
;; Description:
;; Write a function which can rotate a sequence in either direction.
;;
;; Tags: seqs

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))

(= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))

(= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))

(= (__ 1 '(:a :b :c)) '(:b :c :a))

(= (__ -4 '(:a :b :c)) '(:c :a :b))
