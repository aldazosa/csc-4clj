(ns csc-4clj.problems.p138)

;; 138. Squares Squared
;;
;; URL: http://www.4clojure.com/problem/138
;;
;; Description:
;; Create a function of two integer arguments: the start and end, respectively.  You must create a vector of strings which renders a 45&deg; rotated square of integers which are successive squares from the start point up to and including the end point.  If a number comprises multiple digits, wrap them around the shape individually.  If there are not enough digits to complete the shape, fill in the rest with asterisk characters.  The direction of the drawing should be clockwise, starting from the center of the shape and working outwards, with the initial direction being down and to the right.
;;
;; Tags: data-juggling

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ 2 2) ["2"])

(= (__ 2 4) [" 2 "
             "* 4"
             " * "])

(= (__ 3 81) [" 3 "
              "1 9"
              " 8 "])

(= (__ 4 20) [" 4 "
              "* 1"
              " 6 "])

(= (__ 2 256) ["  6  "
               " 5 * "
               "2 2 *"
               " 6 4 "
               "  1  "])

(= (__ 10 10000) ["   0   "
                  "  1 0  "
                  " 0 1 0 "
                  "* 0 0 0"
                  " * 1 * "
                  "  * *  "
                  "   *   "])
