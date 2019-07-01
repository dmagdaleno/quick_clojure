(defn sum [x y] (+ x y))

(def add-on-five (partial sum 5))

(add-on-five 10)
