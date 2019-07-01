(defn drop-nth [n coll]
   (->> coll
      (map vector (iterate inc 1))
      (remove #(zero? (mod (first %) n)))
      (map second)))