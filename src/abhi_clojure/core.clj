(ns abhi-clojure.core
  (:gen-class))

(defn foo [x]
         (case x
           5 "x is 5"
           10 "x is 10"
           "x isn't 5 or 10"))

(foo 11)
