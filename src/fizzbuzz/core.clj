(ns fizzbuzz.core
  (:gen-class))

(defn | [divisor number] ;; Math notation for divides 
  (zero? (mod number divisor)))

(defn fizzbuzz [n]
  (-> 
    (str (when (| 3 n) "fizz") (when (| 5 n) "buzz"))
    not-empty ;; Turn empty string into nil
    (or n)))  ;; Return n if we got nil


(defn -main
  []
  (println (map fizzbuzz (range 1 101))))

