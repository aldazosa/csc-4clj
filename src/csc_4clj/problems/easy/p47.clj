(ns csc-4clj.problems.p47)

;; 47. Contain Yourself
;;
;; URL: http://www.4clojure.com/problem/47
;;
;; Description:
;; The contains? function checks if a KEY is present in a given collection.  This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists.
;;
;; Tags: 

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(contains? #{4 5 6} __)

(contains? [1 1 1 1 1] __)

(contains? {4 :a 2 :b} __)

(not (contains? [1 2 4] __))
