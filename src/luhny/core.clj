(ns luhny.core
  (:gen-class))

(defn trim [s]
  (apply str (butlast s)))

(defn luhny? [strin]
  (zero?
   (mod
    (reduce
     +
     (map #(Integer. (str %))
          (apply
           str
           (map-indexed
            #(* (Integer. (str %2)) (if (even? %1) 2 1))
            strin))))
    10)))

(defn block-luhn [strin]
  (if (luhny? strin)
    (repeat "X" (count strin))
    strin))

(defn work
  "Do all your work in here."
  [input]
;;  (block-luhn input))
  input)
  
(defn work-loop []
  (loop [line (read-line)]
    (when (not= line nil)
      (println (work line))
      (recur (read-line)))))

(defn -main []
  (work-loop))

;;(luhny? "56613959932537")