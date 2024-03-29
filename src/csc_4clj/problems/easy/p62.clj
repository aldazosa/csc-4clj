(ns csc-4clj.problems.p62)

;; 62. Re-implement Iterate
;;
;; URL: http://www.4clojure.com/problem/62
;;
;; Description:
;; Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: iterate


(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])

(= (take 100 (__ inc 0)) (take 100 (range)))

(= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))
