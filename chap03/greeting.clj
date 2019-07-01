(defn cap [s] (clojure.string/upper-case s))

(defn greeting [c s] (prn (c s)))

(greeting cap "hi there")
