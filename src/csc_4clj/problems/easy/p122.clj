(ns csc-4clj.problems.p122)

;; 122. Read a binary number
;;
;; URL: http://www.4clojure.com/problem/122
;;
;; Description:
;; Convert a binary number, provided in the form of a string, to its numerical value.
;;
;; Tags: 

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= 0     (__ "0"))

(= 7     (__ "111"))

(= 8     (__ "1000"))

(= 9     (__ "1001"))

(= 255   (__ "11111111"))

(= 1365  (__ "10101010101"))

(= 65535 (__ "1111111111111111"))
